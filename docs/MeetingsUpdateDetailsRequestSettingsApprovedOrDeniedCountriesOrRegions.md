

# MeetingsUpdateDetailsRequestSettingsApprovedOrDeniedCountriesOrRegions

Approve or block users from specific regions or countries from joining this meeting.  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvedList** | **List&lt;String&gt;** | List of countries or regions from where participants can join this meeting.  |  [optional] |
|**deniedList** | **List&lt;String&gt;** | List of countries or regions from where participants can not join this meeting.  |  [optional] |
|**enable** | **Boolean** | &#x60;true&#x60; - Setting enabled to either allow users or block users from specific regions to join your meetings.    &#x60;false&#x60; - Setting disabled. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | Specify whether to allow users from specific regions to join this meeting, or block users from specific regions from joining this meeting.    &#x60;approve&#x60; - Allow users from specific regions or countries to join this meeting. If this setting is selected, include the approved regions or countries in the &#x60;approved_list&#x60;.     &#x60;deny&#x60; - Block users from specific regions or countries from joining this meeting. If this setting is selected, include the approved regions orcountries in the &#x60;denied_list&#x60; |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| DENY | &quot;deny&quot; |



