

# CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner

Recording file object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deletedTime** | **String** | The time when recording was deleted. Returned in the response only for trash query. |  [optional] |
|**downloadUrl** | **String** | The URL to download the recording.   **OAuth apps**   If a user has authorized and installed your OAuth app that contains recording scopes, use the download_access_token or the user&#39;s [OAuth access token](https://developers.zoom.us/docs/integrations/oauth/) to download the file, and set the access_token as a Bearer token in the Authorization header.   &#x60;curl -H &#39;Authorization: Bearer &lt;ACCESS_TOKEN&gt;&#39; https://{{base-domain}}/rec/archive/download/xyz&#x60;.   **Note:** This field does **not** return for [Zoom On-Premise accounts](https://support.zoom.us/hc/en-us/articles/360034064852-Zoom-On-Premise-Deployment). Instead, this API will return the &#x60;file_path&#x60; field. |  [optional] |
|**filePath** | **String** | The file path to the On-Premise account recording.   **Note:** This API only returns this field for [Zoom On-Premise accounts](https://support.zoom.us/hc/en-us/articles/360034064852-Zoom-On-Premise-Deployment). It does **not** return the &#x60;download_url&#x60; field. |  [optional] |
|**fileSize** | **Double** | The recording file size. |  [optional] |
|**fileType** | [**FileTypeEnum**](#FileTypeEnum) | The recording file type.     &#x60;MP4&#x60; - Video file of the recording.    &#x60;M4A&#x60; Audio-only file of the recording.    &#x60;TIMELINE&#x60; - Timestamp file of the recording in JSON file format. To get a timeline file, the **Add a timestamp to the recording** setting must be enabled in the [recording settings](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-recording#h_3f14c3a4-d16b-4a3c-bbe5-ef7d24500048). The time will display in the host&#39;s timezone, set on their Zoom profile.      &#x60;TRANSCRIPT&#x60; - Transcription file of the recording in VTT format.     &#x60;CHAT&#x60; - A TXT file containing in-meeting chat messages that were sent during the meeting.    &#x60;CC&#x60; - File containing closed captions of the recording in VTT file format.    &#x60;CSV&#x60; - File containing polling data in CSV format.          A recording file object with file type of either &#x60;CC&#x60; or &#x60;TIMELINE&#x60; **does not have** the following properties:      &#x60;id&#x60;, &#x60;status&#x60;, &#x60;file_size&#x60;, &#x60;recording_type&#x60;, and &#x60;play_url&#x60;.    &#x60;SUMMARY&#x60; - Summary file of the recording in JSON file format. |  [optional] |
|**fileExtension** | [**FileExtensionEnum**](#FileExtensionEnum) | The file extension type of the recording file. |  [optional] |
|**id** | **String** | The recording file ID. Included in the response of general query. |  [optional] |
|**meetingId** | **String** | The meeting ID.  |  [optional] |
|**playUrl** | **String** | The URL to play a recording file. |  [optional] |
|**recordingEnd** | **String** | The recording end time. Response in general query. |  [optional] |
|**recordingStart** | **String** | The recording start time. |  [optional] |
|**recordingType** | [**RecordingTypeEnum**](#RecordingTypeEnum) | The recording type.    &#x60;shared_screen_with_speaker_view(CC)&#x60;    &#x60;shared_screen_with_speaker_view&#x60;    &#x60;shared_screen_with_gallery_view&#x60;    &#x60;speaker_view&#x60;    &#x60;gallery_view&#x60;    &#x60;shared_screen&#x60;    &#x60;audio_only&#x60;    &#x60;audio_transcript&#x60;    &#x60;chat_file&#x60;    &#x60;active_speaker&#x60;    &#x60;poll&#x60;    &#x60;timeline&#x60;    &#x60;closed_caption&#x60;    &#x60;audio_interpretation&#x60;    &#x60;summary&#x60;    &#x60;summary_next_steps&#x60;    &#x60;summary_smart_chapters&#x60;    &#x60;sign_interpretation&#x60;    &#x60;production_studio&#x60; |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The recording status. |  [optional] |



## Enum: FileTypeEnum

| Name | Value |
|---- | -----|
| MP4 | &quot;MP4&quot; |
| M4A | &quot;M4A&quot; |
| CHAT | &quot;CHAT&quot; |
| TRANSCRIPT | &quot;TRANSCRIPT&quot; |
| CSV | &quot;CSV&quot; |
| TB | &quot;TB&quot; |
| CC | &quot;CC&quot; |
| CHAT_MESSAGE | &quot;CHAT_MESSAGE&quot; |
| SUMMARY | &quot;SUMMARY&quot; |



## Enum: FileExtensionEnum

| Name | Value |
|---- | -----|
| MP4 | &quot;MP4&quot; |
| M4A | &quot;M4A&quot; |
| TXT | &quot;TXT&quot; |
| VTT | &quot;VTT&quot; |
| CSV | &quot;CSV&quot; |
| JSON | &quot;JSON&quot; |
| JPG | &quot;JPG&quot; |



## Enum: RecordingTypeEnum

| Name | Value |
|---- | -----|
| SHARED_SCREEN_WITH_SPEAKER_VIEW_CC_ | &quot;shared_screen_with_speaker_view(CC)&quot; |
| SHARED_SCREEN_WITH_SPEAKER_VIEW | &quot;shared_screen_with_speaker_view&quot; |
| SHARED_SCREEN_WITH_GALLERY_VIEW | &quot;shared_screen_with_gallery_view&quot; |
| ACTIVE_SPEAKER | &quot;active_speaker&quot; |
| GALLERY_VIEW | &quot;gallery_view&quot; |
| SHARED_SCREEN | &quot;shared_screen&quot; |
| AUDIO_ONLY | &quot;audio_only&quot; |
| AUDIO_TRANSCRIPT | &quot;audio_transcript&quot; |
| CHAT_FILE | &quot;chat_file&quot; |
| POLL | &quot;poll&quot; |
| HOST_VIDEO | &quot;host_video&quot; |
| CLOSED_CAPTION | &quot;closed_caption&quot; |
| TIMELINE | &quot;timeline&quot; |
| THUMBNAIL | &quot;thumbnail&quot; |
| AUDIO_INTERPRETATION | &quot;audio_interpretation&quot; |
| SUMMARY | &quot;summary&quot; |
| SUMMARY_NEXT_STEPS | &quot;summary_next_steps&quot; |
| SUMMARY_SMART_CHAPTERS | &quot;summary_smart_chapters&quot; |
| SIGN_INTERPRETATION | &quot;sign_interpretation&quot; |
| PRODUCTION_STUDIO | &quot;production_studio&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |



