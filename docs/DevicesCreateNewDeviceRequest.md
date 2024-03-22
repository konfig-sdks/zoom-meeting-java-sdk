

# DevicesCreateNewDeviceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceName** | **String** | The device&#39;s name. |  |
|**macAddress** | **String** | The device&#39;s mac address. |  |
|**serialNumber** | **String** | The device&#39;s serial number. |  |
|**vendor** | **String** | The device&#39;s manufacturer. |  |
|**model** | **String** | The device&#39;s model. |  |
|**roomId** | **String** | The Zoom Room&#39;s ID. Only for Zoom Room devices. |  [optional] |
|**userEmail** | **String** | User email for assigning the Zoom Phone device. Only for Zoom Phone devices. |  [optional] |
|**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Device type.    &#x60;0&#x60; - Zoom Rooms computer.    &#x60;1&#x60; - Zoom Rooms controller.    &#x60;5&#x60; - Zoom Phone appliance. |  |
|**tag** | **String** | The name of the tag. |  [optional] |
|**zdmGroupId** | **String** | The ZDM group ID. |  [optional] |
|**extensionNumber** | **String** | The extension number. |  [optional] |



## Enum: DeviceTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_5 | 5 |



