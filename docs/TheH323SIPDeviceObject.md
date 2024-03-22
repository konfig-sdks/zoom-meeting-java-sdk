

# TheH323SIPDeviceObject

The H.323/SIP device object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Device ID. |  [optional] |
|**encryption** | [**EncryptionEnum**](#EncryptionEnum) | Device encryption:    &#x60;auto&#x60; - auto.    &#x60;yes&#x60; - yes.    &#x60;no&#x60; - no. |  |
|**ip** | **String** | Device IP. |  |
|**name** | **String** | Device name. |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Device protocol:    &#x60;H.323&#x60; - H.323.    &#x60;SIP&#x60; - SIP. |  |



## Enum: EncryptionEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| H_323 | &quot;H.323&quot; |
| SIP | &quot;SIP&quot; |



