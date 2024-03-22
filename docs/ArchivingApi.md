# ArchivingApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatistics**](ArchivingApi.md#getStatistics) | **GET** /archive_files/statistics | Get archived file statistics |
| [**meetingFilesDelete**](ArchivingApi.md#meetingFilesDelete) | **DELETE** /past_meetings/{meetingUUID}/archive_files | Delete a meeting&#39;s archived files |
| [**meetingFilesList**](ArchivingApi.md#meetingFilesList) | **GET** /archive_files | List archived files |
| [**meetingFilesList_0**](ArchivingApi.md#meetingFilesList_0) | **GET** /past_meetings/{meetingUUID}/archive_files | Get a meeting&#39;s archived files |
| [**updateAutoDeleteStatus**](ArchivingApi.md#updateAutoDeleteStatus) | **PATCH** /archive_files/{fileId} | Update an archived file&#39;s auto-delete status |


<a name="getStatistics"></a>
# **getStatistics**
> ArchivingGetStatisticsResponse getStatistics().from(from).to(to).execute();

Get archived file statistics

Get statistics about an account&#39;s archived meeting or webinar files.    Zoom&#39;s [archiving solution](https://support.zoom.us/hc/en-us/articles/360050431572-Archiving-indicators) lets account administrators set up an automated mechanism to record, collect, and archive meeting data to a third-party platform of their choice to satisfy FINRA and other compliance requirements.    **Prerequisites:**  * The [**Meeting and Webinar Archiving** feature](https://support.zoom.us/hc/en-us/articles/4405656451213--Archiving-for-meetings-and-webinars) enabled for your account by [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003).  **Scopes:** &#x60;recording:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchivingApi;
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
    OffsetDateTime from = OffsetDateTime.parse("2021-03-11T05:41:36Z"); // The query start date, `yyyy-MM-dd'T'HH:mm:ssZ` format. This value and the `to` query parameter value cannot exceed seven days.
    OffsetDateTime to = OffsetDateTime.parse("2021-03-18T05:41:36Z"); // The query end date, in `yyyy-MM-dd'T'HH:mm:ssZ` format. This value and the `from` query parameter value cannot exceed seven days.
    try {
      ArchivingGetStatisticsResponse result = client
              .archiving
              .getStatistics()
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getStatisticByFileExtension());
      System.out.println(result.getStatisticByFileStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#getStatistics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArchivingGetStatisticsResponse> response = client
              .archiving
              .getStatistics()
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#getStatistics");
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
| **from** | **OffsetDateTime**| The query start date, &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#x60; format. This value and the &#x60;to&#x60; query parameter value cannot exceed seven days. | [optional] |
| **to** | **OffsetDateTime**| The query end date, in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#x60; format. This value and the &#x60;from&#x60; query parameter value cannot exceed seven days. | [optional] |

### Return type

[**ArchivingGetStatisticsResponse**](ArchivingGetStatisticsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       The statistics of Archived files returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2001&#x60; &lt;br&gt; Account does not exist: {accountId}   |  -  |

<a name="meetingFilesDelete"></a>
# **meetingFilesDelete**
> meetingFilesDelete(meetingUUID).execute();

Delete a meeting&#39;s archived files

Use this API to delete all of a meeting&#39;s archived files.    **Prerequisites:**  * The [**Meeting and Webinar Archiving** feature](https://support.zoom.us/hc/en-us/articles/4405656451213--Archiving-for-meetings-and-webinars) enabled for your account by [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003).  **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchivingApi;
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
    String meetingUUID = "4444AAAiAAAAAiAiAiiAii=="; // The meeting's universally unique identifier (UUID). Each meeting instance generates a UUID. For example, after a meeting ends, a new UUID is generated for the next meeting instance.  If the meeting UUID begins with a `/` character or contains a `//` character, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID when using the meeting UUID for other API calls.
    try {
      client
              .archiving
              .meetingFilesDelete(meetingUUID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .archiving
              .meetingFilesDelete(meetingUUID)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesDelete");
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
| **meetingUUID** | **String**| The meeting&#39;s universally unique identifier (UUID). Each meeting instance generates a UUID. For example, after a meeting ends, a new UUID is generated for the next meeting instance.  If the meeting UUID begins with a &#x60;/&#x60; character or contains a &#x60;//&#x60; character, you **must** [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID when using the meeting UUID for other API calls. | |

### Return type

null (empty response body)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | **HTTP Status Code:** &#x60;200&#x60;       Meeting archived files returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; Only available for Paid account.  **Error Code:** &#x60;200&#x60; &lt;br&gt; Not available for this account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {0}   |  -  |

<a name="meetingFilesList"></a>
# **meetingFilesList**
> ArchivingMeetingFilesListResponse meetingFilesList().pageSize(pageSize).nextPageToken(nextPageToken).from(from).to(to).queryDateType(queryDateType).groupId(groupId).execute();

List archived files

Get an account&#39;s archived meeting or webinar files.    Zoom&#39;s [archiving solution](https://support.zoom.us/hc/en-us/articles/360050431572-Archiving-indicators) lets account administrators set up an automated mechanism to record, collect, and archive meeting data to a third-party platform of their choice to satisfy FINRA or other compliance requirements.    **Prerequisites:**  * The [**Meeting and Webinar Archiving** feature](https://support.zoom.us/hc/en-us/articles/4405656451213--Archiving-for-meetings-and-webinars) enabled for your account by [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003).  **Scopes:** &#x60;recording:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchivingApi;
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
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    OffsetDateTime from = OffsetDateTime.parse("2021-03-11T05:41:36Z"); // The query start date, in `yyyy-MM-dd'T'HH:mm:ssZ` format. This value and the `to` query parameter value cannot exceed seven days.
    OffsetDateTime to = OffsetDateTime.parse("2021-03-18T05:41:36Z"); // The query end date, in `yyyy-MM-dd'T'HH:mm:ssZ` format. This value and the `from` query parameter value cannot exceed seven days.
    String queryDateType = "meeting_start_time"; // The type of query date. * `meeting_start_time`  * `archive_complete_time`    This value defaults to `meeting_start_time`.
    String groupId = "pvFIYKSDTum9iCDOOtQL4w"; // The group ID. To get a group ID, use the [List groups](https://developers.zoom.us/docs/api/rest/reference/scim-api/methods/#operation/groupSCIM2List) API.
    try {
      ArchivingMeetingFilesListResponse result = client
              .archiving
              .meetingFilesList()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .queryDateType(queryDateType)
              .groupId(groupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getMeetings());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getTo());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArchivingMeetingFilesListResponse> response = client
              .archiving
              .meetingFilesList()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .queryDateType(queryDateType)
              .groupId(groupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesList");
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
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **from** | **OffsetDateTime**| The query start date, in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#x60; format. This value and the &#x60;to&#x60; query parameter value cannot exceed seven days. | [optional] |
| **to** | **OffsetDateTime**| The query end date, in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ&#x60; format. This value and the &#x60;from&#x60; query parameter value cannot exceed seven days. | [optional] |
| **queryDateType** | **String**| The type of query date. * &#x60;meeting_start_time&#x60;  * &#x60;archive_complete_time&#x60;    This value defaults to &#x60;meeting_start_time&#x60;. | [optional] [default to meeting_start_time] [enum: meeting_start_time, archive_complete_time] |
| **groupId** | **String**| The group ID. To get a group ID, use the [List groups](https://developers.zoom.us/docs/api/rest/reference/scim-api/methods/#operation/groupSCIM2List) API. | [optional] |

### Return type

[**ArchivingMeetingFilesListResponse**](ArchivingMeetingFilesListResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       Archived files returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;2001&#x60; &lt;br&gt;  Account does not exist: {accountId} &lt;br&gt;  |  -  |

<a name="meetingFilesList_0"></a>
# **meetingFilesList_0**
> ArchivingMeetingFilesList200Response meetingFilesList_0(meetingUUID).execute();

Get a meeting&#39;s archived files

Return a specific meeting instance&#39;s [archived files](https://support.zoom.us/hc/en-us/articles/360050431572-Archiving-indicators).    **Prerequisites:**  * The [**Meeting and Webinar Archiving** feature](https://support.zoom.us/hc/en-us/articles/4405656451213--Archiving-for-meetings-and-webinars) enabled for your account by [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003).  **Scopes:** &#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchivingApi;
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
    String meetingUUID = "4444AAAiAAAAAiAiAiiAii=="; // The meeting's universally unique identifier (UUID). Each meeting instance generates a UUID. After a meeting ends, a new UUID is generated for the next meeting instance.  If the meeting UUID begins with a `/` character or contains a `//` character, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID when using the meeting UUID for other API calls.
    try {
      ArchivingMeetingFilesList200Response result = client
              .archiving
              .meetingFilesList_0(meetingUUID)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountName());
      System.out.println(result.getArchiveFiles());
      System.out.println(result.getCompleteTime());
      System.out.println(result.getDuration());
      System.out.println(result.getDurationInSecond());
      System.out.println(result.getHostId());
      System.out.println(result.getId());
      System.out.println(result.getIsBreakoutRoom());
      System.out.println(result.getMeetingType());
      System.out.println(result.getParentMeetingId());
      System.out.println(result.getRecordingCount());
      System.out.println(result.getStartTime());
      System.out.println(result.getTimezone());
      System.out.println(result.getTopic());
      System.out.println(result.getTotalSize());
      System.out.println(result.getType());
      System.out.println(result.getUuid());
      System.out.println(result.getStatus());
      System.out.println(result.getGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArchivingMeetingFilesList200Response> response = client
              .archiving
              .meetingFilesList_0(meetingUUID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#meetingFilesList_0");
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
| **meetingUUID** | **String**| The meeting&#39;s universally unique identifier (UUID). Each meeting instance generates a UUID. After a meeting ends, a new UUID is generated for the next meeting instance.  If the meeting UUID begins with a &#x60;/&#x60; character or contains a &#x60;//&#x60; character, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the meeting UUID when using the meeting UUID for other API calls. | |

### Return type

[**ArchivingMeetingFilesList200Response**](ArchivingMeetingFilesList200Response.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting archived files returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting {meetingUUId} does not exist. &lt;br&gt; &lt;br&gt;  |  -  |

<a name="updateAutoDeleteStatus"></a>
# **updateAutoDeleteStatus**
> updateAutoDeleteStatus().fileId(fileId).archivingUpdateAutoDeleteStatusRequest(archivingUpdateAutoDeleteStatusRequest).execute();

Update an archived file&#39;s auto-delete status

Update an archived file&#39;s auto-delete status.    **Prerequisites:**  * [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003) must enable the [**Meeting and Webinar Archiving** feature](https://support.zoom.us/hc/en-us/articles/4405656451213--Archiving-for-meetings-and-webinars) for your account. * Open the disabling auto-delete feature in OP. Contact [Zoom Support](https://support.zoom.us/hc/en-us/articles/201362003) to open.  **Scopes:** &#x60;recording:write&#x60;,&#x60;recording:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ArchivingApi;
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
    Boolean autoDelete = true; // Whether to auto-delete the archived file.
    String fileId = "fileId_example";
    try {
      client
              .archiving
              .updateAutoDeleteStatus(autoDelete)
              .fileId(fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#updateAutoDeleteStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .archiving
              .updateAutoDeleteStatus(autoDelete)
              .fileId(fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivingApi#updateAutoDeleteStatus");
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
| **fileId** | **String**|  | [optional] |
| **archivingUpdateAutoDeleteStatusRequest** | [**ArchivingUpdateAutoDeleteStatusRequest**](ArchivingUpdateAutoDeleteStatusRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

