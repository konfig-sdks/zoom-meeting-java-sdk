

# TspUpdateUserTspAccountRequest

TSP account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conferenceCode** | **String** | Conference code: numeric value, length is less than 16. |  |
|**dialInNumbers** | [**List&lt;TspUpdateUserTspAccountRequestDialInNumbersInner&gt;**](TspUpdateUserTspAccountRequestDialInNumbersInner.md) | List of dial in numbers. |  [optional] |
|**leaderPin** | **String** | Leader PIN: numeric value, length is less than 16. |  |
|**tspBridge** | [**TspBridgeEnum**](#TspBridgeEnum) | Telephony bridge |  [optional] |



## Enum: TspBridgeEnum

| Name | Value |
|---- | -----|
| US_TSP_TB | &quot;US_TSP_TB&quot; |
| EU_TSP_TB | &quot;EU_TSP_TB&quot; |



