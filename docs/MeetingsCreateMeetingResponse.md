

# MeetingsCreateMeetingResponse

Meeting object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assistantId** | **String** | The ID of the user who scheduled this meeting on behalf of the host. |  [optional] |
|**hostEmail** | **String** | The meeting host&#39;s email address. |  [optional] |
|**id** | **Long** | The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in **long** format(represented as int64 data type in JSON), also known as the meeting number. |  [optional] |
|**registrationUrl** | **String** | The URL that registrants can use to register for a meeting. This field is only returned for meetings that have enabled registration. |  [optional] |
|**agenda** | **String** | Agenda |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time when this meeting was created. |  [optional] |
|**duration** | **Integer** | The meeting duration. |  [optional] |
|**h323Password** | **String** | H.323/SIP room system passcode |  [optional] |
|**joinUrl** | **String** | URL for participants to join the meeting. This URL should only be shared with users that you would like to invite for the meeting. |  [optional] |
|**chatJoinUrl** | **String** | The URL to join the chat. |  [optional] |
|**occurrences** | [**List&lt;MeetingsCreateMeetingResponseOccurrencesInner&gt;**](MeetingsCreateMeetingResponseOccurrencesInner.md) | Array of occurrence objects. |  [optional] |
|**password** | **String** | The meeting passcode. This passcode may only contain these characters: &#x60;[a-z A-Z 0-9 @ - _ * !]&#x60;  If **Require a passcode when scheduling new meetings** setting has been enabled and [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated in the response even if it is not provided in the API request.     |  [optional] |
|**pmi** | **String** | [Personal meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). Only used for scheduled meetings and recurring meetings with no fixed time. |  [optional] |
|**preSchedule** | **Boolean** | Whether the prescheduled meeting was created via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This only supports the meeting &#x60;type&#x60; value of &#x60;2&#x60; (scheduled meetings) and &#x60;3&#x60; (recurring meetings with no fixed time).  * &#x60;true&#x60; - A GSuite prescheduled meeting.  * &#x60;false&#x60; - A regular meeting. |  [optional] |
|**recurrence** | [**MeetingsCreateMeetingResponseRecurrence**](MeetingsCreateMeetingResponseRecurrence.md) |  |  [optional] |
|**settings** | [**MeetingsCreateMeetingResponseSettings**](MeetingsCreateMeetingResponseSettings.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start date-time in UTC/GMT, such as &#x60;2020-03-31T12:02:00Z&#x60;. |  [optional] |
|**startUrl** | **String** | URL to start the meeting. This URL should only be used by the host of the meeting and **should not be shared with anyone other than the host** of the meeting, since anyone with this URL will be able to log in to the Zoom Client as the host of the meeting. |  [optional] |
|**timezone** | **String** | Timezone to format &#x60;start_time&#x60;. |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**trackingFields** | [**List&lt;MeetingsCreateMeetingResponseTrackingFieldsInner&gt;**](MeetingsCreateMeetingResponseTrackingFieldsInner.md) | Tracking fields. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Meeting type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |


