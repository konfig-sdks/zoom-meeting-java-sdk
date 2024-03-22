

# MeetingsCreateBatchPollsResponsePollsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title for the Poll |  [optional] |
|**anonymous** | **Boolean** | Whether to allow meeting participants to answer poll questions anonymously:  * &#x60;true&#x60; &amp;mdash; Anonymous polls enabled.  * &#x60;false&#x60; &amp;mdash; Participants cannot answer poll questions anonymously. |  [optional] |
|**id** | **String** | Meeting Poll ID |  [optional] |
|**pollType** | [**PollTypeEnum**](#PollTypeEnum) | The type of poll:  * &#x60;1&#x60; &amp;mdash; Poll.  * &#x60;2&#x60; &amp;mdash; Advanced Poll. This feature must be enabled in your Zoom account.  * &#x60;3&#x60; &amp;mdash; Quiz. This feature must be enabled in your Zoom account. |  [optional] |
|**questions** | [**List&lt;MeetingsCreateBatchPollsResponsePollsInnerQuestionsInner&gt;**](MeetingsCreateBatchPollsResponsePollsInnerQuestionsInner.md) | Information about the poll&#39;s questions. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Meeting Poll:    &#x60;notstart&#x60; - Poll not started    &#x60;started&#x60; - Poll started    &#x60;ended&#x60; - Poll ended    &#x60;sharing&#x60; - Sharing poll results |  [optional] |



## Enum: PollTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOTSTART | &quot;notstart&quot; |
| STARTED | &quot;started&quot; |
| ENDED | &quot;ended&quot; |
| SHARING | &quot;sharing&quot; |



