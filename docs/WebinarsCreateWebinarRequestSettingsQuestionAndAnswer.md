

# WebinarsCreateWebinarRequestSettingsQuestionAndAnswer

[Q&amp;A](https://support.zoom.us/hc/en-us/articles/203686015-Using-Q-A-as-the-webinar-host#:~:text=Overview,and%20upvote%20each%20other's%20questions.) for webinar.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowSubmitQuestions** | **Boolean** | * &#x60;true&#x60;: Allow participants to submit questions.  * &#x60;false&#x60;: Do not allow submit questions. |  [optional] |
|**allowAnonymousQuestions** | **Boolean** | * &#x60;true&#x60; - Allow participants to send questions without providing their name to the host, co-host, and panelists..  * &#x60;false&#x60; - Do not allow anonymous questions.(Not supported for simulive webinar.) |  [optional] |
|**answerQuestions** | [**AnswerQuestionsEnum**](#AnswerQuestionsEnum) | Indicate whether you want attendees to be able to view answered questions only or view all questions.  * &#x60;only&#x60; - Attendees are able to view answered questions only.  *  &#x60;all&#x60; - Attendees are able to view all questions submitted in the Q&amp;amp;A. |  [optional] |
|**attendeesCanComment** | **Boolean** | * &#x60;true&#x60; - Attendees can answer questions or leave a comment in the question thread.  * &#x60;false&#x60; - Attendees can not answer questions or leave a comment in the question thread |  [optional] |
|**attendeesCanUpvote** | **Boolean** | * &#x60;true&#x60; - Attendees can click the thumbs up button to bring popular questions to the top of the Q&amp;amp;A window.  * &#x60;false&#x60; - Attendees can not click the thumbs up button on questions. |  [optional] |
|**allowAutoReply** | **Boolean** | If simulive webinar,   * &#x60;true&#x60; - allow auto-reply to attendees.   * &#x60;false&#x60; - don&#39;t allow auto-reply to the attendees. |  [optional] |
|**autoReplyText** | **String** | If &#x60;allow_auto_reply&#x60; &#x3D; true, the text to be included in the automatic response.  |  [optional] |
|**enable** | **Boolean** | * &#x60;true&#x60; - Enable [Q&amp;amp;A](https://support.zoom.us/hc/en-us/articles/203686015-Using-Q-A-as-the-webinar-host#:~:text&#x3D;Overview,and%20upvote%20each%20other&#39;s%20questions.) for webinar.  * &#x60;false&#x60; - Disable Q&amp;amp;A for webinar. |  [optional] |



## Enum: AnswerQuestionsEnum

| Name | Value |
|---- | -----|
| ONLY | &quot;only&quot; |
| ALL | &quot;all&quot; |



