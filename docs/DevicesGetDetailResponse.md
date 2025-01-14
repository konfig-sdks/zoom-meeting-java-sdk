

# DevicesGetDetailResponse

Information about the device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceId** | **String** | The device&#39;s unique identifier. |  [optional] |
|**deviceName** | **String** | The name of the device. |  [optional] |
|**macAddress** | **String** | The device&#39;s MAC address. |  [optional] |
|**serialNumber** | **String** | The device&#39;s serial number. |  [optional] |
|**vendor** | **String** | The device&#39;s manufacturer. |  [optional] |
|**model** | **String** | The device&#39;s model. |  [optional] |
|**platformOs** | **String** | The device&#39;s platform. |  [optional] |
|**appVersion** | **String** | App version of Zoom Rooms. |  [optional] |
|**tag** | **String** | The tag&#39;s name. |  [optional] |
|**enrolledInZdm** | **Boolean** | Whether the device is enrolled in ZDM (Zoom Device Management). |  [optional] |
|**connectedToZdm** | **Boolean** | Whether the device is connected to ZDM (Zoom Device Management). |  [optional] |
|**roomId** | **String** | The Zoom Room&#39;s ID. |  [optional] |
|**roomName** | **String** | The Zoom Room&#39;s name. |  [optional] |
|**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Filter devices by device type.   Device Type:    &#x60;-1&#x60; - All Zoom Room device(0,1,2,3,4,6).    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.    &#x60;3&#x60; - Zoom Rooms Control System.    &#x60;4&#x60; - Zoom Rooms Whiteboard.    &#x60;5&#x60; - Zoom Phone Appliance.    &#x60;6&#x60; - Zoom Rooms Computer (with Controller). |  [optional] |
|**sdkVersion** | **String** | The SDK version. |  [optional] |
|**deviceStatus** | [**DeviceStatusEnum**](#DeviceStatusEnum) | Filter devices by status.    Device Status:    &#x60;0&#x60; - offline.    &#x60;1&#x60; - online.    &#x60;-1&#x60; - unlink |  [optional] |
|**lastOnline** | **String** | The time when the device was last online. |  [optional] |
|**userEmail** | **String** | The phone device&#39;s owner. |  [optional] |



## Enum: DeviceTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: DeviceStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



