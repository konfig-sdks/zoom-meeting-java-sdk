

# MeetingsBatchRegistrantsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoApprove** | **Boolean** | If a meeting was scheduled with approval_type &#x60;1&#x60; (manual approval), but you would like to automatically approve the registrants that are added via this API, you can set the value of this field to &#x60;true&#x60;.   You **cannot** use this field to change approval setting for a meeting  that was originally scheduled with approval_type &#x60;0&#x60; (automatic approval). |  [optional] |
|**registrantsConfirmationEmail** | **Boolean** | Send confirmation Email to Registrants |  [optional] |
|**registrants** | [**List&lt;MeetingsBatchRegistrantsCreateRequestRegistrantsInner&gt;**](MeetingsBatchRegistrantsCreateRequestRegistrantsInner.md) |  |  [optional] |



