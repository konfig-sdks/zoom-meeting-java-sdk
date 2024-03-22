

# WebinarsCreatePollResponse

Information about meeting and webinar polling.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The poll&#39;s title, up to 64 characters. |  [optional] |
|**id** | **String** | Webinar Poll ID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the Webinar Poll:    &#x60;notstart&#x60; - Poll not started    &#x60;started&#x60; - Poll started    &#x60;ended&#x60; - Poll ended    &#x60;sharing&#x60; - Sharing poll results |  [optional] |
|**anonymous** | **Boolean** | Allow meeting participants to answer poll questions anonymously.   This value defaults to &#x60;false&#x60;. |  [optional] |
|**pollType** | [**PollTypeEnum**](#PollTypeEnum) | The type of poll.  * &#x60;1&#x60; - Poll.  * &#x60;2&#x60; - Advanced Poll. This feature must be enabled in your Zoom account.  * &#x60;3&#x60; - Quiz. This feature must be enabled in your Zoom account.    This value defaults to &#x60;1&#x60;. |  [optional] |
|**questions** | [**List&lt;WebinarsCreatePollResponseQuestionsInner&gt;**](WebinarsCreatePollResponseQuestionsInner.md) | Information about the poll&#39;s questions. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOTSTART | &quot;notstart&quot; |
| STARTED | &quot;started&quot; |
| ENDED | &quot;ended&quot; |
| SHARING | &quot;sharing&quot; |



## Enum: PollTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



