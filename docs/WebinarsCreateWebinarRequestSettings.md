

# WebinarsCreateWebinarRequestSettings

Create webinar settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleDevices** | **Boolean** | Allow attendees to join from multiple devices. |  [optional] |
|**alternativeHosts** | **String** | Alternative host emails or IDs. Multiple values separated by comma. |  [optional] |
|**alternativeHostUpdatePolls** | **Boolean** | Whether the **Allow alternative hosts to add or edit polls** feature is enabled. This requires Zoom version 5.8.0 or higher. |  [optional] |
|**approvalType** | [**ApprovalTypeEnum**](#ApprovalTypeEnum) | The default value is &#x60;2&#x60;. To enable registration required, set the approval type to &#x60;0&#x60; or &#x60;1&#x60;.  Values include:      &#x60;0&#x60; - Automatically approve.    &#x60;1&#x60; - Manually approve.    &#x60;2&#x60; - No registration required. |  [optional] |
|**attendeesAndPanelistsReminderEmailNotification** | [**WebinarsCreateWebinarRequestSettingsAttendeesAndPanelistsReminderEmailNotification**](WebinarsCreateWebinarRequestSettingsAttendeesAndPanelistsReminderEmailNotification.md) |  |  [optional] |
|**audio** | [**AudioEnum**](#AudioEnum) | Determine how participants can join the audio portion of the meeting.(Not supported for simulive webinar.) |  [optional] |
|**audioConferenceInfo** | **String** | Third party audio conference info. |  [optional] |
|**authenticationDomains** | **String** | Meeting authentication domains. This option allows you to specify the rule so that Zoom users whose email address contains a certain domain can join the webinar. You can either provide multiple comma-separated domains, use a wildcard for listing domains, or use both methods. |  [optional] |
|**authenticationOption** | **String** | Specify the authentication type for users to join a Webinar with&#x60;meeting_authentication&#x60; setting set to &#x60;true&#x60;. The value of this field can be retrieved from the &#x60;id&#x60; field within &#x60;authentication_options&#x60; array in the response of [**Get user settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/userSettings) API. |  [optional] |
|**autoRecording** | [**AutoRecordingEnum**](#AutoRecordingEnum) | Automatic recording. Not supported for simulive webinar.     &#x60;local&#x60; - Record on local.    &#x60;cloud&#x60; -  Record on cloud.    &#x60;none&#x60; - Disabled. |  [optional] |
|**closeRegistration** | **Boolean** | Close registration after event date. |  [optional] |
|**contactEmail** | **String** | Contact email for registration |  [optional] |
|**contactName** | **String** | Contact name for registration |  [optional] |
|**emailLanguage** | **String** | Set the email language. &#x60;en-US&#x60;,&#x60;de-DE&#x60;,&#x60;es-ES&#x60;,&#x60;fr-FR&#x60;,&#x60;id-ID&#x60;,&#x60;jp-JP&#x60;,&#x60;nl-NL&#x60;,&#x60;pl-PL&#x60;,&#x60;pt-PT&#x60;,&#x60;ru-RU&#x60;,&#x60;tr-TR&#x60;,&#x60;zh-CN&#x60;, &#x60;zh-TW&#x60;, &#x60;ko-KO&#x60;, &#x60;it-IT&#x60;, &#x60;vi-VN&#x60;. |  [optional] |
|**enforceLogin** | **Boolean** | Only signed-in users can join this meeting.   **This field is deprecated and will not be supported in future.**          Instead of this field, use the &#x60;meeting_authentication&#x60;, &#x60;authentication_option&#x60;, or &#x60;authentication_domains&#x60; fields to establish the authentication mechanism for this Webinar.  |  [optional] |
|**enforceLoginDomains** | **String** | Only signed-in users with specified domains can join meetings.  **This field is deprecated and will not be supported in future.**        Instead of this field, use the &#x60;authentication_domains&#x60; field for this webinar.  |  [optional] |
|**followUpAbsenteesEmailNotification** | [**WebinarsCreateWebinarRequestSettingsFollowUpAbsenteesEmailNotification**](WebinarsCreateWebinarRequestSettingsFollowUpAbsenteesEmailNotification.md) |  |  [optional] |
|**followUpAttendeesEmailNotification** | [**WebinarsCreateWebinarRequestSettingsFollowUpAttendeesEmailNotification**](WebinarsCreateWebinarRequestSettingsFollowUpAttendeesEmailNotification.md) |  |  [optional] |
|**globalDialInCountries** | **List&lt;String&gt;** | List of global dial-in countries |  [optional] |
|**hdVideo** | **Boolean** | Default to HD video.(Not supported for simulive webinar.) |  [optional] |
|**hdVideoForAttendees** | **Boolean** | Whether HD video for attendees is enabled. This value defaults to &#x60;false&#x60;.(Not supported for simulive webinar.) |  [optional] |
|**hostVideo** | **Boolean** | Start video when host joins webinar.(Not supported for simulive webinar.) |  [optional] |
|**languageInterpretation** | [**WebinarsCreateWebinarRequestSettingsLanguageInterpretation**](WebinarsCreateWebinarRequestSettingsLanguageInterpretation.md) |  |  [optional] |
|**signLanguageInterpretation** | [**WebinarsCreateWebinarRequestSettingsSignLanguageInterpretation**](WebinarsCreateWebinarRequestSettingsSignLanguageInterpretation.md) |  |  [optional] |
|**panelistAuthentication** | **Boolean** | Require panelists to authenticate to join |  [optional] |
|**meetingAuthentication** | **Boolean** | Only [authenticated](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) users can join meeting if the value of this field is set to &#x60;true&#x60;. |  [optional] |
|**addWatermark** | **Boolean** | Add watermark that identifies the viewing participant. Not supported for simulive webinar. |  [optional] |
|**addAudioWatermark** | **Boolean** | Add audio watermark that identifies the participants. Not supported for simulive webinar. |  [optional] |
|**onDemand** | **Boolean** | Make the webinar on-demand. Not supported for simulive webinar. |  [optional] |
|**panelistsInvitationEmailNotification** | **Boolean** | Send invitation email to panelists. If &#x60;false&#x60;, do not send invitation email to panelists. |  [optional] |
|**panelistsVideo** | **Boolean** | Start video when panelists join webinar. Not supported for simulive webinar. |  [optional] |
|**postWebinarSurvey** | **Boolean** | Zoom will open a survey page in attendees&#39; browsers after leaving the webinar |  [optional] |
|**practiceSession** | **Boolean** | Enable practice session. |  [optional] |
|**questionAndAnswer** | [**WebinarsCreateWebinarRequestSettingsQuestionAndAnswer**](WebinarsCreateWebinarRequestSettingsQuestionAndAnswer.md) |  |  [optional] |
|**registrantsEmailNotification** | **Boolean** | Send email notifications to registrants about approval, cancellation, denial of the registration. The value of this field must be set to true in order to use the &#x60;registrants_confirmation_email&#x60; field. |  [optional] |
|**registrantsRestrictNumber** | **Integer** | Restrict number of registrants for a webinar. By default, it is set to &#x60;0&#x60;. A &#x60;0&#x60; value means that the restriction option is disabled. Provide a number higher than 0 to restrict the webinar registrants by the that number. |  [optional] |
|**registrationType** | [**RegistrationTypeEnum**](#RegistrationTypeEnum) | Registration types. Only used for recurring webinars with a fixed time.    &#x60;1&#x60; - Attendees register once and can attend any of the webinar sessions.    &#x60;2&#x60; - Attendees need to register for each session in order to attend.    &#x60;3&#x60; - Attendees register once and can choose one or more sessions to attend. |  [optional] |
|**send1080pVideoToAttendees** | **Boolean** | Whether to always send 1080p video to attendees. This value defaults to &#x60;false&#x60;.(Not supported for simulive webinar.) |  [optional] |
|**showShareButton** | **Boolean** | Show social share buttons on the registration page. |  [optional] |
|**surveyUrl** | **String** | Survey URL for post webinar survey |  [optional] |
|**enableSessionBranding** | **Boolean** | Whether the **Webinar Session Branding** setting is enabled. This setting lets hosts visually customize a webinar by setting a session background. This also lets hosts set Virtual Background and apply name tags to hosts, alternative hosts, panelists, interpreters, and speakers. |  [optional] |



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



