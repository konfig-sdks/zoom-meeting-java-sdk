

# TspAddUserTspAccountResponse

List of TSP accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the TSP account. |  [optional] |
|**conferenceCode** | **String** | Conference code: numeric value, length is less than 16. |  |
|**dialInNumbers** | [**List&lt;TspAddUserTspAccountResponseDialInNumbersInner&gt;**](TspAddUserTspAccountResponseDialInNumbersInner.md) | List of dial in numbers. |  [optional] |
|**leaderPin** | **String** | Leader PIN: numeric value, length is less than 16. |  |
|**tspBridge** | [**TspBridgeEnum**](#TspBridgeEnum) | Telephony bridge |  [optional] |



## Enum: TspBridgeEnum

| Name | Value |
|---- | -----|
| US_TSP_TB | &quot;US_TSP_TB&quot; |
| EU_TSP_TB | &quot;EU_TSP_TB&quot; |



