

# WebinarsUpdatePollRequestQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**answerMaxCharacter** | **Integer** | The allowed maximum number of characters. This field only applies to &#x60;short_answer&#x60; and &#x60;long_answer&#x60; polls:  * For &#x60;short_answer&#x60; polls, a maximum of 500 characters.  * For &#x60;long_answer&#x60; polls, a maximum of 2,000 characters. |  [optional] |
|**answerMinCharacter** | **Integer** | The allowed minimum number of characters. This field only applies to &#x60;short_answer&#x60; and &#x60;long_answer&#x60; polls. You must provide at least a **one** character minimum value. |  [optional] |
|**answerRequired** | **Boolean** | Whether participants must answer the question:  * &#x60;true&#x60; &amp;mdash; The participant must answer the question.  * &#x60;false&#x60; &amp;mdash; The participant does not need to answer the question.   **Note:**  * When the poll&#39;s &#x60;type&#x60; value is &#x60;1&#x60; (Poll), this value defaults to &#x60;true&#x60;.  * When the poll&#39;s &#x60;type&#x60; value is the &#x60;2&#x60; (Advanced Poll) or &#x60;3&#x60; (Quiz) values, this value defaults to &#x60;false&#x60;. |  [optional] |
|**answers** | **List&lt;String&gt;** | The poll question&#39;s available answers. This field requires a **minimum** of two answers.   * For &#x60;single&#x60; and &#x60;multiple&#x60; polls, you can only provide a maximum of 10 answers.  * For &#x60;matching&#x60; polls, you can only provide a maximum of 16 answers.  * For &#x60;rank_order&#x60; polls, you can only provide a maximum of seven answers. |  [optional] |
|**caseSensitive** | **Boolean** | Whether the correct answer is case sensitive. This field only applies to &#x60;fill_in_the_blank&#x60; polls:  * &#x60;true&#x60; &amp;mdash; The answer is case-sensitive.  * &#x60;false&#x60; &amp;mdash; The answer is not case-sensitive.   This value defaults to &#x60;false&#x60;. |  [optional] |
|**name** | **String** | The poll question, up to 255 characters.   For &#x60;fill_in_the_blank&#x60; polls, this field is the poll&#39;s question. For each value that the user must fill in, ensure that there are the same number of &#x60;right_answers&#x60; values. |  [optional] |
|**prompts** | [**List&lt;WebinarsUpdatePollRequestQuestionsInnerPromptsInner&gt;**](WebinarsUpdatePollRequestQuestionsInnerPromptsInner.md) | Information about the prompt questions. This field only applies to &#x60;matching&#x60; and &#x60;rank_order&#x60; polls. You **must** provide a minimum of two prompts, up to a maximum of 10 prompts. |  [optional] |
|**ratingMaxLabel** | **String** | The high score label used for the &#x60;rating_max_value&#x60; field.   This field only applies to the &#x60;rating_scale&#x60; poll. |  [optional] |
|**ratingMaxValue** | **Integer** | The rating scale&#39;s maximum value, up to a maximum value of 10.   This field only applies to the &#x60;rating_scale&#x60; poll. |  [optional] |
|**ratingMinLabel** | **String** | The low score label used for the &#x60;rating_min_value&#x60; field.   This field only applies to the &#x60;rating_scale&#x60; poll. |  [optional] |
|**ratingMinValue** | **Integer** | The rating scale&#39;s minimum value. This value cannot be less than zero.   This field only applies to the &#x60;rating_scale&#x60; poll. |  [optional] |
|**rightAnswers** | **List&lt;String&gt;** | The poll question&#39;s correct answer(s). This field is **required** if the poll&#39;s &#x60;type&#x60; value is &#x60;3&#x60; (Quiz).    For &#x60;single&#x60; and &#x60;matching&#x60; polls, this field only accepts one answer. |  [optional] |
|**showAsDropdown** | **Boolean** | Whether to display the radio selection as a drop-down box:  * &#x60;true&#x60; &amp;mdash; Show as a drop-down box.  * &#x60;false&#x60; &amp;mdash; Do not show as a drop-down box.   This value defaults to &#x60;false&#x60;. |  [optional] |
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



