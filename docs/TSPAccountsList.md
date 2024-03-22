

# TSPAccountsList

List of TSP accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conferenceCode** | **String** | Conference code: numeric value, length is less than 16. |  |
|**dialInNumbers** | [**List&lt;TSPAccountsListDialInNumbersInner&gt;**](TSPAccountsListDialInNumbersInner.md) | List of dial in numbers. |  [optional] |
|**id** | [**IdEnum**](#IdEnum) | The TSP credential ID. |  [optional] |
|**leaderPin** | **String** | Leader PIN: numeric value, length is less than 16. |  |
|**tspBridge** | [**TspBridgeEnum**](#TspBridgeEnum) | Telephony bridge  |  [optional] |



## Enum: IdEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



## Enum: TspBridgeEnum

| Name | Value |
|---- | -----|
| US_TSP_TB | &quot;US_TSP_TB&quot; |
| EU_TSP_TB | &quot;EU_TSP_TB&quot; |



