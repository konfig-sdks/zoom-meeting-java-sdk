

# CloudRecordingGetSettingsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalType** | [**ApprovalTypeEnum**](#ApprovalTypeEnum) | The approval type for the registration.     &#x60;0&#x60;- Automatically approve the registration when a user registers.     &#x60;1&#x60; - Manually approve or deny the registration of a user.     &#x60;2&#x60; - No registration required to view the recording. |  [optional] |
|**authenticationDomains** | **String** | The domains for authentication. |  [optional] |
|**authenticationOption** | **String** | The options for authentication . |  [optional] |
|**onDemand** | **Boolean** | This field determines whether registration is required to view the recording. |  [optional] |
|**password** | **String** | This field enables passcode protection for the recording by setting a passcode. The passcode must have a minimum of **eight** characters with a mix of numbers, letters and special characters.          **Note:** If the account owner or the admin has set minimum passcode strength requirements for recordings through Account Settings, the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling either the [**Get user settings**](/api-reference/zoom-api/methods#operation/userSettings) API or the [**Get account settings**](/api-reference/zoom-api/ma#operation/accountSettings) API. |  [optional] |
|**recordingAuthentication** | **Boolean** | THis field only authenticated users can view. |  [optional] |
|**sendEmailToHost** | **Boolean** | This field enables you to send an email to the host when someone registers to view the recording. This applies for On-demand recordings only. |  [optional] |
|**shareRecording** | [**ShareRecordingEnum**](#ShareRecordingEnum) | This field determines how the meeting recording is shared. |  [optional] |
|**showSocialShareButtons** | **Boolean** | This field shows social share buttons on registration page. This applies for On-demand recordings only. |  [optional] |
|**topic** | **String** | The name of the recording. |  [optional] |
|**viewerDownload** | **Boolean** | This field determines whether a viewer can download the recording file or not. |  [optional] |



## Enum: ApprovalTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



## Enum: ShareRecordingEnum

| Name | Value |
|---- | -----|
| PUBLICLY | &quot;publicly&quot; |
| INTERNALLY | &quot;internally&quot; |
| NONE | &quot;none&quot; |



