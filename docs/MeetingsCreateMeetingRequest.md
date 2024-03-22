

# MeetingsCreateMeetingRequest

The base meeting object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agenda** | **String** | The meeting&#39;s agenda. This value has a maximum length of 2,000 characters. |  [optional] |
|**defaultPassword** | **Boolean** | Whether to generate a default passcode using the user&#39;s settings. This value defaults to &#x60;false&#x60;.   If this value is &#x60;true&#x60; and the user has the PMI setting enabled with a passcode, then the user&#39;s meetings will use the PMI passcode. It will **not** use a default passcode. |  [optional] |
|**duration** | **Integer** | The meeting&#39;s scheduled duration, in minutes. This field is only used for scheduled meetings (&#x60;2&#x60;). |  [optional] |
|**password** | **String** | The passcode required to join the meeting. By default, a passcode can **only** have a maximum length of 10 characters and only contain alphanumeric characters and the &#x60;@&#x60;, &#x60;-&#x60;, &#x60;_&#x60;, and &#x60;*&#x60; characters.  * If the account owner or administrator has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode **must** meet those requirements.  * If passcode requirements are enabled, use the [**Get user settings**](https://developers.zoom.us/docs/api-reference/zoom-api/methods#operation/userSettings) API or the [**Get account settings**](https://developers.zoom.us/docs/api-reference/zoom-api/ma#operation/accountSettings) API to get the requirements. |  [optional] |
|**preSchedule** | **Boolean** | Whether to create a prescheduled meeting via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This **only** supports the meeting &#x60;type&#x60; value of &#x60;2&#x60; (scheduled meetings) and &#x60;3&#x60; (recurring meetings with no fixed time).  * &#x60;true&#x60; - Create a prescheduled meeting.  * &#x60;false&#x60; - Create a regular meeting. |  [optional] |
|**recurrence** | [**MeetingsCreateMeetingRequestRecurrence**](MeetingsCreateMeetingRequestRecurrence.md) |  |  [optional] |
|**scheduleFor** | **String** | The email address or user ID of the user to schedule a meeting for. |  [optional] |
|**settings** | [**MeetingsCreateMeetingRequestSettings**](MeetingsCreateMeetingRequestSettings.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** | The meeting&#39;s start time. This field is only used for scheduled or recurring meetings with a fixed time. This supports local time and GMT formats.  * To set a meeting&#39;s start time in GMT, use the &#x60;yyyy-MM-ddTHH:mm:ssZ&#x60; date-time format. For example, &#x60;2020-03-31T12:02:00Z&#x60;.  * To set a meeting&#39;s start time using a specific timezone, use the &#x60;yyyy-MM-ddTHH:mm:ss&#x60; date-time format and specify the [timezone ID](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones) in the &#x60;timezone&#x60; field. If you do not specify a timezone, the &#x60;timezone&#x60; value defaults to your Zoom account&#39;s timezone. You can also use &#x60;UTC&#x60; for the &#x60;timezone&#x60; value. **Note:** If no &#x60;start_time&#x60; is set for a scheduled meeting, the &#x60;start_time&#x60; is set at the current time and the meeting type changes to an instant meeting, which expires after 30 days. |  [optional] |
|**templateId** | **String** | The account admin meeting template ID used to schedule a meeting using a [meeting template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates). For a list of account admin-provided meeting templates, use the [**List meeting templates**](https://developers.zoom.us/docs/api-reference/zoom-api/methods#operation/listMeetingTemplates) API.  * At this time, this field **only** accepts account admin meeting template IDs.  * To enable the account admin meeting templates feature, [contact Zoom support](https://support.zoom.us/hc/en-us). |  [optional] |
|**timezone** | **String** | The timezone to assign to the &#x60;start_time&#x60; value. This field is only used for scheduled or recurring meetings with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones). |  [optional] |
|**topic** | **String** | The meeting&#39;s topic. |  [optional] |
|**trackingFields** | [**List&lt;MeetingsCreateMeetingRequestTrackingFieldsInner&gt;**](MeetingsCreateMeetingRequestTrackingFieldsInner.md) | Information about the meeting&#39;s tracking fields. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of meeting. * &#x60;1&#x60; - An instant meeting.  * &#x60;2&#x60; - A scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;8&#x60; - A recurring meeting with fixed time. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |



