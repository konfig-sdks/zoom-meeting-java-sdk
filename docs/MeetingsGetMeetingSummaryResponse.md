

# MeetingsGetMeetingSummaryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meetingHostId** | **String** | The ID of the user who is set as the meeting host. |  [optional] |
|**meetingHostEmail** | **String** | The meeting host&#39;s email address. |  [optional] |
|**meetingUuid** | **String** | The unique meeting ID.   Each meeting instance generates its own meeting UUID. After a meeting ends, a new UUID is generated for the next instance of the meeting.   Use the [**List past meeting instances**](https://developers.zoom.us) API to retrieve a list of UUIDs from past meeting instances. [Double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) your UUID when using it for API calls if the UUID begins with a &#x60;/&#x60; or contains &#x60;//&#x60; in it.  |  [optional] |
|**meetingId** | **Long** | [The meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-)  The meeting&#39;s unique identifier in **long** format, represented as int64 data type in JSON. Also known as the meeting number. |  [optional] |
|**meetingTopic** | **String** | The meeting topic. |  [optional] |
|**meetingStartTime** | **OffsetDateTime** | The meeting&#39;s start date and time. |  [optional] |
|**meetingEndTime** | **OffsetDateTime** | The meeting&#39;s end date and time. |  [optional] |
|**summaryStartTime** | **OffsetDateTime** | The summary&#39;s start date and time. |  [optional] |
|**summaryEndTime** | **OffsetDateTime** | The summary&#39;s end date and time. |  [optional] |
|**summaryCreatedTime** | **OffsetDateTime** | The date and time when the meeting summary was created. |  [optional] |
|**summaryLastModifiedTime** | **OffsetDateTime** | The date and time when the meeting summary was last modified. |  [optional] |
|**summaryTitle** | **String** | The summary title. |  [optional] |
|**summaryOverview** | **String** | The summary overview. |  [optional] |
|**summaryDetails** | [**List&lt;MeetingsGetMeetingSummaryResponseSummaryDetailsInner&gt;**](MeetingsGetMeetingSummaryResponseSummaryDetailsInner.md) | The summary content details. |  [optional] |
|**nextSteps** | **List&lt;String&gt;** | The next steps. |  [optional] |
|**editedSummary** | [**MeetingsGetMeetingSummaryResponseEditedSummary**](MeetingsGetMeetingSummaryResponseEditedSummary.md) |  |  [optional] |



