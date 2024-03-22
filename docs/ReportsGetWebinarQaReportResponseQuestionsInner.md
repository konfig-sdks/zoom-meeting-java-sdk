

# ReportsGetWebinarQaReportResponseQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The user ID of the user who asked the question. This value returns blank for external users. |  [optional] |
|**email** | **String** | Participant&#39;s email. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**name** | **String** | Participant&#39;s display name.       If anonymous [Q&amp;amp;A](https://support.zoom.us/hc/en-us/articles/203686015-Getting-Started-with-Question-Answer) option is enabled and if a participant submits the Q&amp;amp;A without providing their name, the value of the &#x60;name&#x60; field will be &amp;quot;Anonymous Attendee&amp;quot;. |  [optional] |
|**questionDetails** | [**List&lt;ReportsGetWebinarQaReportResponseQuestionsInnerQuestionDetailsInner&gt;**](ReportsGetWebinarQaReportResponseQuestionsInnerQuestionDetailsInner.md) | Array of questions from the user. |  [optional] |



