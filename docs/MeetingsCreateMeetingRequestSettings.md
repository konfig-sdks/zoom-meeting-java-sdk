

# MeetingsCreateMeetingRequestSettings

Information about the meeting's settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalDataCenterRegions** | **List&lt;String&gt;** | Add additional meeting [data center regions](https://support.zoom.us/hc/en-us/articles/360042411451-Selecting-data-center-regions-for-hosted-meetings-and-webinars). Provide this value as an array of [country codes](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#countries) for the countries available as data center regions in the [**Account Profile**](https://zoom.us/account/setting) interface but have been opted out of in the [user settings](https://zoom.us/profile).  For example, the data center regions selected in your [**Account Profile**](https://zoom.us/account) are &#x60;Europe&#x60;, &#x60;Hong Kong SAR&#x60;, &#x60;Australia&#x60;, &#x60;India&#x60;, &#x60;Japan&#x60;, &#x60;China&#x60;, &#x60;United States&#x60;, and &#x60;Canada&#x60;. However, in the [**My Profile**](https://zoom.us/profile) settings, you did **not** select &#x60;India&#x60; and &#x60;Japan&#x60; for meeting and webinar traffic routing.  To include &#x60;India&#x60; and &#x60;Japan&#x60; as additional data centers, use the &#x60;[IN, TY]&#x60; value for this field. |  [optional] |
|**allowMultipleDevices** | **Boolean** | Whether to allow attendees to join a meeting from multiple devices. This setting is only applied to meetings with registration enabled. |  [optional] |
|**alternativeHosts** | **String** | A semicolon-separated list of the meeting&#39;s alternative hosts&#39; email addresses or IDs. |  [optional] |
|**alternativeHostsEmailNotification** | **Boolean** | Whether to send email notifications to alternative hosts. This value defaults to &#x60;true&#x60;. |  [optional] |
|**approvalType** | [**ApprovalTypeEnum**](#ApprovalTypeEnum) | Enable meeting registration approval. * &#x60;0&#x60; - Automatically approve registration. * &#x60;1&#x60; - Manually approve registration. * &#x60;2&#x60; - No registration required.  This value defaults to &#x60;2&#x60;. |  [optional] |
|**approvedOrDeniedCountriesOrRegions** | [**MeetingsCreateMeetingRequestSettingsApprovedOrDeniedCountriesOrRegions**](MeetingsCreateMeetingRequestSettingsApprovedOrDeniedCountriesOrRegions.md) |  |  [optional] |
|**audio** | [**AudioEnum**](#AudioEnum) | How participants join the audio portion of the meeting. * &#x60;both&#x60; - Both telephony and VoIP.  * &#x60;telephony&#x60; - Telephony only.  * &#x60;voip&#x60; - VoIP only.  * &#x60;thirdParty&#x60; - Third party audio conference. |  [optional] |
|**audioConferenceInfo** | **String** | Third party audio conference info. |  [optional] |
|**authenticationDomains** | **String** | The meeting&#39;s authenticated domains. Only Zoom users whose email address contains an authenticated domain can join the meeting. Comma-separate multiple domains or use a wildcard for listing domains. |  [optional] |
|**authenticationException** | [**List&lt;MeetingsCreateMeetingRequestSettingsAuthenticationExceptionInner&gt;**](MeetingsCreateMeetingRequestSettingsAuthenticationExceptionInner.md) | A list of participants that can bypass meeting authentication. These participants will receive a unique meeting invite. |  [optional] |
|**authenticationOption** | **String** | If the &#x60;meeting_authentication&#x60; value is &#x60;true&#x60;, the type of authentication required for users to join a meeting.  To get this value, use the &#x60;authentication_options&#x60; array&#39;s &#x60;id&#x60; value in the [**Get user settings**](https://developers.zoom.us/docs/api-reference/zoom-api/methods#operation/userSettings) API response. |  [optional] |
|**autoRecording** | [**AutoRecordingEnum**](#AutoRecordingEnum) | The automatic recording settings.  * &#x60;local&#x60; - Record the meeting locally.  * &#x60;cloud&#x60; - Record the meeting to the cloud.  * &#x60;none&#x60; - Auto-recording disabled.  This value defaults to &#x60;none&#x60;. |  [optional] |
|**breakoutRoom** | [**MeetingsCreateMeetingRequestSettingsBreakoutRoom**](MeetingsCreateMeetingRequestSettingsBreakoutRoom.md) |  |  [optional] |
|**calendarType** | [**CalendarTypeEnum**](#CalendarTypeEnum) | Indicates the type of calendar integration used to schedule the meeting. * &#x60;1&#x60; - [Zoom Outlook add-in](https://support.zoom.us/hc/en-us/articles/360031592971-Getting-started-with-Outlook-plugin-and-add-in)  * &#x60;2&#x60; - [Zoom for Google Workspace add-on](https://support.zoom.us/hc/en-us/articles/360020187492-Using-the-Zoom-for-Google-Workspace-add-on)  Works with the &#x60;private_meeting&#x60; field to determine whether to share details of meetings or not. |  [optional] |
|**closeRegistration** | **Boolean** | Whether to close registration after the event date. This value defaults to &#x60;false&#x60;. |  [optional] |
|**cnMeeting** | **Boolean** | Whether to host the meeting in China (CN). This value defaults to &#x60;false&#x60;. |  [optional] |
|**contactEmail** | **String** | The contact email address for meeting registration. |  [optional] |
|**contactName** | **String** | The contact name for meeting registration. |  [optional] |
|**emailNotification** | **Boolean** | Whether to send email notifications to [alternative hosts](https://support.zoom.us/hc/en-us/articles/208220166) and [users with scheduling privileges](https://support.zoom.us/hc/en-us/articles/201362803-Scheduling-privilege). This value defaults to &#x60;true&#x60;. |  [optional] |
|**encryptionType** | [**EncryptionTypeEnum**](#EncryptionTypeEnum) | The type of [end-to-end (E2EE) encryption](https://support.zoom.us/hc/en-us/articles/360048660871) to use for the meeting.  * &#x60;enhanced_encryption&#x60; - Enhanced encryption. Encryption is stored in the cloud when you enable this option.  * &#x60;e2ee&#x60; - End-to-end encryption. The encryption key is stored on your local device and **cannot** be obtained by anyone else. When you use E2EE encryption, [certain features](https://support.zoom.us/hc/en-us/articles/360048660871), such as cloud recording or phone and SIP/H.323 dial-in, are **disabled**. |  [optional] |
|**focusMode** | **Boolean** | Whether to enable the [**Focus Mode** feature](https://support.zoom.us/hc/en-us/articles/360061113751-Using-focus-mode) when the meeting starts. |  [optional] |
|**globalDialInCountries** | **List&lt;String&gt;** | A list of available global dial-in countries. |  [optional] |
|**hostVideo** | **Boolean** | Whether to start meetings with the host video on. |  [optional] |
|**inMeeting** | **Boolean** | Whether to host the meeting in India (IN). This value defaults to &#x60;false&#x60;. |  [optional] |
|**jbhTime** | [**JbhTimeEnum**](#JbhTimeEnum) | If the value of the &#x60;join_before_host&#x60; field is &#x60;true&#x60;, this field indicates the time limits when a participant can join a meeting before the meeting&#39;s host.  * &#x60;0&#x60; - Allow the participant to join the meeting at anytime. * &#x60;5&#x60; - Allow the participant to join 5 minutes before the meeting&#39;s start time. * &#x60;10&#x60; - Allow the participant to join 10 minutes before the meeting&#39;s start time. |  [optional] |
|**joinBeforeHost** | **Boolean** | Whether participants can join the meeting before its host. This field is only used for scheduled meetings (&#x60;2&#x60;) or recurring meetings (&#x60;3&#x60; and &#x60;8&#x60;). This value defaults to &#x60;false&#x60;.  If the [**Waiting Room** feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room) is enabled, this setting is **disabled**. |  [optional] |
|**languageInterpretation** | [**MeetingsCreateMeetingRequestSettingsLanguageInterpretation**](MeetingsCreateMeetingRequestSettingsLanguageInterpretation.md) |  |  [optional] |
|**signLanguageInterpretation** | [**MeetingsCreateMeetingRequestSettingsSignLanguageInterpretation**](MeetingsCreateMeetingRequestSettingsSignLanguageInterpretation.md) |  |  [optional] |
|**meetingAuthentication** | **Boolean** | If true, only [authenticated](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) users can join the meeting. |  [optional] |
|**meetingInvitees** | [**List&lt;MeetingsCreateMeetingRequestSettingsMeetingInviteesInner&gt;**](MeetingsCreateMeetingRequestSettingsMeetingInviteesInner.md) | A list of the meeting&#39;s invitees. |  [optional] |
|**muteUponEntry** | **Boolean** | Whether to mute participants upon entry. |  [optional] |
|**participantVideo** | **Boolean** | Whether to start meetings with the participant video on. |  [optional] |
|**privateMeeting** | **Boolean** | Whether to set the meeting as private. |  [optional] |
|**registrantsConfirmationEmail** | **Boolean** | Whether to send registrants an email confirmation.  * &#x60;true&#x60; - Send a confirmation email.  * &#x60;false&#x60; - Do not send a confirmation email. |  [optional] |
|**registrantsEmailNotification** | **Boolean** | Whether to send registrants email notifications about their registration approval, cancellation, or rejection.  * &#x60;true&#x60; - Send an email notification. * &#x60;false&#x60; - Do not send an email notification.   Set this value to &#x60;true&#x60; to also use the &#x60;registrants_confirmation_email&#x60; parameter. |  [optional] |
|**registrationType** | [**RegistrationTypeEnum**](#RegistrationTypeEnum) | The meeting&#39;s registration type.  * &#x60;1&#x60; - Attendees register once and can attend any meeting occurrence.  * &#x60;2&#x60; - Attendees must register for each meeting occurrence.  * &#x60;3&#x60; - Attendees register once and can select one or more meeting occurrences to attend.  This field is only for recurring meetings with fixed times (&#x60;8&#x60;). This value defaults to &#x60;1&#x60;. |  [optional] |
|**showShareButton** | **Boolean** | Whether to include social media sharing buttons on the meeting&#39;s registration page. This setting is only applied to meetings with registration enabled. |  [optional] |
|**usePmi** | **Boolean** | Whether to use a [Personal Meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi) instead of a generated meeting ID. This field is only used for scheduled meetings (&#x60;2&#x60;), instant meetings (&#x60;1&#x60;), or recurring meetings with no fixed time (&#x60;3&#x60;). This value defaults to &#x60;false&#x60;. |  [optional] |
|**waitingRoom** | **Boolean** | Whether to enable the [**Waiting Room** feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room). If this value is &#x60;true&#x60;, this **disables** the &#x60;join_before_host&#x60; setting. |  [optional] |
|**watermark** | **Boolean** | Whether to add a watermark when viewing a shared screen. |  [optional] |
|**hostSaveVideoOrder** | **Boolean** | Whether the **Allow host to save video order** feature is enabled. |  [optional] |
|**alternativeHostUpdatePolls** | **Boolean** | Whether the **Allow alternative hosts to add or edit polls** feature is enabled. This requires Zoom version 5.8.0 or higher. |  [optional] |
|**internalMeeting** | **Boolean** | Whether to set the meeting as an internal meeting. |  [optional] |
|**continuousMeetingChat** | [**MeetingsCreateMeetingRequestSettingsContinuousMeetingChat**](MeetingsCreateMeetingRequestSettingsContinuousMeetingChat.md) |  |  [optional] |
|**participantFocusedMeeting** | **Boolean** | Whether to set the meeting as a participant focused meeting. |  [optional] |
|**pushChangeToCalendar** | **Boolean** | Whether to push meeting changes to the calendar.    To enable this feature, configure the **Configure Calendar and Contacts Service** in the user&#39;s profile page of the Zoom web portal and enable the **Automatically sync Zoom calendar events information bi-directionally between Zoom and integrated calendars.** setting in the **Settings** page of the Zoom web portal. * &#x60;true&#x60; - Push meeting changes to the calendar. * &#x60;false&#x60; - Do not push meeting changes to the calendar. |  [optional] |
|**resources** | [**List&lt;MeetingsCreateMeetingRequestSettingsResourcesInner&gt;**](MeetingsCreateMeetingRequestSettingsResourcesInner.md) | The meeting&#39;s resources. |  [optional] |
|**autoStartMeetingSummary** | **Boolean** | Whether to automatically start a meeting summary. |  [optional] |
|**autoStartAiCompanionQuestions** | **Boolean** | Whether to automatically start AI Companion questions. |  [optional] |



## Enum: ApprovalTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: AudioEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;both&quot; |
| TELEPHONY | &quot;telephony&quot; |
| VOIP | &quot;voip&quot; |
| THIRDPARTY | &quot;thirdParty&quot; |



## Enum: AutoRecordingEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| CLOUD | &quot;cloud&quot; |
| NONE | &quot;none&quot; |



## Enum: CalendarTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: EncryptionTypeEnum

| Name | Value |
|---- | -----|
| ENHANCED_ENCRYPTION | &quot;enhanced_encryption&quot; |
| E2EE | &quot;e2ee&quot; |



## Enum: JbhTimeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_5 | 5 |
| NUMBER_10 | 10 |



## Enum: RegistrationTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



