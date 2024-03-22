

# ReportsGetMeetingParticipantReportsResponseParticipantsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerKey** | **String** | The participant&#39;s SDK identifier. This value can be alphanumeric, up to a maximum length of 35 characters. |  [optional] |
|**duration** | **Integer** | Participant duration. |  [optional] |
|**failover** | **Boolean** | Indicates if failover happened during the meeting. |  [optional] |
|**id** | **String** | The participant&#39;s universally unique ID (UUID).  * If the participant joins the meeting by logging into Zoom, this value is the &#x60;id&#x60; value in the [**Get a user**](https://developers.zoom.us) API response.  * If the participant joins the meeting **without** logging into Zoom, this returns an empty string value.   **Note:** Use the &#x60;participant_user_id&#x60; value instead of this value. We will remove this response in a future release. |  [optional] |
|**joinTime** | **OffsetDateTime** | Participant join time. |  [optional] |
|**leaveTime** | **OffsetDateTime** | Participant leave time. |  [optional] |
|**name** | **String** | Participant display name.  This returns an empty string value if the account calling the API is a BAA account. |  [optional] |
|**registrantId** | **String** | Unique identifier of the registrant. This field is only returned if you entered &amp;quot;registrant_id&amp;quot; as the value of &#x60;include_fields&#x60; query parameter. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The participant&#39;s status.  * &#x60;in_meeting&#x60; - In a meeting.  * &#x60;in_waiting_room&#x60; - In a waiting room. |  [optional] |
|**userEmail** | **String** | Participant email.  If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us) for details. This returns an empty string value if the account calling the API is a BAA account. |  [optional] |
|**userId** | **String** | Participant ID. This is a unique ID assigned to the participant joining a meeting and is valid for that meeting only. |  [optional] |
|**boMtgId** | **String** | The [breakout room](https://support.zoom.us/hc/en-us/articles/206476313-Managing-breakout-rooms) ID. Each breakout room is assigned a unique ID. |  [optional] |
|**participantUserId** | **String** | The participant&#39;s universally unique ID (UUID).  * If the participant joins the meeting by logging into Zoom, this value is the &#x60;id&#x60; value in the [**Get a user**](https://developers.zoom.us) API response.  * If the participant joins the meeting **without** logging into Zoom, this returns an empty string value. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MEETING | &quot;in_meeting&quot; |
| WAITING_ROOM | &quot;in_waiting_room&quot; |



