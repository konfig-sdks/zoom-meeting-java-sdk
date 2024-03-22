

# CloudRecordingListRecordingsResponse

The pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **LocalDate** | The start date. |  [optional] |
|**to** | **LocalDate** | The end date. |  [optional] |
|**nextPageToken** | **String** | The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageSize** | **Integer** | The number of records returned within a single API call. |  [optional] |
|**totalRecords** | **Integer** | The number of all records available across pages. |  [optional] |
|**meetings** | [**List&lt;CloudRecordingListRecordingsResponseMeetingsInner&gt;**](CloudRecordingListRecordingsResponseMeetingsInner.md) | List of recordings. |  [optional] |



