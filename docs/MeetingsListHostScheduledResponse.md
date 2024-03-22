

# MeetingsListHostScheduledResponse

Pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | Use the next page token to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageNumber** | **Integer** | The page number of the current results. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. |  [optional] |
|**meetings** | [**List&lt;MeetingsListHostScheduledResponseMeetingsInner&gt;**](MeetingsListHostScheduledResponseMeetingsInner.md) | List of meeting objects. |  [optional] |



