

# ReportsGetOperationLogsReportResponse

Pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of the available result list exceeds the page size. The expiration period is 15 minutes. |  [optional] |
|**pageSize** | **Integer** | The amount of records returns within a single API call.  |  [optional] |
|**operationLogs** | [**List&lt;ReportsGetOperationLogsReportResponseOperationLogsInner&gt;**](ReportsGetOperationLogsReportResponseOperationLogsInner.md) | Array of operation log objects |  [optional] |



