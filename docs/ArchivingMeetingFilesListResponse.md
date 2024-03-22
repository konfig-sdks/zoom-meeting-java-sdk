

# ArchivingMeetingFilesListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **OffsetDateTime** | The queried start date. |  [optional] |
|**meetings** | [**List&lt;ArchivingMeetingFilesListResponseMeetingsInner&gt;**](ArchivingMeetingFilesListResponseMeetingsInner.md) | Information about the meeting or webinar. |  [optional] |
|**nextPageToken** | **String** | Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes.   **Note:** if you use &#x60;next_page_token&#x60; as a parameter, your other request parameters should be changeless to make sure that the large result set is what you want. For example, if your &#x60;to&#x60; parameter is for a future time, Zoom resets this value to the current time and returns this value in the response body, along with the &#x60;next_page_token&#x60; value. Use these same &#x60;to&#x60; and &#x60;next_page_token&#x60; values in requests for the remaining results set; otherwise you will get an invalid token error. |  [optional] |
|**pageSize** | **Integer** | The number of records returned within a single API call. |  [optional] |
|**to** | **OffsetDateTime** | The queried end date. |  [optional] |
|**totalRecords** | **Integer** | The total number of returned meeting records. |  [optional] |



