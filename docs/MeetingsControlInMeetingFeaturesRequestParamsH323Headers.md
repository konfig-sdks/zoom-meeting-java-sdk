

# MeetingsControlInMeetingFeaturesRequestParamsH323Headers

Enable customers to leverage services that require customization of the FROM header to identify the caller. Use this field if you pass the `participant.invite.room_system_callout` value for the `method` field and the `h323` value for the `call_type` field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromDisplayName** | **String** | Custom name that will be used within the h323 Header. |  [optional] |
|**toDisplayName** | **String** | Custom remote name that will be used within the meeting. |  [optional] |



