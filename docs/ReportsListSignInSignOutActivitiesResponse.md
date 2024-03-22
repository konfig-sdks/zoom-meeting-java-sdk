

# ReportsListSignInSignOutActivitiesResponse

Report object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityLogs** | [**List&lt;ReportsListSignInSignOutActivitiesResponseActivityLogsInner&gt;**](ReportsListSignInSignOutActivitiesResponseActivityLogsInner.md) | Array of activity logs. |  [optional] |
|**from** | **String** | Start date from which you want the activity logs report to be generated. |  [optional] |
|**nextPageToken** | **String** | The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. |  [optional] |
|**pageSize** | **Integer** | The number of records returned with a single API call. |  [optional] |
|**to** | **String** | End date until which you want the activity logs report to be generated |  [optional] |



