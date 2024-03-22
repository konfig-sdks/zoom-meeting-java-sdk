

# ReportsGetActiveInactiveHostReportsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **LocalDate** | Start date for this report. |  [optional] |
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageNumber** | **Integer** | The page number of the current results. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**to** | **LocalDate** | End date for this report. |  [optional] |
|**totalRecords** | **Integer** | The total number of all the records available across pages. |  [optional] |
|**totalMeetingMinutes** | **Integer** | Number of meeting minutes for this range. |  [optional] |
|**totalMeetings** | **Integer** | Number of meetings for this range. |  [optional] |
|**totalParticipants** | **Integer** | Number of participants for this range. |  [optional] |
|**users** | [**List&lt;Object&gt;**](Object.md) | Array of user objects. |  [optional] |



