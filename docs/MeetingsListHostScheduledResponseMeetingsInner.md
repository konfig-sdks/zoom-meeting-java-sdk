

# MeetingsListHostScheduledResponseMeetingsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agenda** | **String** | Meeting description. The length of agenda gets truncated to 250 characters when you list all of a user&#39;s meetings. To view a meeting&#39;s complete agenda, or to retrieve details for a single meeting, use the [**Get a meeting**](https://developers.zoom.us) API. |  [optional] |
|**createdAt** | **OffsetDateTime** | Time of creation. |  [optional] |
|**duration** | **Integer** | Meeting duration. |  [optional] |
|**hostId** | **String** | ID of the user who is set as the meeting&#39;s host. |  [optional] |
|**id** | **Long** | Meeting ID - also known as the meeting number in long (int64) format. |  [optional] |
|**joinUrl** | **String** | URL using which participants can join a meeting. |  [optional] |
|**pmi** | **String** | [Personal meeting ID](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). This field is only returned if PMI was used to schedule the meeting. |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start time. |  [optional] |
|**timezone** | **String** | Timezone to format the meeting start time.  |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Meeting types.    &#x60;1&#x60; - Instant meeting.    &#x60;2&#x60; - Scheduled meeting.    &#x60;3&#x60; - Recurring meeting with no fixed time.    &#x60;8&#x60; - Recurring meeting with fixed time. |  [optional] |
|**uuid** | **String** | Unique Meeting ID. Each meeting instance will generate its own Meeting UUID. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |



