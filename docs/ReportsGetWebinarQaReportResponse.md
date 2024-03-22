

# ReportsGetWebinarQaReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | Webinar ID in &#x60;long&#x60; format, represented as int64 data type in JSON. Also known as the webinar number. |  [optional] |
|**questions** | [**List&lt;ReportsGetWebinarQaReportResponseQuestionsInner&gt;**](ReportsGetWebinarQaReportResponseQuestionsInner.md) | Array of webinar question objects. |  [optional] |
|**startTime** | **OffsetDateTime** | Webinar start time. |  [optional] |
|**uuid** | **String** | Webinar UUID. Each webinar instance will generate its own UUID - after a webinar ends, a new UUID will be generated for the next instance of the webinar. Double-encode your UUID when using it for API calls if the UUID begins with a &#39;/&#39; or contains &#39;//&#39; in it. |  [optional] |



