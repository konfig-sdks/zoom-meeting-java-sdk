

# MeetingsUpdateRegistrantStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Registrant Status:    &#x60;approve&#x60; - Approve registrant.    &#x60;cancel&#x60; - Cancel previously approved registrant&#39;s registration.    &#x60;deny&#x60; - Deny registrant. |  |
|**registrants** | [**List&lt;MeetingsUpdateRegistrantStatusRequestRegistrantsInner&gt;**](MeetingsUpdateRegistrantStatusRequestRegistrantsInner.md) | List of registrants. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| CANCEL | &quot;cancel&quot; |
| DENY | &quot;deny&quot; |



