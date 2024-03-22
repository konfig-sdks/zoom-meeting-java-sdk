

# ReportsWebinarParticipantsListResponseParticipantsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerKey** | **String** | The participant&#39;s SDK identifier. This value can be alphanumeric, up to a maximum length of 35 characters. |  [optional] |
|**duration** | **Integer** | The participant&#39;s attendance duration. |  [optional] |
|**failover** | **Boolean** | Whether failover occurred during the webinar. |  [optional] |
|**id** | **String** | The participant&#39;s universally unique ID (UUID).  * If the participant joins the meeting by logging into Zoom, this value is the &#x60;id&#x60; value in the [**Get a user**](https://developers.zoom.us) API response.  * If the participant joins the meeting **without** logging into Zoom, this returns an empty string value.   **Note:** Use the &#x60;participant_user_id&#x60; value instead of this value. We will remove this response in a future release. |  [optional] |
|**joinTime** | **OffsetDateTime** | The participant&#39;s join time. |  [optional] |
|**leaveTime** | **OffsetDateTime** | The participant&#39;s leave time. |  [optional] |
|**name** | **String** | The participant&#39;s display name. This returns an empty string value if the account calling the API is a BAA account. |  [optional] |
|**registrantId** | **String** | The registrant&#39;s ID. This field only returns if you provide the &#x60;registrant_id&#x60; value for the &#x60;include_fields&#x60; query parameter. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The participant&#39;s status.  * &#x60;in_meeting&#x60; - In a meeting.  * &#x60;in_waiting_room&#x60; - In a waiting room. |  [optional] |
|**userEmail** | **String** | The participant&#39;s email address. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us) for details. This returns an empty string value if the account calling the API is a BAA account. |  [optional] |
|**userId** | **String** | The participant&#39;s ID. This ID is assigned to the participant upon joining the webinar and is only valid for that webinar. |  [optional] |
|**participantUserId** | **String** | The participant&#39;s universally unique ID (UUID).  * If the participant joins the meeting by logging into Zoom, this value is the &#x60;id&#x60; value in the [**Get a user**](https://developers.zoom.us) API response.  * If the participant joins the meeting **without** logging into Zoom, this returns an empty string value. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MEETING | &quot;in_meeting&quot; |
| WAITING_ROOM | &quot;in_waiting_room&quot; |



