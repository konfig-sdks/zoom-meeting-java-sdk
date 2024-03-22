

# MeetingsUpdateDetailsRequestSettingsResourcesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The resource type. |  [optional] |
|**resourceId** | **String** | The resource ID. |  [optional] |
|**permissionLevel** | [**PermissionLevelEnum**](#PermissionLevelEnum) | The permission levels for users to access the whiteboard.  * &#x60;editor&#x60; - Users with link access can edit the board.  * &#x60;commenter&#x60; - Users with link access can comment on the board.  * &#x60;viewer&#x60; - Users with link access can view the board. |  [optional] |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| WHITEBOARD | &quot;whiteboard&quot; |



## Enum: PermissionLevelEnum

| Name | Value |
|---- | -----|
| EDITOR | &quot;editor&quot; |
| COMMENTER | &quot;commenter&quot; |
| VIEWER | &quot;viewer&quot; |



