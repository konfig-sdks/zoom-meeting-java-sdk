

# MeetingsGetDetailsResponse

Meeting object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assistantId** | **String** | The ID of the user who scheduled this meeting on behalf of the host. |  [optional] |
|**hostEmail** | **String** | The meeting host&#39;s email address. |  [optional] |
|**hostId** | **String** | The ID of the user who is set as the meeting host. |  [optional] |
|**id** | **Long** | [Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in **long** format, represented as int64 data type in JSON, also known as the meeting number. |  [optional] |
|**uuid** | **String** | Unique meeting ID. Each meeting instance generates its own meeting UUID - after a meeting ends, a new UUID is generated for the next instance of the meeting. Retrieve a list of UUIDs from past meeting instances using the [**List past meeting instances**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/pastMeetings) API. [Double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) your UUID when using it for API calls if the UUID begins with a &#x60;/&#x60; or contains &#x60;//&#x60; in it.  |  [optional] |
|**agenda** | **String** | The meeting description. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time.  |  [optional] |
|**duration** | **Integer** | The meeting duration. |  [optional] |
|**encryptedPassword** | **String** | Encrypted passcode for third party endpoints (H323/SIP). |  [optional] |
|**h323Password** | **String** | H.323/SIP room system passcode. |  [optional] |
|**joinUrl** | **String** | The URL for participants to join the meeting. This URL should only be shared with users invited to the meeting. |  [optional] |
|**chatJoinUrl** | **String** | The URL to join the chat. |  [optional] |
|**occurrences** | [**List&lt;MeetingsGetDetailsResponseOccurrencesInner&gt;**](MeetingsGetDetailsResponseOccurrencesInner.md) | Array of occurrence objects. |  [optional] |
|**password** | **String** | Meeting passcode. |  [optional] |
|**pmi** | **String** | [Personal meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). Only used for scheduled meetings and recurring meetings with no fixed time. |  [optional] |
|**preSchedule** | **Boolean** | Whether the prescheduled meeting was created via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This **only** supports the meeting &#x60;type&#x60; value of &#x60;2&#x60; (scheduled meetings) and &#x60;3&#x60; (recurring meetings with no fixed time):  * &#x60;true&#x60; - A GSuite prescheduled meeting.  * &#x60;false&#x60; - A regular meeting. |  [optional] |
|**recurrence** | [**MeetingsGetDetailsResponseRecurrence**](MeetingsGetDetailsResponseRecurrence.md) |  |  [optional] |
|**settings** | [**MeetingsGetDetailsResponseSettings**](MeetingsGetDetailsResponseSettings.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start time in GMT or UTC. Start time will not be returned if the meeting is an **instant** meeting.   |  [optional] |
|**startUrl** | **String** | The &#x60;start_url&#x60; of a meeting is a URL that a host or an alternative host can start the meeting.   The expiration time for the &#x60;start_url&#x60; field listed in the response of the [**Create a meeting**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/meetingCreate) API is two hours for all regular users.    For users created using the &#x60;custCreate&#x60; option via the [**Create users**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/userCreate) API, the expiration time of the &#x60;start_url&#x60; field is 90 days.   For security reasons, to retrieve the updated value for the &#x60;start_url&#x60; field programmatically after the expiry time, you must call the [**Get a meeting](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/meeting) API and refer to the value of the &#x60;start_url&#x60; field in the response.    This URL should only be used by the host of the meeting and **should not be shared with anyone other than the host** of the meeting as anyone with this URL will be able to login to the Zoom Client as the host of the meeting. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Meeting status |  [optional] |
|**timezone** | **String** | The timezone to format the meeting start time. |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**trackingFields** | [**List&lt;MeetingsGetDetailsResponseTrackingFieldsInner&gt;**](MeetingsGetDetailsResponseTrackingFieldsInner.md) | Tracking fields. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Meeting types.   &#x60;1&#x60; - Instant meeting.    &#x60;2&#x60; - Scheduled meeting.    &#x60;3&#x60; - Recurring meeting with no fixed time.    &#x60;4&#x60; - PMI Meeting     &#x60;8&#x60; - Recurring meeting with a fixed time. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING | &quot;waiting&quot; |
| STARTED | &quot;started&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_8 | 8 |



