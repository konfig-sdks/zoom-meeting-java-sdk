# WebinarsApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPanelists**](WebinarsApi.md#addPanelists) | **POST** /webinars/{webinarId}/panelists | Add panelists |
| [**addRegistrant**](WebinarsApi.md#addRegistrant) | **POST** /webinars/{webinarId}/registrants | Add a webinar registrant |
| [**createBatchRegistrants**](WebinarsApi.md#createBatchRegistrants) | **POST** /webinars/{webinarId}/batch_registrants | Perform batch registration |
| [**createBrandingNameTag**](WebinarsApi.md#createBrandingNameTag) | **POST** /webinars/{webinarId}/branding/name_tags | Create a webinar&#39;s branding name tag |
| [**createInviteLinks**](WebinarsApi.md#createInviteLinks) | **POST** /webinars/{webinarId}/invite_links | Create webinar&#39;s invite links |
| [**createPoll**](WebinarsApi.md#createPoll) | **POST** /webinars/{webinarId}/polls | Create a webinar&#39;s poll |
| [**createWebinar**](WebinarsApi.md#createWebinar) | **POST** /users/{userId}/webinars | Create a webinar |
| [**createWebinarTemplate**](WebinarsApi.md#createWebinarTemplate) | **POST** /users/{userId}/webinar_templates | Create a webinar template |
| [**deleteBrandingNameTag**](WebinarsApi.md#deleteBrandingNameTag) | **DELETE** /webinars/{webinarId}/branding/name_tags | Delete a webinar&#39;s branding name tag |
| [**deleteBrandingVirtualBackground**](WebinarsApi.md#deleteBrandingVirtualBackground) | **DELETE** /webinars/{webinarId}/branding/virtual_backgrounds | Delete a webinar&#39;s branding Virtual Backgrounds |
| [**deleteBrandingWallpaper**](WebinarsApi.md#deleteBrandingWallpaper) | **DELETE** /webinars/{webinarId}/branding/wallpaper | Delete a webinar&#39;s branding wallpaper |
| [**deleteMessageById**](WebinarsApi.md#deleteMessageById) | **DELETE** /live_webinars/{webinarId}/chat/messages/{messageId} | Delete a live webinar message |
| [**deletePoll**](WebinarsApi.md#deletePoll) | **DELETE** /webinars/{webinarId}/polls/{pollId} | Delete a webinar poll |
| [**deleteRegistrant**](WebinarsApi.md#deleteRegistrant) | **DELETE** /webinars/{webinarId}/registrants/{registrantId} | Delete a webinar registrant |
| [**deleteSurvey**](WebinarsApi.md#deleteSurvey) | **DELETE** /webinars/{webinarId}/survey | Delete a webinar survey |
| [**getDetails**](WebinarsApi.md#getDetails) | **GET** /webinars/{webinarId} | Get a webinar |
| [**getJoinTokenLocalRecording**](WebinarsApi.md#getJoinTokenLocalRecording) | **GET** /webinars/{webinarId}/jointoken/local_recording | Get a webinar&#39;s join token for local recording |
| [**getLiveStreamDetails**](WebinarsApi.md#getLiveStreamDetails) | **GET** /webinars/{webinarId}/livestream | Get live stream details |
| [**getMeetingArchiveTokenForLocalArchiving**](WebinarsApi.md#getMeetingArchiveTokenForLocalArchiving) | **GET** /webinars/{webinarId}/jointoken/local_archiving | Get a webinar&#39;s archive token for local archiving |
| [**getPollDetails**](WebinarsApi.md#getPollDetails) | **GET** /webinars/{webinarId}/polls/{pollId} | Get a webinar poll |
| [**getSessionBranding**](WebinarsApi.md#getSessionBranding) | **GET** /webinars/{webinarId}/branding | Get webinar&#39;s session branding |
| [**getSipUriWithPasscode**](WebinarsApi.md#getSipUriWithPasscode) | **POST** /webinars/{webinarId}/sip_dialing | Get a webinar SIP URI with Passcode |
| [**getSurvey**](WebinarsApi.md#getSurvey) | **GET** /webinars/{webinarId}/survey | Get a webinar survey |
| [**getWebinarToken**](WebinarsApi.md#getWebinarToken) | **GET** /webinars/{webinarId}/token | Get webinar&#39;s token |
| [**joinTokenLiveStreaming**](WebinarsApi.md#joinTokenLiveStreaming) | **GET** /webinars/{webinarId}/jointoken/live_streaming | Get a webinar&#39;s join token for live streaming |
| [**listAbsentees**](WebinarsApi.md#listAbsentees) | **GET** /past_webinars/{webinarId}/absentees | Get webinar absentees |
| [**listPanelists**](WebinarsApi.md#listPanelists) | **GET** /webinars/{webinarId}/panelists | List panelists |
| [**listParticipants**](WebinarsApi.md#listParticipants) | **GET** /past_webinars/{webinarId}/participants | List webinar participants |
| [**listPastInstances**](WebinarsApi.md#listPastInstances) | **GET** /past_webinars/{webinarId}/instances | List past webinar instances |
| [**listPastWebinarQa**](WebinarsApi.md#listPastWebinarQa) | **GET** /past_webinars/{webinarId}/qa | List Q&amp;As of a past webinar |
| [**listPollResults**](WebinarsApi.md#listPollResults) | **GET** /past_webinars/{webinarId}/polls | List past webinar poll results |
| [**listPolls**](WebinarsApi.md#listPolls) | **GET** /webinars/{webinarId}/polls | List a webinar&#39;s polls  |
| [**listRegistrants**](WebinarsApi.md#listRegistrants) | **GET** /webinars/{webinarId}/registrants | List webinar registrants |
| [**listRegistrationQuestions**](WebinarsApi.md#listRegistrationQuestions) | **GET** /webinars/{webinarId}/registrants/questions | List registration questions |
| [**listTrackingSources**](WebinarsApi.md#listTrackingSources) | **GET** /webinars/{webinarId}/tracking_sources | Get webinar tracking sources |
| [**listWebinarTemplates**](WebinarsApi.md#listWebinarTemplates) | **GET** /users/{userId}/webinar_templates | List webinar templates |
| [**listWebinars**](WebinarsApi.md#listWebinars) | **GET** /users/{userId}/webinars | List webinars |
| [**registrantDetails**](WebinarsApi.md#registrantDetails) | **GET** /webinars/{webinarId}/registrants/{registrantId} | Get a webinar registrant |
| [**removePanelist**](WebinarsApi.md#removePanelist) | **DELETE** /webinars/{webinarId}/panelists/{panelistId} | Remove a panelist |
| [**removePanelists**](WebinarsApi.md#removePanelists) | **DELETE** /webinars/{webinarId}/panelists | Remove webinar panelists |
| [**removeWebinar**](WebinarsApi.md#removeWebinar) | **DELETE** /webinars/{webinarId} | Delete a webinar |
| [**setDefaultBrandingVirtualBackground**](WebinarsApi.md#setDefaultBrandingVirtualBackground) | **PATCH** /webinars/{webinarId}/branding/virtual_backgrounds | Set webinar&#39;s default branding Virtual Background |
| [**updateBrandingNameTag**](WebinarsApi.md#updateBrandingNameTag) | **PATCH** /webinars/{webinarId}/branding/name_tags/{nameTagId} | Update a webinar&#39;s branding name tag |
| [**updateLiveStream**](WebinarsApi.md#updateLiveStream) | **PATCH** /webinars/{webinarId}/livestream | Update a live stream |
| [**updateLiveStreamStatus**](WebinarsApi.md#updateLiveStreamStatus) | **PATCH** /webinars/{webinarId}/livestream/status | Update live stream status |
| [**updatePoll**](WebinarsApi.md#updatePoll) | **PUT** /webinars/{webinarId}/polls/{pollId} | Update a webinar poll |
| [**updateRegistrantStatus**](WebinarsApi.md#updateRegistrantStatus) | **PUT** /webinars/{webinarId}/registrants/status | Update registrant&#39;s status |
| [**updateRegistrationQuestions**](WebinarsApi.md#updateRegistrationQuestions) | **PATCH** /webinars/{webinarId}/registrants/questions | Update registration questions |
| [**updateScheduledWebinar**](WebinarsApi.md#updateScheduledWebinar) | **PATCH** /webinars/{webinarId} | Update a webinar |
| [**updateStatus**](WebinarsApi.md#updateStatus) | **PUT** /webinars/{webinarId}/status | Update webinar status |
| [**updateSurvey**](WebinarsApi.md#updateSurvey) | **PATCH** /webinars/{webinarId}/survey | Update a webinar survey |
| [**uploadBrandingVirtualBackground**](WebinarsApi.md#uploadBrandingVirtualBackground) | **POST** /webinars/{webinarId}/branding/virtual_backgrounds | Upload a webinar&#39;s branding Virtual Background |
| [**uploadBrandingWallpaper**](WebinarsApi.md#uploadBrandingWallpaper) | **POST** /webinars/{webinarId}/branding/wallpaper | Upload a webinar&#39;s branding wallpaper |


<a name="addPanelists"></a>
# **addPanelists**
> WebinarsAddPanelistsResponse addPanelists(webinarId).webinarsAddPanelistsRequest(webinarsAddPanelistsRequest).execute();

Add panelists

Panelists in a webinar can view and send video, screen share, annotate, and do much more compared to attendees in a webinar.    [Add panelists](https://support.zoom.us/hc/en-us/articles/115005657826-Inviting-Panelists-to-a-Webinar#h_7550d59e-23f5-4703-9e22-e76bded1ed70) to a scheduled webinar.           **Prerequisites:** * Pro or a higher plan with the [Webinar Add-on](https://zoom.us/webinar).       **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    List<WebinarsAddPanelistsRequestPanelistsInner> panelists = Arrays.asList(); // List of panelist objects.
    try {
      WebinarsAddPanelistsResponse result = client
              .webinars
              .addPanelists(webinarId)
              .panelists(panelists)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#addPanelists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsAddPanelistsResponse> response = client
              .webinars
              .addPanelists(webinarId)
              .panelists(panelists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#addPanelists");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsAddPanelistsRequest** | [**WebinarsAddPanelistsRequest**](WebinarsAddPanelistsRequest.md)|  | [optional] |

### Return type

[**WebinarsAddPanelistsResponse**](WebinarsAddPanelistsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Panelist created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You have reached the limit for the number of panelists you can add. Contact Zoom Support for more information.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests     |  -  |

<a name="addRegistrant"></a>
# **addRegistrant**
> WebinarsAddRegistrantResponse addRegistrant(webinarId).occurrenceIds(occurrenceIds).webinarsAddRegistrantRequest(webinarsAddRegistrantRequest).execute();

Add a webinar registrant

Create and submit a user&#39;s registration for a webinar. Zoom users with a [Webinar plan](https://zoom.us/webinar) have access to creating and managing webinars. Webinars allow hosts to broadcast a Zoom meeting to up to 10,000 attendees. Scheduling a [webinar with registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-Webinar-with-Registration) requires your registrants to complete a brief form before receiving the link to join the webinar.   **Prerequisites:**  * A Pro or higher plan with the Webinar add-on.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String firstName = "firstName_example"; // The registrant's first name.
    String email = "email_example"; // The registrant's email address.
    Long webinarId = 99289110036L; // The webinar's ID.
    String lastName = "lastName_example"; // The registrant's last name.
    String address = "address_example"; // The registrant's address.
    String city = "city_example"; // The registrant's city.
    String state = "state_example"; // The registrant's state or province.
    String zip = "zip_example"; // The registrant's ZIP or postal code.
    String country = "country_example"; // The registrant's two-letter [country code](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#countries).
    String phone = "phone_example"; // The registrant's phone number.
    String comments = "comments_example"; // The registrant's questions and comments.
    List<WebinarsAddRegistrantRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Information about custom questions.
    String industry = "industry_example"; // The registrant's industry.
    String jobTitle = "jobTitle_example"; // The registrant's job title.
    String noOfEmployees = ""; // The registrant's number of employees:  * `1-20`  * `21-50`  * `51-100`  * `101-500`  * `500-1,000`  * `1,001-5,000`  * `5,001-10,000`  * `More than 10,000`
    String org = "org_example"; // The registrant's organization.
    String purchasingTimeFrame = ""; // The registrant's purchasing time frame:  * `Within a month`  * `1-3 months`  * `4-6 months`  * `More than 6 months`  * `No timeframe`
    String roleInPurchaseProcess = ""; // The registrant's role in the purchase process:  * `Decision Maker`  * `Evaluator/Recommender`  * `Influencer`  * `Not involved`
    String language = "en-US"; // The registrant's language preference for confirmation emails:  * `en-US` - English (US)  * `de-DE` - German (Germany)  * `es-ES` - Spanish (Spain)  * `fr-FR` - French (France)  * `jp-JP` - Japanese  * `pt-PT` - Portuguese (Portugal)  * `ru-RU` - Russian  * `zh-CN` - Chinese (PRC)  * `zh-TW` - Chinese (Taiwan)  * `ko-KO` - Korean  * `it-IT` - Italian (Italy)  * `vi-VN` - Vietnamese  * `pl-PL` - Polish  * `Tr-TR` - Turkish
    String sourceId = "sourceId_example"; // The tracking source's unique identifier.
    String occurrenceIds = "1648538280000"; // A comma-separated list of webinar occurrence IDs. Get this value with the [Get a webinar](https://developers.zoom.us) API. Make sure the `registration_type` is 3 if updating multiple occurrences with this API.
    try {
      WebinarsAddRegistrantResponse result = client
              .webinars
              .addRegistrant(firstName, email, webinarId)
              .lastName(lastName)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .phone(phone)
              .comments(comments)
              .customQuestions(customQuestions)
              .industry(industry)
              .jobTitle(jobTitle)
              .noOfEmployees(noOfEmployees)
              .org(org)
              .purchasingTimeFrame(purchasingTimeFrame)
              .roleInPurchaseProcess(roleInPurchaseProcess)
              .language(language)
              .sourceId(sourceId)
              .occurrenceIds(occurrenceIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getRegistrantId());
      System.out.println(result.getStartTime());
      System.out.println(result.getTopic());
      System.out.println(result.getOccurrences());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#addRegistrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsAddRegistrantResponse> response = client
              .webinars
              .addRegistrant(firstName, email, webinarId)
              .lastName(lastName)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .phone(phone)
              .comments(comments)
              .customQuestions(customQuestions)
              .industry(industry)
              .jobTitle(jobTitle)
              .noOfEmployees(noOfEmployees)
              .org(org)
              .purchasingTimeFrame(purchasingTimeFrame)
              .roleInPurchaseProcess(roleInPurchaseProcess)
              .language(language)
              .sourceId(sourceId)
              .occurrenceIds(occurrenceIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#addRegistrant");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **occurrenceIds** | **String**| A comma-separated list of webinar occurrence IDs. Get this value with the [Get a webinar](https://developers.zoom.us) API. Make sure the &#x60;registration_type&#x60; is 3 if updating multiple occurrences with this API. | [optional] |
| **webinarsAddRegistrantRequest** | [**WebinarsAddRegistrantRequest**](WebinarsAddRegistrantRequest.md)|  | [optional] |

### Return type

[**WebinarsAddRegistrantResponse**](WebinarsAddRegistrantResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Webinar registration created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: {accountId} &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  This webinar does not have registration as required: {webinarId}. &lt;br&gt; **Error Code:** &#x60;3027&#x60; &lt;br&gt;  Host cannot register. &lt;br&gt; **Error Code:** &#x60;3034&#x60; &lt;br&gt;  If you have been invited, please input your work email address. &lt;br&gt; **Error Code:** &#x60;3038&#x60; &lt;br&gt;  Webinar is over, you cannot register now. If you have any questions, contact the webinar host. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You have reached the limit for the number of attendees you can add. Contact Zoom Support for more information. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  The Zoom REST API does not support paid registration. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User \&quot;{userId}\&quot; does not exist or does not belong to this account. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar \&quot;{webinarId}\&quot; not found or has expired. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests     |  -  |

<a name="createBatchRegistrants"></a>
# **createBatchRegistrants**
> WebinarsCreateBatchRegistrantsResponse createBatchRegistrants(webinarId).webinarsCreateBatchRegistrantsRequest(webinarsCreateBatchRegistrantsRequest).execute();

Perform batch registration

Register up to 30 registrants at once for a scheduled webinar that requires [registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-webinar-with-registration).       **Prerequisites:**     * The webinar host must be a licensed user. * The webinar should be type &#x60;5&#x60;, a scheduled webinar. Other types of webinars are not supported by this API.            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "97871060099"; // The webinar's unique identifier.
    Boolean autoApprove = true; // If a meeting was scheduled with approval_type `1` (manual approval), but you want to automatically approve registrants added via this API, set the value of this field to `true`.   You **cannot** use this field to change approval setting for a meeting that was originally scheduled with approval_type `0` (automatic approval).
    List<WebinarsCreateBatchRegistrantsRequestRegistrantsInner> registrants = Arrays.asList();
    try {
      WebinarsCreateBatchRegistrantsResponse result = client
              .webinars
              .createBatchRegistrants(webinarId)
              .autoApprove(autoApprove)
              .registrants(registrants)
              .execute();
      System.out.println(result);
      System.out.println(result.getRegistrants());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createBatchRegistrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreateBatchRegistrantsResponse> response = client
              .webinars
              .createBatchRegistrants(webinarId)
              .autoApprove(autoApprove)
              .registrants(registrants)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createBatchRegistrants");
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
| **webinarId** | **String**| The webinar&#39;s unique identifier. | |
| **webinarsCreateBatchRegistrantsRequest** | [**WebinarsCreateBatchRegistrantsRequest**](WebinarsCreateBatchRegistrantsRequest.md)|  | [optional] |

### Return type

[**WebinarsCreateBatchRegistrantsResponse**](WebinarsCreateBatchRegistrantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;200&#x60; **OK**      Registrants added. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the Webinar plan and enable webinars for the \&quot;{0}\&quot; user to perform this action. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  This API can only be used for scheduled webinars (type 5). Batch registration is not supported for other webinar types. &lt;br&gt; **Error Code:** &#x60;3038&#x60; &lt;br&gt;  The webinar is over. You cannot register now. If you have any questions, contact the Webinar host. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Registration not enabled for this webinar: {0} &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You have reached the limit for the number of attendees you can add. Contact Zoom Support for more information. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  The Zoom REST API does not support paid registration. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {0}.&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3043&#x60; &lt;br&gt;  Webinar has reached maximum attendee capacity.&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;404&#x60; &lt;br&gt;  Registration has not been enabled for this meeting: {meetingId}. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests     |  -  |

<a name="createBrandingNameTag"></a>
# **createBrandingNameTag**
> WebinarsCreateBrandingNameTagResponse createBrandingNameTag(webinarId).webinarsCreateBrandingNameTagRequest(webinarsCreateBrandingNameTagRequest).execute();

Create a webinar&#39;s branding name tag

Use this API to create a webinar&#39;s [Session Branding](https://support.zoom.us/hc/en-us/articles/4836268732045-Using-Webinar-Session-Branding) name tag. There&#39;s a limit of 20 name tags per webinar. **Prerequisites:**  *  The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String name = "name_example"; // The name tag's name.  **Note:** This value cannot exceed more than 50 characters.
    String textColor = "textColor_example"; // The name tag's text color.
    String accentColor = "accentColor_example"; // The name tag's accent color.
    String backgroundColor = "backgroundColor_example"; // The name tag's background color.
    Long webinarId = 99289110036L; // The webinar's ID.
    Boolean isDefault = false; // Whether set the name tag as the default name tag or not.
    Boolean setDefaultForAllPanelists = true; // Whether to set the name tag as the new default for all panelists or not. This includes panelists not currently assigned a default name tag.
    try {
      WebinarsCreateBrandingNameTagResponse result = client
              .webinars
              .createBrandingNameTag(name, textColor, accentColor, backgroundColor, webinarId)
              .isDefault(isDefault)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTextColor());
      System.out.println(result.getAccentColor());
      System.out.println(result.getBackgroundColor());
      System.out.println(result.getIsDefault());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createBrandingNameTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreateBrandingNameTagResponse> response = client
              .webinars
              .createBrandingNameTag(name, textColor, accentColor, backgroundColor, webinarId)
              .isDefault(isDefault)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createBrandingNameTag");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsCreateBrandingNameTagRequest** | [**WebinarsCreateBrandingNameTagRequest**](WebinarsCreateBrandingNameTagRequest.md)|  | [optional] |

### Return type

[**WebinarsCreateBrandingNameTagResponse**](WebinarsCreateBrandingNameTagResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Name tag created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.&lt;br&gt; You have reached the limit for the number of name tags you can add for this webinar. The limit is 20.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="createInviteLinks"></a>
# **createInviteLinks**
> WebinarsCreateInviteLinksResponse createInviteLinks(webinarId).webinarsCreateInviteLinksRequest(webinarsCreateInviteLinksRequest).execute();

Create webinar&#39;s invite links

Create a batch of invitation links for a webinar.  **Prerequisites:**  * Business, Education or API Plan with the Webinar add-on.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    List<WebinarsCreateInviteLinksRequestAttendeesInner> attendees = Arrays.asList(); // The attendees list.
    Long ttl = 7200L; // The invite link's expiration time, in seconds.   This value defaults to `7200`.
    try {
      WebinarsCreateInviteLinksResponse result = client
              .webinars
              .createInviteLinks(webinarId)
              .attendees(attendees)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttendees());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createInviteLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreateInviteLinksResponse> response = client
              .webinars
              .createInviteLinks(webinarId)
              .attendees(attendees)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createInviteLinks");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsCreateInviteLinksRequest** | [**WebinarsCreateInviteLinksRequest**](WebinarsCreateInviteLinksRequest.md)| Webinar invite link object. | [optional] |

### Return type

[**WebinarsCreateInviteLinksResponse**](WebinarsCreateInviteLinksResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Webinar Invite Links Created |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  * Webinar Id does not exist.&lt;br&gt; * Invalid Webinar Id.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}. &lt;br&gt;  |  -  |

<a name="createPoll"></a>
# **createPoll**
> WebinarsCreatePollResponse createPoll(webinarId).webinarsCreatePollRequest(webinarsCreatePollRequest).execute();

Create a webinar&#39;s poll

Create a [poll](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars) for a webinar.            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String title = "title_example"; // The poll's title, up to 64 characters.
    Boolean anonymous = false; // Allow meeting participants to answer poll questions anonymously.   This value defaults to `false`.
    Integer pollType = 1; // The type of poll.  * `1` - Poll.  * `2` - Advanced Poll. This feature must be enabled in your Zoom account.  * `3` - Quiz. This feature must be enabled in your Zoom account.    This value defaults to `1`.
    List<WebinarsCreatePollRequestQuestionsInner> questions = Arrays.asList(); // Information about the poll's questions.
    try {
      WebinarsCreatePollResponse result = client
              .webinars
              .createPoll(webinarId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getAnonymous());
      System.out.println(result.getPollType());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createPoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreatePollResponse> response = client
              .webinars
              .createPoll(webinarId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createPoll");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsCreatePollRequest** | [**WebinarsCreatePollRequest**](WebinarsCreatePollRequest.md)| Webinar poll object. | [optional] |

### Return type

[**WebinarsCreatePollResponse**](WebinarsCreatePollResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Webinar Poll Created |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;4400&#x60; &lt;br&gt;  * Webinar polls disabled. To enable this feature, enable the \&quot;Webinar Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  * Advanced webinar polls disabled. To enable this feature, enable the \&quot;Allow host to create advanced polls and quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="createWebinar"></a>
# **createWebinar**
> WebinarsCreateWebinarResponse createWebinar(userId).webinarsCreateWebinarRequest(webinarsCreateWebinarRequest).execute();

Create a webinar

Schedule a webinar for a user who is a webinar host. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.    Webinars allow a host to broadcast a Zoom meeting to up to 10,000 attendees.   **Rate limit:** Up to a maximum of **100 requests per day**. The rate limit is applied to the &#x60;userId&#x60; of the **webinar host** used to make the request.   **Prerequisites:**  * A Pro or higher plan with a [Webinar plan](https://zoom.us/webinar) add-on.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String userId = "userId_example"; // The user ID or email address of the user. For user-level apps, pass the `me` value.
    String agenda = "agenda_example"; // Webinar description.
    Integer duration = 56; // Webinar duration in minutes. Used for scheduled webinars only.
    String password = "password_example"; // Webinar passcode. Passcode may only contain the characters [a-z A-Z 0-9 @ - _ * !]. Maximum of 10 characters.  If **Require a passcode when scheduling new meetings** setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated for the Webinar in the response even if it is not provided in the API request.     **Note:** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling the [**Get account settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/ma#operation/accountSettings) API.
    RecurrenceWebinarProperty recurrence = new RecurrenceWebinarProperty();
    String scheduleFor = "scheduleFor_example"; // The email address or user ID of the user to schedule a webinar for.
    WebinarsCreateWebinarRequestSettings settings = new WebinarsCreateWebinarRequestSettings();
    OffsetDateTime startTime = OffsetDateTime.now(); // Webinar start time. We support two formats for `start_time` - local time and GMT.       To set time as GMT the format should be `yyyy-MM-dd`T`HH:mm:ssZ`.  To set time using a specific timezone, use `yyyy-MM-dd`T`HH:mm:ss` format and specify the timezone [ID](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones) in the `timezone` field OR leave it blank and the timezone set on your Zoom account will be used. You can also set the time as UTC as the timezone field.  The `start_time` should only be used for scheduled and / or recurring webinars with fixed time.
    String templateId = "templateId_example"; // The webinar template ID to schedule a webinar using a [webinar template](https://support.zoom.us/hc/en-us/articles/115001079746-Webinar-Templates) or a [admin webinar template](https://support.zoom.us/hc/en-us/articles/8137753618957-Configuring-admin-webinar-templates). For a list of webinar templates, use the [**List webinar templates**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/listWebinarTemplates) API.
    String timezone = "timezone_example"; // The timezone to assign to the `start_time` value. This field is only used for scheduled or recurring webinars with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
    String topic = "topic_example"; // Webinar topic.
    List<WebinarsCreateWebinarRequestTrackingFieldsInner> trackingFields = Arrays.asList(); // Tracking fields.
    Integer type = 5; // Webinar types.  `5` - Webinar.    `6` - Recurring webinar with no fixed time.    `9` - Recurring webinar with a fixed time.
    Boolean isSimulive = true; // Whether to set the webinar simulive.
    String recordFileId = "recordFileId_example"; // The previously recorded file's ID for `simulive`.
    try {
      WebinarsCreateWebinarResponse result = client
              .webinars
              .createWebinar(userId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .recurrence(recurrence)
              .scheduleFor(scheduleFor)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .isSimulive(isSimulive)
              .recordFileId(recordFileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHostEmail());
      System.out.println(result.getHostId());
      System.out.println(result.getId());
      System.out.println(result.getRegistrantsConfirmationEmail());
      System.out.println(result.getTemplateId());
      System.out.println(result.getUuid());
      System.out.println(result.getAgenda());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDuration());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getOccurrences());
      System.out.println(result.getPassword());
      System.out.println(result.getEncryptedPasscode());
      System.out.println(result.getH323Passcode());
      System.out.println(result.getRecurrence());
      System.out.println(result.getSettings());
      System.out.println(result.getStartTime());
      System.out.println(result.getStartUrl());
      System.out.println(result.getTimezone());
      System.out.println(result.getTopic());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
      System.out.println(result.getIsSimulive());
      System.out.println(result.getRecordFileId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createWebinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreateWebinarResponse> response = client
              .webinars
              .createWebinar(userId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .recurrence(recurrence)
              .scheduleFor(scheduleFor)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .isSimulive(isSimulive)
              .recordFileId(recordFileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createWebinar");
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
| **userId** | **String**| The user ID or email address of the user. For user-level apps, pass the &#x60;me&#x60; value. | |
| **webinarsCreateWebinarRequest** | [**WebinarsCreateWebinarRequest**](WebinarsCreateWebinarRequest.md)|  | [optional] |

### Return type

[**WebinarsCreateWebinarResponse**](WebinarsCreateWebinarResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Webinar created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The value that you entered for the schedule_for field is invalid. Enter a valid value and try again. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Can not schedule simulive webinar for others. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Account hasn&#39;t enabled Simulive Webinar. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Record file does not exist. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You cannot schedule a meeting for {userId}. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests     **Error Code:** &#x60;429&#x60; &lt;br&gt;  A maximum of ({rateLimitNumber}) webinars can be created and updated for a single user in one day. &lt;br&gt;  |  -  |

<a name="createWebinarTemplate"></a>
# **createWebinarTemplate**
> WebinarsCreateWebinarTemplateResponse createWebinarTemplate(userId).webinarsCreateWebinarTemplateRequest(webinarsCreateWebinarTemplateRequest).execute();

Create a webinar template

Use this API to create a webinar template from an existing webinar.     **Scopes:** &#x60;webinar:write:admin&#x60;,&#x60;webinar:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String userId = "30R7kT7bTIKSNUFEuH_Qlg"; // The user ID retrievable from the [List users](https://developers.zoom.us) API.
    Long webinarId = 56L; // The webinar ID in long (int64) format.
    String name = "name_example"; // The webinar template's name.
    Boolean saveRecurrence = false; // If the field is set to true, the recurrence webinar template will be saved as the scheduled webinar.
    Boolean overwrite = false; // Overwrite an existing webinar template if the template is created from same existing webinar.
    try {
      WebinarsCreateWebinarTemplateResponse result = client
              .webinars
              .createWebinarTemplate(userId)
              .webinarId(webinarId)
              .name(name)
              .saveRecurrence(saveRecurrence)
              .overwrite(overwrite)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createWebinarTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsCreateWebinarTemplateResponse> response = client
              .webinars
              .createWebinarTemplate(userId)
              .webinarId(webinarId)
              .name(name)
              .saveRecurrence(saveRecurrence)
              .overwrite(overwrite)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#createWebinarTemplate");
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
| **userId** | **String**| The user ID retrievable from the [List users](https://developers.zoom.us) API. | |
| **webinarsCreateWebinarTemplateRequest** | [**WebinarsCreateWebinarTemplateRequest**](WebinarsCreateWebinarTemplateRequest.md)|  | [optional] |

### Return type

[**WebinarsCreateWebinarTemplateResponse**](WebinarsCreateWebinarTemplateResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Webinar template created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}.  **Error Code:** &#x60;300&#x60; &lt;br&gt; You can only create up to 40 webinar templates.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; * Cannot access meeting info.  * Webinar template name already exists: {templateName}.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar does not exist: {webinarId}.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; * User does not exist.  * User {userId} does not exist or does not belong to this account.   |  -  |

<a name="deleteBrandingNameTag"></a>
# **deleteBrandingNameTag**
> deleteBrandingNameTag(webinarId).nameTagIds(nameTagIds).execute();

Delete a webinar&#39;s branding name tag

Use this API to delete a webinar&#39;s [Session Branding](https://support.zoom.us/hc/en-us/articles/4836268732045-Using-Webinar-Session-Branding) name tag.    **Prerequisites:**  * The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String nameTagIds = "zazQjwDuQkS3Q2EprNd7jQ,AsfE0cx2TFSfqqKbE0BUZg"; // A comma-separated list of the name tag IDs to delete.
    try {
      client
              .webinars
              .deleteBrandingNameTag(webinarId)
              .nameTagIds(nameTagIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingNameTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteBrandingNameTag(webinarId)
              .nameTagIds(nameTagIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingNameTag");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **nameTagIds** | **String**| A comma-separated list of the name tag IDs to delete. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      * No content.  * Name tag(s) deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: name_tag_ids  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="deleteBrandingVirtualBackground"></a>
# **deleteBrandingVirtualBackground**
> deleteBrandingVirtualBackground(webinarId).ids(ids).execute();

Delete a webinar&#39;s branding Virtual Backgrounds

Use this API to delete a webinar&#39;s session branding [Virtual Background](https://support.zoom.us/hc/en-us/articles/210707503-Virtual-Background).    **Prerequisites:**  * The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String ids = "zazQjwDuQkS3Q2EprNd7jQ,AsfE0cx2TFSfqqKbE0BUZg"; // A comma-separated list of the Virtual Background file IDs to delete.
    try {
      client
              .webinars
              .deleteBrandingVirtualBackground(webinarId)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingVirtualBackground");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteBrandingVirtualBackground(webinarId)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingVirtualBackground");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **ids** | **String**| A comma-separated list of the Virtual Background file IDs to delete. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      * No content.  * Virtual Background file(s) deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: ids  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

<a name="deleteBrandingWallpaper"></a>
# **deleteBrandingWallpaper**
> deleteBrandingWallpaper(webinarId).execute();

Delete a webinar&#39;s branding wallpaper

Use this API to delete a webinar&#39;s session branding wallpaper file.    **Prerequisites:**  * The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      client
              .webinars
              .deleteBrandingWallpaper(webinarId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingWallpaper");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteBrandingWallpaper(webinarId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteBrandingWallpaper");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      * No content.  * Webinar wallpaper deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: {id}  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

<a name="deleteMessageById"></a>
# **deleteMessageById**
> deleteMessageById(webinarId, messageId).fileIds(fileIds).execute();

Delete a live webinar message

Deletes a message in a live webinar based on ID.   **Prerequisites:**  * Have Zoom enable the DLP for the in-meeting chat feature to use this API.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String messageId = "MS17MDQ5NjE4QjYtRjk4Ny00REEwLUFBQUItMTg3QTY0RjU2MzhFfQ=="; // The live webinar chat message's unique identifier (UUID), in base64-encoded format.
    String fileIds = "MS17RDk0QTY3QUQtQkFGQy04QTJFLTI2RUEtNkYxQjRBRTU1MTk5fQ==,MS17NDQ0OEU5MjMtM0JFOS1CMDA1LTQ0NDAtQjdGOTU0Rjk5MTkyfQ=="; // The live webinar chat file's universally unique identifier (UUID), in base64-encoded format. Separate multiple values with commas.
    try {
      client
              .webinars
              .deleteMessageById(webinarId, messageId)
              .fileIds(fileIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteMessageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteMessageById(webinarId, messageId)
              .fileIds(fileIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteMessageById");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **messageId** | **String**| The live webinar chat message&#39;s unique identifier (UUID), in base64-encoded format. | |
| **fileIds** | **String**| The live webinar chat file&#39;s universally unique identifier (UUID), in base64-encoded format. Separate multiple values with commas. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Webinar chat message deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  * Only available for paid accounts. * DLP is not enabled. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar  {webinarId} does not exist. &lt;br&gt;  |  -  |

<a name="deletePoll"></a>
# **deletePoll**
> deletePoll(webinarId, pollId).execute();

Delete a webinar poll

Delete a webinar&#39;s [poll](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars).            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    try {
      client
              .webinars
              .deletePoll(webinarId, pollId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deletePoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deletePoll(webinarId, pollId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deletePoll");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **pollId** | **String**| The poll ID | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Webinar Poll deleted |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;4400&#x60; &lt;br&gt;  Webinar polls disabled. To enable this feature, enable the \&quot;Webinar Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="deleteRegistrant"></a>
# **deleteRegistrant**
> deleteRegistrant(webinarId, registrantId).occurrenceId(occurrenceId).execute();

Delete a webinar registrant

Delete a webinar registrant.            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Integer webinarId = 95204914252; // The webinar ID.
    String registrantId = "9tboDiHUQAeOnbmudzWa5g"; // The registrant ID.
    String occurrenceId = "1648538280000"; // The webinar occurrence ID.
    try {
      client
              .webinars
              .deleteRegistrant(webinarId, registrantId)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteRegistrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteRegistrant(webinarId, registrantId)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteRegistrant");
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
| **webinarId** | **Integer**| The webinar ID. | |
| **registrantId** | **String**| The registrant ID. | |
| **occurrenceId** | **String**| The webinar occurrence ID. | [optional] |

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
| **204** | **HTTP status code:** &#x60;204&#x60;      OK |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {0}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The value that you entered for the Registrant ID field is invalid. Enter a valid value and try again.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;404&#x60; &lt;br&gt;  Registration has not been enabled for this webinar: {0}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Registrant {0} was not found.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {0}. &lt;br&gt;  |  -  |

<a name="deleteSurvey"></a>
# **deleteSurvey**
> deleteSurvey(webinarId).execute();

Delete a webinar survey

Use this API to delete a [webinar survey](https://support.zoom.us/hc/en-us/articles/360048745651).    **Prerequisites:**  * A Pro or higher plan with the Webinar Add-on.  * The [**Webinar Survey**](https://support.zoom.us/hc/en-us/articles/360061293191-Enabling-webinar-survey) feature enabled in the host&#39;s account.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      client
              .webinars
              .deleteSurvey(webinarId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .deleteSurvey(webinarId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#deleteSurvey");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;       Webinar survey deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid webinar ID. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Webinar survey disabled. To enable this feature, enable the \&quot;Webinar Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Webinar ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}. &lt;br&gt;  |  -  |

<a name="getDetails"></a>
# **getDetails**
> WebinarsGetDetailsResponse getDetails(webinarId).occurrenceId(occurrenceId).showPreviousOccurrences(showPreviousOccurrences).execute();

Get a webinar

Get details for a scheduled Zoom Webinar.            **Prerequisites:** * Pro or higher plan with a Webinar add-on.  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "95204914252"; // The webinar's ID or universally unique ID (UUID).
    String occurrenceId = "1648538280000"; // Unique identifier for an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences. When you create a recurring Webinar using [**Create a webinar**](https://developers.zoom.us) API, you can retrieve the Occurrence ID from the response of the API call.
    Boolean showPreviousOccurrences = true; // Set the value of this field to `true` if you would like to view Webinar details of all previous occurrences of a recurring Webinar.
    try {
      WebinarsGetDetailsResponse result = client
              .webinars
              .getDetails(webinarId)
              .occurrenceId(occurrenceId)
              .showPreviousOccurrences(showPreviousOccurrences)
              .execute();
      System.out.println(result);
      System.out.println(result.getHostEmail());
      System.out.println(result.getHostId());
      System.out.println(result.getId());
      System.out.println(result.getUuid());
      System.out.println(result.getAgenda());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDuration());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getOccurrences());
      System.out.println(result.getPassword());
      System.out.println(result.getEncryptedPasscode());
      System.out.println(result.getH323Passcode());
      System.out.println(result.getRecurrence());
      System.out.println(result.getSettings());
      System.out.println(result.getStartTime());
      System.out.println(result.getStartUrl());
      System.out.println(result.getTimezone());
      System.out.println(result.getTopic());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
      System.out.println(result.getIsSimulive());
      System.out.println(result.getRecordFileId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetDetailsResponse> response = client
              .webinars
              .getDetails(webinarId)
              .occurrenceId(occurrenceId)
              .showPreviousOccurrences(showPreviousOccurrences)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getDetails");
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
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID). | |
| **occurrenceId** | **String**| Unique identifier for an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences. When you create a recurring Webinar using [**Create a webinar**](https://developers.zoom.us) API, you can retrieve the Occurrence ID from the response of the API call. | [optional] |
| **showPreviousOccurrences** | **Boolean**| Set the value of this field to &#x60;true&#x60; if you would like to view Webinar details of all previous occurrences of a recurring Webinar. | [optional] |

### Return type

[**WebinarsGetDetailsResponse**](WebinarsGetDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Success |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid webinar ID. &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user to perform this action. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}. &lt;br&gt;  |  -  |

<a name="getJoinTokenLocalRecording"></a>
# **getJoinTokenLocalRecording**
> WebinarsGetJoinTokenLocalRecordingResponse getJoinTokenLocalRecording(webinarId).execute();

Get a webinar&#39;s join token for local recording

Use this API to get a webinar&#39;s join token to allow for local recording. The join token lets a recording bot implemented using Zoom Meeting SDK to connect to a Zoom webinar. The recording bot can then automatically start locally recording. This supports both regular and raw local recording types.    **Prerequisites:**  * A Pro or higher plan with a Webinar Add-on.  * The **Local recording** user setting enabled in the Zoom web portal.  **Scopes:** &#x60;webinar_token:read:admin:local_recording&#x60;,&#x60;webinar_token:read:local_recording&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsGetJoinTokenLocalRecordingResponse result = client
              .webinars
              .getJoinTokenLocalRecording(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getJoinTokenLocalRecording");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetJoinTokenLocalRecordingResponse> response = client
              .webinars
              .getJoinTokenLocalRecording(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getJoinTokenLocalRecording");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsGetJoinTokenLocalRecordingResponse**](WebinarsGetJoinTokenLocalRecordingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Webinar local recording token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid webinar ID.  **Error Code:** &#x60;124&#x60; &lt;br&gt; This API only supports OAuth2 authorization.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Not allowed to start local recording. To use this feature, enable the \&quot;Local Recording\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Webinar ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar does not exist: {webinarId}   |  -  |

<a name="getLiveStreamDetails"></a>
# **getLiveStreamDetails**
> WebinarsGetLiveStreamDetailsResponse getLiveStreamDetails(webinarId).execute();

Get live stream details

Get a webinar&#39;s live stream configuration details, such as Stream URL, Stream Key and Page URL.  Zoom allows users to [live stream a webinar](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service) to a custom platform.    **Prerequisites:**     * Pro or higher plan with the webinar add-on.     * Live streaming details must have been [configured](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service#h_01589a6f-a40a-4e18-a448-cb746e52ebc5) for the webinar.       **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "95204914252"; // The webinar's unique ID.
    try {
      WebinarsGetLiveStreamDetailsResponse result = client
              .webinars
              .getLiveStreamDetails(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPageUrl());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getResolution());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getLiveStreamDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetLiveStreamDetailsResponse> response = client
              .webinars
              .getLiveStreamDetails(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getLiveStreamDetails");
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
| **webinarId** | **String**| The webinar&#39;s unique ID. | |

### Return type

[**WebinarsGetLiveStreamDetailsResponse**](WebinarsGetLiveStreamDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**   Live stream details returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  * Webinar ID does not exist.&lt;br&gt;* Invalid Webinar ID.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} does not exist.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  * Webinar plan is missing. Subscribe to the webinar plan and enable webinars for user  {userId} in order to perform this action.&lt;br&gt;* The current user has not enabled the custom live streaming feature of the webinar. &lt;br&gt;  |  -  |

<a name="getMeetingArchiveTokenForLocalArchiving"></a>
# **getMeetingArchiveTokenForLocalArchiving**
> WebinarsGetMeetingArchiveTokenForLocalArchivingResponse getMeetingArchiveTokenForLocalArchiving(webinarId).execute();

Get a webinar&#39;s archive token for local archiving

Use this API to get a webinar&#39;s archive token to allow local archiving. The archive token allows a meeting SDK app or bot to get archive permission to access the webinar&#39;s raw audio and video media stream in real-time.    **Prerequisites:**  * A Pro or higher plan with a Webinar Add-on.  * The **Archive meetings and webinars** account setting enabled in the Zoom web portal.  **Scopes:** &#x60;webinar_token:read:admin:local_archiving&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsGetMeetingArchiveTokenForLocalArchivingResponse result = client
              .webinars
              .getMeetingArchiveTokenForLocalArchiving(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getMeetingArchiveTokenForLocalArchiving");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetMeetingArchiveTokenForLocalArchivingResponse> response = client
              .webinars
              .getMeetingArchiveTokenForLocalArchiving(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getMeetingArchiveTokenForLocalArchiving");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsGetMeetingArchiveTokenForLocalArchivingResponse**](WebinarsGetMeetingArchiveTokenForLocalArchivingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Webinar local archiving token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid webinar ID.  **Error Code:** &#x60;124&#x60; &lt;br&gt; This API only supports OAuth2 authorization.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Not allowed to start local archiving. To use this feature, enable the \&quot;Archive meetings and webinars\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Webinar ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar does not exist: {webinarId}   |  -  |

<a name="getPollDetails"></a>
# **getPollDetails**
> WebinarsGetPollDetailsResponse getPollDetails(webinarId, pollId).execute();

Get a webinar poll

Get a webinar&#39;s [poll](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars) details.            **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    try {
      WebinarsGetPollDetailsResponse result = client
              .webinars
              .getPollDetails(webinarId, pollId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getAnonymous());
      System.out.println(result.getPollType());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getPollDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetPollDetailsResponse> response = client
              .webinars
              .getPollDetails(webinarId, pollId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getPollDetails");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **pollId** | **String**| The poll ID | |

### Return type

[**WebinarsGetPollDetailsResponse**](WebinarsGetPollDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar Poll object returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;4400&#x60; &lt;br&gt;  Webinar polls disabled. To enable this feature, enable the \&quot;Webinar Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="getSessionBranding"></a>
# **getSessionBranding**
> WebinarsGetSessionBrandingResponse getSessionBranding(webinarId).execute();

Get webinar&#39;s session branding

Use this API to get the webinar&#39;s [Session Branding](https://support.zoom.us/hc/en-us/articles/4836268732045-Using-Webinar-Session-Branding) information. Session branding lets hosts visually customize a webinar by setting a webinar wallpaper that displays behind video tiles. Session branding also lets hosts set the Virtual Background for and apply name tags to hosts, alternative hosts, panelists, interpreters, and speakers.    **Prerequisites:**  * A Pro or higher plan with the Webinar add-on.  * The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:read&#x60;,&#x60;webinar:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsGetSessionBrandingResponse result = client
              .webinars
              .getSessionBranding(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWallpaper());
      System.out.println(result.getVirtualBackgrounds());
      System.out.println(result.getNameTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSessionBranding");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetSessionBrandingResponse> response = client
              .webinars
              .getSessionBranding(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSessionBranding");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsGetSessionBrandingResponse**](WebinarsGetSessionBrandingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Webinar session branding returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;3000&#x60; &lt;br&gt; You cannot enable session branding for this webinar.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

<a name="getSipUriWithPasscode"></a>
# **getSipUriWithPasscode**
> WebinarsGetSipUriWithPasscodeResponse getSipUriWithPasscode(webinarId).webinarsGetSipUriWithPasscodeRequest(webinarsGetSipUriWithPasscodeRequest).execute();

Get a webinar SIP URI with Passcode

Get a webinar&#39;s SIP URI. The URI consists of the webinar ID, an optional user-supplied passcode, and participant identifier code. The API return data also includes additional fields to indicate whether the API caller has a valid Cloud Room Connector subscription, the participant identifier code from the URI, and the SIP URI validity period in seconds.   **Scopes:** &#x60;webinar:write:admin:sip_dialing&#x60;,&#x60;webinar:write:sip_dialing&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 85746065L; // The webinar's ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Webinar IDs can exceed 10 digits.
    String passcode = "passcode_example"; // If customers want a passcode to be embedded in the SIP URI dial string, they must supply the passcode. Zoom will not validate the passcode.
    try {
      WebinarsGetSipUriWithPasscodeResponse result = client
              .webinars
              .getSipUriWithPasscode(webinarId)
              .passcode(passcode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSipDialing());
      System.out.println(result.getPaidCrcPlanParticipant());
      System.out.println(result.getParticipantIdentifierCode());
      System.out.println(result.getExpireIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSipUriWithPasscode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetSipUriWithPasscodeResponse> response = client
              .webinars
              .getSipUriWithPasscode(webinarId)
              .passcode(passcode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSipUriWithPasscode");
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
| **webinarId** | **Long**| The webinar&#39;s ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Webinar IDs can exceed 10 digits. | |
| **webinarsGetSipUriWithPasscodeRequest** | [**WebinarsGetSipUriWithPasscodeRequest**](WebinarsGetSipUriWithPasscodeRequest.md)|  | [optional] |

### Return type

[**WebinarsGetSipUriWithPasscodeResponse**](WebinarsGetSipUriWithPasscodeResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;  Webinar&#39;s encoded SIP URI returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Webinar Id does not exist. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid Webinar Id. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access meeting info. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  The webinar&#39;s SIP URI does not exist: {webinarId}. &lt;br&gt;  |  -  |

<a name="getSurvey"></a>
# **getSurvey**
> WebinarsGetSurveyResponse getSurvey(webinarId).execute();

Get a webinar survey

Return information about a [webinar survey](https://support.zoom.us/hc/en-us/articles/360048745651).    **Prerequisites:**  * A Pro or higher plan with the Webinar add-on.  * The [**Webinar Survey**](https://support.zoom.us/hc/en-us/articles/360061293191-Enabling-webinar-survey) feature enabled in the host&#39;s account.  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsGetSurveyResponse result = client
              .webinars
              .getSurvey(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomSurvey());
      System.out.println(result.getShowInTheBrowser());
      System.out.println(result.getShowInTheFollowUpEmail());
      System.out.println(result.getThirdPartySurvey());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetSurveyResponse> response = client
              .webinars
              .getSurvey(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getSurvey");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsGetSurveyResponse**](WebinarsGetSurveyResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       Webinar survey object returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid webinar ID. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Webinar survey disabled. To enable this feature, enable the \&quot;Webinar Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Webinar ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}. &lt;br&gt;  |  -  |

<a name="getWebinarToken"></a>
# **getWebinarToken**
> WebinarsGetWebinarTokenResponse getWebinarToken(webinarId).type(type).execute();

Get webinar&#39;s token

Use this API to get a webinar&#39;s [closed caption token (caption URL)](https://support.zoom.us/hc/en-us/articles/115002212983-Using-a-third-party-closed-captioning-service). This token lets you use a third-party service to stream text to their closed captioning software to the Zoom webinar.   **Prerequisites:**  * A Pro or higher plan with the Webinar add-on.  * The **Closed captioning** setting enabled in the Zoom web portal.  *  * The **Allow use of caption API Token to integrate with 3rd-party Closed Captioning services** setting enabled.  **Scopes:** &#x60;webinar:read&#x60;,&#x60;webinar:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String type = "closed_caption_token"; // The webinar token type:  * `closed_caption_token` &mdash; The third-party closed caption API token.   This defaults to `closed_caption_token`.
    try {
      WebinarsGetWebinarTokenResponse result = client
              .webinars
              .getWebinarToken(webinarId)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getWebinarToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsGetWebinarTokenResponse> response = client
              .webinars
              .getWebinarToken(webinarId)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#getWebinarToken");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **type** | **String**| The webinar token type:  * &#x60;closed_caption_token&#x60; &amp;mdash; The third-party closed caption API token.   This defaults to &#x60;closed_caption_token&#x60;. | [optional] [default to closed_caption_token] [enum: closed_caption_token] |

### Return type

[**WebinarsGetWebinarTokenResponse**](WebinarsGetWebinarTokenResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Webinar token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid webinar ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Closed captioning disabled. To enable this feature, enable the \&quot;Closed captioning\&quot; and \&quot;Allow use of caption API Token to integrate with 3rd-party Closed Captioning services\&quot; settings in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Webinar {webinarId} has not started.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Webinar ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar does not exist: {webinarId}   |  -  |

<a name="joinTokenLiveStreaming"></a>
# **joinTokenLiveStreaming**
> WebinarsJoinTokenLiveStreamingResponse joinTokenLiveStreaming(webinarId).execute();

Get a webinar&#39;s join token for live streaming

Use this API to get a webinar&#39;s archive token to allow live streaming. The join token allows a recording bot implemented using Zoom meeting SDK to connect to a Zoom meeting &amp;quot;hosted by the issuer of the token&amp;quot;, and can call the streaming method automatically. It supports both regular live streaming, and raw streaming.    **Prerequisites:**  * A Pro or higher plan with a Webinar Add-on.  * The **Allow livestreaming of webinars** user setting enabled in the Zoom web portal.  **Scopes:** &#x60;webinar_token:read:admin:live_streaming&#x60;,&#x60;webinar_token:read:live_streaming&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsJoinTokenLiveStreamingResponse result = client
              .webinars
              .joinTokenLiveStreaming(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#joinTokenLiveStreaming");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsJoinTokenLiveStreamingResponse> response = client
              .webinars
              .joinTokenLiveStreaming(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#joinTokenLiveStreaming");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsJoinTokenLiveStreamingResponse**](WebinarsJoinTokenLiveStreamingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Webinar live streaming token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid webinar ID.  **Error Code:** &#x60;124&#x60; &lt;br&gt; This API only supports OAuth2 authorization.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Not allowed to start live streaming. To use this feature, enable the \&quot;Allow livestreaming of webinars\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Webinar ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar does not exist: {webinarId}   |  -  |

<a name="listAbsentees"></a>
# **listAbsentees**
> WebinarsListAbsenteesResponse listAbsentees(webinarId).occurrenceId(occurrenceId).pageSize(pageSize).nextPageToken(nextPageToken).execute();

Get webinar absentees

List absentees of a webinar.            **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      WebinarsListAbsenteesResponse result = client
              .webinars
              .listAbsentees(webinarId)
              .occurrenceId(occurrenceId)
              .pageSize(pageSize)
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
      System.err.println("Exception when calling WebinarsApi#listAbsentees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListAbsenteesResponse> response = client
              .webinars
              .listAbsentees(webinarId)
              .occurrenceId(occurrenceId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listAbsentees");
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
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API will return a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request. | |
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**WebinarsListAbsenteesResponse**](WebinarsListAbsenteesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Success.    **Error Code:** &#x60;200&#x60;      Webinar plan subscription is missing. Enable webinar for this user once the subscription is added:{userId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  The request could not be completed because you have provided an invalid occurrence ID: {occurrenceId}&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  This Webinar has not registration required: {webinarUUID} &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting ID is invalid or not end. &lt;br&gt;  |  -  |

<a name="listPanelists"></a>
# **listPanelists**
> WebinarsListPanelistsResponse listPanelists(webinarId).execute();

List panelists

List all of a webinar&#39;s panelists.    Webinar panelists can view and send video, screen share, annotate, and do much more compared to webinar attendees.    **Prerequisites:**     * Pro or a higher plan with [Webinar Add-on](https://zoom.us/webinar).       **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsListPanelistsResponse result = client
              .webinars
              .listPanelists(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPanelists());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPanelists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListPanelistsResponse> response = client
              .webinars
              .listPanelists(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPanelists");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsListPanelistsResponse**](WebinarsListPanelistsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar plan subscription missing. Enable webinar for this user once the subscription is added. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="listParticipants"></a>
# **listParticipants**
> WebinarsListParticipantsResponse listParticipants(webinarId).pageSize(pageSize).nextPageToken(nextPageToken).execute();

List webinar participants

Retrieve a list of all the participants who attended a webinar hosted in the past.   **Prerequisites:**  * A Pro or higher plan with a webinar add-on.  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      WebinarsListParticipantsResponse result = client
              .webinars
              .listParticipants(webinarId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getParticipants());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listParticipants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListParticipantsResponse> response = client
              .webinars
              .listParticipants(webinarId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listParticipants");
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
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request. | |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**WebinarsListParticipantsResponse**](WebinarsListParticipantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Participants list returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  No permission.&lt;br&gt; Only available for paid account: {accountId}.&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The next page token is invalid or expired. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist. &lt;br&gt;  |  -  |

<a name="listPastInstances"></a>
# **listPastInstances**
> WebinarsListPastInstancesResponse listPastInstances(webinarId).execute();

List past webinar instances

List past webinar instances.            **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsListPastInstancesResponse result = client
              .webinars
              .listPastInstances(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebinars());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPastInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListPastInstancesResponse> response = client
              .webinars
              .listPastInstances(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPastInstances");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsListPastInstancesResponse**](WebinarsListPastInstancesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of past webinar instances returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="listPastWebinarQa"></a>
# **listPastWebinarQa**
> WebinarsListPastWebinarQaResponse listPastWebinarQa(webinarId).execute();

List Q&amp;As of a past webinar

List the Q&amp;amp;A of a specific past webinar.   The [question &amp;amp; answer (Q&amp;amp;A)](https://support.zoom.us/hc/en-us/articles/203686015-Getting-Started-with-Question-Answer) feature for webinars lets attendees ask questions during the webinar and for the panelists, co-hosts and host to answer their questions.   **Prerequisites**     * [Webinar license](https://zoom.us/webinar)       **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request.
    try {
      WebinarsListPastWebinarQaResponse result = client
              .webinars
              .listPastWebinarQa(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPastWebinarQa");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListPastWebinarQaResponse> response = client
              .webinars
              .listPastWebinarQa(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPastWebinarQa");
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
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request. | |

### Return type

[**WebinarsListPastWebinarQaResponse**](WebinarsListPastWebinarQaResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Q&amp;amp;A returned successfully. |  -  |
| **401** | **HTTP Status Code:** &#x60;401&#x60; &lt;br&gt;  Unauthorized    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar ID is invalid or not end.&lt;br&gt; This webinar id does not belong to you:{webinarId}. &lt;br&gt;  |  -  |

<a name="listPollResults"></a>
# **listPollResults**
> WebinarsListPollResultsResponse listPollResults(webinarId).execute();

List past webinar poll results

The polling feature for webinar lets you create single-choice or multiple-choice polling questions for your webinars. This API endpoint retrieves the results for webinar polls of a specific webinar.  **Prerequisites:**     * [Webinar license](https://zoom.us/webinar)       **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String webinarId = "ABCDE12345"; // The webinar's ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a `/` character or contains the `//` characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request.
    try {
      WebinarsListPollResultsResponse result = client
              .webinars
              .listPollResults(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPollResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListPollResultsResponse> response = client
              .webinars
              .listPollResults(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPollResults");
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
| **webinarId** | **String**| The webinar&#39;s ID or universally unique ID (UUID).  * If you provide a webinar ID, the API returns a response for the latest webinar instance.  * If you provide a webinar UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** [double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) the webinar UUID before making an API request. | |

### Return type

[**WebinarsListPollResultsResponse**](WebinarsListPollResultsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Polls returned successfully. |  -  |
| **401** | **HTTP Status Code:** &#x60;401&#x60; &lt;br&gt;  Unauthorized    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar ID is invalid or not end.&lt;br&gt; This webinar id does not belong to you:{webinarId}. &lt;br&gt;  |  -  |

<a name="listPolls"></a>
# **listPolls**
> WebinarsListPollsResponse listPolls(webinarId).anonymous(anonymous).execute();

List a webinar&#39;s polls 

List all the [polls](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars) of a Webinar.            **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    Boolean anonymous = true; // Whether to query for polls with the **Anonymous** option enabled:  * `true` &mdash; Query for polls with the **Anonymous** option enabled.  * `false` &mdash; Do not query for polls with the **Anonymous** option enabled.
    try {
      WebinarsListPollsResponse result = client
              .webinars
              .listPolls(webinarId)
              .anonymous(anonymous)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolls());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListPollsResponse> response = client
              .webinars
              .listPolls(webinarId)
              .anonymous(anonymous)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listPolls");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **anonymous** | **Boolean**| Whether to query for polls with the **Anonymous** option enabled:  * &#x60;true&#x60; &amp;mdash; Query for polls with the **Anonymous** option enabled.  * &#x60;false&#x60; &amp;mdash; Do not query for polls with the **Anonymous** option enabled. | [optional] |

### Return type

[**WebinarsListPollsResponse**](WebinarsListPollsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List polls of a Webinar  returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;4400&#x60; &lt;br&gt;  Webinar polls disabled. To enable this feature, enable the \&quot;Webinar Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="listRegistrants"></a>
# **listRegistrants**
> WebinarsListRegistrantsResponse listRegistrants(webinarId).occurrenceId(occurrenceId).status(status).trackingSourceId(trackingSourceId).pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).execute();

List webinar registrants

List all users that have registered for a given webinar. Zoom users with a [webinar plan](https://zoom.us/webinar) have access to creating and managing webinars. The webinar functionality lets a host broadcast a Zoom meeting to up to 10,000 attendees. Scheduling a [webinar with registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-Webinar-with-Registration) requires your registrants to complete a brief form before receiving the link to join the webinar.     **Prerequisites** * Pro or higher plan with a Webinar Add-on.       **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    String status = "pending"; // Query by the registrant's status.  * `pending` - The registration is pending.  * `approved` - The registrant is approved.  * `denied` - The registration is denied.
    String trackingSourceId = "5516482804110"; // The tracking source ID for the registrants. Useful if you share the webinar registration page in multiple locations. See [Creating source tracking links for webinar registration](https://support.zoom.us/hc/en-us/articles/360000315683-Creating-source-tracking-links-for-webinar-registration) for details.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // **Deprecated** This field will be deprecated. We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      WebinarsListRegistrantsResponse result = client
              .webinars
              .listRegistrants(webinarId)
              .occurrenceId(occurrenceId)
              .status(status)
              .trackingSourceId(trackingSourceId)
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
      System.err.println("Exception when calling WebinarsApi#listRegistrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListRegistrantsResponse> response = client
              .webinars
              .listRegistrants(webinarId)
              .occurrenceId(occurrenceId)
              .status(status)
              .trackingSourceId(trackingSourceId)
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
      System.err.println("Exception when calling WebinarsApi#listRegistrants");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **status** | **String**| Query by the registrant&#39;s status.  * &#x60;pending&#x60; - The registration is pending.  * &#x60;approved&#x60; - The registrant is approved.  * &#x60;denied&#x60; - The registration is denied. | [optional] [default to approved] [enum: pending, approved, denied] |
| **trackingSourceId** | **String**| The tracking source ID for the registrants. Useful if you share the webinar registration page in multiple locations. See [Creating source tracking links for webinar registration](https://support.zoom.us/hc/en-us/articles/360000315683-Creating-source-tracking-links-for-webinar-registration) for details. | [optional] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| **Deprecated** This field will be deprecated. We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**WebinarsListRegistrantsResponse**](WebinarsListRegistrantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Webinar plan subscription is missing. Enable webinar for this user once the subscription is added:{userId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="listRegistrationQuestions"></a>
# **listRegistrationQuestions**
> WebinarsListRegistrationQuestionsResponse listRegistrationQuestions(webinarId).execute();

List registration questions

List registration questions and fields that are to be answered by users while registering for a webinar.    Scheduling a [webinar with registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-Webinar-with-Registration) requires your registrants to complete a brief form with fields and questions before they can receive the link to join the webinar.       **Prerequisites:**      * Pro or higher plan with the webinar add-on.   **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsListRegistrationQuestionsResponse result = client
              .webinars
              .listRegistrationQuestions(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomQuestions());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListRegistrationQuestionsResponse> response = client
              .webinars
              .listRegistrationQuestions(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listRegistrationQuestions");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsListRegistrationQuestionsResponse**](WebinarsListRegistrationQuestionsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;   Webinar registrant question object returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="listTrackingSources"></a>
# **listTrackingSources**
> WebinarsListTrackingSourcesResponse listTrackingSources(webinarId).execute();

Get webinar tracking sources

[Webinar Registration Tracking Sources](https://support.zoom.us/hc/en-us/articles/360000315683-Webinar-Registration-Source-Tracking) allow you to see where your registrants are coming from if you share the webinar registration page in multiple platforms. You can then use the source tracking to see the number of registrants generated from each platform.     Use this API to list information on all the tracking sources of a Webinar.      **Prerequisites**:     * [Webinar license](https://zoom.us/webinar). * Registration must be required for the Webinar.   **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      WebinarsListTrackingSourcesResponse result = client
              .webinars
              .listTrackingSources(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalRecords());
      System.out.println(result.getTrackingSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listTrackingSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListTrackingSourcesResponse> response = client
              .webinars
              .listTrackingSources(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listTrackingSources");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

### Return type

[**WebinarsListTrackingSourcesResponse**](WebinarsListTrackingSourcesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; |  -  |

<a name="listWebinarTemplates"></a>
# **listWebinarTemplates**
> WebinarsListWebinarTemplatesResponse listWebinarTemplates(userId).execute();

List webinar templates

Display a list of a user&#39;s [webinar templates](https://support.zoom.us/hc/en-us/articles/115001079746-Webinar-Templates). For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us) instead of the &#x60;userId&#x60; parameter. When you schedule a webinar, save the settings for that webinar as a template for scheduling future webinars.  To use a template when scheduling a webinar, use the &#x60;id&#x60; value in this API response in the &#x60;template_id&#x60; field of the [**Create a webinar**](https://developers.zoom.us) API. **Prerequisites:** * A Pro or a higher account with the [Zoom Webinar plan](https://zoom.us/pricing/webinar).  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String userId = "abcD3ojfdbjfg"; // The user's ID. To get a user's ID, use the [**List users**](https://developers.zoom.us) API. For user-level apps, pass the `me` value instead of the user ID value.
    try {
      WebinarsListWebinarTemplatesResponse result = client
              .webinars
              .listWebinarTemplates(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTemplates());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listWebinarTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListWebinarTemplatesResponse> response = client
              .webinars
              .listWebinarTemplates(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listWebinarTemplates");
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
| **userId** | **String**| The user&#39;s ID. To get a user&#39;s ID, use the [**List users**](https://developers.zoom.us) API. For user-level apps, pass the &#x60;me&#x60; value instead of the user ID value. | |

### Return type

[**WebinarsListWebinarTemplatesResponse**](WebinarsListWebinarTemplatesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**  List of existing templates returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  Cannot use webinar API, you need to subscribe webinar plan and then enable webinar for this user:{userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1001&#x60; &lt;br&gt;  * User not exist: {userId}. * User {userId} does not exist or does not belong to this account. &lt;br&gt;  |  -  |

<a name="listWebinars"></a>
# **listWebinars**
> WebinarsListWebinarsResponse listWebinars(userId).type(type).pageSize(pageSize).pageNumber(pageNumber).execute();

List webinars

List all the webinars scheduled by or on behalf a webinar host. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.    Zoom users with a [webinar plan](https://zoom.us/webinar) have access to creating and managing webinars. Webinars let a host broadcast a Zoom meeting to up to 10,000 attendees.   **Note** This API only returns a user&#39;s [unexpired webinars](https://support.zoom.us/hc/en-us/articles/201362373-Meeting-ID#h_c73f9b08-c1c0-4a1a-b538-e01ebb98e844).    **Prerequisites**  * A Pro or higher plan with the webinar add-on.  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String userId = "userId_example"; // The user's user ID or email address. For user-level apps, pass the `me` value.
    String type = "scheduled"; // The type of webinar.  * `scheduled` - All valid previous (unexpired) webinars, live webinars, and upcoming scheduled webinars.  * `upcoming` - All upcoming webinars, including live webinars.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // **Deprecated** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    try {
      WebinarsListWebinarsResponse result = client
              .webinars
              .listWebinars(userId)
              .type(type)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getWebinars());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listWebinars");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsListWebinarsResponse> response = client
              .webinars
              .listWebinars(userId)
              .type(type)
              .pageSize(pageSize)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#listWebinars");
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
| **userId** | **String**| The user&#39;s user ID or email address. For user-level apps, pass the &#x60;me&#x60; value. | |
| **type** | **String**| The type of webinar.  * &#x60;scheduled&#x60; - All valid previous (unexpired) webinars, live webinars, and upcoming scheduled webinars.  * &#x60;upcoming&#x60; - All upcoming webinars, including live webinars. | [optional] [default to scheduled] [enum: scheduled, upcoming] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| **Deprecated** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |

### Return type

[**WebinarsListWebinarsResponse**](WebinarsListWebinarsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of webinar objects returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} not exist or not belong to this account. &lt;br&gt;  |  -  |

<a name="registrantDetails"></a>
# **registrantDetails**
> WebinarsRegistrantDetailsResponse registrantDetails(webinarId, registrantId).occurrenceId(occurrenceId).execute();

Get a webinar registrant

Zoom users with a [webinar plan](https://zoom.us/webinar) have access to creating and managing webinars. The webinar feature lets a host broadcast a Zoom meeting to up to 10,000 attendees. Scheduling a [webinar with registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-Webinar-with-Registration) requires your registrants to complete a brief form before receiving the link to join the webinar.    Use this API to get details on a specific user who has registered for the webinar.           **Prerequisites:**     * The account must have a webinar plan.  **Scopes:** &#x60;webinar:read:admin&#x60;,&#x60;webinar:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String registrantId = "9tboDiHUQAeOnbmudzWa5g"; // The registrant ID.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    try {
      WebinarsRegistrantDetailsResponse result = client
              .webinars
              .registrantDetails(webinarId, registrantId)
              .occurrenceId(occurrenceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAddress());
      System.out.println(result.getCity());
      System.out.println(result.getComments());
      System.out.println(result.getCountry());
      System.out.println(result.getCustomQuestions());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getIndustry());
      System.out.println(result.getJobTitle());
      System.out.println(result.getLastName());
      System.out.println(result.getNoOfEmployees());
      System.out.println(result.getOrg());
      System.out.println(result.getPhone());
      System.out.println(result.getPurchasingTimeFrame());
      System.out.println(result.getRoleInPurchaseProcess());
      System.out.println(result.getState());
      System.out.println(result.getStatus());
      System.out.println(result.getZip());
      System.out.println(result.getLanguage());
      System.out.println(result.getCreateTime());
      System.out.println(result.getJoinUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#registrantDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsRegistrantDetailsResponse> response = client
              .webinars
              .registrantDetails(webinarId, registrantId)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#registrantDetails");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **registrantId** | **String**| The registrant ID. | |
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |

### Return type

[**WebinarsRegistrantDetailsResponse**](WebinarsRegistrantDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="removePanelist"></a>
# **removePanelist**
> removePanelist(webinarId, panelistId).execute();

Remove a panelist

[Remove](https://support.zoom.us/hc/en-us/articles/115005657826-Inviting-Panelists-to-a-Webinar#h_de31f237-a91c-4fb2-912b-ecfba8ec5ffb) a single panelist from a webinar.     Retrieve the &#x60;panelistId&#x60; by calling **List Panelists API**.           **Prerequisites:**     * Pro or a higher plan with the [webinar add-on](https://zoom.us/webinar).       **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String panelistId = "Tg2b6GhcQKKbV7nSCbDKug"; // The panelist's ID or email.
    try {
      client
              .webinars
              .removePanelist(webinarId, panelistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removePanelist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .removePanelist(webinarId, panelistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removePanelist");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **panelistId** | **String**| The panelist&#39;s ID or email. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Panelist removed. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User  {accountId} does not belong to this account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {email} does not exist or does not belong to this account. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired. &lt;br&gt;  |  -  |

<a name="removePanelists"></a>
# **removePanelists**
> removePanelists(webinarId).execute();

Remove webinar panelists

Remove all the panelists from a webinar.     **Prerequisites:**     * Pro or a higher plan with the [webinar add-on](https://zoom.us/webinar).       **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    try {
      client
              .webinars
              .removePanelists(webinarId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removePanelists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .removePanelists(webinarId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removePanelists");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Panelists removed. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="removeWebinar"></a>
# **removeWebinar**
> removeWebinar(webinarId).occurrenceId(occurrenceId).cancelWebinarReminder(cancelWebinarReminder).execute();

Delete a webinar

Delete a webinar.    **Prerequisites:**     * Pro or higher plan with the webinar add-on.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    Boolean cancelWebinarReminder = true; // `true` - Notify panelists and registrants about the webinar cancellation via email.   `false` - Do not send any email notification to webinar registrants and panelists.   The default value of this field is `false`.
    try {
      client
              .webinars
              .removeWebinar(webinarId)
              .occurrenceId(occurrenceId)
              .cancelWebinarReminder(cancelWebinarReminder)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removeWebinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .removeWebinar(webinarId)
              .occurrenceId(occurrenceId)
              .cancelWebinarReminder(cancelWebinarReminder)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#removeWebinar");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **cancelWebinarReminder** | **Boolean**| &#x60;true&#x60; - Notify panelists and registrants about the webinar cancellation via email.   &#x60;false&#x60; - Do not send any email notification to webinar registrants and panelists.   The default value of this field is &#x60;false&#x60;. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; &lt;br&gt;  Webinar deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3002&#x60; &lt;br&gt;  Sorry, you cannot delete this webinar since it is in progress.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3003&#x60; &lt;br&gt;  You are not the webinar host.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3007&#x60; &lt;br&gt;  Sorry, you cannot delete this webinar since it has ended.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3018&#x60; &lt;br&gt;  Not allowed to delete PMI.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3037&#x60; &lt;br&gt;  Not allowed to delete PAC.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="setDefaultBrandingVirtualBackground"></a>
# **setDefaultBrandingVirtualBackground**
> setDefaultBrandingVirtualBackground(webinarId).id(id).setDefaultForAllPanelists(setDefaultForAllPanelists).execute();

Set webinar&#39;s default branding Virtual Background

Use this API to set a webinar&#39;s default session branding [Virtual Background](https://support.zoom.us/hc/en-us/articles/210707503-Virtual-Background).    **Prerequisites:**  * The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String id = "zazQjwDuQkS3Q2EprNd7jQ"; // The Virtual Background file ID to update.
    Boolean setDefaultForAllPanelists = true; // Whether to set the Virtual Background file as the new default for all panelists. This includes panelists not currently assigned a default Virtual Background.
    try {
      client
              .webinars
              .setDefaultBrandingVirtualBackground(webinarId)
              .id(id)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#setDefaultBrandingVirtualBackground");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .setDefaultBrandingVirtualBackground(webinarId)
              .id(id)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#setDefaultBrandingVirtualBackground");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **id** | **String**| The Virtual Background file ID to update. | [optional] |
| **setDefaultForAllPanelists** | **Boolean**| Whether to set the Virtual Background file as the new default for all panelists. This includes panelists not currently assigned a default Virtual Background. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      * No content.  * Virtual Background updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: {id}  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

<a name="updateBrandingNameTag"></a>
# **updateBrandingNameTag**
> updateBrandingNameTag(webinarId, nameTagId).webinarsUpdateBrandingNameTagRequest(webinarsUpdateBrandingNameTagRequest).execute();

Update a webinar&#39;s branding name tag

Use this API to update a webinar&#39;s [Session Branding](https://support.zoom.us/hc/en-us/articles/4836268732045-Using-Webinar-Session-Branding) name tag. **Prerequisites:**  *  The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String nameTagId = "J0sFXN2PSOCGrqTqLRwgAQ"; // The name tag's ID.
    String name = "name_example"; // The name tag's name.  **Note:** This value cannot exceed more than 50 characters.
    String textColor = "textColor_example"; // The name tag's text color.
    String accentColor = "accentColor_example"; // The name tag's accent color.
    String backgroundColor = "backgroundColor_example"; // The name tag's background color.
    Boolean isDefault = false; // Whether set the name tag as the default name tag or not.
    Boolean setDefaultForAllPanelists = true; // Whether to set the name tag as the new default for all panelists or not. This includes panelists not currently assigned a default name tag.
    try {
      client
              .webinars
              .updateBrandingNameTag(webinarId, nameTagId)
              .name(name)
              .textColor(textColor)
              .accentColor(accentColor)
              .backgroundColor(backgroundColor)
              .isDefault(isDefault)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateBrandingNameTag");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateBrandingNameTag(webinarId, nameTagId)
              .name(name)
              .textColor(textColor)
              .accentColor(accentColor)
              .backgroundColor(backgroundColor)
              .isDefault(isDefault)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateBrandingNameTag");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **nameTagId** | **String**| The name tag&#39;s ID. | |
| **webinarsUpdateBrandingNameTagRequest** | [**WebinarsUpdateBrandingNameTagRequest**](WebinarsUpdateBrandingNameTagRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      * No content.  * Name tag updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="updateLiveStream"></a>
# **updateLiveStream**
> updateLiveStream(webinarId).webinarsUpdateLiveStreamRequest(webinarsUpdateLiveStreamRequest).execute();

Update a live stream

Update a webinar&#39;s live stream information.         **Prerequisites:**     * Pro or higher plan with the webinar add-on.     * Live streaming details must be [configured](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service#h_01589a6f-a40a-4e18-a448-cb746e52ebc5) for the webinar.            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    URI pageUrl = new URI(); // The webinar live stream page's URL.
    String streamKey = "streamKey_example"; // The webinar live stream name and key.
    String streamUrl = "streamUrl_example"; // The webinar live stream URL.
    Long webinarId = 99289110036L; // The webinar's ID.
    String resolution = "resolution_example"; // The number of pixels in each dimension that the video camera can display, required when a user enables 1080p. Use a value of `720p` or `1080p`
    try {
      client
              .webinars
              .updateLiveStream(pageUrl, streamKey, streamUrl, webinarId)
              .resolution(resolution)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateLiveStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateLiveStream(pageUrl, streamKey, streamUrl, webinarId)
              .resolution(resolution)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateLiveStream");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsUpdateLiveStreamRequest** | [**WebinarsUpdateLiveStreamRequest**](WebinarsUpdateLiveStreamRequest.md)| Webinar | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Meeting live stream updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  * Webinar Id does not exist.&lt;br&gt; * Invalid Webinar Id.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  * Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}.&lt;br&gt; * The current user has not enabled the custom live streaming feature of the webinar. &lt;br&gt;  |  -  |

<a name="updateLiveStreamStatus"></a>
# **updateLiveStreamStatus**
> updateLiveStreamStatus(webinarId).webinarsUpdateLiveStreamStatusRequest(webinarsUpdateLiveStreamStatusRequest).execute();

Update live stream status

Let users [live stream a webinar](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service) to a custom platform. Update the status of a webinar&#39;s live stream.          **Prerequisites:**     * Pro or higher plan with a Webinar Add-on.     * Live streaming details must be [configured](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service#h_01589a6f-a40a-4e18-a448-cb746e52ebc5) for the webinar.            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String action = "start"; // Update the live stream's status.   * `start` - Start a webinar live stream.  * `stop`- Stop an ongoing webinar live stream.
    WebinarsUpdateLiveStreamStatusRequestSettings settings = new WebinarsUpdateLiveStreamStatusRequestSettings();
    try {
      client
              .webinars
              .updateLiveStreamStatus(webinarId)
              .action(action)
              .settings(settings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateLiveStreamStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateLiveStreamStatus(webinarId)
              .action(action)
              .settings(settings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateLiveStreamStatus");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsUpdateLiveStreamStatusRequest** | [**WebinarsUpdateLiveStreamStatusRequest**](WebinarsUpdateLiveStreamStatusRequest.md)| Webinar | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting live stream updated.   |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  * Webinar Id does not exist.&lt;br&gt; * Invalid Webinar Id.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  * Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}.&lt;br&gt; * The current user has not enabled the custom live streaming feature of the webinar.&lt;br&gt; * Webinar {0} has not started. &lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  The current webinar is not configured with a custom streaming service. &lt;br&gt;  |  -  |

<a name="updatePoll"></a>
# **updatePoll**
> updatePoll(webinarId, pollId).webinarsUpdatePollRequest(webinarsUpdatePollRequest).execute();

Update a webinar poll

Update a webinar&#39;s [poll](https://support.zoom.us/hc/en-us/articles/203749865-Polling-for-Webinars).            **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    String title = "title_example"; // The poll's title, up to 64 characters.
    Boolean anonymous = false; // Allow meeting participants to answer poll questions anonymously.   This value defaults to `false`.
    Integer pollType = 1; // The type of poll:  * `1` &mdash; Poll.  * `2` &mdash; Advanced Poll. This feature must be enabled in your Zoom account.  * `3` &mdash; Quiz. This feature must be enabled in your Zoom account.    This value defaults to `1`.
    List<WebinarsUpdatePollRequestQuestionsInner> questions = Arrays.asList(); // Information about the poll's questions.
    try {
      client
              .webinars
              .updatePoll(webinarId, pollId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updatePoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updatePoll(webinarId, pollId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updatePoll");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **pollId** | **String**| The poll ID | |
| **webinarsUpdatePollRequest** | [**WebinarsUpdatePollRequest**](WebinarsUpdatePollRequest.md)| Webinar Poll | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Webinar Poll Updated |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;4400&#x60; &lt;br&gt;  * Webinar polls disabled. To enable this feature, enable the \&quot;Webinar Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  * Advanced webinar polls disabled. To enable this feature, enable the \&quot;Allow host to create advanced polls and quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="updateRegistrantStatus"></a>
# **updateRegistrantStatus**
> updateRegistrantStatus(webinarId).occurrenceId(occurrenceId).webinarsUpdateRegistrantStatusRequest(webinarsUpdateRegistrantStatusRequest).execute();

Update registrant&#39;s status

Update webinar registrants&#39; registration status. You can approve or deny a registrant, or revoke a registrant&#39;s approval.   **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    String action = "approve"; // The registration action to perform.  * `approve` - Approve the registrant.  * `deny` - Reject the registrant.  * `cancel` - Cancel the registrant's approval.
    Long webinarId = 99289110036L; // The webinar's ID.
    List<WebinarsUpdateRegistrantStatusRequestRegistrantsInner> registrants = Arrays.asList(); // The registrant information.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    try {
      client
              .webinars
              .updateRegistrantStatus(action, webinarId)
              .registrants(registrants)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateRegistrantStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateRegistrantStatus(action, webinarId)
              .registrants(registrants)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateRegistrantStatus");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **webinarsUpdateRegistrantStatusRequest** | [**WebinarsUpdateRegistrantStatusRequest**](WebinarsUpdateRegistrantStatusRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; &lt;br&gt;  Registrant status updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: {accountId}. &lt;br&gt; **Error Code:** &#x60;3035&#x60; &lt;br&gt;  Webinar has reached maximum attendee capacity. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests     |  -  |

<a name="updateRegistrationQuestions"></a>
# **updateRegistrationQuestions**
> updateRegistrationQuestions(webinarId).webinarsUpdateRegistrationQuestionsRequest(webinarsUpdateRegistrationQuestionsRequest).execute();

Update registration questions

Update registration questions and fields of a scheduled webinar for users to answer during webinar registration. Scheduling a [webinar with registration](https://support.zoom.us/hc/en-us/articles/204619915-Scheduling-a-Webinar-with-Registration) requires your registrants to complete a brief form with fields and questions before they can receive the link to join the webinar.          **Prerequisites:**       * Pro or higher plan with a Webinar Add-on. * Registration option for Webinar should be set as required to use this API.    **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    List<WebinarsUpdateRegistrationQuestionsRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Array of custom questions for registrants.
    List<WebinarsUpdateRegistrationQuestionsRequestQuestionsInner> questions = Arrays.asList(); // Array of registration fields whose values should be provided by registrants.
    try {
      client
              .webinars
              .updateRegistrationQuestions(webinarId)
              .customQuestions(customQuestions)
              .questions(questions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateRegistrationQuestions(webinarId)
              .customQuestions(customQuestions)
              .questions(questions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateRegistrationQuestions");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsUpdateRegistrationQuestionsRequest** | [**WebinarsUpdateRegistrationQuestionsRequest**](WebinarsUpdateRegistrationQuestionsRequest.md)| Webinar registrant questions | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;   Webinar registrant questions updated. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     |  -  |

<a name="updateScheduledWebinar"></a>
# **updateScheduledWebinar**
> updateScheduledWebinar(webinarId).occurrenceId(occurrenceId).webinarsUpdateScheduledWebinarRequest(webinarsUpdateScheduledWebinarRequest).execute();

Update a webinar

Make updates to a scheduled webinar.   **100 requests per day**. The rate limit is applied to the &#x60;userId&#x60; of the **webinar host** used to make the request.   **Prerequisites**  * A Pro or higher plan with a webinar add-on.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String agenda = "agenda_example"; // Webinar description.
    Integer duration = 56; // Webinar duration, in minutes. Used for scheduled webinar only.
    String password = "password_example"; // [Webinar passcode](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords). By default, passcode may only contain the following characters: [a-z A-Z 0-9 @ - _ * !] and can have a maximum of 10 characters.  **Note:** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling either the [**Get user settings**](https://developers.zoom.us) API or the [**Get account settings**](https://developers.zoom.us) API.   If **Require a passcode when scheduling new meetings** setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated for the webinar in the response even if it is not provided in the API request.
    String scheduleFor = "scheduleFor_example"; // The user's email address or `userId` to schedule a webinar for.
    WebinarsUpdateScheduledWebinarRequestRecurrence recurrence = new WebinarsUpdateScheduledWebinarRequestRecurrence();
    WebinarsUpdateScheduledWebinarRequestSettings settings = new WebinarsUpdateScheduledWebinarRequestSettings();
    OffsetDateTime startTime = OffsetDateTime.now(); // Webinar start time, in the format `yyyy-MM-dd'T'HH:mm:ss'Z'`. Should be in GMT time. In the format `yyyy-MM-dd'T'HH:mm:ss`. This should be in local time and the timezone should be specified. Only used for scheduled webinars and recurring webinars with a fixed time.
    String timezone = "timezone_example"; // The timezone to assign to the `start_time` value. This field is only used for scheduled or recurring webinars with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
    String topic = "topic_example"; // The webinar topic.
    List<WebinarsUpdateScheduledWebinarRequestTrackingFieldsInner> trackingFields = Arrays.asList(); // Tracking fields.
    Integer type = 5; // Webinar types.   `5` - webinar.    `6` - Recurring webinar with no fixed time.    `9` - Recurring webinar with a fixed time.
    Boolean isSimulive = true; // Whether to set the webinar simulive.
    String recordFileId = "recordFileId_example"; // The previously recorded file's ID for `simulive`.
    String occurrenceId = "1648538280000"; // Webinar occurrence ID. Support change of agenda, start time, duration, and settings `host_video`, `panelist_video`, `hd_video, watermark`, `auto_recording`.
    try {
      client
              .webinars
              .updateScheduledWebinar(webinarId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .scheduleFor(scheduleFor)
              .recurrence(recurrence)
              .settings(settings)
              .startTime(startTime)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .isSimulive(isSimulive)
              .recordFileId(recordFileId)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateScheduledWebinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateScheduledWebinar(webinarId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .scheduleFor(scheduleFor)
              .recurrence(recurrence)
              .settings(settings)
              .startTime(startTime)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .isSimulive(isSimulive)
              .recordFileId(recordFileId)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateScheduledWebinar");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **occurrenceId** | **String**| Webinar occurrence ID. Support change of agenda, start time, duration, and settings &#x60;host_video&#x60;, &#x60;panelist_video&#x60;, &#x60;hd_video, watermark&#x60;, &#x60;auto_recording&#x60;. | [optional] |
| **webinarsUpdateScheduledWebinarRequest** | [**WebinarsUpdateScheduledWebinarRequest**](WebinarsUpdateScheduledWebinarRequest.md)| Webinar. | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Webinar updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: {accountId} &lt;br&gt; **Error Code:** &#x60;3003&#x60; &lt;br&gt;  * You are not the meeting host.  * Users in \&quot;{0}\&quot; have been blocked from joining meetings and webinars. To unblock them, go to the \&quot;Settings\&quot; page in the Zoom web portal and update the \&quot;Block users in specific domains from joining meetings and webinars\&quot; setting. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You cannot update or delete simulive webinars that have started using this method. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The value that you entered for the schedule_for field is invalid. Enter a valid value and try again. &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  Webinar plan is missing. You must subscribe to the webinar plan and enable webinars for this user in order to perform this action: {userId}. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="updateStatus"></a>
# **updateStatus**
> Object updateStatus(webinarId).webinarsUpdateStatusRequest(webinarsUpdateStatusRequest).execute();

Update webinar status

Update a webinar&#39;s status. Use this API to end an ongoing webinar.          **Prerequisites:**     * The account must hold a valid [Webinar plan](https://zoom.us/webinar).  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    String action = "end";
    try {
      Object result = client
              .webinars
              .updateStatus(webinarId)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .webinars
              .updateStatus(webinarId)
              .action(action)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateStatus");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsUpdateStatusRequest** | [**WebinarsUpdateStatusRequest**](WebinarsUpdateStatusRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webinar plan subscription is missing. Enable webinar for this user once the subscription is added:{userId}. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account:{accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3003&#x60; &lt;br&gt;  You are not the meeting host.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3063&#x60; &lt;br&gt;  Can not end on-premise user&#39;s meeting:{meetingId}.&lt;br&gt; &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} does not exist or does not belong to this account.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar {webinarId} not found or has expired.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="updateSurvey"></a>
# **updateSurvey**
> updateSurvey(webinarId).webinarsUpdateSurveyRequest(webinarsUpdateSurveyRequest).execute();

Update a webinar survey

Update a [webinar survey](https://support.zoom.us/hc/en-us/articles/360048745651).  **Prerequisites:** * A Pro or higher plan with the Webinar add-on. * Enable the [**Webinar Survey**](https://support.zoom.us/hc/en-us/articles/360061293191-Enabling-webinar-survey) feature in the host&#39;s account.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    WebinarsUpdateSurveyRequestCustomSurvey customSurvey = new WebinarsUpdateSurveyRequestCustomSurvey();
    Boolean showInTheBrowser = true; // Whether the **Show in the browser when the webinar ends** option is enabled.  * `true` - Enabled.  * `false` - Disabled.    This value defaults to `true`.
    Boolean showInTheFollowUpEmail = false; // Whether the **Show the link on the follow-up email** option is enabled.  * `true` - Enabled.  * `false` - Disabled.    This value defaults to `false`.
    String thirdPartySurvey = "thirdPartySurvey_example"; // The link to the third party webinar survey.
    try {
      client
              .webinars
              .updateSurvey(webinarId)
              .customSurvey(customSurvey)
              .showInTheBrowser(showInTheBrowser)
              .showInTheFollowUpEmail(showInTheFollowUpEmail)
              .thirdPartySurvey(thirdPartySurvey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinars
              .updateSurvey(webinarId)
              .customSurvey(customSurvey)
              .showInTheBrowser(showInTheBrowser)
              .showInTheFollowUpEmail(showInTheFollowUpEmail)
              .thirdPartySurvey(thirdPartySurvey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#updateSurvey");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **webinarsUpdateSurveyRequest** | [**WebinarsUpdateSurveyRequest**](WebinarsUpdateSurveyRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;       Webinar survey updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid webinar ID. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid third party survey: {third_party_survey}. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Webinar survey disabled. To use this feature, enable the \&quot;Webinar Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  The host isn&#39;t allowed to use a third party survey link. To use this feature, enable the \&quot;Allow host to use a 3rd-party survey link\&quot; setting in the \&quot;Account Settings\&quot; page of the Zoom web portal. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Webinar ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Webinar does not exist: {webinarId}. &lt;br&gt;  |  -  |

<a name="uploadBrandingVirtualBackground"></a>
# **uploadBrandingVirtualBackground**
> WebinarsUploadBrandingVirtualBackgroundResponse uploadBrandingVirtualBackground(webinarId, _file)._default(_default).setDefaultForAllPanelists(setDefaultForAllPanelists).webinarsUploadBrandingVirtualBackgroundRequest(webinarsUploadBrandingVirtualBackgroundRequest).execute();

Upload a webinar&#39;s branding Virtual Background

Use this API to upload a webinar&#39;s session branding [Virtual Background](https://support.zoom.us/hc/en-us/articles/210707503-Virtual-Background). Hosts and panelists can select and use these Virtual Backgrounds during the webinar. Branding Virtual Background files have the following restrictions:  * A webinar cannot exceed more than 10 Virtual Background files.  * You can only upload image files that are in JPG/JPEG, GIF or PNG format.  * The Virtual Background file size cannot exceed 15 megabytes (MB).    **Prerequisites:**  *  The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    File _file = new File("/path/to/file"); // The Virtual Background's file path, in binary format.
    Boolean _default = false; // Whether set the file as the default Virtual Background file.
    Boolean setDefaultForAllPanelists = true; // Whether to set the Virtual Background file as the new default for all panelists. This includes panelists not currently assigned a default Virtual Background.
    try {
      WebinarsUploadBrandingVirtualBackgroundResponse result = client
              .webinars
              .uploadBrandingVirtualBackground(webinarId, _file)
              ._default(_default)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getIsDefault());
      System.out.println(result.getSize());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#uploadBrandingVirtualBackground");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsUploadBrandingVirtualBackgroundResponse> response = client
              .webinars
              .uploadBrandingVirtualBackground(webinarId, _file)
              ._default(_default)
              .setDefaultForAllPanelists(setDefaultForAllPanelists)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#uploadBrandingVirtualBackground");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **_file** | **File**| The Virtual Background&#39;s file path, in binary format. | |
| **_default** | **Boolean**| Whether set the file as the default Virtual Background file. | [optional] [default to false] |
| **setDefaultForAllPanelists** | **Boolean**| Whether to set the Virtual Background file as the new default for all panelists. This includes panelists not currently assigned a default Virtual Background. | [optional] [default to true] |
| **webinarsUploadBrandingVirtualBackgroundRequest** | [**WebinarsUploadBrandingVirtualBackgroundRequest**](WebinarsUploadBrandingVirtualBackgroundRequest.md)|  | [optional] |

### Return type

[**WebinarsUploadBrandingVirtualBackgroundResponse**](WebinarsUploadBrandingVirtualBackgroundResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Virtual Background uploaded. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.  **Error Code:** &#x60;120&#x60; &lt;br&gt; * No file uploaded. Verify that a file has been uploaded.  * File size cannot exceed 15M.  * A maximum of 10 files are allowed for a webinar.  * Only JPG/JPEG, GIF, or PNG image files can be uploaded.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

<a name="uploadBrandingWallpaper"></a>
# **uploadBrandingWallpaper**
> WebinarsUploadBrandingWallpaperResponse uploadBrandingWallpaper(webinarId, _file).webinarsUploadBrandingWallpaperRequest(webinarsUploadBrandingWallpaperRequest).execute();

Upload a webinar&#39;s branding wallpaper

Use this API to upload a webinar&#39;s session branding wallpaper file. Webinar branding wallpaper files have the following requirements:  * A webinar can only have one wallpaper file.  * You can only upload image files that are in JPG/JPEG, GIF, or PNG format.  * Image files must be 16:9 ratio. The recommended image size is 1920 x 1080 pixels (px).  * The wallpaper file size cannot exceed 15 megabytes (MB).    **Prerequisites:**  *  The **Webinar Session Branding** setting enabled.  **Scopes:** &#x60;webinar:write&#x60;,&#x60;webinar:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarsApi;
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
    Long webinarId = 99289110036L; // The webinar's ID.
    File _file = new File("/path/to/file"); // The wallpaper's file path, in binary format.
    try {
      WebinarsUploadBrandingWallpaperResponse result = client
              .webinars
              .uploadBrandingWallpaper(webinarId, _file)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSize());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#uploadBrandingWallpaper");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarsUploadBrandingWallpaperResponse> response = client
              .webinars
              .uploadBrandingWallpaper(webinarId, _file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarsApi#uploadBrandingWallpaper");
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
| **webinarId** | **Long**| The webinar&#39;s ID. | |
| **_file** | **File**| The wallpaper&#39;s file path, in binary format. | |
| **webinarsUploadBrandingWallpaperRequest** | [**WebinarsUploadBrandingWallpaperRequest**](WebinarsUploadBrandingWallpaperRequest.md)|  | [optional] |

### Return type

[**WebinarsUploadBrandingWallpaperResponse**](WebinarsUploadBrandingWallpaperResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Webinar wallpaper uploaded. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3000&#x60; &lt;br&gt; This webinar does not have session branding enabled.  **Error Code:** &#x60;120&#x60; &lt;br&gt; * No file uploaded. Verify that a file has been uploaded.  * File size cannot exceed 15M.  * A maximum of 10 files are allowed for a webinar.  * Only JPG/JPEG, GIF, or PNG image files can be uploaded.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Webinar \&quot;{webinarId}\&quot; not found or has expired.   |  -  |

