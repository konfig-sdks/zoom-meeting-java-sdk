

# WebinarsUpdateScheduledWebinarRequestSettings

Webinar settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleDevices** | **Boolean** | Allow attendees to join from multiple devices. |  [optional] |
|**alternativeHosts** | **String** | Alternative host emails or IDs. Separate multiple values by commas. |  [optional] |
|**alternativeHostUpdatePolls** | **Boolean** | Whether the **Allow alternative hosts to add or edit polls** feature is enabled. This requires Zoom version 5.8.0 or higher. |  [optional] |
|**approvalType** | [**ApprovalTypeEnum**](#ApprovalTypeEnum) | &#x60;0&#x60; - Automatically approve.    &#x60;1&#x60; - Manually approve.    &#x60;2&#x60; - No registration required. |  [optional] |
|**attendeesAndPanelistsReminderEmailNotification** | [**WebinarsUpdateScheduledWebinarRequestSettingsAttendeesAndPanelistsReminderEmailNotification**](WebinarsUpdateScheduledWebinarRequestSettingsAttendeesAndPanelistsReminderEmailNotification.md) |  |  [optional] |
|**audio** | [**AudioEnum**](#AudioEnum) | Determine how participants can join the audio portion of the webinar. |  [optional] |
|**audioConferenceInfo** | **String** | Third party audio conference info. |  [optional] |
|**authenticationDomains** | **String** | If user has configured [**Sign Into Zoom with Specified Domains**](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f) option, this will list the domains that are authenticated. |  [optional] |
|**authenticationName** | **String** | Authentication name set in the [authentication profile](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f). |  [optional] |
|**authenticationOption** | **String** | Webinar authentication option ID. |  [optional] |
|**autoRecording** | [**AutoRecordingEnum**](#AutoRecordingEnum) | Automatic recording.   &#x60;local&#x60; - Record on local.    &#x60;cloud&#x60; -  Record on cloud.    &#x60;none&#x60; - Disabled. |  [optional] |
|**closeRegistration** | **Boolean** | Close registration after event date. |  [optional] |
|**contactEmail** | **String** | Contact email for registration |  [optional] |
|**contactName** | **String** | Contact name for registration |  [optional] |
|**emailLanguage** | **String** | Set the email language to one of the following. &#x60;en-US&#x60;,&#x60;de-DE&#x60;,&#x60;es-ES&#x60;,&#x60;fr-FR&#x60;,&#x60;jp-JP&#x60;,&#x60;pt-PT&#x60;,&#x60;ru-RU&#x60;,&#x60;zh-CN&#x60;, &#x60;zh-TW&#x60;, &#x60;ko-KO&#x60;, &#x60;it-IT&#x60;, &#x60;vi-VN&#x60;. |  [optional] |
|**enforceLogin** | **Boolean** | Only signed in users can join this meeting.  **This field is deprecated and will not be supported in the future.**    As an alternative, use the &#x60;&#x60;meeting_authentication&#x60;, &#x60;authentication_option&#x60;, and &#x60;authentication_domains&#x60; fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the webinar. |  [optional] |
|**enforceLoginDomains** | **String** | Only signed in users with specified domains can join meetings.  **This field is deprecated and will not be supported in the future.**   As an alternative, use the &#x60;meeting_authentication&#x60;, &#x60;authentication_option&#x60;, and &#x60;authentication_domains&#x60; fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the webinar. |  [optional] |
|**followUpAbsenteesEmailNotification** | [**WebinarsUpdateScheduledWebinarRequestSettingsFollowUpAbsenteesEmailNotification**](WebinarsUpdateScheduledWebinarRequestSettingsFollowUpAbsenteesEmailNotification.md) |  |  [optional] |
|**followUpAttendeesEmailNotification** | [**WebinarsUpdateScheduledWebinarRequestSettingsFollowUpAttendeesEmailNotification**](WebinarsUpdateScheduledWebinarRequestSettingsFollowUpAttendeesEmailNotification.md) |  |  [optional] |
|**globalDialInCountries** | **List&lt;String&gt;** | List of global dial-in countries |  [optional] |
|**hdVideo** | **Boolean** | Default to HD video. |  [optional] |
|**hdVideoForAttendees** | **Boolean** | Whether HD video for attendees is enabled. |  [optional] |
|**hostVideo** | **Boolean** | Start video when host joins the webinar. |  [optional] |
|**languageInterpretation** | [**WebinarsUpdateScheduledWebinarRequestSettingsLanguageInterpretation**](WebinarsUpdateScheduledWebinarRequestSettingsLanguageInterpretation.md) |  |  [optional] |
|**signLanguageInterpretation** | [**WebinarsUpdateScheduledWebinarRequestSettingsSignLanguageInterpretation**](WebinarsUpdateScheduledWebinarRequestSettingsSignLanguageInterpretation.md) |  |  [optional] |
|**panelistAuthentication** | **Boolean** | Require panelists to authenticate to join. |  [optional] |
|**meetingAuthentication** | **Boolean** | Only authenticated users can join the webinar. |  [optional] |
|**addWatermark** | **Boolean** | Add watermark that identifies the viewing participant. |  [optional] |
|**addAudioWatermark** | **Boolean** | Add audio watermark that identifies the participants. |  [optional] |
|**notifyRegistrants** | **Boolean** | Send notification email to registrants when the host updates a webinar. |  [optional] |
|**onDemand** | **Boolean** | Make the webinar on-demand. |  [optional] |
|**panelistsInvitationEmailNotification** | **Boolean** | Send invitation email to panelists. If &#x60;false&#x60;, do not send invitation email to panelists. |  [optional] |
|**panelistsVideo** | **Boolean** | Start video when panelists join the webinar. |  [optional] |
|**postWebinarSurvey** | **Boolean** | Zoom will open a survey page in attendees&#39; browsers after leaving the webinar. |  [optional] |
|**practiceSession** | **Boolean** | Enable practice session. |  [optional] |
|**questionAndAnswer** | [**WebinarsUpdateScheduledWebinarRequestSettingsQuestionAndAnswer**](WebinarsUpdateScheduledWebinarRequestSettingsQuestionAndAnswer.md) |  |  [optional] |
|**registrantsConfirmationEmail** | **Boolean** | Send confirmation email to registrants |  [optional] |
|**registrantsEmailNotification** | **Boolean** | Send email notifications to registrants about approval, cancellation, denial of the registration. The value of this field must be set to true in order to use the &#x60;registrants_confirmation_email&#x60; field. |  [optional] |
|**registrantsRestrictNumber** | **Integer** | Restrict number of registrants for a webinar. By default, it is set to &#x60;0&#x60;. A &#x60;0&#x60; value means that the restriction option is disabled. Provide a number higher than 0 to restrict the webinar registrants by the that number. |  [optional] |
|**registrationType** | [**RegistrationTypeEnum**](#RegistrationTypeEnum) | Registration types. Only used for recurring webinars with a fixed time.    &#x60;1&#x60; - Attendees register once and can attend any of the webinar sessions.    &#x60;2&#x60; - Attendees need to register for each session in order to attend.    &#x60;3&#x60; - Attendees register once and can choose one or more sessions to attend. |  [optional] |
|**send1080pVideoToAttendees** | **Boolean** | Always send 1080p video to attendees. |  [optional] |
|**showShareButton** | **Boolean** | Show social share buttons on the registration page. |  [optional] |
|**surveyUrl** | **String** | Survey url for post webinar survey |  [optional] |
|**enableSessionBranding** | **Boolean** | Whether the **Webinar Session Branding** setting is enabled. This setting lets hosts visually customize a webinar by setting a session background. This also lets hosts use [Webinar Session Branding](https://support.zoom.us/hc/en-us/articles/4836268732045-Using-Webinar-Session-Branding) to set the virtual background for and apply name tags to hosts, alternative hosts, panelists, interpreters, and speakers. |  [optional] |



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



## Enum: RegistrationTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



