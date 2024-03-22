

# WebinarsGetSipUriWithPasscodeResponse

Information about the webinar's encoded SIP URI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sipDialing** | **String** | The webinar&#39;s encoded SIP URI. |  [optional] |
|**paidCrcPlanParticipant** | **Boolean** | Whether the API caller has a Conference Room Connector (CRC) plan. |  [optional] |
|**participantIdentifierCode** | **String** | This value identifies the webinar participant. It is automatically embedded in the SIP URI if the API caller has a CRC plan. |  [optional] |
|**expireIn** | **Long** | The number of seconds the encoded SIP URI is valid before it expires. |  [optional] |



