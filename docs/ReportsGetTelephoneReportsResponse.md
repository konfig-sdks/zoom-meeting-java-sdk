

# ReportsGetTelephoneReportsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **LocalDate** | Start date for this report. |  [optional] |
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. This field does **not** return if the &#x60;query_date_type&#x60; parameter is the &#x60;meeting_start_time&#x60; or &#x60;meeting_end_time&#x60; value. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**to** | **LocalDate** | End date for this report. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. This field does **not** return if the &#x60;query_date_type&#x60; parameter is the &#x60;meeting_start_time&#x60; or &#x60;meeting_end_time&#x60; value. |  [optional] |
|**telephonyUsage** | [**List&lt;ReportsGetTelephoneReportsResponseTelephonyUsageInner&gt;**](ReportsGetTelephoneReportsResponseTelephonyUsageInner.md) | Array of telephony objects. |  [optional] |



