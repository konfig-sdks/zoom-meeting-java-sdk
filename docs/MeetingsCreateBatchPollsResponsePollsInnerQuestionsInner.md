

# MeetingsCreateBatchPollsResponsePollsInnerQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**answerMaxCharacter** | **Integer** | The allowed maximum number of characters. This field only returns for &#x60;short_answer&#x60; and &#x60;long_answer&#x60; polls. |  [optional] |
|**answerMinCharacter** | **Integer** | The allowed minimum number of characters. This field only returns for &#x60;short_answer&#x60; and &#x60;long_answer&#x60; polls. |  [optional] |
|**answerRequired** | **Boolean** | Whether participants must answer the question:  * &#x60;true&#x60; &amp;mdash; The participant must answer the question.  * &#x60;false&#x60; &amp;mdash; The participant does not need to answer the question. |  [optional] |
|**answers** | **List&lt;String&gt;** | The poll question&#39;s available answers. |  [optional] |
|**caseSensitive** | **Boolean** | Whether the correct answer is case sensitive. This field only returns for &#x60;fill_in_the_blank&#x60; polls:  * &#x60;true&#x60; &amp;mdash; The answer is case-sensitive.  * &#x60;false&#x60; &amp;mdash; The answer is not case-sensitive. |  [optional] |
|**name** | **String** | The poll question&#39;s title. For &#x60;fill_in_the_blank&#x60; polls, this field is the poll&#39;s question. |  [optional] |
|**prompts** | [**List&lt;MeetingsCreateBatchPollsResponsePollsInnerQuestionsInnerPromptsInner&gt;**](MeetingsCreateBatchPollsResponsePollsInnerQuestionsInnerPromptsInner.md) | Information about the prompt questions. This object only returns for &#x60;matching&#x60; and &#x60;rank_order&#x60; polls. |  [optional] |
|**ratingMaxLabel** | **String** | The high score label used for the &#x60;rating_max_value&#x60; field. This field only returns for &#x60;rating_scale&#x60; polls. |  [optional] |
|**ratingMaxValue** | **Integer** | The rating scale&#39;s maximum value. This field only returns for &#x60;rating_scale&#x60; polls. |  [optional] |
|**ratingMinLabel** | **String** | The low score label used for the &#x60;rating_min_value&#x60; field. This field only returns for &#x60;rating_scale&#x60; polls. |  [optional] |
|**ratingMinValue** | **Integer** | The rating scale&#39;s minimum value. This field only returns for &#x60;rating_scale&#x60; polls. |  [optional] |
|**rightAnswers** | **List&lt;String&gt;** | The poll question&#39;s correct answer(s). |  [optional] |
|**showAsDropdown** | **Boolean** | Whether to display the radio selection as a drop-down box:  * &#x60;true&#x60; &amp;mdash; Show as a drop-down box.  * &#x60;false&#x60; &amp;mdash; Do not show as a drop-down box. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The poll&#39;s question and answer type:  * &#x60;single&#x60; &amp;mdash; Single choice.  * &#x60;multiple&#x60; &amp;mdash; Multiple choice.  * &#x60;matching&#x60; &amp;mdash; Matching.  * &#x60;rank_order&#x60; &amp;mdash; Rank order.  * &#x60;short_answer&#x60; &amp;mdash; Short answer.  * &#x60;long_answer&#x60; &amp;mdash; Long answer.  * &#x60;fill_in_the_blank&#x60; &amp;mdash; Fill in the blank.  * &#x60;rating_scale&#x60; &amp;mdash; Rating scale. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| MULTIPLE | &quot;multiple&quot; |
| MATCHING | &quot;matching&quot; |
| RANK_ORDER | &quot;rank_order&quot; |
| SHORT_ANSWER | &quot;short_answer&quot; |
| LONG_ANSWER | &quot;long_answer&quot; |
| FILL_IN_THE_BLANK | &quot;fill_in_the_blank&quot; |
| RATING_SCALE | &quot;rating_scale&quot; |



