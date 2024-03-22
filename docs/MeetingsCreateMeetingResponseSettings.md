

# MeetingsCreateMeetingResponseSettings

Meeting settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleDevices** | **Boolean** | Allow attendees to join the meeting from multiple devices. This setting only works for meetings that require [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting). |  [optional] |
|**alternativeHosts** | **String** | A semicolon-separated list of the meeting&#39;s alternative hosts&#39; email addresses or IDs. |  [optional] |
|**alternativeHostsEmailNotification** | **Boolean** | Flag to determine whether to send email notifications to alternative hosts, default value is true. |  [optional] |
|**alternativeHostUpdatePolls** | **Boolean** | Whether the **Allow alternative hosts to add or edit polls** feature is enabled. This requires Zoom version 5.8.0 or higher. |  [optional] |
|**approvalType** | [**ApprovalTypeEnum**](#ApprovalTypeEnum) | Enable registration and set approval for the registration. Note that this feature requires the host to be of **Licensed** user type. **Registration cannot be enabled for a basic user.**            &#x60;0&#x60; - Automatically approve.    &#x60;1&#x60; - Manually approve.    &#x60;2&#x60; - No registration required. |  [optional] |
|**approvedOrDeniedCountriesOrRegions** | [**MeetingsCreateMeetingResponseSettingsApprovedOrDeniedCountriesOrRegions**](MeetingsCreateMeetingResponseSettingsApprovedOrDeniedCountriesOrRegions.md) |  |  [optional] |
|**audio** | [**AudioEnum**](#AudioEnum) | Determine how participants can join the audio portion of the meeting.    &#x60;both&#x60; - Both Telephony and VoIP.    &#x60;telephony&#x60; - Telephony only.    &#x60;voip&#x60; - VoIP only.    &#x60;thirdParty&#x60; - Third party audio conference. |  [optional] |
|**audioConferenceInfo** | **String** | Third party audio conference info. |  [optional] |
|**authenticationDomains** | **String** | If user has configured [Sign Into Zoom with Specified Domains](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f) option, this will list the domains that are authenticated. |  [optional] |
|**authenticationException** | [**List&lt;MeetingsCreateMeetingResponseSettingsAuthenticationExceptionInner&gt;**](MeetingsCreateMeetingResponseSettingsAuthenticationExceptionInner.md) | The participants added here will receive unique meeting invite links and bypass authentication. |  [optional] |
|**authenticationName** | **String** | Authentication name set in the [authentication profile](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f). |  [optional] |
|**authenticationOption** | **String** | Meeting authentication option ID. |  [optional] |
|**autoRecording** | [**AutoRecordingEnum**](#AutoRecordingEnum) | Automatic recording.  &#x60;local&#x60; - Record on local.    &#x60;cloud&#x60; -  Record on cloud.    &#x60;none&#x60; - Disabled. |  [optional] |
|**breakoutRoom** | [**MeetingsCreateMeetingResponseSettingsBreakoutRoom**](MeetingsCreateMeetingResponseSettingsBreakoutRoom.md) |  |  [optional] |
|**calendarType** | [**CalendarTypeEnum**](#CalendarTypeEnum) | The type of calendar integration used to schedule the meeting.  * &#x60;1&#x60; - [Zoom Outlook add-in](https://support.zoom.us/hc/en-us/articles/360031592971-Getting-started-with-Outlook-plugin-and-add-in)  * &#x60;2&#x60; - [Zoom for Google Workspace add-on](https://support.zoom.us/hc/en-us/articles/360020187492-Using-the-Zoom-for-Google-Workspace-add-on)  Works with the &#x60;private_meeting&#x60; field to determine whether to share details of meetings or not. |  [optional] |
|**closeRegistration** | **Boolean** | Close registration after event date. |  [optional] |
|**cnMeeting** | **Boolean** | Host meeting in China. |  [optional] |
|**contactEmail** | **String** | Contact email for registration |  [optional] |
|**contactName** | **String** | Contact name for registration |  [optional] |
|**customKeys** | [**List&lt;MeetingsCreateMeetingResponseSettingsCustomKeysInner&gt;**](MeetingsCreateMeetingResponseSettingsCustomKeysInner.md) | Custom keys and values assigned to the meeting. |  [optional] |
|**emailNotification** | **Boolean** | Whether to send email notifications to [alternative hosts](https://support.zoom.us/hc/en-us/articles/208220166) and [users with scheduling privileges](https://support.zoom.us/hc/en-us/articles/201362803-Scheduling-privilege). This value defaults to &#x60;true&#x60;. |  [optional] |
|**encryptionType** | [**EncryptionTypeEnum**](#EncryptionTypeEnum) | Choose between enhanced encryption and [end-to-end encryption](https://support.zoom.us/hc/en-us/articles/360048660871) when starting or a meeting. When using end-to-end encryption, several features (e.g. cloud recording, phone/SIP/H.323 dial-in) will be **automatically disabled**.   &#x60;enhanced_encryption&#x60; - Enhanced encryption. Encryption is stored in the cloud if you enable this option.       &#x60;e2ee&#x60; - [End-to-end encryption](https://support.zoom.us/hc/en-us/articles/360048660871). The encryption key is stored in your local device and can not be obtained by anyone else. Enabling this setting also **disables** the join before host, cloud recording, streaming, live transcription, breakout rooms, polling, 1:1 private chat, and meeting reactions features. |  [optional] |
|**enforceLogin** | **Boolean** | Only signed in users can join this meeting.  **This field is deprecated and will not be supported in the future.**          As an alternative, use the &#x60;meeting_authentication&#x60;, &#x60;authentication_option&#x60;, and &#x60;authentication_domains&#x60; fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the meeting. |  [optional] |
|**enforceLoginDomains** | **String** | Only signed in users with specified domains can join meetings.  **This field is deprecated and will not be supported in the future.**          As an alternative, use the &#x60;meeting_authentication&#x60;, &#x60;authentication_option&#x60;, and &#x60;authentication_domains&#x60; fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the meeting. |  [optional] |
|**focusMode** | **Boolean** | Whether the [**Focus Mode** feature](https://support.zoom.us/hc/en-us/articles/360061113751-Using-focus-mode) is enabled when the meeting starts. |  [optional] |
|**globalDialInCountries** | **List&lt;String&gt;** | List of global dial-in countries. |  [optional] |
|**globalDialInNumbers** | [**List&lt;MeetingsCreateMeetingResponseSettingsGlobalDialInNumbersInner&gt;**](MeetingsCreateMeetingResponseSettingsGlobalDialInNumbersInner.md) | Global dial-in countries or regions. |  [optional] |
|**hostVideo** | **Boolean** | Start video when the host joins the meeting. |  [optional] |
|**inMeeting** | **Boolean** | Host meeting in India. |  [optional] |
|**jbhTime** | [**JbhTimeEnum**](#JbhTimeEnum) | If the value of &#x60;join_before_host&#x60; field is set to &#x60;true&#x60;, use this field to indicate time limits when a participant may join a meeting before a host.  *  &#x60;0&#x60; - Allow participant to join anytime. *  &#x60;5&#x60;- Allow participant to join 5 minutes before meeting start time.  * &#x60;10&#x60; - Allow participant to join 10 minutes before meeting start time. |  [optional] |
|**joinBeforeHost** | **Boolean** | Allow participants to join the meeting before the host starts the meeting. Only used for scheduled or recurring meetings. |  [optional] |
|**languageInterpretation** | [**MeetingsCreateMeetingResponseSettingsLanguageInterpretation**](MeetingsCreateMeetingResponseSettingsLanguageInterpretation.md) |  |  [optional] |
|**signLanguageInterpretation** | [**MeetingsCreateMeetingResponseSettingsSignLanguageInterpretation**](MeetingsCreateMeetingResponseSettingsSignLanguageInterpretation.md) |  |  [optional] |
|**meetingAuthentication** | **Boolean** | &#x60;true&#x60; - Only authenticated users can join meetings. |  [optional] |
|**muteUponEntry** | **Boolean** | Mute participants upon entry. |  [optional] |
|**participantVideo** | **Boolean** | Start video when participants join the meeting. |  [optional] |
|**privateMeeting** | **Boolean** | Whether the meeting is set as private. |  [optional] |
|**registrantsConfirmationEmail** | **Boolean** | Whether to send registrants an email confirmation. * &#x60;true&#x60; - Send a confirmation email. * &#x60;false&#x60; - Do not send a confirmation email. |  [optional] |
|**registrantsEmailNotification** | **Boolean** | Whether to send registrants email notifications about their registration approval, cancellation, or rejection.  * &#x60;true&#x60; - Send an email notification. * &#x60;false&#x60; - Do not send an email notification.   Set this value to &#x60;true&#x60; to also use the &#x60;registrants_confirmation_email&#x60; parameter. |  [optional] |
|**registrationType** | [**RegistrationTypeEnum**](#RegistrationTypeEnum) | Registration type. Used for recurring meeting with fixed time only.   &#x60;1&#x60; - Attendees register once and can attend any of the occurrences.    &#x60;2&#x60; - Attendees need to register for each occurrence to attend.    &#x60;3&#x60; - Attendees register once and can choose one or more occurrences to attend. |  [optional] |
|**showShareButton** | **Boolean** | Show social share buttons on the meeting registration page. This setting only works for meetings that require [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting). |  [optional] |
|**usePmi** | **Boolean** | Use a [personal meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). Only used for scheduled meetings and recurring meetings with no fixed time. |  [optional] |
|**waitingRoom** | **Boolean** | Enable the waiting room. |  [optional] |
|**watermark** | **Boolean** | Add a watermark when viewing a shared screen. |  [optional] |
|**hostSaveVideoOrder** | **Boolean** | Whether the **Allow host to save video order** feature is enabled. |  [optional] |
|**internalMeeting** | **Boolean** | Whether to set the meeting as an internal meeting. |  [optional] |
|**continuousMeetingChat** | [**MeetingsCreateMeetingResponseSettingsContinuousMeetingChat**](MeetingsCreateMeetingResponseSettingsContinuousMeetingChat.md) |  |  [optional] |
|**participantFocusedMeeting** | **Boolean** | Whether to set the meeting as a participant focused meeting. |  [optional] |
|**pushChangeToCalendar** | **Boolean** | Whether to push meeting changes to the calendar.    To enable this feature, configure the **Configure Calendar and Contacts Service** in the user&#39;s profile page of the Zoom web portal and enable the **Automatically sync Zoom calendar events information bi-directionally between Zoom and integrated calendars.** setting in the **Settings** page of the Zoom web portal. * &#x60;true&#x60; - Push meeting changes to the calendar. * &#x60;false&#x60; - Do not push meeting changes to the calendar. |  [optional] |
|**resources** | [**List&lt;MeetingsCreateMeetingResponseSettingsResourcesInner&gt;**](MeetingsCreateMeetingResponseSettingsResourcesInner.md) | The meeting&#39;s resources. |  [optional] |
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



