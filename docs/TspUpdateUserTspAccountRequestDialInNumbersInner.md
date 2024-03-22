

# TspUpdateUserTspAccountRequestDialInNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Country code. |  [optional] |
|**countryLabel** | **String** | Country Label, if passed, will display in place of code. |  [optional] |
|**number** | **String** | Dial-in number: length is less than 16. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Dial-in number types:    &#x60;toll&#x60; - Toll number.    &#x60;tollfree&#x60; -Toll free number.    &#x60;media_link&#x60; - Media Link Phone Number. It is used for PSTN integration instead of paid bridge number. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOLL | &quot;toll&quot; |
| TOLLFREE | &quot;tollfree&quot; |
| MEDIA_LINK | &quot;media_link&quot; |



