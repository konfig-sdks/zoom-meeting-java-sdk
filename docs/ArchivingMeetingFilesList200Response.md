

# ArchivingMeetingFilesList200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | The user&#39;s account name. |  |
|**archiveFiles** | [**List&lt;ArchivingMeetingFilesList200ResponseArchiveFilesInner&gt;**](ArchivingMeetingFilesList200ResponseArchiveFilesInner.md) | Information about the archive files. |  |
|**completeTime** | **Object** |  |  |
|**duration** | **Integer** | The meeting or webinar&#39;s scheduled duration. |  |
|**durationInSecond** | **Integer** | The meeting or webinar&#39;s duration, in seconds. |  |
|**hostId** | **String** | The host&#39;s user ID for the archived meeting or webinar. |  |
|**id** | **Long** | The meeting or webinar ID, either &#x60;meetingId&#x60; or &#x60;webinarId&#x60;. |  |
|**isBreakoutRoom** | **Boolean** | Whether the room is a [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms). |  |
|**meetingType** | [**MeetingTypeEnum**](#MeetingTypeEnum) | Whether the meeting or webinar is internal or external.  * &#x60;internal&#x60; - An internal meeting or webinar.  * &#x60;external&#x60; - An external meeting or webinar.    The &#x60;id&#x60;, &#x60;host_id&#x60;, and &#x60;topic&#x60; PII (Personal Identifiable Information) values in this response are removed when this value is &#x60;external&#x60;. |  |
|**parentMeetingId** | **String** | The parent meeting&#39;s universally unique ID (UUID). Each meeting or webinar instance generates a UUID. If the &#x60;is_breakout_room&#x60; value is &#x60;true&#x60;, the API returns this value. |  [optional] |
|**recordingCount** | **Integer** | The number of archived files returned in the API call response. |  |
|**startTime** | **OffsetDateTime** | The meeting or webinar&#39;s start time. |  |
|**timezone** | **String** | The meeting or webinar&#39;s [timezone](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones). |  |
|**topic** | **String** | The meeting or webinar topic. |  |
|**totalSize** | **Integer** | The total size of the archive file, in bytes. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of archived meeting or webinar.    If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created via PMI (Personal Meeting ID).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.    If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time.  * &#x60;9&#x60; - A recurring webinar with a fixed time.    If the recording is **not** from a meeting or webinar:   * &#x60;100&#x60; - A [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms). |  |
|**uuid** | **String** | The universally unique identifier (UUID) of the recorded meeting or webinar instance. Each meeting or webinar instance generates a UUID. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The archive&#39;s processing status.  * &#x60;completed&#x60; - The archive&#39;s processing is complete.  * &#x60;processing&#x60; - The archive is processing. |  |
|**groupId** | **String** | Primary group IDs of participants who belong to your account. Each group ID is separated by a comma. |  [optional] |



## Enum: MeetingTypeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |



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
| NUMBER_100 | 100 |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| PROCESSING | &quot;processing&quot; |



