

# MeetingsListMeetingSummariesResponseSummariesInner

The meeting summary object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meetingHostId** | **String** | The ID of the user who is set as the meeting host. |  [optional] |
|**meetingHostEmail** | **String** | The meeting host&#39;s email address. |  [optional] |
|**meetingUuid** | **String** | Unique meeting ID. Each meeting instance generates its own meeting UUID - after a meeting ends, a new UUID is generated for the next instance of the meeting. Retrieve a list of UUIDs from past meeting instances using the [**List past meeting instances**](https://developers.zoom.us) API. [Double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) your UUID when using it for API calls if the UUID begins with a &#x60;/&#x60; or contains &#x60;//&#x60; in it.  |  [optional] |
|**meetingId** | **Long** | [Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-) - the meeting&#39;s unique identifier in **long** format, represented as int64 data type in JSON, also known as the meeting number. |  [optional] |
|**meetingTopic** | **String** | Meeting topic. |  [optional] |
|**meetingStartTime** | **OffsetDateTime** | The meeting&#39;s start date and time. |  [optional] |
|**meetingEndTime** | **OffsetDateTime** | The meeting&#39;s end date and time. |  [optional] |
|**summaryStartTime** | **OffsetDateTime** | The summary&#39;s start date and time. |  [optional] |
|**summaryEndTime** | **OffsetDateTime** | The summary&#39;s end date and time. |  [optional] |
|**summaryCreatedTime** | **OffsetDateTime** | The date and time at which the meeting summary was created. |  [optional] |
|**summaryLastModifiedTime** | **OffsetDateTime** | The date and time at which the meeting summary was last modified. |  [optional] |



