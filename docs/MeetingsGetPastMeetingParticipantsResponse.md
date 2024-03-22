

# MeetingsGetPastMeetingParticipantsResponse

Pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageCount** | **Integer** | The number of pages returned for the request made. |  [optional] |
|**pageSize** | **Integer** | The number of records returned within a single API call. |  [optional] |
|**totalRecords** | **Integer** | The number of all records available across pages. |  [optional] |
|**participants** | [**List&lt;MeetingsGetPastMeetingParticipantsResponseParticipantsInner&gt;**](MeetingsGetPastMeetingParticipantsResponseParticipantsInner.md) | Array of meeting participant objects. |  [optional] |



