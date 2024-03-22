

# ReportsListUpcomingEventsReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **LocalDate** | The report&#39;s start date. This value must be within the past six months. |  [optional] |
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token returns when the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageSize** | **Integer** | The number of records returned in a single API call. |  [optional] |
|**to** | **LocalDate** | The report&#39;s end date. This value must be within the past six months and cannot exceed a month from the &#x60;from&#x60; value. |  [optional] |
|**upcomingEvents** | [**List&lt;ReportsListUpcomingEventsReportResponseUpcomingEventsInner&gt;**](ReportsListUpcomingEventsReportResponseUpcomingEventsInner.md) | Information about the upcoming event. |  [optional] |



