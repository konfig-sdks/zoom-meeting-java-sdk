

# AnalyticsDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **LocalDate** | The queried start date |  [optional] |
|**to** | **LocalDate** | The queried end date. |  [optional] |
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageSize** | **Integer** | The number of records returned within a single API call. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. |  [optional] |
|**analyticsDetails** | [**List&lt;AnalyticsDetailsResponseAnalyticsDetailsInner&gt;**](AnalyticsDetailsResponseAnalyticsDetailsInner.md) | Analytics Detail. |  [optional] |



