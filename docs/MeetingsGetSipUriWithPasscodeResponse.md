

# MeetingsGetSipUriWithPasscodeResponse

Information about the meeting's encoded SIP URI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sipDialing** | **String** | The meeting&#39;s encoded SIP URI. |  [optional] |
|**paidCrcPlanParticipant** | **Boolean** | Whether the API caller has a CRC (Conference Room Connector) plan. |  [optional] |
|**participantIdentifierCode** | **String** | This value identifies the meeting participant. It is automatically embedded in the SIP URI if the API caller has a CRC (Conference Room Connector) plan. |  [optional] |
|**expireIn** | **Long** | The number of seconds the encoded SIP URI is valid before it expires. |  [optional] |



