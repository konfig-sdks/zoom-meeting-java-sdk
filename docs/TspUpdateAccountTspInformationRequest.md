

# TspUpdateAccountTspInformationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dialInNumberUnrestricted** | **Boolean** | Control restriction on account users adding a TSP number outside of account&#39;s dial in numbers. |  [optional] |
|**enable** | **Boolean** | Enable 3rd party audio conferencing for account users |  [optional] |
|**masterAccountSettingExtended** | **Boolean** | For master account, extend its TSP setting to all sub accounts. For sub account, extend TSP setting from master account. |  [optional] |
|**modifyCredentialForbidden** | **Boolean** | Control restriction on account users being able to modify their TSP credentials. |  [optional] |
|**tspBridge** | [**TspBridgeEnum**](#TspBridgeEnum) | Telephony bridge |  [optional] |
|**tspEnabled** | **Boolean** | Enable TSP feature for account. This has to be enabled to use any other tsp settings/features. |  [optional] |
|**tspProvider** | **String** | 3rd party audio conferencing provider |  [optional] |



## Enum: TspBridgeEnum

| Name | Value |
|---- | -----|
| US_TSP_TB | &quot;US_TSP_TB&quot; |
| EU_TSP_TB | &quot;EU_TSP_TB&quot; |



