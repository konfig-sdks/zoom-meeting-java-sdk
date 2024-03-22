

# MeetingsControlInMeetingFeaturesRequestParams

The in-meeting parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contacts** | [**List&lt;MeetingsControlInMeetingFeaturesRequestParamsContactsInner&gt;**](MeetingsControlInMeetingFeaturesRequestParamsContactsInner.md) | The user&#39;s email address or the user ID, up to a maximum of 10 contacts. The account must be a part of the meeting host&#39;s account. |  [optional] |
|**inviteeName** | **String** | The user&#39;s name to display in the meeting. Use this field if you pass the &#x60;participant.invite.callout&#x60; value for the &#x60;method&#x60; field. |  [optional] |
|**phoneNumber** | **String** | The user&#39;s phone number. Use this field if you pass the &#x60;participant.invite.callout&#x60; value for the &#x60;method&#x60; field. As a best practice, ensure this includes a country code and area code. |  [optional] |
|**inviteOptions** | [**MeetingsControlInMeetingFeaturesRequestParamsInviteOptions**](MeetingsControlInMeetingFeaturesRequestParamsInviteOptions.md) |  |  [optional] |
|**callType** | **String** | The type of call out. Use a value of &#x60;h323&#x60; or &#x60;sip&#x60;. Use this field if you pass the &#x60;participant.invite.room_system_callout&#x60; value for the &#x60;method&#x60; field. |  [optional] |
|**deviceIp** | **String** | The user&#39;s device IP address or URI. Use this field if you pass the &#x60;participant.invite.room_system_callout&#x60; value for the &#x60;method&#x60; field. |  [optional] |
|**h323Headers** | [**MeetingsControlInMeetingFeaturesRequestParamsH323Headers**](MeetingsControlInMeetingFeaturesRequestParamsH323Headers.md) |  |  [optional] |
|**sipHeaders** | [**MeetingsControlInMeetingFeaturesRequestParamsSipHeaders**](MeetingsControlInMeetingFeaturesRequestParamsSipHeaders.md) |  |  [optional] |



