# CloudRecordingApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRegistrant**](CloudRecordingApi.md#createRegistrant) | **POST** /meetings/{meetingId}/recordings/registrants | Create a recording registrant |
| [**deleteMeetingRecordings**](CloudRecordingApi.md#deleteMeetingRecordings) | **DELETE** /meetings/{meetingId}/recordings | Delete meeting recordings |
| [**deleteRecording**](CloudRecordingApi.md#deleteRecording) | **DELETE** /meetings/{meetingId}/recordings/{recordingId} | Delete a meeting recording file |
| [**details**](CloudRecordingApi.md#details) | **GET** /meetings/{meetingId}/recordings/analytics_details | Get Meeting Recording&#39;s Analytics Details |
| [**getMeetingRecordings**](CloudRecordingApi.md#getMeetingRecordings) | **GET** /meetings/{meetingId}/recordings | Get meeting recordings |
| [**getSettings**](CloudRecordingApi.md#getSettings) | **GET** /meetings/{meetingId}/recordings/settings | Get meeting recording settings |
| [**listRecordings**](CloudRecordingApi.md#listRecordings) | **GET** /users/{userId}/recordings | List all recordings |
| [**listRegistrants**](CloudRecordingApi.md#listRegistrants) | **GET** /meetings/{meetingId}/recordings/registrants | List recording registrants |
| [**listRegistrationQuestions**](CloudRecordingApi.md#listRegistrationQuestions) | **GET** /meetings/{meetingId}/recordings/registrants/questions | Get registration questions |
| [**recoverRecordingStatus**](CloudRecordingApi.md#recoverRecordingStatus) | **PUT** /meetings/{meetingUUID}/recordings/status | Recover meeting recordings |
| [**recoverStatus**](CloudRecordingApi.md#recoverStatus) | **PUT** /meetings/{meetingId}/recordings/{recordingId}/status | Recover a single recording |
| [**summary**](CloudRecordingApi.md#summary) | **GET** /meetings/{meetingId}/recordings/analytics_summary | Get Meeting Recording&#39;s Analytics Summary |
| [**updateRegistrantStatus**](CloudRecordingApi.md#updateRegistrantStatus) | **PUT** /meetings/{meetingId}/recordings/registrants/status | Update registrant&#39;s status |
| [**updateRegistrationQuestions**](CloudRecordingApi.md#updateRegistrationQuestions) | **PATCH** /meetings/{meetingId}/recordings/registrants/questions | Update registration questions |
| [**updateSettings**](CloudRecordingApi.md#updateSettings) | **PATCH** /meetings/{meetingId}/recordings/settings | Update meeting recording settings |


<a name="createRegistrant"></a>
# **createRegistrant**
> CloudRecordingCreateRegistrantResponse createRegistrant(meetingId).cloudRecordingCreateRegistrantRequest(cloudRecordingCreateRegistrantRequest).execute();

Create a recording registrant

Cloud Recordings of past Zoom Meetings can be made [on-demand](https://support.zoom.us/hc/en-us/articles/360000488283-On-demand-Recordings). Users should be [registered](https://developers.zoom.us) to view these recordings.  Use this API to register a user to gain access to **On-demand Cloud Recordings** of a past meeting.       **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String email = "email_example"; // The registrant's email address. See [Email address display rules](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis#email-address) for return value details.
    String firstName = "firstName_example"; // The registrant's first name.
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String address = "address_example"; // The registrant's address.
    String city = "city_example"; // The registrant's city.
    String comments = "comments_example"; // The registrant's questions and comments.
    String country = "country_example"; // The registrant's two-letter [country code](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries).
    List<CloudRecordingCreateRegistrantRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Information about custom questions.
    String industry = "industry_example"; // The registrant's industry.
    String jobTitle = "jobTitle_example"; // The registrant's job title.
    String lastName = "lastName_example"; // The registrant's last name.
    String noOfEmployees = ""; // The registrant's number of employees:  * `1-20`  * `21-50`  * `51-100`  * `101-250`  * `251-500`  * `501-1,000`  * `1,001-5,000`  * `5,001-10,000`  * `More than 10,000`
    String org = "org_example"; // The registrant's organization.
    String phone = "phone_example"; // The registrant's phone number.
    String purchasingTimeFrame = ""; // The registrant's purchasing time frame:  * `Within a month`  * `1-3 months`  * `4-6 months`  * `More than 6 months`  * `No timeframe`
    String roleInPurchaseProcess = ""; // The registrant's role in the purchase process:  * `Decision Maker`  * `Evaluator/Recommender`  * `Influencer`  * `Not involved`
    String state = "state_example"; // The registrant's state or province.
    String status = "approved"; // The registrant's status:  * `approved` &mdash; Registrant is approved.  * `denied` &mdash; Registrant is denied.  * `pending` &mdash; Registrant is waiting for approval.
    String zip = "zip_example"; // The registrant's ZIP or postal code.
    try {
      CloudRecordingCreateRegistrantResponse result = client
              .cloudRecording
              .createRegistrant(email, firstName, meetingId)
              .address(address)
              .city(city)
              .comments(comments)
              .country(country)
              .customQuestions(customQuestions)
              .industry(industry)
              .jobTitle(jobTitle)
              .lastName(lastName)
              .noOfEmployees(noOfEmployees)
              .org(org)
              .phone(phone)
              .purchasingTimeFrame(purchasingTimeFrame)
              .roleInPurchaseProcess(roleInPurchaseProcess)
              .state(state)
              .status(status)
              .zip(zip)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getRegistrantId());
      System.out.println(result.getShareUrl());
      System.out.println(result.getTopic());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#createRegistrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingCreateRegistrantResponse> response = client
              .cloudRecording
              .createRegistrant(email, firstName, meetingId)
              .address(address)
              .city(city)
              .comments(comments)
              .country(country)
              .customQuestions(customQuestions)
              .industry(industry)
              .jobTitle(jobTitle)
              .lastName(lastName)
              .noOfEmployees(noOfEmployees)
              .org(org)
              .phone(phone)
              .purchasingTimeFrame(purchasingTimeFrame)
              .roleInPurchaseProcess(roleInPurchaseProcess)
              .state(state)
              .status(status)
              .zip(zip)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#createRegistrant");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits. | |
| **cloudRecordingCreateRegistrantRequest** | [**CloudRecordingCreateRegistrantRequest**](CloudRecordingCreateRegistrantRequest.md)|  | [optional] |

### Return type

[**CloudRecordingCreateRegistrantResponse**](CloudRecordingCreateRegistrantResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Registration submitted. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="deleteMeetingRecordings"></a>
# **deleteMeetingRecordings**
> deleteMeetingRecordings(meetingId).action(action).execute();

Delete meeting recordings

Delete all recording files of a meeting.           **Prerequisites**: * Cloud Recording should be enabled on the user&#39;s account.       **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    String action = "trash"; // The recording delete actions:    `trash` - Move recording to trash.    `delete` - Delete recording permanently.
    try {
      client
              .cloudRecording
              .deleteMeetingRecordings(meetingId)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#deleteMeetingRecordings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .deleteMeetingRecordings(meetingId)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#deleteMeetingRecordings");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **action** | **String**| The recording delete actions:    &#x60;trash&#x60; - Move recording to trash.    &#x60;delete&#x60; - Delete recording permanently. | [optional] [default to trash] [enum: trash, delete] |

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
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Recordings deleted.   **Error Code:** &#x60;200&#x60;      You do not have the right permission. |  -  |
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting recording deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}. &lt;br/&gt;  **Error Code:** &#x60;3332&#x60; &lt;br&gt; This recording was selected for a simulive webinar. You cannot delete or trash it.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist or does not belong to this account.&lt;br&gt;  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="deleteRecording"></a>
# **deleteRecording**
> deleteRecording(meetingId, recordingId).action(action).execute();

Delete a meeting recording file

Delete a specific recording file from a meeting.&amp;lt;p style&#x3D;&amp;quot;background-color:#e1f5fe; color:#01579b; padding:8px&amp;quot;&amp;gt; &amp;lt;b&amp;gt;Note:&amp;lt;/b&amp;gt; To use this API, you must enable the &amp;lt;b&amp;gt;The host can delete cloud recordings&amp;lt;/b&amp;gt; setting. You can find this setting in the &amp;lt;b&amp;gt;Recording&amp;lt;/b&amp;gt; tab of the &amp;lt;b&amp;gt;Settings&amp;lt;/b&amp;gt; interface in the [Zoom web portal](https://zoom.us/).&amp;lt;/p&amp;gt;    **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    String recordingId = "a2f19f96-9294-4f51-8134-6f0eea108eb2"; // The recording ID.
    String action = "trash"; // The recording delete actions:    `trash` - Move recording to trash.    `delete` - Delete recording permanently.
    try {
      client
              .cloudRecording
              .deleteRecording(meetingId, recordingId)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#deleteRecording");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .deleteRecording(meetingId, recordingId)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#deleteRecording");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **recordingId** | **String**| The recording ID. | |
| **action** | **String**| The recording delete actions:    &#x60;trash&#x60; - Move recording to trash.    &#x60;delete&#x60; - Delete recording permanently. | [optional] [default to trash] [enum: trash, delete] |

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
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Recording deleted.   **Error Code:** &#x60;200&#x60;     You do not have the right permissions. |  -  |
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting recording file deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.&lt;br&gt;  **Error Code:** &#x60;3303&#x60; &lt;br&gt; You can not delete an uncompleted meeting. &lt;br/&gt;  **Error Code:** &#x60;3332&#x60; &lt;br&gt; This recording was selected for a simulive webinar. You cannot delete or trash it. &lt;br&gt;  **Error Code:** &#x60;3332&#x60; &lt;br&gt; Unable to delete this file because this recording is being used for Zoom IQ for Sales.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist or does not belong to this account.&lt;br&gt;  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="details"></a>
# **details**
> AnalyticsDetailsResponse details(meetingId).pageSize(pageSize).nextPageToken(nextPageToken).from(from).to(to).type(type).execute();

Get Meeting Recording&#39;s Analytics Details

Use this API to return a meeting recording&#39;s [analytics details](https://support.zoom.us/hc/en-us/articles/205347605-Managing-cloud-recordings#h_0b665029-ce74-4849-9794-d1aa0320d163). **Maximum duration: 1 Month**. To access a password-protected cloud recording, send the user&#39;s [OAuth access token](https://developers.zoom.us/docs/integrations/oauth/) as a Bearer token in the Authorization header. For example,    &#x60;curl -H &amp;quot;Authorization: Bearer &amp;lt;ACCESS_TOKEN&amp;gt;&amp;quot; https://{{base-domain}}/rec/archive/download/xyz&#x60;       **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    LocalDate from = LocalDate.parse("Mon Jun 29 17:00:00 PDT 2020"); // The start date for the monthly range to query. The maximum range can be a month. If you do not provide this value, this defaults to the current date.
    LocalDate to = LocalDate.parse("Wed Jul 29 17:00:00 PDT 2020"); // The end date for the monthly range to query. The maximum range can be a month.
    String type = "by_view"; // The type of analytics details:  * `by_view` &mdash; by_view.  * `by_download` &mdash; by_download.
    try {
      AnalyticsDetailsResponse result = client
              .cloudRecording
              .details(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getAnalyticsDetails());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnalyticsDetailsResponse> response = client
              .cloudRecording
              .details(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#details");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **from** | **LocalDate**| The start date for the monthly range to query. The maximum range can be a month. If you do not provide this value, this defaults to the current date. | [optional] |
| **to** | **LocalDate**| The end date for the monthly range to query. The maximum range can be a month. | [optional] |
| **type** | **String**| The type of analytics details:  * &#x60;by_view&#x60; &amp;mdash; by_view.  * &#x60;by_download&#x60; &amp;mdash; by_download. | [optional] [enum: by_view, by_download] |

### Return type

[**AnalyticsDetailsResponse**](AnalyticsDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Analytics Detail listed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User not found on this account: {accountId}   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="getMeetingRecordings"></a>
# **getMeetingRecordings**
> CloudRecordingGetMeetingRecordingsResponse getMeetingRecordings(meetingId).includeFields(includeFields).ttl(ttl).execute();

Get meeting recordings

Returns all of a meeting&#39;s [recordings](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-Recording#h_7420acb5-1897-4061-87b4-5b76e99c03b4).   Use the &#x60;download_url&#x60; property listed in the response to download the recording files.  To access a passcode-protected cloud recording, send the user&#39;s [OAuth access token](https://developers.zoom.us/docs/integrations/oauth/) as a Bearer token in the Authorization header.     Example:  &#x60;curl -H &#39;Authorization: Bearer &lt;ACCESS_TOKEN&gt;&#39; https://{{base-domain}}/rec/archive/download/xyz&#x60;    **Scopes:** &#x60;recording:read&#x60;,&#x60;phone_recording:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get a meeting's cloud recordings, provide the meeting ID or UUID. If providing the meeting ID instead of UUID, the response will be for the latest meeting instance.   To get a webinar's cloud recordings, provide the webinar's ID or UUID. If providing the webinar ID instead of UUID, the response will be for the latest webinar instance.   If a UUID starts with `/` or contains `//` (example: `/ajXp112QmuoKj4854875==`), **[double encode](https://developers.zoom.us) the UUID** before making an API request. 
    String includeFields = "a2f19f96-9294-4f51-8134-6f0eea108eb2"; // The `download_access_token` value for downloading the meeting's recordings.
    Integer ttl = 1; // The `download_access_token` Time to Live (TTL) value. This parameter is only valid if the `include_fields` query parameter contains the `download_access_token` value.
    try {
      CloudRecordingGetMeetingRecordingsResponse result = client
              .cloudRecording
              .getMeetingRecordings(meetingId)
              .includeFields(includeFields)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountId());
      System.out.println(result.getDuration());
      System.out.println(result.getHostId());
      System.out.println(result.getId());
      System.out.println(result.getRecordingCount());
      System.out.println(result.getStartTime());
      System.out.println(result.getTopic());
      System.out.println(result.getTotalSize());
      System.out.println(result.getType());
      System.out.println(result.getUuid());
      System.out.println(result.getRecordingPlayPasscode());
      System.out.println(result.getRecordingFiles());
      System.out.println(result.getDownloadAccessToken());
      System.out.println(result.getPassword());
      System.out.println(result.getParticipantAudioFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#getMeetingRecordings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingGetMeetingRecordingsResponse> response = client
              .cloudRecording
              .getMeetingRecordings(meetingId)
              .includeFields(includeFields)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#getMeetingRecordings");
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
| **meetingId** | **String**| To get a meeting&#39;s cloud recordings, provide the meeting ID or UUID. If providing the meeting ID instead of UUID, the response will be for the latest meeting instance.   To get a webinar&#39;s cloud recordings, provide the webinar&#39;s ID or UUID. If providing the webinar ID instead of UUID, the response will be for the latest webinar instance.   If a UUID starts with &#x60;/&#x60; or contains &#x60;//&#x60; (example: &#x60;/ajXp112QmuoKj4854875&#x3D;&#x3D;&#x60;), **[double encode](https://developers.zoom.us) the UUID** before making an API request.  | |
| **includeFields** | **String**| The &#x60;download_access_token&#x60; value for downloading the meeting&#39;s recordings. | [optional] |
| **ttl** | **Integer**| The &#x60;download_access_token&#x60; Time to Live (TTL) value. This parameter is only valid if the &#x60;include_fields&#x60; query parameter contains the &#x60;download_access_token&#x60; value. | [optional] |

### Return type

[**CloudRecordingGetMeetingRecordingsResponse**](CloudRecordingGetMeetingRecordingsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Recording object returned.   **Error Code:** &#x60;200&#x60;      You do not have the right permissions. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User not found on this account: {accountId}. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User \&quot;{userId}\&quot; does not exist or does not belong to this account. &lt;br&gt; **Error Code:** &#x60;3301&#x60; &lt;br&gt;  There is no recording for this meeting. &lt;br&gt;  |  -  |

<a name="getSettings"></a>
# **getSettings**
> CloudRecordingGetSettingsResponse getSettings(meetingId).execute();

Get meeting recording settings

Retrieves settings applied to a meeting&#39;s [Cloud Recording](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-Recording).            **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // The meeting ID enables you to get cloud recording of a: - Meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   - Webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **double encode** the UUID before making an API request. 
    try {
      CloudRecordingGetSettingsResponse result = client
              .cloudRecording
              .getSettings(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getApprovalType());
      System.out.println(result.getAuthenticationDomains());
      System.out.println(result.getAuthenticationOption());
      System.out.println(result.getOnDemand());
      System.out.println(result.getPassword());
      System.out.println(result.getRecordingAuthentication());
      System.out.println(result.getSendEmailToHost());
      System.out.println(result.getShareRecording());
      System.out.println(result.getShowSocialShareButtons());
      System.out.println(result.getTopic());
      System.out.println(result.getViewerDownload());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingGetSettingsResponse> response = client
              .cloudRecording
              .getSettings(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#getSettings");
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
| **meetingId** | **String**| The meeting ID enables you to get cloud recording of a: - Meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   - Webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **double encode** the UUID before making an API request.  | |

### Return type

[**CloudRecordingGetSettingsResponse**](CloudRecordingGetSettingsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;    Meeting recording settings returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="listRecordings"></a>
# **listRecordings**
> CloudRecordingListRecordingsResponse listRecordings(userId).pageSize(pageSize).nextPageToken(nextPageToken).mc(mc).trash(trash).from(from).to(to).trashType(trashType).meetingId(meetingId).execute();

List all recordings

Lists all [cloud recordings](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-Recording) for a user.    For user-level apps, pass the [&#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.  To access a user&#39;s passcode protected cloud recording, send the user&#39;s [OAuth access token](https://developers.zoom.us/docs/integrations/oauth/) as a bearer token in the authorization header.    Example:  &#x60;curl -H \&quot;Authorization: Bearer &lt;ACCESS_TOKEN&gt;\&quot; https://{{base-domain}}/rec/archive/download/xyz&#x60;    **Prerequisites:**   * Must have a Pro or a higher plan.   * Must enable Cloud Recording on the user&#39;s account.  **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String userId = "userId_example"; // The user's ID or email address. For user-level apps, pass the `me` value.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
    String mc = "false"; // The query metadata of the recording if using an on-premise meeting connector for the meeting.
    Boolean trash = false; // The query trash. * `true` - List recordings from trash.   * `false` - Do not list recordings from the trash.    The default value is `false`. If you set it to `true`, you can use the `trash_type` property to indicate the type of Cloud recording that you need to retrieve. 
    LocalDate from = LocalDate.parse("Mon Jun 29 17:00:00 PDT 2020"); // The start date in 'yyyy-mm-dd' UTC format for the date range where you would like to retrieve recordings. The maximum range can be a month. If no value is provided for this field, the default will be current date.   For example, if you make the API request on June 30, 2020, without providing the `from` and `to` parameters, by default the value of 'from' field will be `2020-06-30` and the value of the 'to' field will be `2020-07-01`.   **Note**: The `trash` files cannot be filtered by date range and thus, the `from` and `to` fields should not be used for trash files.
    LocalDate to = LocalDate.parse("Mon Jun 29 17:00:00 PDT 2020"); // The end date in 'yyyy-mm-dd' 'yyyy-mm-dd' UTC format. 
    String trashType = "meeting_recordings"; // The type of cloud recording to retrieve from the trash.     *   `meeting_recordings`: List all meeting recordings from the trash.    *  `recording_file`: List all individual recording files from the trash. 
    Integer meetingId = 6840331990; // The meeting ID.
    try {
      CloudRecordingListRecordingsResponse result = client
              .cloudRecording
              .listRecordings(userId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .mc(mc)
              .trash(trash)
              .from(from)
              .to(to)
              .trashType(trashType)
              .meetingId(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getMeetings());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#listRecordings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingListRecordingsResponse> response = client
              .cloudRecording
              .listRecordings(userId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .mc(mc)
              .trash(trash)
              .from(from)
              .to(to)
              .trashType(trashType)
              .meetingId(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#listRecordings");
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
| **userId** | **String**| The user&#39;s ID or email address. For user-level apps, pass the &#x60;me&#x60; value. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. | [optional] |
| **mc** | **String**| The query metadata of the recording if using an on-premise meeting connector for the meeting. | [optional] [default to false] |
| **trash** | **Boolean**| The query trash. * &#x60;true&#x60; - List recordings from trash.   * &#x60;false&#x60; - Do not list recordings from the trash.    The default value is &#x60;false&#x60;. If you set it to &#x60;true&#x60;, you can use the &#x60;trash_type&#x60; property to indicate the type of Cloud recording that you need to retrieve.  | [optional] [default to false] |
| **from** | **LocalDate**| The start date in &#39;yyyy-mm-dd&#39; UTC format for the date range where you would like to retrieve recordings. The maximum range can be a month. If no value is provided for this field, the default will be current date.   For example, if you make the API request on June 30, 2020, without providing the &#x60;from&#x60; and &#x60;to&#x60; parameters, by default the value of &#39;from&#39; field will be &#x60;2020-06-30&#x60; and the value of the &#39;to&#39; field will be &#x60;2020-07-01&#x60;.   **Note**: The &#x60;trash&#x60; files cannot be filtered by date range and thus, the &#x60;from&#x60; and &#x60;to&#x60; fields should not be used for trash files. | [optional] |
| **to** | **LocalDate**| The end date in &#39;yyyy-mm-dd&#39; &#39;yyyy-mm-dd&#39; UTC format.  | [optional] |
| **trashType** | **String**| The type of cloud recording to retrieve from the trash.     *   &#x60;meeting_recordings&#x60;: List all meeting recordings from the trash.    *  &#x60;recording_file&#x60;: List all individual recording files from the trash.  | [optional] [default to meeting_recordings] |
| **meetingId** | **Integer**| The meeting ID. | [optional] |

### Return type

[**CloudRecordingListRecordingsResponse**](CloudRecordingListRecordingsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of recording objects returned. |  -  |
| **401** | **HTTP Status Code:** &#x60;401&#x60; &lt;br&gt;  Unauthorized     **Error Code:** &#x60;124&#x60; &lt;br&gt;  Requires an access token. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist, or does not belong to this account. &lt;br&gt; **Error Code:** &#x60;3301&#x60; &lt;br&gt;  There is no recording for this session. &lt;br&gt;  |  -  |

<a name="listRegistrants"></a>
# **listRegistrants**
> CloudRecordingListRegistrantsResponse listRegistrants(meetingId).status(status).pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).execute();

List recording registrants

Use this API to list registrants of a past meeting&#39;s [on-demand cloud recordings](https://support.zoom.us/hc/en-us/articles/360000488283-On-demand-recordings). Users must [register](https://developers.zoom.us) to view the recordings.      **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String status = "pending"; // Query by the registrant's status:  * `pending` &mdash; The registration is pending.  * `approved` &mdash; The registrant is approved.  * `denied` &mdash; The registration is denied.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // **Deprecated.** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      CloudRecordingListRegistrantsResponse result = client
              .cloudRecording
              .listRegistrants(meetingId)
              .status(status)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getRegistrants());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#listRegistrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingListRegistrantsResponse> response = client
              .cloudRecording
              .listRegistrants(meetingId)
              .status(status)
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
      System.err.println("Exception when calling CloudRecordingApi#listRegistrants");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits. | |
| **status** | **String**| Query by the registrant&#39;s status:  * &#x60;pending&#x60; &amp;mdash; The registration is pending.  * &#x60;approved&#x60; &amp;mdash; The registrant is approved.  * &#x60;denied&#x60; &amp;mdash; The registration is denied. | [optional] [default to approved] [enum: pending, approved, denied] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**CloudRecordingListRegistrantsResponse**](CloudRecordingListRegistrantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       Registrants returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="listRegistrationQuestions"></a>
# **listRegistrationQuestions**
> CloudRecordingListRegistrationQuestionsResponse listRegistrationQuestions(meetingId).execute();

Get registration questions

For [on-demand](https://support.zoom.us/hc/en-us/articles/360000488283-On-demand-Recordings) meeting recordings, you can include fields with questions that will be shown to registrants when they register to view the recording.  Use this API to retrieve a list of questions that are displayed for users to complete when registering to view the recording of a specific meeting.       **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    try {
      CloudRecordingListRegistrationQuestionsResponse result = client
              .cloudRecording
              .listRegistrationQuestions(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomQuestions());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#listRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CloudRecordingListRegistrationQuestionsResponse> response = client
              .cloudRecording
              .listRegistrationQuestions(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#listRegistrationQuestions");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |

### Return type

[**CloudRecordingListRegistrationQuestionsResponse**](CloudRecordingListRegistrationQuestionsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Recording Registrant Question object returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="recoverRecordingStatus"></a>
# **recoverRecordingStatus**
> recoverRecordingStatus(meetingUUID).cloudRecordingRecoverRecordingStatusRequest(cloudRecordingRecoverRecordingStatusRequest).execute();

Recover meeting recordings

Zoom allows users to recover recordings from trash for up to 30 days from the deletion date. Use this API to recover all deleted [Cloud Recordings](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-Recording) of a specific meeting.          **Prerequisites**:     * A Pro user with Cloud Recording enabled.  **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String action = "recover";
    try {
      client
              .cloudRecording
              .recoverRecordingStatus(meetingUUID)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#recoverRecordingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .recoverRecordingStatus(meetingUUID)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#recoverRecordingStatus");
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
| **cloudRecordingRecoverRecordingStatusRequest** | [**CloudRecordingRecoverRecordingStatusRequest**](CloudRecordingRecoverRecordingStatusRequest.md)|  | [optional] |

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
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Recordings recovered.   **Error Code:** &#x60;200&#x60;     You do not have the right permissions. |  -  |
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Deleted recordings of the meeting recovered. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.  **Error Code:** &#x60;3309&#x60; &lt;br&gt; Not enough cloud storage available. Either purchase additional storage or delete cloud recordings to free up storage.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: {userId}.&lt;br&gt;  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="recoverStatus"></a>
# **recoverStatus**
> recoverStatus(meetingId, recordingId).cloudRecordingRecoverStatusRequest(cloudRecordingRecoverStatusRequest).execute();

Recover a single recording

Zoom allows users to recover recordings from trash for up to 30 days from the deletion date. Use this API to recover a single recording file from the meeting.       **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    String recordingId = "a2f19f96-9294-4f51-8134-6f0eea108eb2"; // The recording ID.
    String action = "recover";
    try {
      client
              .cloudRecording
              .recoverStatus(meetingId, recordingId)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#recoverStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .recoverStatus(meetingId, recordingId)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#recoverStatus");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **recordingId** | **String**| The recording ID. | |
| **cloudRecordingRecoverStatusRequest** | [**CloudRecordingRecoverStatusRequest**](CloudRecordingRecoverStatusRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting recording recovered.   |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.  **Error Code:** &#x60;3309&#x60; &lt;br&gt; Not enough cloud storage available. Either purchase additional storage or delete cloud recordings to free up storage.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist or does not belong to this account.&lt;br&gt;  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="summary"></a>
# **summary**
> AnalyticsSummaryResponse summary(meetingId).from(from).to(to).execute();

Get Meeting Recording&#39;s Analytics Summary

Use this API to return a meeting recording&#39;s [analytics summary](https://support.zoom.us/hc/en-us/articles/205347605-Managing-cloud-recordings#h_0b665029-ce74-4849-9794-d1aa0320d163). **Maximum duration: 1 Month**. To access a password-protected cloud recording, send the user&#39;s [OAuth access token](https://developers.zoom.us/docs/integrations/oauth/) as a Bearer token in the Authorization header. For example,    &#x60;curl -H &amp;quot;Authorization: Bearer &amp;lt;ACCESS_TOKEN&amp;gt;&amp;quot; https://{{base-domain}}/rec/archive/download/xyz&#x60;       **Scopes:** &#x60;recording:read:admin&#x60;,&#x60;recording:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    LocalDate from = LocalDate.parse("Mon Jun 29 17:00:00 PDT 2020"); // The start date for the monthly range to query. The maximum range can be a month. If you do not provide this value, this defaults to the current date.
    LocalDate to = LocalDate.parse("Wed Jul 29 17:00:00 PDT 2020"); // The end date for the monthly range to query. The maximum range can be a month.
    try {
      AnalyticsSummaryResponse result = client
              .cloudRecording
              .summary(meetingId)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getAnalyticsSummary());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#summary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnalyticsSummaryResponse> response = client
              .cloudRecording
              .summary(meetingId)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#summary");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **from** | **LocalDate**| The start date for the monthly range to query. The maximum range can be a month. If you do not provide this value, this defaults to the current date. | [optional] |
| **to** | **LocalDate**| The end date for the monthly range to query. The maximum range can be a month. | [optional] |

### Return type

[**AnalyticsSummaryResponse**](AnalyticsSummaryResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Analytics Summary listed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User not found on this account: {accountId}   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3301&#x60; &lt;br&gt; There is no recording for this meeting.   |  -  |

<a name="updateRegistrantStatus"></a>
# **updateRegistrantStatus**
> updateRegistrantStatus(meetingId).cloudRecordingUpdateRegistrantStatusRequest(cloudRecordingUpdateRegistrantStatusRequest).execute();

Update registrant&#39;s status

A registrant can either be approved or denied from viewing the [on-demand](https://support.zoom.us/hc/en-us/articles/360000488283-On-demand-Recordings) recording.  Use this API to update a registrant&#39;s status.    **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String action = "approve";
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    List<CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner> registrants = Arrays.asList(); // List of registrants
    try {
      client
              .cloudRecording
              .updateRegistrantStatus(action, meetingId)
              .registrants(registrants)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateRegistrantStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .updateRegistrantStatus(action, meetingId)
              .registrants(registrants)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateRegistrantStatus");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits. | |
| **cloudRecordingUpdateRegistrantStatusRequest** | [**CloudRecordingUpdateRegistrantStatusRequest**](CloudRecordingUpdateRegistrantStatusRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Registrant status updated. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="updateRegistrationQuestions"></a>
# **updateRegistrationQuestions**
> updateRegistrationQuestions(meetingId).cloudRecordingUpdateRegistrationQuestionsRequest(cloudRecordingUpdateRegistrationQuestionsRequest).execute();

Update registration questions

For [on-demand](https://support.zoom.us/hc/en-us/articles/360000488283-On-demand-Recordings) meeting recordings, you can include fields with questions that will be shown to registrants when they register to view the recording.  Use this API to update registration questions that are to be answered by users while registering to view a recording.       **Scopes:** &#x60;recording:write:admin&#x60;,&#x60;recording:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request. 
    List<CloudRecordingUpdateRegistrationQuestionsRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Array of Registrant Custom Questions
    List<CloudRecordingUpdateRegistrationQuestionsRequestQuestionsInner> questions = Arrays.asList(); // Array of Registrant Questions
    try {
      client
              .cloudRecording
              .updateRegistrationQuestions(meetingId)
              .customQuestions(customQuestions)
              .questions(questions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .updateRegistrationQuestions(meetingId)
              .customQuestions(customQuestions)
              .questions(questions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateRegistrationQuestions");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **[double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid)** the UUID before making an API request.  | |
| **cloudRecordingUpdateRegistrationQuestionsRequest** | [**CloudRecordingUpdateRegistrationQuestionsRequest**](CloudRecordingUpdateRegistrationQuestionsRequest.md)| Recording Registrant Questions | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;200&#x60;     Recording Registrant Questions Updated |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> updateSettings(meetingId).cloudRecordingUpdateSettingsRequest(cloudRecordingUpdateSettingsRequest).execute();

Update meeting recording settings

Updates settings applied to a meeting&#39;s [Cloud Recording](https://support.zoom.us/hc/en-us/articles/203741855-Cloud-Recording).        **Scopes:** &#x60;recording:write&#x60;,&#x60;recording:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CloudRecordingApi;
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
    String meetingId = "atsXxhSEQWit9t+U02HXNQ=="; // To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &quot;/&quot; or contains &quot;//&quot; (example: &quot;/ajXp112QmuoKj4854875==&quot;), you must **double encode** the UUID before making an API request. 
    Integer approvalType = 0; // The approval type for the registration.     `0`- Automatically approve the registration when a user registers.     `1` - Manually approve or deny the registration of a user.     `2` - No registration required to view the recording.
    String authenticationDomains = "authenticationDomains_example"; // The authentication domains.
    String authenticationOption = "authenticationOption_example"; // The authentication options.
    Boolean onDemand = true; // This field determines whether the registration is required to view the recording.
    String password = "password_example"; // This field enables passcode protection for the recording by setting a passcode.   The passcode must have a minimum of **eight** characters with a mix of numbers, letters and special characters.          **Note:** If the account owner or the admin has set minimum passcode strength requirements for recordings through Account Settings, the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling either the [**Get user settings**](/api-reference/zoom-api/methods#operation/userSettings) API or the [**Get account settings**](/api-reference/zoom-api/ma#operation/accountSettings) API.
    Boolean recordingAuthentication = true; // This field indicates that only authenticated users can view.
    Boolean sendEmailToHost = true; // This field sends an email to host when someone registers to view the recording. This setting applies for On-demand recordings only.
    String shareRecording = "publicly"; // This field determines how the meeting recording is shared.
    Boolean showSocialShareButtons = true; // This field shows social share buttons on registration page. This setting applies for On-demand recordings only.
    String topic = "topic_example"; // The name of the recording.
    Boolean viewerDownload = true; // This field determines whether a viewer can download the recording file or not.
    try {
      client
              .cloudRecording
              .updateSettings(meetingId)
              .approvalType(approvalType)
              .authenticationDomains(authenticationDomains)
              .authenticationOption(authenticationOption)
              .onDemand(onDemand)
              .password(password)
              .recordingAuthentication(recordingAuthentication)
              .sendEmailToHost(sendEmailToHost)
              .shareRecording(shareRecording)
              .showSocialShareButtons(showSocialShareButtons)
              .topic(topic)
              .viewerDownload(viewerDownload)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cloudRecording
              .updateSettings(meetingId)
              .approvalType(approvalType)
              .authenticationDomains(authenticationDomains)
              .authenticationOption(authenticationOption)
              .onDemand(onDemand)
              .password(password)
              .recordingAuthentication(recordingAuthentication)
              .sendEmailToHost(sendEmailToHost)
              .shareRecording(shareRecording)
              .showSocialShareButtons(showSocialShareButtons)
              .topic(topic)
              .viewerDownload(viewerDownload)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRecordingApi#updateSettings");
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
| **meetingId** | **String**| To get Cloud Recordings of a meeting, provide the meeting ID or meeting UUID. If the meeting ID is provided instead of UUID,the response will be for the latest meeting instance.   To get Cloud Recordings of a webinar, provide the webinar ID or the webinar UUID. If the webinar ID is provided instead of UUID,the response will be for the latest webinar instance.   If a UUID starts with &amp;quot;/&amp;quot; or contains &amp;quot;//&amp;quot; (example: &amp;quot;/ajXp112QmuoKj4854875&#x3D;&#x3D;&amp;quot;), you must **double encode** the UUID before making an API request.  | |
| **cloudRecordingUpdateSettingsRequest** | [**CloudRecordingUpdateSettingsRequest**](CloudRecordingUpdateSettingsRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;    Meeting recording setting&#39;s updated. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

