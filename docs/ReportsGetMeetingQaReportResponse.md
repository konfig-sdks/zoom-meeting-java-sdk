

# ReportsGetMeetingQaReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The meeting ID in &#x60;long&#x60; format, represented as int64 data type in JSON. Also known as the meeting number. |  [optional] |
|**questions** | [**List&lt;ReportsGetMeetingQaReportResponseQuestionsInner&gt;**](ReportsGetMeetingQaReportResponseQuestionsInner.md) | Array of meeting question objects. |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start time. |  [optional] |
|**uuid** | **String** | The meeting UUID. Each meeting instance will generate its own UUID - for example, after a meeting ends, a new UUID will be generated for the next instance of the meeting. Double-encode your UUID when using it for API calls if the UUID begins with a &#39;/&#39; or contains &#39;//&#39;. |  [optional] |



