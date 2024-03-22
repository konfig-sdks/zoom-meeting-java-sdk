

# WebinarsListParticipantsResponseParticipantsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The participant&#39;s unique identifier. |  [optional] |
|**name** | **String** | The participant&#39;s name. |  [optional] |
|**userId** | **String** | The participant&#39;s ID. This ID is assigned to the participant upon joining the webinar and is only valid for that webinar. |  [optional] |
|**registrantId** | **String** | The participant&#39;s unique registrant ID. This field only returns if you pass the &#x60;registrant_id&#x60; value for the &#x60;include_fields&#x60; query parameter.   This field does not return if the &#x60;type&#x60; query parameter is the &#x60;live&#x60; value. |  [optional] |
|**userEmail** | **String** | Email address of the participant. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details. |  [optional] |
|**joinTime** | **OffsetDateTime** | The participant&#39;s join time. |  [optional] |
|**leaveTime** | **OffsetDateTime** | The participant&#39;s leave time. |  [optional] |
|**duration** | **Integer** | The participant&#39;s attendance duration. |  [optional] |
|**failover** | **Boolean** | Whether failover occurred during the webinar. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The participant&#39;s status.  * &#x60;in_meeting&#x60; - In a meeting.  * &#x60;in_waiting_room&#x60; - In a waiting room. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MEETING | &quot;in_meeting&quot; |
| WAITING_ROOM | &quot;in_waiting_room&quot; |



