

# ReportsGetWebinarQaReportResponseQuestionsInnerQuestionDetailsInnerAnswerDetailsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The user ID of the user who answered the question. This value returns blank for external users. |  [optional] |
|**name** | **String** | User display name, including the host or participant.  |  [optional] |
|**email** | **String** | Participant&#39;s email. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**content** | **String** | The answer from the host or the comment from a participant. |  [optional] |
|**createTime** | **String** | Content submission time. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of answer. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| HOST_ANSWERED | &quot;host_answered&quot; |
| PARTICIPANT_COMMENTED | &quot;participant_commented&quot; |



