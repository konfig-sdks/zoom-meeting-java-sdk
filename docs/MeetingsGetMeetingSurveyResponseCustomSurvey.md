

# MeetingsGetMeetingSurveyResponseCustomSurvey

Information about the customized meeting survey.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The survey&#39;s title, up to 64 characters. |  [optional] |
|**anonymous** | **Boolean** | Allow participants to anonymously answer survey questions.    This value defaults to &#x60;true&#x60;. |  [optional] |
|**numberedQuestions** | **Boolean** | Whether to display the number in the question name.    This value defaults to &#x60;true&#x60;. |  [optional] |
|**showQuestionType** | **Boolean** | Whether to display the question type in the question name.    This value defaults to &#x60;false&#x60;. |  [optional] |
|**feedback** | **String** | The survey&#39;s feedback, up to 320 characters.    This value defaults to &#x60;Thank you so much for taking the time to complete the survey. Your feedback really makes a difference.&#x60;. |  [optional] |
|**questions** | [**List&lt;MeetingsGetMeetingSurveyResponseCustomSurveyQuestionsInner&gt;**](MeetingsGetMeetingSurveyResponseCustomSurveyQuestionsInner.md) | Information about the meeting survey&#39;s questions. |  [optional] |



