

# MeetingsListUpcomingMeetingsResponseMeetingsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-) - a unique identifier of the meeting in **long** format, represented as int64 data type in JSON. Also known as the meeting number. |  [optional] |
|**topic** | **String** | The meeting topic. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Meeting types. &#x60;1&#x60; - Instant meeting. &#x60;2&#x60; - Scheduled meeting. &#x60;3&#x60; - Recurring meeting with no fixed time. &#x60;8&#x60; - Recurring meeting with fixed time. |  [optional] |
|**startTime** | **OffsetDateTime** | The meeting&#39;s start time. |  [optional] |
|**duration** | **Integer** | Meeting duration. |  [optional] |
|**timezone** | **String** | The timezone to format the meeting start time. |  [optional] |
|**createdAt** | **OffsetDateTime** | The meeting creation time. |  [optional] |
|**joinUrl** | **String** | The URL that participants can use to join a meeting. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |



