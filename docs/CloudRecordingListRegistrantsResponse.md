

# CloudRecordingListRegistrantsResponse

Information about the meeting cloud recording registrant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageNumber** | **Integer** | **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. |  [optional] |
|**registrants** | [**List&lt;CloudRecordingListRegistrantsResponseRegistrantsInner&gt;**](CloudRecordingListRegistrantsResponseRegistrantsInner.md) | Information about the cloud recording registrants. |  [optional] |


