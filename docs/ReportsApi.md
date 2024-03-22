# ReportsApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActiveInactiveHostReports**](ReportsApi.md#getActiveInactiveHostReports) | **GET** /report/users | Get active/inactive host reports |
| [**getBillingDepartmentReports**](ReportsApi.md#getBillingDepartmentReports) | **GET** /report/billing | Get billing reports |
| [**getBillingInvoices**](ReportsApi.md#getBillingInvoices) | **GET** /report/billing/invoices | Get billing invoice reports |
| [**getCloudRecordingUsageReport**](ReportsApi.md#getCloudRecordingUsageReport) | **GET** /report/cloud_recording | Get cloud recording usage report |
| [**getDailyUsageReport**](ReportsApi.md#getDailyUsageReport) | **GET** /report/daily | Get daily usage report |
| [**getMeetingDetailReports**](ReportsApi.md#getMeetingDetailReports) | **GET** /report/meetings/{meetingId} | Get meeting detail reports |
| [**getMeetingParticipantReports**](ReportsApi.md#getMeetingParticipantReports) | **GET** /report/meetings/{meetingId}/participants | Get meeting participant reports |
| [**getMeetingPollReports**](ReportsApi.md#getMeetingPollReports) | **GET** /report/meetings/{meetingId}/polls | Get meeting poll reports |
| [**getMeetingQaReport**](ReportsApi.md#getMeetingQaReport) | **GET** /report/meetings/{meetingId}/qa | Get meeting Q&amp;A report |
| [**getMeetingReports**](ReportsApi.md#getMeetingReports) | **GET** /report/users/{userId}/meetings | Get meeting reports |
| [**getMeetingSurveyReport**](ReportsApi.md#getMeetingSurveyReport) | **GET** /report/meetings/{meetingId}/survey | Get meeting survey report |
| [**getOperationLogsReport**](ReportsApi.md#getOperationLogsReport) | **GET** /report/operationlogs | Get operation logs report |
| [**getTelephoneReports**](ReportsApi.md#getTelephoneReports) | **GET** /report/telephone | Get telephone reports |
| [**getWebinarDetailsReport**](ReportsApi.md#getWebinarDetailsReport) | **GET** /report/webinars/{webinarId} | Get webinar detail reports |
| [**getWebinarPollReports**](ReportsApi.md#getWebinarPollReports) | **GET** /report/webinars/{webinarId}/polls | Get webinar poll reports |
| [**getWebinarQAReport**](ReportsApi.md#getWebinarQAReport) | **GET** /report/webinars/{webinarId}/qa | Get webinar Q&amp;A report |
| [**getWebinarSurveyReport**](ReportsApi.md#getWebinarSurveyReport) | **GET** /report/webinars/{webinarId}/survey | Get webinar survey report |
| [**listSignInSignOutActivities**](ReportsApi.md#listSignInSignOutActivities) | **GET** /report/activities | Get sign In / sign out activity report |
| [**listUpcomingEventsReport**](ReportsApi.md#listUpcomingEventsReport) | **GET** /report/upcoming_events | Get upcoming events report |
| [**webinarParticipantsList**](ReportsApi.md#webinarParticipantsList) | **GET** /report/webinars/{webinarId}/participants | Get webinar participant reports |


<a name="getActiveInactiveHostReports"></a>
# **getActiveInactiveHostReports**
> ReportsGetActiveInactiveHostReportsResponse getActiveInactiveHostReports(from, to).type(type).pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).groupId(groupId).execute();

Get active/inactive host reports

Retrieve a host report for a specified period of time within the last six months.   The report time range is limited to a month.   You can specify the type of report and date range using the query parameters.     * The **Active Hosts** report displays a list of meetings, participants, and meeting minutes. An **active host** is defined as any user who has hosted at least one meeting during the during the month specified in the &#x60;from&#x60; and &#x60;to&#x60; range.   * The **Inactive Hosts** report pulls a list of users who were not active during a specific period of time.    An **inactive host** is defined as any user who has not hosted any meetings during the specified period of time for the report. to be inactive.               **Prerequisites:**     * Pro or higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the `from` and `to` parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    String type = "active"; // Active or inactive hosts.    `active` - Active hosts.     `inactive` - Inactive hosts.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // The page number of the current page in the returned records.
    String nextPageToken = "b43YBRLJFg3V4vsSpxvGdKIGtNbxn9h9If2"; // The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
    String groupId = "TaVA8QKik_1233"; // The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID.
    try {
      ReportsGetActiveInactiveHostReportsResponse result = client
              .reports
              .getActiveInactiveHostReports(from, to)
              .type(type)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .nextPageToken(nextPageToken)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getTo());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getTotalMeetingMinutes());
      System.out.println(result.getTotalMeetings());
      System.out.println(result.getTotalParticipants());
      System.out.println(result.getUsers());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getActiveInactiveHostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetActiveInactiveHostReportsResponse> response = client
              .reports
              .getActiveInactiveHostReports(from, to)
              .type(type)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .nextPageToken(nextPageToken)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getActiveInactiveHostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &#x60;from&#x60; and &#x60;to&#x60; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **type** | **String**| Active or inactive hosts.    &#x60;active&#x60; - Active hosts.     &#x60;inactive&#x60; - Inactive hosts. | [optional] [enum: active, inactive] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| The page number of the current page in the returned records. | [optional] [default to 1] |
| **nextPageToken** | **String**| The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. | [optional] |
| **groupId** | **String**| The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID. | [optional] |

### Return type

[**ReportsGetActiveInactiveHostReportsResponse**](ReportsGetActiveInactiveHostReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Active or inactive hosts report returned.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; ’ &lt;br&gt;  |  -  |

<a name="getBillingDepartmentReports"></a>
# **getBillingDepartmentReports**
> ReportsGetBillingDepartmentReportsResponse getBillingDepartmentReports().execute();

Get billing reports

Get department billing reports of a Zoom account.  **Prerequisites:**     * Pro or a higher account with Department Billing option enabled. Contact Zoom Support team for details.    **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    try {
      ReportsGetBillingDepartmentReportsResponse result = client
              .reports
              .getBillingDepartmentReports()
              .execute();
      System.out.println(result);
      System.out.println(result.getBillingReports());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getBillingDepartmentReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetBillingDepartmentReportsResponse> response = client
              .reports
              .getBillingDepartmentReports()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getBillingDepartmentReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportsGetBillingDepartmentReportsResponse**](ReportsGetBillingDepartmentReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Billing report returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.   |  -  |

<a name="getBillingInvoices"></a>
# **getBillingInvoices**
> ReportsGetBillingInvoicesResponse getBillingInvoices(billingId).execute();

Get billing invoice reports

Get department billing invoices reports for a specific billing period. Provide the &#x60;billing_id&#x60; of the billing period for which you would like to retrieve the invoices for. This ID can be retrieved from **Get Billing Reports** API.   **Prerequisites:**     * Pro or a higher account with Department Billing option enabled. Contact the Zoom Support team to enable this feature.    **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String billingId = "indfhgfhfho"; // Unique Identifier of the Billing Report. Retrieve this ID from the response of **Get Billing Reports** API request.   
    try {
      ReportsGetBillingInvoicesResponse result = client
              .reports
              .getBillingInvoices(billingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getInvoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getBillingInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetBillingInvoicesResponse> response = client
              .reports
              .getBillingInvoices(billingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getBillingInvoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **billingId** | **String**| Unique Identifier of the Billing Report. Retrieve this ID from the response of **Get Billing Reports** API request.    | |

### Return type

[**ReportsGetBillingInvoicesResponse**](ReportsGetBillingInvoicesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Billing Invoice reports returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;5010&#x60; &lt;br&gt; Report does not exist.   |  -  |

<a name="getCloudRecordingUsageReport"></a>
# **getCloudRecordingUsageReport**
> ReportsGetCloudRecordingUsageReportResponse getCloudRecordingUsageReport(from, to).groupId(groupId).execute();

Get cloud recording usage report

Retrieve cloud recording usage report for a specified period. You can only get cloud recording reports that is one day earlier than the current date and for the most recent period of 6 months. The date gap between from and to dates should be smaller or equal to 30 days.      **Prerequisites**     * Pro or higher plan.       **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the &quot;from&quot; and &quot;to&quot; parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    String groupId = "TaVA8QKik_1233"; // The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID.
    try {
      ReportsGetCloudRecordingUsageReportResponse result = client
              .reports
              .getCloudRecordingUsageReport(from, to)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getCloudRecordingStorage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getCloudRecordingUsageReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetCloudRecordingUsageReportResponse> response = client
              .reports
              .getCloudRecordingUsageReport(from, to)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getCloudRecordingUsageReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &amp;quot;from&amp;quot; and &amp;quot;to&amp;quot; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **groupId** | **String**| The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID. | [optional] |

### Return type

[**ReportsGetCloudRecordingUsageReportResponse**](ReportsGetCloudRecordingUsageReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Cloud Recording Report Returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt; ’   |  -  |

<a name="getDailyUsageReport"></a>
# **getDailyUsageReport**
> ReportsGetDailyUsageReportResponse getDailyUsageReport().year(year).month(month).groupId(groupId).execute();

Get daily usage report

Retrieve daily report to access the account-wide usage of Zoom services for each day in a given month. It lists the number of new users, meetings, participants, and meeting minutes.     **Prerequisites**     * Pro or higher plan.       **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    Integer year = 2022; // Year for this report
    Integer month = 3; // Month for this report
    String groupId = "TaVA8QKik_1233"; // The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID.
    try {
      ReportsGetDailyUsageReportResponse result = client
              .reports
              .getDailyUsageReport()
              .year(year)
              .month(month)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDates());
      System.out.println(result.getMonth());
      System.out.println(result.getYear());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailyUsageReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetDailyUsageReportResponse> response = client
              .reports
              .getDailyUsageReport()
              .year(year)
              .month(month)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDailyUsageReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **year** | **Integer**| Year for this report | [optional] |
| **month** | **Integer**| Month for this report | [optional] |
| **groupId** | **String**| The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain users who are members of the queried group ID. | [optional] |

### Return type

[**ReportsGetDailyUsageReportResponse**](ReportsGetDailyUsageReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Daily report retrieved.     This is only available for paid accounts:{accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Daily report can only be provided for a month that falls within the recent 6 months.  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt; ’   |  -  |

<a name="getMeetingDetailReports"></a>
# **getMeetingDetailReports**
> ReportsGetMeetingDetailReportsResponse getMeetingDetailReports(meetingId).execute();

Get meeting detail reports

Get a detailed report for a past meeting.      **Prerequisites:**     * Pro or a higher plan.         **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    Object meetingId = null; // The meeting's ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID before making an API request.
    try {
      ReportsGetMeetingDetailReportsResponse result = client
              .reports
              .getMeetingDetailReports(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomKeys());
      System.out.println(result.getDept());
      System.out.println(result.getDuration());
      System.out.println(result.getEndTime());
      System.out.println(result.getId());
      System.out.println(result.getParticipantsCount());
      System.out.println(result.getStartTime());
      System.out.println(result.getTopic());
      System.out.println(result.getTotalMinutes());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
      System.out.println(result.getUserEmail());
      System.out.println(result.getUserName());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingDetailReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingDetailReportsResponse> response = client
              .reports
              .getMeetingDetailReports(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingDetailReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **meetingId** | [**Object**](.md)| The meeting&#39;s ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID before making an API request. | |

### Return type

[**ReportsGetMeetingDetailReportsResponse**](ReportsGetMeetingDetailReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting details returned.     This is only available for paid account. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;12702&#x60; &lt;br&gt; Can not access meeting a year ago.&lt;br&gt;  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting {meetingId} not found or has expired.&lt;br&gt;   |  -  |

<a name="getMeetingParticipantReports"></a>
# **getMeetingParticipantReports**
> ReportsGetMeetingParticipantReportsResponse getMeetingParticipantReports(meetingId).pageSize(pageSize).nextPageToken(nextPageToken).includeFields(includeFields).execute();

Get meeting participant reports

Return a report of a past meeting with two or more participants, including the host. To return a report for past meeting with only **one** participant, use the [**List meeting participants**](https://developers.zoom.us) API.   **Note:**   This API may return empty values for participants&#39; &#x60;user_name&#x60;, &#x60;ip_address&#x60;, &#x60;location&#x60;, and &#x60;email&#x60; responses when the account calling this API:  * Does **not** have a signed HIPAA business associate agreement (BAA).  * Is a [**legacy** HIPAA BAA account](https://developers.zoom.us).   **Prerequisites:**  * A Pro or a higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String meetingId = "meetingId_example"; // The meeting's ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the meeting UUID before making an API request.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    String includeFields = "registrant_id"; // Provide `registrant_id` as the value for this field if you would like to see the registrant ID attribute in the response of this API call. A registrant ID is a unique identifier of a [meeting registrant](https://developers.zoom.us).
    try {
      ReportsGetMeetingParticipantReportsResponse result = client
              .reports
              .getMeetingParticipantReports(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .includeFields(includeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getParticipants());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingParticipantReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingParticipantReportsResponse> response = client
              .reports
              .getMeetingParticipantReports(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .includeFields(includeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingParticipantReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **meetingId** | **String**| The meeting&#39;s ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the meeting UUID before making an API request. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **includeFields** | **String**| Provide &#x60;registrant_id&#x60; as the value for this field if you would like to see the registrant ID attribute in the response of this API call. A registrant ID is a unique identifier of a [meeting registrant](https://developers.zoom.us). | [optional] [enum: registrant_id] |

### Return type

[**ReportsGetMeetingParticipantReportsResponse**](ReportsGetMeetingParticipantReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting participants report returned.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access meeting a year ago.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting  {MeetingId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="getMeetingPollReports"></a>
# **getMeetingPollReports**
> ReportsGetMeetingPollReportsResponse getMeetingPollReports(meetingId).execute();

Get meeting poll reports

Use this API to get a report of [poll](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings) results for a past meeting.    **Prerequisites:**  * A Pro or a higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    Object meetingId = null; // The meeting's ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID before making an API request.
    try {
      ReportsGetMeetingPollReportsResponse result = client
              .reports
              .getMeetingPollReports(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUuid());
      System.out.println(result.getStartTime());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingPollReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingPollReportsResponse> response = client
              .reports
              .getMeetingPollReports(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingPollReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **meetingId** | [**Object**](.md)| The meeting&#39;s ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID before making an API request. | |

### Return type

[**ReportsGetMeetingPollReportsResponse**](ReportsGetMeetingPollReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;  * Meeting polls report returned.  * This is only available for paid account: {accountId} |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;12702&#x60; &lt;br&gt; Can not access meeting a year ago.  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting \&quot;{meetingId}\&quot; not found or has expired.   |  -  |

<a name="getMeetingQaReport"></a>
# **getMeetingQaReport**
> ReportsGetMeetingQaReportResponse getMeetingQaReport(meetingId).execute();

Get meeting Q&amp;A report

Retrieve a report on questions asked and answered by participants from past meetings.             **Prerequisites:**     * Pro plan or higher.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String meetingId = "meetingId_example"; // The meeting's ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the meeting UUID before making an API request.
    try {
      ReportsGetMeetingQaReportResponse result = client
              .reports
              .getMeetingQaReport(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingQaReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingQaReportResponse> response = client
              .reports
              .getMeetingQaReport(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingQaReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **meetingId** | **String**| The meeting&#39;s ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the meeting UUID before making an API request. | |

### Return type

[**ReportsGetMeetingQaReportResponse**](ReportsGetMeetingQaReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting Q&amp;amp;A report returned.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting {meetingId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="getMeetingReports"></a>
# **getMeetingReports**
> ReportsGetMeetingReportsResponse getMeetingReports(userId, from, to).pageSize(pageSize).nextPageToken(nextPageToken).type(type).execute();

Get meeting reports

Retrieve [report](https://support.zoom.us/hc/en-us/articles/216378603-Meeting-Reporting) on past meetings and webinars for a specified time period. The time range for the report is limited to a month and the month must fall within the past six months.  Meetings and webinars are returned only if they have two or more unique participants.            **Prerequisites:**     * Pro or higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    Object userId = null; // The user ID or email address of the user. For user-level apps, pass the `me` value.
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the &quot;from&quot; and &quot;to&quot; parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    String type = "past"; // The meeting type to query for:  * `past` &mdash; All past meetings.  * `pastOne` &mdash; A single past user meeting.  * `pastJoined` &mdash; All past meetings the account's users hosted or joined.
    try {
      ReportsGetMeetingReportsResponse result = client
              .reports
              .getMeetingReports(userId, from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getFrom());
      System.out.println(result.getMeetings());
      System.out.println(result.getTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingReportsResponse> response = client
              .reports
              .getMeetingReports(userId, from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | [**Object**](.md)| The user ID or email address of the user. For user-level apps, pass the &#x60;me&#x60; value. | |
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &amp;quot;from&amp;quot; and &amp;quot;to&amp;quot; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **type** | **String**| The meeting type to query for:  * &#x60;past&#x60; &amp;mdash; All past meetings.  * &#x60;pastOne&#x60; &amp;mdash; A single past user meeting.  * &#x60;pastJoined&#x60; &amp;mdash; All past meetings the account&#39;s users hosted or joined. | [optional] [default to past] [enum: past, pastOne, pastJoined] |

### Return type

[**ReportsGetMeetingReportsResponse**](ReportsGetMeetingReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Active or inactive hosts report returned.      |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; This is only available for paid account:{accountId}.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; The next page token is invalid or expired.  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} not exist or not belong to this account.   |  -  |

<a name="getMeetingSurveyReport"></a>
# **getMeetingSurveyReport**
> ReportsGetMeetingSurveyReportResponse getMeetingSurveyReport(meetingId).execute();

Get meeting survey report

Retrieve a report on past [meeting survey](https://support.zoom.com/hc/en/article?id&#x3D;zm_kb&amp;sysparm_article&#x3D;KB0057559).          **Prerequisites:**     * Pro or a higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String meetingId = "meetingId_example"; // The meeting's ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the meeting UUID before making an API request.
    try {
      ReportsGetMeetingSurveyReportResponse result = client
              .reports
              .getMeetingSurveyReport(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeetingId());
      System.out.println(result.getMeetingUuid());
      System.out.println(result.getStartTime());
      System.out.println(result.getSurveyId());
      System.out.println(result.getSurveyName());
      System.out.println(result.getSurveyAnswers());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingSurveyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetMeetingSurveyReportResponse> response = client
              .reports
              .getMeetingSurveyReport(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getMeetingSurveyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **meetingId** | **String**| The meeting&#39;s ID or universally unique ID (UUID).  * If you provide a meeting ID, the API will return a response for the latest meeting instance.  * If you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the meeting UUID before making an API request. | |

### Return type

[**ReportsGetMeetingSurveyReportResponse**](ReportsGetMeetingSurveyReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting survey report returned.      Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access a webinar a year ago.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar  {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="getOperationLogsReport"></a>
# **getOperationLogsReport**
> ReportsGetOperationLogsReportResponse getOperationLogsReport(from, to).pageSize(pageSize).nextPageToken(nextPageToken).categoryType(categoryType).execute();

Get operation logs report

The [Operations Logs](https://support.zoom.us/hc/en-us/articles/360032748331-Operation-Logs) report allows you to audit admin and user activity, such as adding a new user, changing account settings, and deleting recordings.     Use this API to retrieve operation logs report for a specified period of time.     **Prerequisites:**     * Pro or higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the &quot;from&quot; and &quot;to&quot; parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    String categoryType = "all"; // **Optional**     Filter your response by a category type to see reports for a specific category. The value for this field can be one of the following:     `all`    `user`    `user_settings`    `account`    `billing`    `im`    `recording`    `phone_contacts`    `webinar`    `sub_account`    `role`    `zoom_rooms`
    try {
      ReportsGetOperationLogsReportResponse result = client
              .reports
              .getOperationLogsReport(from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .categoryType(categoryType)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getOperationLogs());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getOperationLogsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetOperationLogsReportResponse> response = client
              .reports
              .getOperationLogsReport(from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .categoryType(categoryType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getOperationLogsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &amp;quot;from&amp;quot; and &amp;quot;to&amp;quot; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **categoryType** | **String**| **Optional**     Filter your response by a category type to see reports for a specific category. The value for this field can be one of the following:     &#x60;all&#x60;    &#x60;user&#x60;    &#x60;user_settings&#x60;    &#x60;account&#x60;    &#x60;billing&#x60;    &#x60;im&#x60;    &#x60;recording&#x60;    &#x60;phone_contacts&#x60;    &#x60;webinar&#x60;    &#x60;sub_account&#x60;    &#x60;role&#x60;    &#x60;zoom_rooms&#x60; | [optional] [enum: all, user, user_settings, account, billing, im, recording, phone_contacts, webinar, sub_account, role, zoom_rooms] |

### Return type

[**ReportsGetOperationLogsReportResponse**](ReportsGetOperationLogsReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Operation Logs Report Returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |

<a name="getTelephoneReports"></a>
# **getTelephoneReports**
> ReportsGetTelephoneReportsResponse getTelephoneReports(from, to).type(type).queryDateType(queryDateType).pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).execute();

Get telephone reports

The [telephone report](https://support.zoom.us/hc/en-us/articles/206514816-Telephone-reports) allows you to view who dialed into meetings via phone (Audio Conferencing or SIP Connected Audio) and which number they dialed into and other details. Use this API to get telephone report for a specified period of time.  **Prerequisites:**     * Pro or higher plan.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the &quot;from&quot; and &quot;to&quot; parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    String type = "1"; // Audio types:    `1` - Toll-free Call-in &amp; Call-out.    `2` - Toll      `3` - SIP Connected Audio
    String queryDateType = "start_time"; // The type of date to query.  * `start_time` &mdash; Query by call start time.  * `end_time` &mdash; Query by call end time.  * `meeting_start_time` &mdash; Query by meeting start time.  * `meeting_end_time` &mdash; Query by meeting end time.   This value defaults to `start_time`.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // The page number of the current page in the returned records. This field is **not** available if the `query_date_type` parameter is the `meeting_start_time` or `meeting_end_time` value.   This field is deprecated. Use the `next_page_token` query parameter for pagination.
    String nextPageToken = "b43YBRLJFg3V4vsSpxvGdKIGtNbxn9h9If2"; // The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
    try {
      ReportsGetTelephoneReportsResponse result = client
              .reports
              .getTelephoneReports(from, to)
              .type(type)
              .queryDateType(queryDateType)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getTo());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getTelephonyUsage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getTelephoneReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetTelephoneReportsResponse> response = client
              .reports
              .getTelephoneReports(from, to)
              .type(type)
              .queryDateType(queryDateType)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getTelephoneReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &amp;quot;from&amp;quot; and &amp;quot;to&amp;quot; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **type** | **String**| Audio types:    &#x60;1&#x60; - Toll-free Call-in &amp;amp; Call-out.    &#x60;2&#x60; - Toll      &#x60;3&#x60; - SIP Connected Audio | [optional] [default to 1] [enum: 1, 2, 3] |
| **queryDateType** | **String**| The type of date to query.  * &#x60;start_time&#x60; &amp;mdash; Query by call start time.  * &#x60;end_time&#x60; &amp;mdash; Query by call end time.  * &#x60;meeting_start_time&#x60; &amp;mdash; Query by meeting start time.  * &#x60;meeting_end_time&#x60; &amp;mdash; Query by meeting end time.   This value defaults to &#x60;start_time&#x60;. | [optional] [default to start_time] [enum: start_time, end_time, meeting_start_time, meeting_end_time] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| The page number of the current page in the returned records. This field is **not** available if the &#x60;query_date_type&#x60; parameter is the &#x60;meeting_start_time&#x60; or &#x60;meeting_end_time&#x60; value.   This field is deprecated. Use the &#x60;next_page_token&#x60; query parameter for pagination. | [optional] [default to 1] |
| **nextPageToken** | **String**| The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. | [optional] |

### Return type

[**ReportsGetTelephoneReportsResponse**](ReportsGetTelephoneReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Telephone report returned.     This is only available for paid account:{accountId}.     The requested report cannot be generated for this account because this account has not subscribed to toll-free audio conference plan.     Toll Report feature must be enabled to perform this action. Contact the Zoom Support team for help. |  -  |

<a name="getWebinarDetailsReport"></a>
# **getWebinarDetailsReport**
> ReportsGetWebinarDetailsReportResponse getWebinarDetailsReport(webinarId).execute();

Get webinar detail reports

Retrieve a [report](https://support.zoom.us/hc/en-us/articles/201393719-Webinar-Reporting) containing past webinar details.            **Prerequisites:**     * Pro or higher plan with Webinar add-on.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request.
    try {
      ReportsGetWebinarDetailsReportResponse result = client
              .reports
              .getWebinarDetailsReport(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomKeys());
      System.out.println(result.getDept());
      System.out.println(result.getDuration());
      System.out.println(result.getEndTime());
      System.out.println(result.getId());
      System.out.println(result.getParticipantsCount());
      System.out.println(result.getStartTime());
      System.out.println(result.getTopic());
      System.out.println(result.getTotalMinutes());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
      System.out.println(result.getUserEmail());
      System.out.println(result.getUserName());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarDetailsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetWebinarDetailsReportResponse> response = client
              .reports
              .getWebinarDetailsReport(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarDetailsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request. | |

### Return type

[**ReportsGetWebinarDetailsReportResponse**](ReportsGetWebinarDetailsReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar details returned.     This is only available for paid account:{accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account:{accountId}.&lt;br&gt;  **Error Code:** &#x60;12702&#x60; &lt;br&gt; Can not access a webinar a year ago.&lt;br&gt;  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting  {meetingId} not found or has expired.&lt;br&gt;   |  -  |

<a name="getWebinarPollReports"></a>
# **getWebinarPollReports**
> ReportsGetWebinarPollReportsResponse getWebinarPollReports(webinarId).execute();

Get webinar poll reports

Retrieve a report on past [webinar polls](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars).          **Prerequisites:**     * Pro or a higher plan with Webinar add-on enabled.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the webinar UUID before making an API request.
    try {
      ReportsGetWebinarPollReportsResponse result = client
              .reports
              .getWebinarPollReports(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarPollReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetWebinarPollReportsResponse> response = client
              .reports
              .getWebinarPollReports(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarPollReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the webinar UUID before making an API request. | |

### Return type

[**ReportsGetWebinarPollReportsResponse**](ReportsGetWebinarPollReportsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar polls report returned.     Missing webinar subscription plan.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account:{accountId}.&lt;br&gt;  **Error Code:** &#x60;12702&#x60; &lt;br&gt; Can not access a webinar a year ago.&lt;br&gt;  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar  {webinarId} not found or has expired.&lt;br&gt;   |  -  |

<a name="getWebinarQAReport"></a>
# **getWebinarQAReport**
> ReportsGetWebinarQaReportResponse getWebinarQAReport(webinarId).execute();

Get webinar Q&amp;A report

Retrieve a report on questions asked by participants and answered by panelists, co-hosts and hosts from past webinars.             **Prerequisites:**     * Pro or a higher plan with the Webinar add-on enabled.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the webinar UUID before making an API request.
    try {
      ReportsGetWebinarQaReportResponse result = client
              .reports
              .getWebinarQAReport(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarQAReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetWebinarQaReportResponse> response = client
              .reports
              .getWebinarQAReport(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarQAReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the webinar UUID before making an API request. | |

### Return type

[**ReportsGetWebinarQaReportResponse**](ReportsGetWebinarQaReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;   Webinar Q&amp;A report returned. Only available for Paid or ZMP account: {accountId}.   A report can&#39;t be generated for this account because this account is not subscribed to a webinar plan. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar  {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="getWebinarSurveyReport"></a>
# **getWebinarSurveyReport**
> ReportsGetWebinarSurveyReportResponse getWebinarSurveyReport(webinarId).execute();

Get webinar survey report

Retrieve a report on past [webinar survey](https://support.zoom.com/hc/en/article?id&#x3D;zm_kb&amp;sysparm_article&#x3D;KB0057559).          **Prerequisites:**     * Pro or a higher plan with Webinar add-on enabled.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the webinar UUID before making an API request.
    try {
      ReportsGetWebinarSurveyReportResponse result = client
              .reports
              .getWebinarSurveyReport(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebinarId());
      System.out.println(result.getWebinarUuid());
      System.out.println(result.getStartTime());
      System.out.println(result.getSurveyId());
      System.out.println(result.getSurveyName());
      System.out.println(result.getSurveyAnswers());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarSurveyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetWebinarSurveyReportResponse> response = client
              .reports
              .getWebinarSurveyReport(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebinarSurveyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the webinar UUID before making an API request. | |

### Return type

[**ReportsGetWebinarSurveyReportResponse**](ReportsGetWebinarSurveyReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar survey report returned.     Missing webinar subscription plan.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access a webinar a year ago.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar  {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="listSignInSignOutActivities"></a>
# **listSignInSignOutActivities**
> ReportsListSignInSignOutActivitiesResponse listSignInSignOutActivities().from(from).to(to).pageSize(pageSize).nextPageToken(nextPageToken).execute();

Get sign In / sign out activity report

Retrieve a list of sign in / sign out activity logs [report](https://support.zoom.us/hc/en-us/articles/201363213-Getting-Started-with-Reports) of users under a Zoom account.     **Prerequisites**     * Pro or higher plan.       **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Sat Aug 31 17:00:00 PDT 2019"); // Start date for which you would like to view the activity logs report. Using the `from` and `to` parameters, specify a monthly date range for the report as the API only provides one month worth of data in one request. The specified date range should fall within the last six months.
    LocalDate to = LocalDate.parse("Thu Sep 19 17:00:00 PDT 2019"); // End date up to which you would like to view the activity logs report.
    Integer pageSize = 30; // The number of records to be returned within a single API call
    String nextPageToken = "b43YBRLJFg3V4vsSpxvGdKIGtNbxn9h9If2"; // Next page token is used to paginate through large result sets
    try {
      ReportsListSignInSignOutActivitiesResponse result = client
              .reports
              .listSignInSignOutActivities()
              .from(from)
              .to(to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivityLogs());
      System.out.println(result.getFrom());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getTo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listSignInSignOutActivities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsListSignInSignOutActivitiesResponse> response = client
              .reports
              .listSignInSignOutActivities()
              .from(from)
              .to(to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listSignInSignOutActivities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date for which you would like to view the activity logs report. Using the &#x60;from&#x60; and &#x60;to&#x60; parameters, specify a monthly date range for the report as the API only provides one month worth of data in one request. The specified date range should fall within the last six months. | [optional] |
| **to** | **LocalDate**| End date up to which you would like to view the activity logs report. | [optional] |
| **pageSize** | **Integer**| The number of records to be returned within a single API call | [optional] |
| **nextPageToken** | **String**| Next page token is used to paginate through large result sets | [optional] |

### Return type

[**ReportsListSignInSignOutActivitiesResponse**](ReportsListSignInSignOutActivitiesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Success |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |

<a name="listUpcomingEventsReport"></a>
# **listUpcomingEventsReport**
> ReportsListUpcomingEventsReportResponse listUpcomingEventsReport(from, to).pageSize(pageSize).nextPageToken(nextPageToken).type(type).groupId(groupId).execute();

Get upcoming events report

Use this API to list upcoming meeting and/or webinar events within a specified period of time. The report&#39;s time range is limited to one month.  **Prerequisites:**  * A Pro or higher plan  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    LocalDate from = LocalDate.parse("Fri Dec 31 16:00:00 PST 2021"); // Start date in 'yyyy-mm-dd' format. The date range defined by the &quot;from&quot; and &quot;to&quot; parameters should only be one month as the report includes only one month worth of data at once.
    LocalDate to = LocalDate.parse("Thu Jan 27 16:00:00 PST 2022"); // End date.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    String type = "meeting"; // The type of event to query.  * `meeting` &mdash; A meeting event.  * `webinar` &mdash; A webinar event.  * `all` &mdash; Both meeting and webinar events.  This value defaults to `all`.
    String groupId = "TaVA8QKik_1233"; // The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain meetings where the host is a member of the queried group ID.
    try {
      ReportsListUpcomingEventsReportResponse result = client
              .reports
              .listUpcomingEventsReport(from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .type(type)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getTo());
      System.out.println(result.getUpcomingEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listUpcomingEventsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsListUpcomingEventsReportResponse> response = client
              .reports
              .listUpcomingEventsReport(from, to)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .type(type)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#listUpcomingEventsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **LocalDate**| Start date in &#39;yyyy-mm-dd&#39; format. The date range defined by the &amp;quot;from&amp;quot; and &amp;quot;to&amp;quot; parameters should only be one month as the report includes only one month worth of data at once. | |
| **to** | **LocalDate**| End date. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **type** | **String**| The type of event to query.  * &#x60;meeting&#x60; &amp;mdash; A meeting event.  * &#x60;webinar&#x60; &amp;mdash; A webinar event.  * &#x60;all&#x60; &amp;mdash; Both meeting and webinar events.  This value defaults to &#x60;all&#x60;. | [optional] [default to all] [enum: meeting, webinar, all] |
| **groupId** | **String**| The group ID. To get a group ID, use the [**List groups**](https://developers.zoom.us) API.    **Note:** The API response will only contain meetings where the host is a member of the queried group ID. | [optional] |

### Return type

[**ReportsListUpcomingEventsReportResponse**](ReportsListUpcomingEventsReportResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Upcoming events report returned.      |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; This is only available for the paid account: {accountId} &lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; The next page token is invalid or expired.  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.&lt;br&gt;   |  -  |

<a name="webinarParticipantsList"></a>
# **webinarParticipantsList**
> ReportsWebinarParticipantsListResponse webinarParticipantsList(webinarId).pageSize(pageSize).nextPageToken(nextPageToken).includeFields(includeFields).execute();

Get webinar participant reports

Get a detailed report on each webinar attendee. You can get webinar participant reports for the last 6 months.    **Prerequisites:**  * A Pro or a higher plan with Webinar add-on enabled.  **Scopes:** &#x60;report:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.zoom.us/v2";
    
    configuration.openapiAuthorization  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: openapi_oauth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    ZoomMeeting client = new ZoomMeeting(configuration);
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the webinar UUID before making an API request.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    String includeFields = "registrant_id"; // The additional query parameters to include.  * `registrant_id` - Include the registrant's ID in the API response. The registrant ID is the webinar participant's unique ID.
    try {
      ReportsWebinarParticipantsListResponse result = client
              .reports
              .webinarParticipantsList(webinarId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .includeFields(includeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getParticipants());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#webinarParticipantsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsWebinarParticipantsListResponse> response = client
              .reports
              .webinarParticipantsList(webinarId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .includeFields(includeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#webinarParticipantsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the webinar UUID before making an API request. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **includeFields** | **String**| The additional query parameters to include.  * &#x60;registrant_id&#x60; - Include the registrant&#39;s ID in the API response. The registrant ID is the webinar participant&#39;s unique ID. | [optional] [enum: registrant_id] |

### Return type

[**ReportsWebinarParticipantsListResponse**](ReportsWebinarParticipantsListResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;  * Meeting participants report returned.     Only available for Paid or ZMP account: {accountId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: {accountId} &lt;br&gt; **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access a webinar a year ago.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar \&quot;{webinarId}\&quot; not found or has expired &lt;br&gt;  |  -  |

