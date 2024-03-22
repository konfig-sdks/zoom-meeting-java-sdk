

# CloudRecordingListRecordingsResponseMeetingsInner

The recording meeting object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Unique Identifier of the user account. |  [optional] |
|**duration** | **Integer** | Meeting duration. |  [optional] |
|**hostId** | **String** | ID of the user set as host of meeting. |  [optional] |
|**id** | **Integer** | Meeting ID - also known as the meeting number. |  [optional] |
|**recordingCount** | **Integer** | Number of recording files returned in the response of this API call. This includes the &#x60;recording_files&#x60; and  &#x60;participant_audio_files&#x60; files. |  [optional] |
|**startTime** | **OffsetDateTime** | The time when the meeting started. |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**totalSize** | **Long** | The total file size of the recording. This includes the &#x60;recording_files&#x60; and &#x60;participant_audio_files&#x60; files. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The recording&#39;s associated type of meeting or webinar:   If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created viaPersonal Meeting ID (PMI).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.   If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time  * &#x60;9&#x60; - A recurring webinar with a fixed time.  If the recording is **not** from a meeting or webinar:   * &#x60;99&#x60; - A recording uploaded via the [**Recordings**](https://zoom.us/recording) interface on the Zoom Web Portal. |  [optional] |
|**uuid** | **String** | Unique Meeting Identifier. Each instance of the meeting will have its own UUID. |  [optional] |
|**recordingPlayPasscode** | **String** | The cloud recording&#39;s passcode to be used in the URL. This recording&#39;s passcode can be directly spliced in &#x60;play_url&#x60; or &#x60;share_url&#x60; with &#x60;?pwd&#x3D;&#x60; to access and play. For example, &#39;https://zoom.us/rec/share/_**************?pwd&#x3D;yNYIS408EJygs7rE5vVsJwXIz4-VW7MH&#39;. If you want to use this field, please contact Zoom support. |  [optional] |
|**recordingFiles** | [**List&lt;CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner&gt;**](CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner.md) | List of recording file. |  [optional] |



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



