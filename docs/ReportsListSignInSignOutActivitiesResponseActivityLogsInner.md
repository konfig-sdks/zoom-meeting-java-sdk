

# ReportsListSignInSignOutActivitiesResponseActivityLogsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | Zoom client version of the user. |  [optional] |
|**clientType** | **String** | The client interface type using which the activity was performed. |  [optional] |
|**email** | **String** | Email address of the user used for the activity. |  [optional] |
|**ipAddress** | **String** | The IP address of the user&#39;s device. |  [optional] |
|**time** | **OffsetDateTime** | Time during which the activity occurred. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of activity.  * &#x60;Sign in&#x60; &amp;mdash; Sign in activity by user.  * &#x60;Sign out&#x60; &amp;mdash; Sign out activity by user. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IN | &quot;Sign in&quot; |
| OUT | &quot;Sign out&quot; |



