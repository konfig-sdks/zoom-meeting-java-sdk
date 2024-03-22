

# ReportsGetMeetingReportsResponseMeetingsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customKeys** | [**List&lt;ReportsGetMeetingReportsResponseMeetingsInnerCustomKeysInner&gt;**](ReportsGetMeetingReportsResponseMeetingsInnerCustomKeysInner.md) | Information about the meeting&#39;s assigned custom keys and values. This returns a maximum of 10 items. |  [optional] |
|**duration** | **Integer** | The meeting&#39;s duration. |  [optional] |
|**endTime** | **OffsetDateTime** | The meeting&#39;s end date and time. |  [optional] |
|**id** | **Integer** | The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID). |  [optional] |
|**participantsCount** | **Integer** | The number of meeting participants. |  [optional] |
|**sessionKey** | **String** | The Video SDK custom session ID. |  [optional] |
|**source** | **String** | Whether the meeting was created directly through Zoom or via an API request:  * If the meeting was created via an OAuth app, this field returns the OAuth app&#39;s name.  * If the meeting was created via JWT or the Zoom Web Portal, this returns the &#x60;Zoom&#x60; value. |  [optional] |
|**startTime** | **OffsetDateTime** | The meeting&#39;s start date and time. |  [optional] |
|**topic** | **String** | The meeting&#39;s topic. |  [optional] |
|**totalMinutes** | **Integer** | The sum of meeting minutes from all meeting participants in the meeting. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of meeting or webinar.   meeting:  * &#x60;1&#x60; &amp;mdash; Instant meeting.  * &#x60;2&#x60; &amp;mdash; Scheduled meeting.  * &#x60;3&#x60; &amp;mdash; A recurring meeting with no fixed time.  * &#x60;4&#x60; &amp;mdash; A meeting created via PMI (Personal Meeting ID).  * &#x60;7&#x60; &amp;mdash; A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.   webinar:  * &#x60;5&#x60; &amp;mdash; A webinar.  * &#x60;6&#x60; &amp;mdash; A recurring webinar without a fixed time  * &#x60;9&#x60; &amp;mdash; A recurring webinar with a fixed time.  |  [optional] |
|**userEmail** | **String** | The user&#39;s email address. |  [optional] |
|**userName** | **String** | The user&#39;s display name. |  [optional] |
|**uuid** | **String** | The meeting&#39;s universally unique identifier (UUID). Each meeting instance generates a meeting UUID. |  [optional] |
|**scheduleTime** | **String** | The meeting&#39;s scheduled date and time. |  [optional] |
|**joinWaitingRoomTime** | **String** | The date and time at which the attendee joined the waiting room. |  [optional] |
|**joinTime** | **String** | The date and time at which the attendee joined the meeting. |  [optional] |
|**leaveTime** | **String** | The date and time at which the attendee left the meeting. |  [optional] |
|**hostOrganization** | **String** | Host Account Name of Hosting Organization. |  [optional] |
|**hostName** | **String** | Host&#39;s name. |  [optional] |
|**hasScreenShare** | **Boolean** | Indicates whether or not the screenshare feature was used in the meeting. |  [optional] |
|**hasRecording** | **Boolean** | Indicates whether or not the recording feature was used in the meeting. |  [optional] |
|**hasChat** | **Boolean** | Indicates whether or not the chat feature was used in the meeting. |  [optional] |
|**meetingEncryptionStatus** | [**MeetingEncryptionStatusEnum**](#MeetingEncryptionStatusEnum) | The meeting&#39;s encryption status.  * &#x60;1&#x60; &amp;mdash; E2E encryption.  * &#x60;2&#x60; &amp;mdash; Enhanced encryption. |  [optional] |
|**participantsCountMyAccount** | **Integer** | The number of meeting participants from my account. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |



## Enum: MeetingEncryptionStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



