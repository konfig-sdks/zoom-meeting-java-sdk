

# WebinarsGetSurveyResponseCustomSurvey

Information about the customized webinar survey.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The survey&#39;s title, up to 64 characters. |  [optional] |
|**anonymous** | **Boolean** | Allow participants to anonymously answer survey questions.  * &#x60;true&#x60; - Anonymous survey enabled.  * &#x60;false&#x60; - Participants cannot answer survey questions anonymously.    This value defaults to &#x60;true&#x60;. |  [optional] |
|**numberedQuestions** | **Boolean** | Whether to display the number in the question name.    This value defaults to &#x60;true&#x60;. |  [optional] |
|**showQuestionType** | **Boolean** | Whether to display the question type in the question name.    This value defaults to &#x60;false&#x60;. |  [optional] |
|**feedback** | **String** | The survey&#39;s feedback, up to 320 characters.    This value defaults to &#x60;Thank you so much for taking the time to complete the survey, your feedback really makes a difference.&#x60;. |  [optional] |
|**questions** | [**List&lt;WebinarsGetSurveyResponseCustomSurveyQuestionsInner&gt;**](WebinarsGetSurveyResponseCustomSurveyQuestionsInner.md) | Information about the webinar survey&#39;s questions. |  [optional] |



