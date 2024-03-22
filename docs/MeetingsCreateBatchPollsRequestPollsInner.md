

# MeetingsCreateBatchPollsRequestPollsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The poll&#39;s title, up to 64 characters. |  [optional] |
|**anonymous** | **Boolean** | Whether to allow meeting participants to answer poll questions anonymously:  * &#x60;true&#x60; &amp;mdash; Anonymous polls enabled.  * &#x60;false&#x60; &amp;mdash; Participants cannot answer poll questions anonymously.   This value defaults to &#x60;false&#x60;. |  [optional] |
|**pollType** | [**PollTypeEnum**](#PollTypeEnum) | The type of poll:  * &#x60;1&#x60; &amp;mdash; Poll.  * &#x60;2&#x60; &amp;mdash; Advanced Poll. This feature must be enabled in your Zoom account.  * &#x60;3&#x60; &amp;mdash; Quiz. This feature must be enabled in your Zoom account.    This value defaults to &#x60;1&#x60;. |  [optional] |
|**questions** | [**List&lt;MeetingsCreateBatchPollsRequestPollsInnerQuestionsInner&gt;**](MeetingsCreateBatchPollsRequestPollsInnerQuestionsInner.md) | Information about the poll&#39;s questions. |  [optional] |



## Enum: PollTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



