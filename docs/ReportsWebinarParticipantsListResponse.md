

# ReportsWebinarParticipantsListResponse

Pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageSize** | **Integer** | The number of records returned within a single API call. |  [optional] |
|**totalRecords** | **Integer** | The number of all records available across pages. |  [optional] |
|**participants** | [**List&lt;ReportsWebinarParticipantsListResponseParticipantsInner&gt;**](ReportsWebinarParticipantsListResponseParticipantsInner.md) | Information about the webinar participant. |  [optional] |



