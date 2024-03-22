

# ReportsGetBillingDepartmentReportsResponseBillingReportsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **LocalDate** | End date of the billing period. |  [optional] |
|**id** | **String** | Unique Identifier of the report. Use this ID to retrieve billing invoice via the &amp;quot;Get Billing Invoices API&amp;quot;.   You can also use this ID to export a CSV file of the billing report from this URL: &#x60;https://zoom.us/account/report/billing/export?id&#x3D;{id}&#x60;. |  [optional] |
|**startDate** | **LocalDate** | Start date of the billing period. |  [optional] |
|**taxAmount** | **String** | Total tax amount for this billing period. |  [optional] |
|**totalAmount** | **String** | Total billing amount for this billing period. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the billing report. The value should be either of the following:     &#x60;0&#x60; - Detailed Billing Reports &#x60;1&#x60; - Custom Billing Reports |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



