

# MeetingsControlInMeetingFeaturesRequestParamsSipHeaders

Enable customers to leverage services that require customization of the FROM header to identify the caller. Use this field if you pass the `participant.invite.room_system_callout` value for the `method` field and the `sip` value for the `call_type` field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromDisplayName** | **String** | Custom name that will be used within the SIP Header. |  [optional] |
|**toDisplayName** | **String** | Custom remote name that will be used within the meeting. |  [optional] |
|**fromUri** | **String** | Custom URI that will be used within the SIP Header. The URI must start with &#39;sip:&#39; or &#39;sips:&#39; as a valid URI based on parameters defined by the platform. |  [optional] |
|**additionalHeaders** | [**List&lt;MeetingsControlInMeetingFeaturesRequestParamsSipHeadersAdditionalHeadersInner&gt;**](MeetingsControlInMeetingFeaturesRequestParamsSipHeadersAdditionalHeadersInner.md) | Ability to add 1 to 10 custom headers, each of which has a maximum length of 256 bytes to comply with SIP standards.  Custom headers would leverage header names starting with &#39;X-&#39; per SIP guidelines. |  [optional] |



