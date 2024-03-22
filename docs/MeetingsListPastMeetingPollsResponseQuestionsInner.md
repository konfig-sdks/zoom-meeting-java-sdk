

# MeetingsListPastMeetingPollsResponseQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address of the user who submitted answers to the poll. If the user is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**name** | **String** | Name of the user who submitted answers to the poll. If &#x60;anonymous&#x60; option is enabled for a poll, the participant&#39;s polling information will be kept anonymous and the value of &#x60;name&#x60; field will be &#x60;Anonymous Attendee&#x60;. |  [optional] |
|**questionDetails** | [**List&lt;MeetingsListPastMeetingPollsResponseQuestionsInnerQuestionDetailsInner&gt;**](MeetingsListPastMeetingPollsResponseQuestionsInnerQuestionDetailsInner.md) |  |  [optional] |



