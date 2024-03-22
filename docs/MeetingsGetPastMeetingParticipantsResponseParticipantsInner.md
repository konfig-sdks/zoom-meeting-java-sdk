

# MeetingsGetPastMeetingParticipantsResponseParticipantsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Universally unique identifier of the Participant. It is the same as the User ID of the participant if the participant joins the meeting by logging into Zoom. If the participant joins the meeting without logging in, the value of this field will be blank. |  [optional] |
|**name** | **String** | Participant display name. |  [optional] |
|**userId** | **String** | Participant ID. This is a unique ID assigned to the participant joining a meeting and is valid for that meeting only. |  [optional] |
|**registrantId** | **String** | The participant&#39;s unique registrant ID. This field only returns if you pass the &#x60;registrant_id&#x60; value for the &#x60;include_fields&#x60; query parameter.   This field does not return if the &#x60;type&#x60; query parameter is the &#x60;live&#x60; value. |  [optional] |
|**userEmail** | **String** | Email address of the user. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**joinTime** | **OffsetDateTime** | Participant join time. |  [optional] |
|**leaveTime** | **OffsetDateTime** | Participant leave time. |  [optional] |
|**duration** | **Integer** | Participant duration. Duration, in seconds, calculated by subtracting the &#x60;leave_time&#x60; from the &#x60;join_time&#x60; for the &#x60;user_id&#x60;. If the participant leaves and rejoins the same meeting, they will be assigned a different &#x60;user_id&#x60; and Zoom displays their new duration in a separate object. Note that because of this, the duration may not reflect the total time the user was in the meeting. |  [optional] |
|**failover** | **Boolean** | Indicates if failover happened during the meeting. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The participant&#39;s status.  * &#x60;in_meeting&#x60; - In a meeting.  * &#x60;in_waiting_room&#x60; - In a waiting room. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MEETING | &quot;in_meeting&quot; |
| WAITING_ROOM | &quot;in_waiting_room&quot; |



