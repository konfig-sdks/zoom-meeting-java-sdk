

# WebinarsListAbsenteesResponse

List of users.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageNumber** | **Integer** | **Deprecated.** This field is deprecated. We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. |  [optional] |
|**registrants** | [**List&lt;WebinarsListAbsenteesResponseRegistrantsInner&gt;**](WebinarsListAbsenteesResponseRegistrantsInner.md) | List of registrant objects. |  [optional] |



