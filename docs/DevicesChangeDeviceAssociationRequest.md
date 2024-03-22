

# DevicesChangeDeviceAssociationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roomId** | **String** | The Zoom Room ID which device is being associated to. The &#x60;room_id&#x60; is required when &#x60;assign&#x60; is selected for &#x60;action&#x60; field. |  [optional] |
|**appType** | [**AppTypeEnum**](#AppTypeEnum) | Specify one of the following values for this field:  &#x60;ZR&#x60;: Zoom Room Computer.     &#x60;ZRC&#x60;: Zoom Room Controller.     &#x60;ZRP&#x60;: Scheduling Display.     &#x60;ZRW&#x60;: Companion Whiteboard. |  [optional] |



## Enum: AppTypeEnum

| Name | Value |
|---- | -----|
| ZR | &quot;ZR&quot; |
| ZRC | &quot;ZRC&quot; |
| ZRP | &quot;ZRP&quot; |
| ZRW | &quot;ZRW&quot; |



