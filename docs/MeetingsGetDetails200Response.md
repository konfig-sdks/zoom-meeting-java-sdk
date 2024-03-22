

# MeetingsGetDetails200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID). |  [optional] |
|**uuid** | **String** | The meeting&#39;s UUID. You **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) this value if the meeting UUID begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; character. |  [optional] |
|**duration** | **Integer** | The meeting&#39;s duration, in minutes. |  [optional] |
|**startTime** | **OffsetDateTime** | The meeting&#39;s start date and time. |  [optional] |
|**endTime** | **OffsetDateTime** | The meeting&#39;s end date and time. |  [optional] |
|**hostId** | **String** | The host&#39;s ID. |  [optional] |
|**dept** | **String** | The meeting host&#39;s department. |  [optional] |
|**participantsCount** | **Integer** | The number of meeting participants. |  [optional] |
|**source** | **String** | Whether the meeting was created directly through Zoom or via an API request:  * If the meeting was created via an OAuth app, this field returns the OAuth app&#39;s name.  * If the meeting was created via JWT or the Zoom Web Portal, this returns the &#x60;Zoom&#x60; value. |  [optional] |
|**topic** | **String** | The meeting&#39;s topic. |  [optional] |
|**totalMinutes** | **Integer** | The total number of minutes attended by the meeting&#39;s host and participants. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The meeting type:  * &#x60;0&#x60; &amp;mdash; A prescheduled meeting.  * &#x60;1&#x60; &amp;mdash; An instant meeting.  * &#x60;2&#x60; &amp;mdash; A scheduled meeting.  * &#x60;3&#x60; &amp;mdash; A recurring meeting with no fixed time.  * &#x60;4&#x60; &amp;mdash; A [personal meeting room](https://support.zoom.us/hc/en-us/articles/201362843).  * &#x60;7&#x60; &amp;mdash; A [PAC (Personal Audio Conference)](https://support.zoom.us/hc/en-us/articles/205172455-Hosting-a-Personal-Audio-Conference-PAC-meeting) meeting.  * &#x60;8&#x60; &amp;mdash; A recurring meeting with a fixed time. |  [optional] |
|**userEmail** | **String** | The user&#39;s email address. |  [optional] |
|**userName** | **String** | The user&#39;s display name. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |



