

# WebinarsUpdateRegistrantStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The registration action to perform.  * &#x60;approve&#x60; - Approve the registrant.  * &#x60;deny&#x60; - Reject the registrant.  * &#x60;cancel&#x60; - Cancel the registrant&#39;s approval. |  |
|**registrants** | [**List&lt;WebinarsUpdateRegistrantStatusRequestRegistrantsInner&gt;**](WebinarsUpdateRegistrantStatusRequestRegistrantsInner.md) | The registrant information. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| DENY | &quot;deny&quot; |
| CANCEL | &quot;cancel&quot; |



