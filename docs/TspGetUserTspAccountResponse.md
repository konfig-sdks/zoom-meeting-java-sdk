

# TspGetUserTspAccountResponse

TSP account of the user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conferenceCode** | **String** | Conference code: numeric value, length is less than 16. |  |
|**dialInNumbers** | [**List&lt;TspGetUserTspAccountResponseDialInNumbersInner&gt;**](TspGetUserTspAccountResponseDialInNumbersInner.md) | List of dial in numbers. |  [optional] |
|**id** | **String** | The TSP account ID. |  [optional] |
|**leaderPin** | **String** | Leader PIN: numeric value, length is less than 16. |  |
|**tspBridge** | [**TspBridgeEnum**](#TspBridgeEnum) | Telephony bridge |  [optional] |



## Enum: TspBridgeEnum

| Name | Value |
|---- | -----|
| US_TSP_TB | &quot;US_TSP_TB&quot; |
| EU_TSP_TB | &quot;EU_TSP_TB&quot; |



