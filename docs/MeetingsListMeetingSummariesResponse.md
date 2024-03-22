

# MeetingsListMeetingSummariesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**nextPageToken** | **String** | The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**from** | **OffsetDateTime** | The start date in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;&#x60; UTC format used to retrieve the creation date range of the meeting summaries. |  [optional] |
|**to** | **OffsetDateTime** | The end date in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;&#x60; UTC format used to retrieve the creation date range of the meeting summaries. |  [optional] |
|**summaries** | [**List&lt;MeetingsListMeetingSummariesResponseSummariesInner&gt;**](MeetingsListMeetingSummariesResponseSummariesInner.md) | List of meeting summary objects. |  [optional] |



