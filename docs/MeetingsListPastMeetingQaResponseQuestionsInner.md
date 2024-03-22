

# MeetingsListPastMeetingQaResponseQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The user&#39;s email address. If the user is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**name** | **String** | The user&#39;s name. If &#x60;anonymous&#x60; option is enabled for the Q&amp;amp;A, the participant&#39;s information is be kept anonymous and the value of &#x60;name&#x60; field is &#x60;Anonymous Attendee&#x60;. |  [optional] |
|**questionDetails** | [**List&lt;MeetingsListPastMeetingQaResponseQuestionsInnerQuestionDetailsInner&gt;**](MeetingsListPastMeetingQaResponseQuestionsInnerQuestionDetailsInner.md) |  |  [optional] |



