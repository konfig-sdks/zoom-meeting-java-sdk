

# MeetingsAddRegistrantResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The meeting ID. |  [optional] |
|**joinUrl** | **String** | The URL the registrant can use to join the meeting.   The API will not return this field if the meeting was [created](https://developers.zoom.us) with the &#x60;approval_type&#x60; field value of &#x60;1&#x60; (manual approval). |  [optional] |
|**registrantId** | **String** | The registrant&#39;s ID. |  [optional] |
|**startTime** | **OffsetDateTime** | The meeting&#39;s start time. |  [optional] |
|**topic** | **String** | The meeting&#39;s topic. |  [optional] |
|**occurrences** | [**List&lt;MeetingsAddRegistrantResponseOccurrencesInner&gt;**](MeetingsAddRegistrantResponseOccurrencesInner.md) | Array of occurrence objects. |  [optional] |
|**participantPinCode** | **Long** | The participant PIN code is used to authenticate audio participants before they join the meeting. |  [optional] |



