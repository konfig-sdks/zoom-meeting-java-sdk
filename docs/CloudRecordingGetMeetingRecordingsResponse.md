

# CloudRecordingGetMeetingRecordingsResponse

This field returns a list of recording files for each participant. The API only returns this response when the **Record a separate audio file of each participant** setting is enabled.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The user account&#39;s unique identifier. |  [optional] |
|**duration** | **Integer** | The meeting duration. |  [optional] |
|**hostId** | **String** | The ID of the user set as host of meeting. |  [optional] |
|**id** | **Integer** | The meeting ID, also known as the meeting number. |  [optional] |
|**recordingCount** | **Integer** |  The number of recording files returned in the response of this API call. This includes the &#x60;recording_files&#x60; and  &#x60;participant_audio_files&#x60; files. |  [optional] |
|**startTime** | **OffsetDateTime** | The time when the meeting started. |  [optional] |
|**topic** | **String** | The meeting topic. |  [optional] |
|**totalSize** | **Long** | The recording&#39;s total file size. This includes the &#x60;recording_files&#x60; and &#x60;participant_audio_files&#x60; files. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The recording&#39;s associated type of meeting or webinar.   If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created via PMI (Personal Meeting ID).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.   If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time  * &#x60;9&#x60; - A recurring webinar with a fixed time.  If the recording is **not** from a meeting or webinar:   * &#x60;99&#x60; - A recording uploaded via the [**Recordings**](https://zoom.us/recording) interface on the Zoom Web Portal. |  [optional] |
|**uuid** | **String** | The unique meeting identifier. Each instance of the meeting has its own UUID. |  [optional] |
|**recordingPlayPasscode** | **String** | The cloud recording&#39;s passcode to be used in the URL. Directly splice this recording&#39;s passcode in &#x60;play_url&#x60; or &#x60;share_url&#x60; with &#x60;?pwd&#x3D;&#x60; to access and play. Example: &#39;https://zoom.us/rec/share/_**************?pwd&#x3D;yNYIS408EJygs7rE5vVsJwXIz4-VW7MH&#39;. |  [optional] |
|**recordingFiles** | [**List&lt;CloudRecordingGetMeetingRecordingsResponseRecordingFilesInner&gt;**](CloudRecordingGetMeetingRecordingsResponseRecordingFilesInner.md) | The list of recording file. |  [optional] |
|**downloadAccessToken** | **String** | The JWT token to download the meeting&#39;s recording. This response only returns if the &#x60;download_access_token&#x60; is included in the &#x60;include_fields&#x60; query parameter. |  [optional] |
|**password** | **String** | The cloud recording&#39;s passcode. |  [optional] |
|**participantAudioFiles** | [**List&lt;CloudRecordingGetMeetingRecordingsResponseParticipantAudioFilesInner&gt;**](CloudRecordingGetMeetingRecordingsResponseParticipantAudioFilesInner.md) | A list of recording files. The API only returns this response when the **Record a separate audio file of each participant** setting is enabled. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| _99 | &quot;99&quot; |



