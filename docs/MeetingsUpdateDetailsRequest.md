

# MeetingsUpdateDetailsRequest

Meeting object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agenda** | **String** | Meeting description. |  [optional] |
|**duration** | **Integer** | Meeting duration in minutes. Used for scheduled meetings only. |  [optional] |
|**password** | **String** | Meeting passcode. Passcodes may only contain these characters [a-z A-Z 0-9 @ - _ *] and can have a maximum of 10 characters.  **Note** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, view those requirements by calling either the [**Get user settings**](https://developers.zoom.us) API or the [**Get account settings**](https://developers.zoom.us) API. |  [optional] |
|**preSchedule** | **Boolean** | Whether to create a prescheduled meeting through the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This **only** supports the meeting &#x60;type&#x60; value of &#x60;2&#x60; - scheduled meetings- and &#x60;3&#x60; - recurring meetings with no fixed time.  * &#x60;true&#x60; - Create a prescheduled meeting.  * &#x60;false&#x60; - Create a regular meeting. |  [optional] |
|**scheduleFor** | **String** | The email address or &#x60;userId&#x60; of the user to schedule a meeting for. |  [optional] |
|**recurrence** | [**MeetingsUpdateDetailsRequestRecurrence**](MeetingsUpdateDetailsRequestRecurrence.md) |  |  [optional] |
|**settings** | [**MeetingsUpdateDetailsRequestSettings**](MeetingsUpdateDetailsRequestSettings.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start time. When using a format like &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;&#x60;, always use GMT time. When using a format like &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#x60;, use local time and specify the time zone. Only used for scheduled meetings and recurring meetings with a fixed time. |  [optional] |
|**templateId** | **String** | Unique identifier of the meeting template.   [Schedule the meeting from a meeting template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates#h_86f06cff-0852-4998-81c5-c83663c176fb). Retrieve this field&#39;s value by calling the [List meeting templates](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods/#operation/listMeetingTemplates) API. |  [optional] |
|**timezone** | **String** | The timezone to assign to the &#x60;start_time&#x60; value. Only use this field ifor scheduled or recurring meetings with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones). |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**trackingFields** | [**List&lt;MeetingsUpdateDetailsRequestTrackingFieldsInner&gt;**](MeetingsUpdateDetailsRequestTrackingFieldsInner.md) | Tracking fields. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Meeting types.  &#x60;1&#x60; - Instant meeting.    &#x60;2&#x60; - Scheduled meeting.    &#x60;3&#x60; - Recurring meeting with no fixed time.    &#x60;8&#x60; - Recurring meeting with a fixed time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |



