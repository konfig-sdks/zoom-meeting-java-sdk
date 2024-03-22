# MeetingsApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRegistrant**](MeetingsApi.md#addRegistrant) | **POST** /meetings/{meetingId}/registrants | Add a meeting registrant |
| [**batchRegistrantsCreate**](MeetingsApi.md#batchRegistrantsCreate) | **POST** /meetings/{meetingId}/batch_registrants | Perform batch registration |
| [**controlInMeetingFeatures**](MeetingsApi.md#controlInMeetingFeatures) | **PATCH** /live_meetings/{meetingId}/events | Use in-meeting controls |
| [**createBatchPolls**](MeetingsApi.md#createBatchPolls) | **POST** /meetings/{meetingId}/batch_polls | Perform batch poll creation |
| [**createInviteLinks**](MeetingsApi.md#createInviteLinks) | **POST** /meetings/{meetingId}/invite_links | Create meeting&#39;s invite links |
| [**createMeeting**](MeetingsApi.md#createMeeting) | **POST** /users/{userId}/meetings | Create a meeting |
| [**createPoll**](MeetingsApi.md#createPoll) | **POST** /meetings/{meetingId}/polls | Create a meeting poll |
| [**createTemplateFromMeeting**](MeetingsApi.md#createTemplateFromMeeting) | **POST** /users/{userId}/meeting_templates | Create a meeting template from an existing meeting |
| [**deleteMeetingChatMessage**](MeetingsApi.md#deleteMeetingChatMessage) | **DELETE** /live_meetings/{meetingId}/chat/messages/{messageId} | Delete a live meeting message |
| [**deleteMeetingSurvey**](MeetingsApi.md#deleteMeetingSurvey) | **DELETE** /meetings/{meetingId}/survey | Delete a meeting survey |
| [**deleteRegistrant**](MeetingsApi.md#deleteRegistrant) | **DELETE** /meetings/{meetingId}/registrants/{registrantId} | Delete a meeting registrant |
| [**getDetails**](MeetingsApi.md#getDetails) | **GET** /meetings/{meetingId} | Get a meeting |
| [**getDetails_0**](MeetingsApi.md#getDetails_0) | **GET** /past_meetings/{meetingId} | Get past meeting details |
| [**getInvitationNote**](MeetingsApi.md#getInvitationNote) | **GET** /meetings/{meetingId}/invitation | Get meeting invitation |
| [**getJoinToken**](MeetingsApi.md#getJoinToken) | **GET** /meetings/{meetingId}/jointoken/live_streaming | Get a meeting&#39;s join token for live streaming |
| [**getJoinTokenLocalRecording**](MeetingsApi.md#getJoinTokenLocalRecording) | **GET** /meetings/{meetingId}/jointoken/local_recording | Get a meeting&#39;s join token for local recording |
| [**getLivestreamDetails**](MeetingsApi.md#getLivestreamDetails) | **GET** /meetings/{meetingId}/livestream | Get livestream details |
| [**getMeetingArchiveTokenForLocalArchiving**](MeetingsApi.md#getMeetingArchiveTokenForLocalArchiving) | **GET** /meetings/{meetingId}/jointoken/local_archiving | Get a meeting&#39;s archive token for local archiving |
| [**getMeetingSummary**](MeetingsApi.md#getMeetingSummary) | **GET** /meetings/{meetingId}/meeting_summary | Get a meeting summary |
| [**getMeetingSurvey**](MeetingsApi.md#getMeetingSurvey) | **GET** /meetings/{meetingId}/survey | Get a meeting survey |
| [**getMeetingToken**](MeetingsApi.md#getMeetingToken) | **GET** /meetings/{meetingId}/token | Get meeting&#39;s token |
| [**getPastMeetingParticipants**](MeetingsApi.md#getPastMeetingParticipants) | **GET** /past_meetings/{meetingId}/participants | Get past meeting participants |
| [**getPoll**](MeetingsApi.md#getPoll) | **GET** /meetings/{meetingId}/polls/{pollId} | Get a meeting poll |
| [**getRegistrantDetails**](MeetingsApi.md#getRegistrantDetails) | **GET** /meetings/{meetingId}/registrants/{registrantId} | Get a meeting registrant |
| [**getSipUriWithPasscode**](MeetingsApi.md#getSipUriWithPasscode) | **POST** /meetings/{meetingId}/sip_dialing | Get a meeting SIP URI with Passcode |
| [**listHostScheduled**](MeetingsApi.md#listHostScheduled) | **GET** /users/{userId}/meetings | List meetings |
| [**listMeetingPolls**](MeetingsApi.md#listMeetingPolls) | **GET** /meetings/{meetingId}/polls | List meeting polls |
| [**listMeetingSummaries**](MeetingsApi.md#listMeetingSummaries) | **GET** /meetings/meeting_summaries | List meeting summaries of an account |
| [**listMeetingTemplates**](MeetingsApi.md#listMeetingTemplates) | **GET** /users/{userId}/meeting_templates | List meeting templates |
| [**listPastMeetingInstances**](MeetingsApi.md#listPastMeetingInstances) | **GET** /past_meetings/{meetingId}/instances | List past meeting instances |
| [**listPastMeetingPolls**](MeetingsApi.md#listPastMeetingPolls) | **GET** /past_meetings/{meetingId}/polls | List past meeting&#39;s poll results |
| [**listPastMeetingQA**](MeetingsApi.md#listPastMeetingQA) | **GET** /past_meetings/{meetingId}/qa | List past meetings&#39; Q&amp;A |
| [**listRegistrants**](MeetingsApi.md#listRegistrants) | **GET** /meetings/{meetingId}/registrants | List meeting registrants |
| [**listRegistrationQuestions**](MeetingsApi.md#listRegistrationQuestions) | **GET** /meetings/{meetingId}/registrants/questions | List registration questions  |
| [**listUpcomingMeetings**](MeetingsApi.md#listUpcomingMeetings) | **GET** /users/{userId}/upcoming_meetings | List upcoming meetings |
| [**livestreamStatusUpdate**](MeetingsApi.md#livestreamStatusUpdate) | **PATCH** /meetings/{meetingId}/livestream/status | Update Live Stream Status |
| [**pollDelete**](MeetingsApi.md#pollDelete) | **DELETE** /meetings/{meetingId}/polls/{pollId} | Delete a meeting poll |
| [**removeMeeting**](MeetingsApi.md#removeMeeting) | **DELETE** /meetings/{meetingId} | Delete a meeting |
| [**updateDetails**](MeetingsApi.md#updateDetails) | **PATCH** /meetings/{meetingId} | Update a meeting |
| [**updateLivestream**](MeetingsApi.md#updateLivestream) | **PATCH** /meetings/{meetingId}/livestream | Update a livestream |
| [**updateMeetingPoll**](MeetingsApi.md#updateMeetingPoll) | **PUT** /meetings/{meetingId}/polls/{pollId} | Update a meeting poll |
| [**updateMeetingStatus**](MeetingsApi.md#updateMeetingStatus) | **PUT** /meetings/{meetingId}/status | Update meeting status |
| [**updateMessage**](MeetingsApi.md#updateMessage) | **PATCH** /live_meetings/{meetingId}/chat/messages/{messageId} | Update a live meeting message |
| [**updateRegistrantStatus**](MeetingsApi.md#updateRegistrantStatus) | **PUT** /meetings/{meetingId}/registrants/status | Update registrant&#39;s status |
| [**updateRegistrationQuestions**](MeetingsApi.md#updateRegistrationQuestions) | **PATCH** /meetings/{meetingId}/registrants/questions | Update registration questions |
| [**updateSurvey**](MeetingsApi.md#updateSurvey) | **PATCH** /meetings/{meetingId}/survey | Update a meeting survey |


<a name="addRegistrant"></a>
# **addRegistrant**
> MeetingsAddRegistrantResponse addRegistrant(meetingId).occurrenceIds(occurrenceIds).meetingsAddRegistrantRequest(meetingsAddRegistrantRequest).execute();

Add a meeting registrant

Create and submit a user&#39;s registration to a meeting. See [Customizing webinar registration](https://support.zoom.us/hc/en-us/articles/202835649-Customizing-webinar-registration) for details on how to set the requirements for these fields. Note that there is a maximum limit of 4,999 registrants per meeting and users will see an error if the meeting&#39;s capacity is reached.    **Prerequisites:**  * The host must be a **Licensed** user type.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String lastName = "lastName_example"; // The registrant's last name.
    String address = "address_example"; // The registrant's address.
    String city = "city_example"; // The registrant's city.
    String state = "state_example"; // The registrant's state or province.
    String zip = "zip_example"; // The registrant's ZIP or postal code.
    String country = "country_example"; // The registrant's two-letter [country code](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries).
    String phone = "phone_example"; // The registrant's phone number.
    String comments = "comments_example"; // The registrant's questions and comments.
    List<MeetingsAddRegistrantRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Information about custom questions.
    String industry = "industry_example"; // The registrant's industry.
    String jobTitle = "jobTitle_example"; // The registrant's job title.
    String noOfEmployees = ""; // The registrant's number of employees:  * `1-20`  * `21-50`  * `51-100`  * `101-500`  * `500-1,000`  * `1,001-5,000`  * `5,001-10,000`  * `More than 10,000`
    String org = "org_example"; // The registrant's organization.
    String purchasingTimeFrame = ""; // The registrant's purchasing time frame:  * `Within a month`  * `1-3 months`  * `4-6 months`  * `More than 6 months`  * `No timeframe`
    String roleInPurchaseProcess = ""; // The registrant's role in the purchase process:  * `Decision Maker`  * `Evaluator/Recommender`  * `Influencer`  * `Not involved`
    String language = "en-US"; // The registrant's language preference for confirmation emails:  * `en-US` &mdash; English (US)  * `de-DE` &mdash; German (Germany)  * `es-ES` &mdash; Spanish (Spain)  * `fr-FR` &mdash; French (France)  * `jp-JP` &mdash; Japanese  * `pt-PT` &mdash; Portuguese (Portugal)  * `ru-RU` &mdash; Russian  * `zh-CN` &mdash; Chinese (PRC)  * `zh-TW` &mdash; Chinese (Taiwan)  * `ko-KO` &mdash; Korean  * `it-IT` &mdash; Italian (Italy)  * `vi-VN` &mdash; Vietnamese  * `pl-PL` &mdash; Polish  * `Tr-TR` &mdash; Turkish
    Boolean autoApprove = true; // If a meeting was scheduled with the `approval_type` field value of `1` (manual approval) but you want to automatically approve meeting registrants, set the value of this field to `true`.   **Note:** You cannot use this field to change approval setting for a meeting originally scheduled with the `approval_type` field value of `0` (automatic approval).
    String occurrenceIds = "1648194360000,1648367160000"; // A comma-separated list of meeting occurrence IDs. You can get this value with the [Get a meeting](https://developers.zoom.us) API.
    try {
      MeetingsAddRegistrantResponse result = client
              .meetings
              .addRegistrant(firstName, email, meetingId)
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
              .autoApprove(autoApprove)
              .occurrenceIds(occurrenceIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getRegistrantId());
      System.out.println(result.getStartTime());
      System.out.println(result.getTopic());
      System.out.println(result.getOccurrences());
      System.out.println(result.getParticipantPinCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#addRegistrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsAddRegistrantResponse> response = client
              .meetings
              .addRegistrant(firstName, email, meetingId)
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
              .autoApprove(autoApprove)
              .occurrenceIds(occurrenceIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#addRegistrant");
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
| **occurrenceIds** | **String**| A comma-separated list of meeting occurrence IDs. You can get this value with the [Get a meeting](https://developers.zoom.us) API. | [optional] |
| **meetingsAddRegistrantRequest** | [**MeetingsAddRegistrantRequest**](MeetingsAddRegistrantRequest.md)|  | [optional] |

### Return type

[**MeetingsAddRegistrantResponse**](MeetingsAddRegistrantResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Meeting registration created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;3003&#x60; &lt;br&gt; You are not the meeting host.  **Error Code:** &#x60;3043&#x60; &lt;br&gt; Meeting has reached maximum attendee capacity.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access meeting info.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; Meeting host does not exist: {userId}   |  -  |

<a name="batchRegistrantsCreate"></a>
# **batchRegistrantsCreate**
> MeetingsBatchRegistrantsCreateResponse batchRegistrantsCreate(meetingId).meetingsBatchRegistrantsCreateRequest(meetingsBatchRegistrantsCreateRequest).execute();

Perform batch registration

Register up to 30 registrants at once for a meeting that requires [registration](https://support.zoom.us/hc/en-us/articles/211579443-Registration-for-Meetings).       **Prerequisites:**     * The meeting host must be a Licensed user. * The meeting must require registration and should be of type &#x60;2&#x60;, i.e., they should be scheduled meetings. Instant meetings and Recurring meetings are not supported by this API.            **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Heavy&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String meetingId = "91498058927"; // Unique identifier of the meeting (Meeting Number).
    Boolean autoApprove = true; // If a meeting was scheduled with approval_type `1` (manual approval), but you would like to automatically approve the registrants that are added via this API, you can set the value of this field to `true`.   You **cannot** use this field to change approval setting for a meeting  that was originally scheduled with approval_type `0` (automatic approval).
    Boolean registrantsConfirmationEmail = true; // Send confirmation Email to Registrants
    List<MeetingsBatchRegistrantsCreateRequestRegistrantsInner> registrants = Arrays.asList();
    try {
      MeetingsBatchRegistrantsCreateResponse result = client
              .meetings
              .batchRegistrantsCreate(meetingId)
              .autoApprove(autoApprove)
              .registrantsConfirmationEmail(registrantsConfirmationEmail)
              .registrants(registrants)
              .execute();
      System.out.println(result);
      System.out.println(result.getRegistrants());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#batchRegistrantsCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsBatchRegistrantsCreateResponse> response = client
              .meetings
              .batchRegistrantsCreate(meetingId)
              .autoApprove(autoApprove)
              .registrantsConfirmationEmail(registrantsConfirmationEmail)
              .registrants(registrants)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#batchRegistrantsCreate");
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
| **meetingId** | **String**| Unique identifier of the meeting (Meeting Number). | |
| **meetingsBatchRegistrantsCreateRequest** | [**MeetingsBatchRegistrantsCreateRequest**](MeetingsBatchRegistrantsCreateRequest.md)|  | [optional] |

### Return type

[**MeetingsBatchRegistrantsCreateResponse**](MeetingsBatchRegistrantsCreateResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;200&#x60; **OK**      Registrants added. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3038&#x60; &lt;br&gt; Meeting is over, you can not register now. If you have any questions, please contact the Meeting host.&lt;br&gt;&lt;br&gt;  **Error Code:** &#x60;303&#x60; &lt;br&gt; This API can only be used for scheduled meeting(meeting type: 2). Batch registration is not supported for other meeting types.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}.&lt;br&gt;  **Error Code:** &#x60;3043&#x60; &lt;br&gt; Meeting has reached maximum attendee capacity.&lt;br&gt;  **Error Code:** &#x60;404&#x60; &lt;br&gt; Registration has not been enabled for this meeting: {meetingId}.   |  -  |

<a name="controlInMeetingFeatures"></a>
# **controlInMeetingFeatures**
> controlInMeetingFeatures(meetingId).meetingsControlInMeetingFeaturesRequest(meetingsControlInMeetingFeaturesRequest).execute();

Use in-meeting controls

Control [in-meeting](https://support.zoom.us/hc/en-us/articles/360021921032-In-Meeting-Controls) features. In-meeting controls include starting and stopping a recording, pausing and resuming a recording, and inviting participants.   **Note:** This API&#39;s recording control only works for cloud recordings. It does **not** work for local recordings.   **Prerequisites:** * The meeting **must** be a live meeting **except** inviting participants to the meeting through [call out (phone)/(room system)].  * Recording control: [Cloud recording](https://support.zoom.us/hc/en-us/articles/360060231472-Enabling-cloud-recording) must be enabled on the account.  * The user calling this API must be the host or an alternative meeting host.     **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;,&#x60;meeting:master&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String meetingId = "93398114182"; // The live meeting's ID.
    String method = "method_example"; // The in-meeting method to control:  * `recording.start` &mdash; Start the recording.  * `recording.stop` &mdash; Stop the recording.  * `recording.pause` &mdash; Pause the recording.  * `recording.resume` &mdash; Resume a paused recording.  * `participant.invite` &mdash; Invite a participant to the meeting.  * `participant.invite.callout` &mdash; Invite a participant to the meeting through [call out (phone)](https://support.zoom.us/hc/en-us/articles/4404535651085-Inviting-others-by-phone-call-out).  * `participant.invite.room_system_callout` &mdash; Invite a participant to the meeting through [call out (room system)].
    MeetingsControlInMeetingFeaturesRequestParams params = new MeetingsControlInMeetingFeaturesRequestParams();
    try {
      client
              .meetings
              .controlInMeetingFeatures(meetingId)
              .method(method)
              .params(params)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#controlInMeetingFeatures");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .controlInMeetingFeatures(meetingId)
              .method(method)
              .params(params)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#controlInMeetingFeatures");
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
| **meetingId** | **String**| The live meeting&#39;s ID. | |
| **meetingsControlInMeetingFeaturesRequest** | [**MeetingsControlInMeetingFeaturesRequest**](MeetingsControlInMeetingFeaturesRequest.md)|  | [optional] |

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
| **202** | **HTTP Status:** &#x60;202&#x60; **Accepted** Request processed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  * Meeting id does not exist.&lt;br&gt; * Invalid meeting id.&lt;br&gt; * Meeting does not exist.&lt;br&gt; * No permission.&lt;br&gt; * This API is not available for this account, please contact Zoom support. &lt;br&gt; **Error Code:** &#x60;3309&#x60; &lt;br&gt;  Not enough cloud storage available. Either purchase additional storage or delete cloud recordings to free up storage. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting {meetingId} is not found or has expired. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  undefined     |  -  |

<a name="createBatchPolls"></a>
# **createBatchPolls**
> MeetingsCreateBatchPollsResponse createBatchPolls(meetingId).meetingsCreateBatchPollsRequest(meetingsCreateBatchPollsRequest).execute();

Perform batch poll creation

Polls allow the meeting host to survey attendees. Create batch [polls](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings) for a meeting.           **Prerequisites**:     * Host user type must be **Pro** or higher plan. * Polling feature must be enabled in the host&#39;s account. * Meeting must be a scheduled meeting. Instant meetings do not have polling features enabled.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String meetingId = "93398114182";
    List<MeetingsCreateBatchPollsRequestPollsInner> polls = Arrays.asList(); // Information about the meeting's polls.
    try {
      MeetingsCreateBatchPollsResponse result = client
              .meetings
              .createBatchPolls(meetingId)
              .polls(polls)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolls());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createBatchPolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsCreateBatchPollsResponse> response = client
              .meetings
              .createBatchPolls(meetingId)
              .polls(polls)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createBatchPolls");
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
| **meetingId** | **String**|  | |
| **meetingsCreateBatchPollsRequest** | [**MeetingsCreateBatchPollsRequest**](MeetingsCreateBatchPollsRequest.md)| Batch Meeting poll object | [optional] |

### Return type

[**MeetingsCreateBatchPollsResponse**](MeetingsCreateBatchPollsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Meeting Poll Created |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid Meeting ID.  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting id does not exist.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access meeting information.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}.&lt;br&gt;  **Error Code:** &#x60;4400&#x60; &lt;br&gt; * You can only add a maximum of 50 polls.  * Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  * Advanced meeting polls disabled. To enable this feature, enable the \&quot;Allow host to create advanced polls and quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |

<a name="createInviteLinks"></a>
# **createInviteLinks**
> MeetingsCreateInviteLinksResponse createInviteLinks(meetingId).meetingsCreateInviteLinksRequest(meetingsCreateInviteLinksRequest).execute();

Create meeting&#39;s invite links

Create a batch of invitation links for a meeting.    **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    List<MeetingsCreateInviteLinksRequestAttendeesInner> attendees = Arrays.asList(); // The attendees list.
    Long ttl = 7200L; // The invite link's expiration time, in seconds.   This value defaults to `7200`.
    try {
      MeetingsCreateInviteLinksResponse result = client
              .meetings
              .createInviteLinks(meetingId)
              .attendees(attendees)
              .ttl(ttl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttendees());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createInviteLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsCreateInviteLinksResponse> response = client
              .meetings
              .createInviteLinks(meetingId)
              .attendees(attendees)
              .ttl(ttl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createInviteLinks");
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
| **meetingsCreateInviteLinksRequest** | [**MeetingsCreateInviteLinksRequest**](MeetingsCreateInviteLinksRequest.md)|  | [optional] |

### Return type

[**MeetingsCreateInviteLinksResponse**](MeetingsCreateInviteLinksResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Meeting invitation links created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; * Meeting ID does not exist.  * Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access webinar information.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |

<a name="createMeeting"></a>
# **createMeeting**
> MeetingsCreateMeetingResponse createMeeting(userId).meetingsCreateMeetingRequest(meetingsCreateMeetingRequest).execute();

Create a meeting

[Create a meeting](https://support.zoom.us/hc/en-us/articles/201362413-Scheduling-meetings) for a user. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.  * A meeting&#39;s &#x60;start_url&#x60; value is the URL a host or an alternative host can use to start a meeting. The expiration time for the &#x60;start_url&#x60; value is **two hours** for all regular users. * For &#x60;custCreate&#x60; meeting hosts (users created with the &#x60;custCreate&#x60; parameter via the [**Create users**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods/#operation/userCreate) API), the expiration time of the &#x60;start_url&#x60; parameter is **90 days** from the generation of the &#x60;start_url&#x60;.  **Note:**   For security reasons, the recommended way to programmatically get the updated &#x60;start_url&#x60; value after expiry is to call the [**Get a meeting**](/api-reference/zoom-api/methods#operation/meeting) API. Refer to the &#x60;start_url&#x60; value in the response.    **100 requests per day**. The rate limit is applied against the &#x60;userId&#x60; of the **meeting host** used to make the request.  **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String agenda = "agenda_example"; // The meeting's agenda. This value has a maximum length of 2,000 characters.
    Boolean defaultPassword = false; // Whether to generate a default passcode using the user's settings. This value defaults to `false`.   If this value is `true` and the user has the PMI setting enabled with a passcode, then the user's meetings will use the PMI passcode. It will **not** use a default passcode.
    Integer duration = 56; // The meeting's scheduled duration, in minutes. This field is only used for scheduled meetings (`2`).
    String password = "password_example"; // The passcode required to join the meeting. By default, a passcode can **only** have a maximum length of 10 characters and only contain alphanumeric characters and the `@`, `-`, `_`, and `*` characters.  * If the account owner or administrator has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode **must** meet those requirements.  * If passcode requirements are enabled, use the [**Get user settings**](https://developers.zoom.us/docs/api-reference/zoom-api/methods#operation/userSettings) API or the [**Get account settings**](https://developers.zoom.us/docs/api-reference/zoom-api/ma#operation/accountSettings) API to get the requirements.
    Boolean preSchedule = false; // Whether to create a prescheduled meeting via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This **only** supports the meeting `type` value of `2` (scheduled meetings) and `3` (recurring meetings with no fixed time).  * `true` - Create a prescheduled meeting.  * `false` - Create a regular meeting.
    MeetingsCreateMeetingRequestRecurrence recurrence = new MeetingsCreateMeetingRequestRecurrence();
    String scheduleFor = "scheduleFor_example"; // The email address or user ID of the user to schedule a meeting for.
    MeetingsCreateMeetingRequestSettings settings = new MeetingsCreateMeetingRequestSettings();
    OffsetDateTime startTime = OffsetDateTime.now(); // The meeting's start time. This field is only used for scheduled or recurring meetings with a fixed time. This supports local time and GMT formats.  * To set a meeting's start time in GMT, use the `yyyy-MM-ddTHH:mm:ssZ` date-time format. For example, `2020-03-31T12:02:00Z`.  * To set a meeting's start time using a specific timezone, use the `yyyy-MM-ddTHH:mm:ss` date-time format and specify the [timezone ID](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones) in the `timezone` field. If you do not specify a timezone, the `timezone` value defaults to your Zoom account's timezone. You can also use `UTC` for the `timezone` value. **Note:** If no `start_time` is set for a scheduled meeting, the `start_time` is set at the current time and the meeting type changes to an instant meeting, which expires after 30 days.
    String templateId = "templateId_example"; // The account admin meeting template ID used to schedule a meeting using a [meeting template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates). For a list of account admin-provided meeting templates, use the [**List meeting templates**](https://developers.zoom.us/docs/api-reference/zoom-api/methods#operation/listMeetingTemplates) API.  * At this time, this field **only** accepts account admin meeting template IDs.  * To enable the account admin meeting templates feature, [contact Zoom support](https://support.zoom.us/hc/en-us).
    String timezone = "timezone_example"; // The timezone to assign to the `start_time` value. This field is only used for scheduled or recurring meetings with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
    String topic = "topic_example"; // The meeting's topic.
    List<MeetingsCreateMeetingRequestTrackingFieldsInner> trackingFields = Arrays.asList(); // Information about the meeting's tracking fields.
    Integer type = 1; // The type of meeting. * `1` - An instant meeting.  * `2` - A scheduled meeting.  * `3` - A recurring meeting with no fixed time.  * `8` - A recurring meeting with fixed time.
    try {
      MeetingsCreateMeetingResponse result = client
              .meetings
              .createMeeting(userId)
              .agenda(agenda)
              .defaultPassword(defaultPassword)
              .duration(duration)
              .password(password)
              .preSchedule(preSchedule)
              .recurrence(recurrence)
              .scheduleFor(scheduleFor)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssistantId());
      System.out.println(result.getHostEmail());
      System.out.println(result.getId());
      System.out.println(result.getRegistrationUrl());
      System.out.println(result.getAgenda());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDuration());
      System.out.println(result.getH323Password());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getChatJoinUrl());
      System.out.println(result.getOccurrences());
      System.out.println(result.getPassword());
      System.out.println(result.getPmi());
      System.out.println(result.getPreSchedule());
      System.out.println(result.getRecurrence());
      System.out.println(result.getSettings());
      System.out.println(result.getStartTime());
      System.out.println(result.getStartUrl());
      System.out.println(result.getTimezone());
      System.out.println(result.getTopic());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createMeeting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsCreateMeetingResponse> response = client
              .meetings
              .createMeeting(userId)
              .agenda(agenda)
              .defaultPassword(defaultPassword)
              .duration(duration)
              .password(password)
              .preSchedule(preSchedule)
              .recurrence(recurrence)
              .scheduleFor(scheduleFor)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createMeeting");
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
| **meetingsCreateMeetingRequest** | [**MeetingsCreateMeetingRequest**](MeetingsCreateMeetingRequest.md)| Meeting object. | [optional] |

### Return type

[**MeetingsCreateMeetingResponse**](MeetingsCreateMeetingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Meeting created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Your user account is not allowed meeting hosting and scheduling capabilities. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Instant meetings do not support the &#x60;schedule_for&#x60; parameter, and you can&#39;t schedule an instant meeting for another user. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Users in &#39;{userId}&#39; have been blocked from joining meetings and webinars. To unblock them, go to the **Settings** page in the Zoom web portal and update **Block users in specific domains from joining meetings and webinars**. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You cannot schedule a meeting for {userId} &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The value that you entered in the &#x60;schedule_for&#x60; field is invalid. Enter a valid value and try again. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid &#x60;enforce_login_domains&#x60;. Separate multiple domains with semicolons. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: {userId}. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests      |  -  |

<a name="createPoll"></a>
# **createPoll**
> MeetingsCreatePollResponse createPoll(meetingId).meetingsCreatePollRequest(meetingsCreatePollRequest).execute();

Create a meeting poll

Polls allow the meeting host to survey attendees. Create a [poll](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings) for a meeting.           **Prerequisites**:     * Host user type must be **Pro** or higher plan. * Polling feature must be enabled in the host&#39;s account. * Meeting must be a scheduled meeting. Instant meetings do not have polling features enabled.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String title = "title_example"; // The poll's title, up to 64 characters.
    Boolean anonymous = false; // Allow meeting participants to answer poll questions anonymously.   This value defaults to `false`.
    Integer pollType = 1; // The type of poll:  * `1` &mdash; Poll.  * `2` &mdash; Advanced Poll. This feature must be enabled in your Zoom account.  * `3` &mdash; Quiz. This feature must be enabled in your Zoom account.    This value defaults to `1`.
    List<MeetingsCreatePollRequestQuestionsInner> questions = Arrays.asList(); // Information about the poll's questions.
    try {
      MeetingsCreatePollResponse result = client
              .meetings
              .createPoll(meetingId)
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
      System.err.println("Exception when calling MeetingsApi#createPoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsCreatePollResponse> response = client
              .meetings
              .createPoll(meetingId)
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
      System.err.println("Exception when calling MeetingsApi#createPoll");
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
| **meetingsCreatePollRequest** | [**MeetingsCreatePollRequest**](MeetingsCreatePollRequest.md)| Meeting poll object | [optional] |

### Return type

[**MeetingsCreatePollResponse**](MeetingsCreatePollResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;      Meeting Poll Created |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;4400&#x60; &lt;br&gt; * Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  * Advanced meeting polls disabled. To enable this feature, enable the \&quot;Allow host to create advanced polls and quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;404&#x60; &lt;br&gt; Meeting not found   |  -  |

<a name="createTemplateFromMeeting"></a>
# **createTemplateFromMeeting**
> MeetingsCreateTemplateFromMeetingResponse createTemplateFromMeeting(userId).meetingsCreateTemplateFromMeetingRequest(meetingsCreateTemplateFromMeetingRequest).execute();

Create a meeting template from an existing meeting

Create a meeting template from an existing meeting.     **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 56L; // The meeting ID aka the meeting number in long (int64) format.
    String name = "name_example"; // The template name.
    Boolean saveRecurrence = false; // If the field is set to true, the recurrence meeting template will be saved as the scheduled meeting.
    Boolean overwrite = false; // Overwrite an existing meeting template if the template is created from same existing meeting.
    try {
      MeetingsCreateTemplateFromMeetingResponse result = client
              .meetings
              .createTemplateFromMeeting(userId)
              .meetingId(meetingId)
              .name(name)
              .saveRecurrence(saveRecurrence)
              .overwrite(overwrite)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#createTemplateFromMeeting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsCreateTemplateFromMeetingResponse> response = client
              .meetings
              .createTemplateFromMeeting(userId)
              .meetingId(meetingId)
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
      System.err.println("Exception when calling MeetingsApi#createTemplateFromMeeting");
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
| **meetingsCreateTemplateFromMeetingRequest** | [**MeetingsCreateTemplateFromMeetingRequest**](MeetingsCreateTemplateFromMeetingRequest.md)|  | [optional] |

### Return type

[**MeetingsCreateTemplateFromMeetingResponse**](MeetingsCreateTemplateFromMeetingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Meeting template created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; * Meeting ID does not exist.  * Invalid meeting ID.  * You can only create up to 40 meeting templates.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; * Cannot access webinar information.  * Meeting template name already exists: {templateName}.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; * User not exist: {userId}.  * User {userId} does not exist or does not belong to this account.   |  -  |

<a name="deleteMeetingChatMessage"></a>
# **deleteMeetingChatMessage**
> deleteMeetingChatMessage(meetingId, messageId).fileIds(fileIds).execute();

Delete a live meeting message

Delete a message in a live meeting, based on ID.   **Prerequisites:**  * Have Zoom enable the DLP for the in-meeting chat feature to use this API.  **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long-format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String messageId = "MS17MDQ5NjE4QjYtRjk4Ny00REEwLUFBQUItMTg3QTY0RjU2MzhFfQ=="; // The live meeting chat message's unique identifier (UUID), in base64-encoded format.
    String fileIds = "MS17RDk0QTY3QUQtQkFGQy04QTJFLTI2RUEtNkYxQjRBRTU1MTk5fQ==,MS17NDQ0OEU5MjMtM0JFOS1CMDA1LTQ0NDAtQjdGOTU0Rjk5MTkyfQ=="; // The live webinar chat file's universally unique identifier (UUID), in base64-encoded format. Separate multiple values with commas.
    try {
      client
              .meetings
              .deleteMeetingChatMessage(meetingId, messageId)
              .fileIds(fileIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteMeetingChatMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .deleteMeetingChatMessage(meetingId, messageId)
              .fileIds(fileIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteMeetingChatMessage");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long-format integer and **not** an integer. Meeting IDs can exceed 10 digits. | |
| **messageId** | **String**| The live meeting chat message&#39;s unique identifier (UUID), in base64-encoded format. | |
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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting chat message deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;200&#x60; &lt;br&gt;  * Only available for Paid accounts.  * DLP is not enabled. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting {meetingId} does not exist. &lt;br&gt;  |  -  |

<a name="deleteMeetingSurvey"></a>
# **deleteMeetingSurvey**
> deleteMeetingSurvey(meetingId).execute();

Delete a meeting survey

Delete a [meeting survey](https://support.zoom.us/hc/en-us/articles/4404969060621-Post-meeting-survey-and-reporting).    **Prerequisites:**  * The host must be a **Pro** user type.  * The [**Meeting Survey**](https://support.zoom.us/hc/en-us/articles/4404939095053-Enabling-meeting-surveys) feature enabled in the host&#39;s account.  * The meeting must be a scheduled meeting. Instant meetings do not have survey features enabled.  **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      client
              .meetings
              .deleteMeetingSurvey(meetingId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteMeetingSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .deleteMeetingSurvey(meetingId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteMeetingSurvey");
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
| **204** | **HTTP Status Code:** &#x60;204&#x60;       Meeting survey deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; * Cannot access Webinar information. &lt;br&gt;  * Meeting survey disabled. To enable this feature, enable the \&quot;Meeting Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}.   |  -  |

<a name="deleteRegistrant"></a>
# **deleteRegistrant**
> deleteRegistrant(meetingId, registrantId).occurrenceId(occurrenceId).execute();

Delete a meeting registrant

Delete a meeting registrant.            **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Integer meetingId = 91498058927; // The meeting ID.
    String registrantId = "9tboDiHUQAeOnbmudzWa5g"; // The meeting registrant ID.
    String occurrenceId = "approved"; // The meeting occurrence ID.
    try {
      client
              .meetings
              .deleteRegistrant(meetingId, registrantId)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteRegistrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .deleteRegistrant(meetingId, registrantId)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#deleteRegistrant");
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
| **meetingId** | **Integer**| The meeting ID. | |
| **registrantId** | **String**| The meeting registrant ID. | |
| **occurrenceId** | **String**| The meeting occurrence ID. | [optional] |

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
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; Only available for paid users: {0}.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; The value that you entered for the Registrant ID field is invalid. Enter a valid value and try again.&lt;br&gt;  **Error Code:** &#x60;404&#x60; &lt;br&gt; Registration has not been enabled for this meeting: {0}.&lt;br&gt;  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist or does not belong to this account.&lt;br&gt;  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access webinar info.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {0}.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |

<a name="getDetails"></a>
# **getDetails**
> MeetingsGetDetailsResponse getDetails(meetingId).occurrenceId(occurrenceId).showPreviousOccurrences(showPreviousOccurrences).execute();

Get a meeting

Retrieve the given meeting&#39;s details.         **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Meeting IDs can be more than 10 digits.
    String occurrenceId = "1648194360000"; // Meeting occurrence ID. Provide this field to view meeting details of a particular occurrence of the [recurring meeting](https://support.zoom.us/hc/en-us/articles/214973206-Scheduling-Recurring-Meetings).
    Boolean showPreviousOccurrences = true; // Set this field's value to `true` to view meeting details of all previous occurrences of a [recurring meeting](https://support.zoom.us/hc/en-us/articles/214973206-Scheduling-Recurring-Meetings). 
    try {
      MeetingsGetDetailsResponse result = client
              .meetings
              .getDetails(meetingId)
              .occurrenceId(occurrenceId)
              .showPreviousOccurrences(showPreviousOccurrences)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssistantId());
      System.out.println(result.getHostEmail());
      System.out.println(result.getHostId());
      System.out.println(result.getId());
      System.out.println(result.getUuid());
      System.out.println(result.getAgenda());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDuration());
      System.out.println(result.getEncryptedPassword());
      System.out.println(result.getH323Password());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getChatJoinUrl());
      System.out.println(result.getOccurrences());
      System.out.println(result.getPassword());
      System.out.println(result.getPmi());
      System.out.println(result.getPreSchedule());
      System.out.println(result.getRecurrence());
      System.out.println(result.getSettings());
      System.out.println(result.getStartTime());
      System.out.println(result.getStartUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getTimezone());
      System.out.println(result.getTopic());
      System.out.println(result.getTrackingFields());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetDetailsResponse> response = client
              .meetings
              .getDetails(meetingId)
              .occurrenceId(occurrenceId)
              .showPreviousOccurrences(showPreviousOccurrences)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getDetails");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Meeting IDs can be more than 10 digits. | |
| **occurrenceId** | **String**| Meeting occurrence ID. Provide this field to view meeting details of a particular occurrence of the [recurring meeting](https://support.zoom.us/hc/en-us/articles/214973206-Scheduling-Recurring-Meetings). | [optional] |
| **showPreviousOccurrences** | **Boolean**| Set this field&#39;s value to &#x60;true&#x60; to view meeting details of all previous occurrences of a [recurring meeting](https://support.zoom.us/hc/en-us/articles/214973206-Scheduling-Recurring-Meetings).  | [optional] |

### Return type

[**MeetingsGetDetailsResponse**](MeetingsGetDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting object returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access webinar info. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Your user account is not allowed meeting hosting and scheduling capabilities. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting does not exist: {meetingId}. &lt;br&gt;  |  -  |

<a name="getDetails_0"></a>
# **getDetails_0**
> MeetingsGetDetails200Response getDetails_0(meetingId).execute();

Get past meeting details

Get information about a past meeting.      **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
      MeetingsGetDetails200Response result = client
              .meetings
              .getDetails_0(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUuid());
      System.out.println(result.getDuration());
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getHostId());
      System.out.println(result.getDept());
      System.out.println(result.getParticipantsCount());
      System.out.println(result.getSource());
      System.out.println(result.getTopic());
      System.out.println(result.getTotalMinutes());
      System.out.println(result.getType());
      System.out.println(result.getUserEmail());
      System.out.println(result.getUserName());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetDetails200Response> response = client
              .meetings
              .getDetails_0(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getDetails_0");
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

[**MeetingsGetDetails200Response**](MeetingsGetDetails200Response.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting information returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; * User does not exist: {userId}  * User \&quot;{userId}\&quot; does not exist or does not belong to this account.  **Error Code:** &#x60;300&#x60; &lt;br&gt; Cannot access meeting information.  **Error Code:** &#x60;200&#x60; &lt;br&gt; Only available for paid account: {accountId}  **Error Code:** &#x60;12702&#x60; &lt;br&gt; Can not access a meeting a year ago.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;3001&#x60; &lt;br&gt; * This meeting is not available or the meeting ID is invalid.  * The meeting ID is invalid or the meeting has not ended.   |  -  |

<a name="getInvitationNote"></a>
# **getInvitationNote**
> MeetingsGetInvitationNoteResponse getInvitationNote(meetingId).execute();

Get meeting invitation

Retrieve the meeting invitation note for a specific meeting.  **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsGetInvitationNoteResponse result = client
              .meetings
              .getInvitationNote(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvitation());
      System.out.println(result.getSipLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getInvitationNote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetInvitationNoteResponse> response = client
              .meetings
              .getInvitationNote(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getInvitationNote");
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

### Return type

[**MeetingsGetInvitationNoteResponse**](MeetingsGetInvitationNoteResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting invitation returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |

<a name="getJoinToken"></a>
# **getJoinToken**
> MeetingsGetJoinTokenResponse getJoinToken(meetingId).execute();

Get a meeting&#39;s join token for live streaming

Get a meeting&#39;s join token to allow live streaming. The join token allows a recording bot implemented using Zoom meeting SDK to connect to a Zoom meeting &amp;quot;hosted by the issuer of the token&amp;quot;, and can call the streaming method automatically. It supports both regular live streaming, and raw streaming.   **Prerequisites:**  * A Pro or higher plan for the meeting host.  * The **Allow livestreaming of meetings** user setting enabled in the Zoom web portal.  **Scopes:** &#x60;meeting_token:read:admin:live_streaming&#x60;,&#x60;meeting_token:read:live_streaming&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsGetJoinTokenResponse result = client
              .meetings
              .getJoinToken(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getJoinToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetJoinTokenResponse> response = client
              .meetings
              .getJoinToken(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getJoinToken");
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

### Return type

[**MeetingsGetJoinTokenResponse**](MeetingsGetJoinTokenResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting live streaming token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access Webinar information.  **Error Code:** &#x60;124&#x60; &lt;br&gt; This API only supports OAuth2 authorization.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Not allowed to start live streaming. To use this feature, enable the \&quot;Allow livestreaming of meetings\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}   |  -  |

<a name="getJoinTokenLocalRecording"></a>
# **getJoinTokenLocalRecording**
> MeetingsGetJoinTokenLocalRecordingResponse getJoinTokenLocalRecording(meetingId).bypassWaitingRoom(bypassWaitingRoom).execute();

Get a meeting&#39;s join token for local recording

Get a meeting&#39;s join token to allow for local recording. The join token lets a recording bot implemented using Zoom Meeting SDK to connect to a Zoom meeting. The recording bot can then automatically start locally recording. This supports both regular and raw local recording types.   **Prerequisites:**  * The **Local recording** user setting enabled in the Zoom web portal.  **Scopes:** &#x60;meeting_token:read:local_recording&#x60;,&#x60;meeting_token:read:admin:local_recording&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Boolean bypassWaitingRoom = true; // Whether to bypass the waiting room.
    try {
      MeetingsGetJoinTokenLocalRecordingResponse result = client
              .meetings
              .getJoinTokenLocalRecording(meetingId)
              .bypassWaitingRoom(bypassWaitingRoom)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getJoinTokenLocalRecording");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetJoinTokenLocalRecordingResponse> response = client
              .meetings
              .getJoinTokenLocalRecording(meetingId)
              .bypassWaitingRoom(bypassWaitingRoom)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getJoinTokenLocalRecording");
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
| **bypassWaitingRoom** | **Boolean**| Whether to bypass the waiting room. | [optional] |

### Return type

[**MeetingsGetJoinTokenLocalRecordingResponse**](MeetingsGetJoinTokenLocalRecordingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting local recording token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid meeting ID. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access Webinar information. &lt;br&gt; **Error Code:** &#x60;124&#x60; &lt;br&gt;  This API only supports OAuth2 authorization. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Not allowed to start local recording. To use this feature, enable the \&quot;Local Recording\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;300&#x60; &lt;br&gt;  Meeting ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting does not exist: {meetingId}. &lt;br&gt;  |  -  |

<a name="getLivestreamDetails"></a>
# **getLivestreamDetails**
> MeetingsGetLivestreamDetailsResponse getLivestreamDetails(meetingId).execute();

Get livestream details

Zoom allows users to [livestream a meeting](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service) to a custom platform. Get a meeting&#39;s livestream configuration details such as Stream URL, Stream Key and Page URL.          **Prerequisites:**     * Meeting host must be a licensed user with a Pro or higher plan.     * Live streaming details must have been [configured](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service#h_01589a6f-a40a-4e18-a448-cb746e52ebc5) for the meeting.            **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String meetingId = "93398114182"; // Unique identifier of the meeting.
    try {
      MeetingsGetLivestreamDetailsResponse result = client
              .meetings
              .getLivestreamDetails(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPageUrl());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getResolution());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getLivestreamDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetLivestreamDetailsResponse> response = client
              .meetings
              .getLivestreamDetails(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getLivestreamDetails");
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
| **meetingId** | **String**| Unique identifier of the meeting. | |

### Return type

[**MeetingsGetLivestreamDetailsResponse**](MeetingsGetLivestreamDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Live Stream details returned.   |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Missing meetingId&lt;br&gt; Invalid meetingId&lt;br&gt;&lt;br&gt;  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist.   |  -  |

<a name="getMeetingArchiveTokenForLocalArchiving"></a>
# **getMeetingArchiveTokenForLocalArchiving**
> MeetingsGetMeetingArchiveTokenForLocalArchivingResponse getMeetingArchiveTokenForLocalArchiving(meetingId).execute();

Get a meeting&#39;s archive token for local archiving

Get a meeting&#39;s archive token to allow local archiving. The archive token allows a meeting SDK app or bot to get archive permission to access the meeting&#39;s raw audio and video media stream in real-time.   **Prerequisites:**  * A Pro or higher plan for the meeting host.  * The **Archive meetings and webinars** account setting enabled in the Zoom web portal.  **Scopes:** &#x60;meeting_token:read:admin:local_archiving&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsGetMeetingArchiveTokenForLocalArchivingResponse result = client
              .meetings
              .getMeetingArchiveTokenForLocalArchiving(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpireIn());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingArchiveTokenForLocalArchiving");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetMeetingArchiveTokenForLocalArchivingResponse> response = client
              .meetings
              .getMeetingArchiveTokenForLocalArchiving(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingArchiveTokenForLocalArchiving");
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

### Return type

[**MeetingsGetMeetingArchiveTokenForLocalArchivingResponse**](MeetingsGetMeetingArchiveTokenForLocalArchivingResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting local archiving token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access Webinar information.  **Error Code:** &#x60;124&#x60; &lt;br&gt; This API only supports OAuth2 authorization.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Not allowed to start local archiving. To use this feature, enable the \&quot;Archive meetings and webinars\&quot; setting in the \&quot;Settings\&quot; page of the Zoom web portal.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}   |  -  |

<a name="getMeetingSummary"></a>
# **getMeetingSummary**
> MeetingsGetMeetingSummaryResponse getMeetingSummary().meetingId(meetingId).execute();

Get a meeting summary

Displays information about a meeting summary.  **Prerequisites**: * Host user type must be Pro or higher plan. * The Meeting Summary with AI Companion feature enabled in the host&#39;s account. * E2ee meetings do not have summary feature enabled.  **Scopes:** &#x60;meeting_summary:read:admin&#x60;,&#x60;meeting_summary:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String meetingId = "aDYlohsHRtCd4ii1uC2+hA=="; // The meeting's universally unique ID (UUID). When you provide a meeting UUID that begins with a `/` character or contains the `//` characters, you **must** double-encode the meeting UUID before making an API request.
    try {
      MeetingsGetMeetingSummaryResponse result = client
              .meetings
              .getMeetingSummary()
              .meetingId(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeetingHostId());
      System.out.println(result.getMeetingHostEmail());
      System.out.println(result.getMeetingUuid());
      System.out.println(result.getMeetingId());
      System.out.println(result.getMeetingTopic());
      System.out.println(result.getMeetingStartTime());
      System.out.println(result.getMeetingEndTime());
      System.out.println(result.getSummaryStartTime());
      System.out.println(result.getSummaryEndTime());
      System.out.println(result.getSummaryCreatedTime());
      System.out.println(result.getSummaryLastModifiedTime());
      System.out.println(result.getSummaryTitle());
      System.out.println(result.getSummaryOverview());
      System.out.println(result.getSummaryDetails());
      System.out.println(result.getNextSteps());
      System.out.println(result.getEditedSummary());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetMeetingSummaryResponse> response = client
              .meetings
              .getMeetingSummary()
              .meetingId(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingSummary");
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
| **meetingId** | **String**| The meeting&#39;s universally unique ID (UUID). When you provide a meeting UUID that begins with a &#x60;/&#x60; character or contains the &#x60;//&#x60; characters, you **must** double-encode the meeting UUID before making an API request. | [optional] |

### Return type

[**MeetingsGetMeetingSummaryResponse**](MeetingsGetMeetingSummaryResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;Meeting Poll object returned. |  -  |

<a name="getMeetingSurvey"></a>
# **getMeetingSurvey**
> MeetingsGetMeetingSurveyResponse getMeetingSurvey(meetingId).execute();

Get a meeting survey

Display information about a [meeting survey](https://support.zoom.us/hc/en-us/articles/4404969060621-Post-meeting-survey-and-reporting).  **Prerequisites:** * The host has a **Pro** license. * The [**Meeting Survey**](https://support.zoom.us/hc/en-us/articles/4404939095053-Enabling-meeting-surveys) feature is enabled on the host&#39;s account. * The meeting must be a scheduled meeting. Instant meetings do not have survey features enabled.  **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long-format integer and **not** a simple integer. Meeting IDs can be more than 10 digits.
    try {
      MeetingsGetMeetingSurveyResponse result = client
              .meetings
              .getMeetingSurvey(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomSurvey());
      System.out.println(result.getShowInTheBrowser());
      System.out.println(result.getThirdPartySurvey());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetMeetingSurveyResponse> response = client
              .meetings
              .getMeetingSurvey(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingSurvey");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long-format integer and **not** a simple integer. Meeting IDs can be more than 10 digits. | |

### Return type

[**MeetingsGetMeetingSurveyResponse**](MeetingsGetMeetingSurveyResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       Meeting survey object returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid meeting ID. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access Webinar information. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Meeting survey disabled. To enable this feature, enable the \&quot;Meeting Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Meeting ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting does not exist: {meetingId}. &lt;br&gt;  |  -  |

<a name="getMeetingToken"></a>
# **getMeetingToken**
> MeetingsGetMeetingTokenResponse getMeetingToken(meetingId).type(type).execute();

Get meeting&#39;s token

Get a meeting&#39;s [closed caption token (caption URL)](https://support.zoom.us/hc/en-us/articles/115002212983-Using-a-third-party-closed-captioning-service). This token lets you use a third-party service to stream text to their closed captioning software to the Zoom meeting.   **Prerequisites:**  * The **Closed captioning** setting enabled in the Zoom web portal.  * The **Allow use of caption API Token to integrate with 3rd-party Closed Captioning services** setting enabled.  **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String type = "closed_caption_token"; // The meeting token type:  * `closed_caption_token` &mdash; The third-party closed caption API token.   This defaults to `closed_caption_token`.
    try {
      MeetingsGetMeetingTokenResponse result = client
              .meetings
              .getMeetingToken(meetingId)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetMeetingTokenResponse> response = client
              .meetings
              .getMeetingToken(meetingId)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getMeetingToken");
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
| **type** | **String**| The meeting token type:  * &#x60;closed_caption_token&#x60; &amp;mdash; The third-party closed caption API token.   This defaults to &#x60;closed_caption_token&#x60;. | [optional] [default to closed_caption_token] [enum: closed_caption_token] |

### Return type

[**MeetingsGetMeetingTokenResponse**](MeetingsGetMeetingTokenResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting token returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; * Cannot access Webinar information. &lt;br&gt; * Meeting survey disabled. To enable this feature, enable the \&quot;Meeting Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}   |  -  |

<a name="getPastMeetingParticipants"></a>
# **getPastMeetingParticipants**
> MeetingsGetPastMeetingParticipantsResponse getPastMeetingParticipants(meetingId).pageSize(pageSize).nextPageToken(nextPageToken).execute();

Get past meeting participants

Retrieve information on participants from a past meeting. Note the API doesn&#39;t return results if there&#39;s only one participant in a meeting.          **Prerequisites:**     * Paid account on a Pro or higher plan.             **Note**: Please double encode your UUID when using this API if the UUID begins with a &#39;/&#39;or contains &#39;//&#39; in it.   **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsGetPastMeetingParticipantsResponse result = client
              .meetings
              .getPastMeetingParticipants(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getParticipants());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getPastMeetingParticipants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetPastMeetingParticipantsResponse> response = client
              .meetings
              .getPastMeetingParticipants(meetingId)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getPastMeetingParticipants");
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

### Return type

[**MeetingsGetPastMeetingParticipantsResponse**](MeetingsGetPastMeetingParticipantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting participants&#39; report returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User {userId} not exist or not belong to this account.&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Cannot access meeting information.&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;200&#x60; &lt;br&gt;  Only available for paid account: {accountId} &lt;br&gt; **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access a meeting a year ago. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} not exist or not belong to this account.&lt;br&gt; User not exist: {userId}&lt;br&gt;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  This meeting is not available or ID is not valid.&lt;br&gt; Meeting ID is invalid or not end. &lt;br&gt;  |  -  |

<a name="getPoll"></a>
# **getPoll**
> MeetingsGetPollResponse getPoll(meetingId, pollId).execute();

Get a meeting poll

Polls allow the meeting host to survey attendees. Retrieve information about a specific meeting [poll](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings).            **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    try {
      MeetingsGetPollResponse result = client
              .meetings
              .getPoll(meetingId, pollId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getAnonymous());
      System.out.println(result.getPollType());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getPoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetPollResponse> response = client
              .meetings
              .getPoll(meetingId, pollId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getPoll");
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
| **pollId** | **String**| The poll ID | |

### Return type

[**MeetingsGetPollResponse**](MeetingsGetPollResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting Poll object returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;4400&#x60; &lt;br&gt; Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;404&#x60; &lt;br&gt; Meeting Poll not found.   |  -  |

<a name="getRegistrantDetails"></a>
# **getRegistrantDetails**
> MeetingsGetRegistrantDetailsResponse getRegistrantDetails(meetingId, registrantId).execute();

Get a meeting registrant

Retrieve details on a specific user who has registered for the meeting. A host or a user with administrative permissions can require [registration for Zoom meetings](https://support.zoom.us/hc/en-us/articles/211579443-Registration-for-Meetings).  **Prerequisites:**  * The account must have a Meeting plan  **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String registrantId = "9tboDiHUQAeOnbmudzWa5g"; // The registrant ID.
    try {
      MeetingsGetRegistrantDetailsResponse result = client
              .meetings
              .getRegistrantDetails(meetingId, registrantId)
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
      System.out.println(result.getCreateTime());
      System.out.println(result.getJoinUrl());
      System.out.println(result.getParticipantPinCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getRegistrantDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetRegistrantDetailsResponse> response = client
              .meetings
              .getRegistrantDetails(meetingId, registrantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getRegistrantDetails");
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
| **registrantId** | **String**| The registrant ID. | |

### Return type

[**MeetingsGetRegistrantDetailsResponse**](MeetingsGetRegistrantDetailsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: \&quot;{accountId}\&quot;&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3003&#x60; &lt;br&gt;  You are not the meeting host.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  &gt; Cannot access meeting info. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  Meeting host does not exist: \&quot;{userId}\&quot; &lt;br&gt;  |  -  |

<a name="getSipUriWithPasscode"></a>
# **getSipUriWithPasscode**
> MeetingsGetSipUriWithPasscodeResponse getSipUriWithPasscode(meetingId).meetingsGetSipUriWithPasscodeRequest(meetingsGetSipUriWithPasscodeRequest).execute();

Get a meeting SIP URI with Passcode

Get a meeting&#39;s SIP URI.  The URI consists of the meeting ID, (optional, user-supplied) passcode and participant identifier code.  The API return data also includes additional fields to indicate whether the API caller has a valid Cloud Room Connector subscription, the participant identifier code from the URI, and the SIP URI validity period (in seconds).     **Scopes:** &#x60;meeting:write:sip_dialing&#x60;,&#x60;meeting:write:admin:sip_dialing&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String passcode = "passcode_example"; // If customers desire that a passcode be embedded in the SIP URI dial string, they must supply the passcode. Zoom will not validate the passcode.
    try {
      MeetingsGetSipUriWithPasscodeResponse result = client
              .meetings
              .getSipUriWithPasscode(meetingId)
              .passcode(passcode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSipDialing());
      System.out.println(result.getPaidCrcPlanParticipant());
      System.out.println(result.getParticipantIdentifierCode());
      System.out.println(result.getExpireIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getSipUriWithPasscode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsGetSipUriWithPasscodeResponse> response = client
              .meetings
              .getSipUriWithPasscode(meetingId)
              .passcode(passcode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#getSipUriWithPasscode");
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
| **meetingsGetSipUriWithPasscodeRequest** | [**MeetingsGetSipUriWithPasscodeRequest**](MeetingsGetSipUriWithPasscodeRequest.md)|  | [optional] |

### Return type

[**MeetingsGetSipUriWithPasscodeResponse**](MeetingsGetSipUriWithPasscodeResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;      Meeting&#39;s encoded SIP URI returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid meeting ID.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; The meeting&#39;s SIP URI does not exist: {meetingId}.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;300&#x60; &lt;br&gt; Meeting ID does not exist.  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting does not exist: {meetingId}   |  -  |

<a name="listHostScheduled"></a>
# **listHostScheduled**
> MeetingsListHostScheduledResponse listHostScheduled(userId).type(type).pageSize(pageSize).nextPageToken(nextPageToken).pageNumber(pageNumber).from(from).to(to).timezone(timezone).execute();

List meetings

List a meeting host user&#39;s scheduled meetings. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.   **Note**  * This API **only** supports scheduled meetings. This API does not return information about instant meetings.  * This API only returns a user&#39;s [unexpired meetings](https://support.zoom.us/hc/en-us/articles/201362373-Meeting-ID#h_c73f9b08-c1c0-4a1a-b538-e01ebb98e844).      **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String type = "scheduled"; // The type of meeting.  * `scheduled` - All valid previous (unexpired) meetings, live meetings, and upcoming scheduled meetings.  * `live` - All the ongoing meetings.  * `upcoming` - All upcoming meetings, including live meetings.  * `upcoming_meetings` - All upcoming meetings, including live meetings.  * `previous_meetings` - All the previous meetings.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    Integer pageNumber = 1; // The page number of the current page in the returned records.
    LocalDate from = LocalDate.parse("Sat Dec 31 16:00:00 PST 2022"); // The start date.
    LocalDate to = LocalDate.parse("Sun Jan 15 16:00:00 PST 2023"); // The end date.
    String timezone = "America/Los_Angeles"; // The timezone to assign to the `from` and `to` value. For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
    try {
      MeetingsListHostScheduledResponse result = client
              .meetings
              .listHostScheduled(userId)
              .type(type)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .pageNumber(pageNumber)
              .from(from)
              .to(to)
              .timezone(timezone)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getTotalRecords());
      System.out.println(result.getMeetings());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listHostScheduled");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListHostScheduledResponse> response = client
              .meetings
              .listHostScheduled(userId)
              .type(type)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .pageNumber(pageNumber)
              .from(from)
              .to(to)
              .timezone(timezone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listHostScheduled");
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
| **type** | **String**| The type of meeting.  * &#x60;scheduled&#x60; - All valid previous (unexpired) meetings, live meetings, and upcoming scheduled meetings.  * &#x60;live&#x60; - All the ongoing meetings.  * &#x60;upcoming&#x60; - All upcoming meetings, including live meetings.  * &#x60;upcoming_meetings&#x60; - All upcoming meetings, including live meetings.  * &#x60;previous_meetings&#x60; - All the previous meetings. | [optional] [default to scheduled] [enum: scheduled, live, upcoming, upcoming_meetings, previous_meetings] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |
| **pageNumber** | **Integer**| The page number of the current page in the returned records. | [optional] |
| **from** | **LocalDate**| The start date. | [optional] |
| **to** | **LocalDate**| The end date. | [optional] |
| **timezone** | **String**| The timezone to assign to the &#x60;from&#x60; and &#x60;to&#x60; value. For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones). | [optional] |

### Return type

[**MeetingsListHostScheduledResponse**](MeetingsListHostScheduledResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of meeting objects returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} not exist or not belong to this account.&lt;br&gt; &lt;br&gt;  |  -  |

<a name="listMeetingPolls"></a>
# **listMeetingPolls**
> MeetingsListMeetingPollsResponse listMeetingPolls(meetingId).anonymous(anonymous).execute();

List meeting polls

Polls allow the meeting host to survey attendees. List all [polls](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings) of a meeting.           **Prerequisites**:     * Host user type must be **Pro** or higher plan. * Meeting must be a scheduled meeting. Instant meetings do not have polling features enabled.  **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Boolean anonymous = true; // Whether to query for polls with the **Anonymous** option enabled:  * `true` &mdash; Query for polls with the **Anonymous** option enabled.  * `false` &mdash; Do not query for polls with the **Anonymous** option enabled.
    try {
      MeetingsListMeetingPollsResponse result = client
              .meetings
              .listMeetingPolls(meetingId)
              .anonymous(anonymous)
              .execute();
      System.out.println(result);
      System.out.println(result.getPolls());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingPolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListMeetingPollsResponse> response = client
              .meetings
              .listMeetingPolls(meetingId)
              .anonymous(anonymous)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingPolls");
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
| **anonymous** | **Boolean**| Whether to query for polls with the **Anonymous** option enabled:  * &#x60;true&#x60; &amp;mdash; Query for polls with the **Anonymous** option enabled.  * &#x60;false&#x60; &amp;mdash; Do not query for polls with the **Anonymous** option enabled. | [optional] |

### Return type

[**MeetingsListMeetingPollsResponse**](MeetingsListMeetingPollsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:**      List polls of a Meeting  returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;4400&#x60; &lt;br&gt; Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;404&#x60; &lt;br&gt; Meeting Poll not found   |  -  |

<a name="listMeetingSummaries"></a>
# **listMeetingSummaries**
> MeetingsListMeetingSummariesResponse listMeetingSummaries().pageSize(pageSize).nextPageToken(nextPageToken).from(from).to(to).execute();

List meeting summaries of an account

Generates a list of all meeting summaries for an account.  **Prerequisites** * Host user type must be Pro or higher plan. * The Meeting Summary with AI Companion feature enabled in the host&#39;s account. * E2ee meetings do not have summary feature enabled.  **Scopes:** &#x60;meeting_summary:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
    OffsetDateTime from = OffsetDateTime.parse("2023-10-19T07:00Z"); // The start date in `yyyy-MM-dd'T'HH:mm:ss'Z'` UTC format used to retrieve the creation date range of the meeting summaries.
    OffsetDateTime to = OffsetDateTime.parse("2023-10-20T07:00Z"); // The end date in `yyyy-MM-dd'T'HH:mm:ss'Z'` UTC format used to retrieve the creation date range of the meeting summaries.
    try {
      MeetingsListMeetingSummariesResponse result = client
              .meetings
              .listMeetingSummaries()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getPageSize());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getFrom());
      System.out.println(result.getTo());
      System.out.println(result.getSummaries());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingSummaries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListMeetingSummariesResponse> response = client
              .meetings
              .listMeetingSummaries()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingSummaries");
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
| **nextPageToken** | **String**| The next page token paginates through a large set of results. A next page token returns whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. | [optional] |
| **from** | **OffsetDateTime**| The start date in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;&#x60; UTC format used to retrieve the creation date range of the meeting summaries. | [optional] |
| **to** | **OffsetDateTime**| The end date in &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;&#x60; UTC format used to retrieve the creation date range of the meeting summaries. | [optional] |

### Return type

[**MeetingsListMeetingSummariesResponse**](MeetingsListMeetingSummariesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;  Successfully listed meeting summaries of an account. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Meeting summary disabled. To enable this feature, enable the \&quot;Meeting Summary with AI Companion\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt;  |  -  |
| **401** | **HTTP Status Code:** &#x60;401&#x60; &lt;br&gt;  Unauthorized    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User {userId} not exist or not belong to this account. &lt;br&gt;  |  -  |

<a name="listMeetingTemplates"></a>
# **listMeetingTemplates**
> MeetingsListMeetingTemplatesResponse listMeetingTemplates(userId).execute();

List meeting templates

List available [meeting templates](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates) for a user. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.    **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsListMeetingTemplatesResponse result = client
              .meetings
              .listMeetingTemplates(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTemplates());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListMeetingTemplatesResponse> response = client
              .meetings
              .listMeetingTemplates(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listMeetingTemplates");
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

### Return type

[**MeetingsListMeetingTemplatesResponse**](MeetingsListMeetingTemplatesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**      |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User not exist: {userId}.&lt;br&gt; User {userId} does not exist or does not belong to this account. &lt;br&gt;  |  -  |

<a name="listPastMeetingInstances"></a>
# **listPastMeetingInstances**
> MeetingsListPastMeetingInstancesResponse listPastMeetingInstances(meetingId).execute();

List past meeting instances

Return a list of past meeting instances.      **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 93398114182L; // The past meeting's ID.
    try {
      MeetingsListPastMeetingInstancesResponse result = client
              .meetings
              .listPastMeetingInstances(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeetings());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingInstances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListPastMeetingInstancesResponse> response = client
              .meetings
              .listPastMeetingInstances(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingInstances");
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
| **meetingId** | **Long**| The past meeting&#39;s ID. | |

### Return type

[**MeetingsListPastMeetingInstancesResponse**](MeetingsListPastMeetingInstancesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       List of ended meeting instances returned. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="listPastMeetingPolls"></a>
# **listPastMeetingPolls**
> MeetingsListPastMeetingPollsResponse listPastMeetingPolls(meetingId).execute();

List past meeting&#39;s poll results

[Polls](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings) allow the meeting host to survey attendees. List poll results of a meeting.           **Prerequisites**:     * Host user type must be **Pro**. * Meeting must be a scheduled meeting. Instant meetings do not have polling features enabled.  **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
      MeetingsListPastMeetingPollsResponse result = client
              .meetings
              .listPastMeetingPolls(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingPolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListPastMeetingPollsResponse> response = client
              .meetings
              .listPastMeetingPolls(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingPolls");
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

[**MeetingsListPastMeetingPollsResponse**](MeetingsListPastMeetingPollsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Polls returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;12702&#x60; &lt;br&gt;  Can not access a meeting a year ago. &lt;br&gt;  |  -  |

<a name="listPastMeetingQA"></a>
# **listPastMeetingQA**
> MeetingsListPastMeetingQaResponse listPastMeetingQA(meetingId).execute();

List past meetings&#39; Q&amp;A

The question &amp;amp; answer (Q&amp;amp;A) feature for Zoom Meetings lets attendees ask questions during a meeting and lets the other attendees answer those questions.     List Q&amp;amp;A of a specific meeting.  **Prerequisites:**     *   **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
      MeetingsListPastMeetingQaResponse result = client
              .meetings
              .listPastMeetingQA(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getQuestions());
      System.out.println(result.getStartTime());
      System.out.println(result.getUuid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingQA");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListPastMeetingQaResponse> response = client
              .meetings
              .listPastMeetingQA(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listPastMeetingQA");
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

[**MeetingsListPastMeetingQaResponse**](MeetingsListPastMeetingQaResponse.md)

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
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting ID is invalid or not end.&lt;br&gt; This Meeting id does not belong to you:{meetingId}. &lt;br&gt;  |  -  |

<a name="listRegistrants"></a>
# **listRegistrants**
> MeetingsListRegistrantsResponse listRegistrants(meetingId).occurrenceId(occurrenceId).status(status).pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).execute();

List meeting registrants

A host or a user with admin permission can require [registration for a Zoom meeting](https://support.zoom.us/hc/en-us/articles/211579443-Registration-for-Meetings). List users that have registered for a meeting.            **Scopes:** &#x60;meeting:read:admin&#x60;,&#x60;meeting:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    String status = "pending"; // Query by the registrant's status.  * `pending` - The registration is pending.  * `approved` - The registrant is approved.  * `denied` - The registration is denied.
    Integer pageSize = 30; // The number of records returned within a single API call.
    Integer pageNumber = 1; // **Deprecated.** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      MeetingsListRegistrantsResponse result = client
              .meetings
              .listRegistrants(meetingId)
              .occurrenceId(occurrenceId)
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
      System.err.println("Exception when calling MeetingsApi#listRegistrants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListRegistrantsResponse> response = client
              .meetings
              .listRegistrants(meetingId)
              .occurrenceId(occurrenceId)
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
      System.err.println("Exception when calling MeetingsApi#listRegistrants");
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
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **status** | **String**| Query by the registrant&#39;s status.  * &#x60;pending&#x60; - The registration is pending.  * &#x60;approved&#x60; - The registrant is approved.  * &#x60;denied&#x60; - The registration is denied. | [optional] [default to approved] [enum: pending, approved, denied] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **pageNumber** | **Integer**| **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**MeetingsListRegistrantsResponse**](MeetingsListRegistrantsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Successfully listed meeting registrants. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;1010&#x60; &lt;br&gt;  User does not belong to this account: {accountId}.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3003&#x60; &lt;br&gt;  You are not the meeting host.&lt;br&gt; &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access meeting info. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  Meeting host does not exist: {userId}. &lt;br&gt;  |  -  |

<a name="listRegistrationQuestions"></a>
# **listRegistrationQuestions**
> MeetingsListRegistrationQuestionsResponse listRegistrationQuestions(meetingId).execute();

List registration questions 

List registration questions that will be displayed to users while [registering for a meeting](https://support.zoom.us/hc/en-us/articles/211579443-Registration-for-Meetings).        **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    try {
      MeetingsListRegistrationQuestionsResponse result = client
              .meetings
              .listRegistrationQuestions(meetingId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomQuestions());
      System.out.println(result.getQuestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListRegistrationQuestionsResponse> response = client
              .meetings
              .listRegistrationQuestions(meetingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listRegistrationQuestions");
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

### Return type

[**MeetingsListRegistrationQuestionsResponse**](MeetingsListRegistrationQuestionsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Meeting Registrant Question object returned |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="listUpcomingMeetings"></a>
# **listUpcomingMeetings**
> MeetingsListUpcomingMeetingsResponse listUpcomingMeetings(userId).execute();

List upcoming meetings

List a Zoom user&#39;s upcoming meetings. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.  **Note** * This API includes the meetings that Zoom users schedule and the meetings they are invited to join. * This API **only** includes upcoming meetings within the next 24 hours.  **Scopes:** &#x60;meeting:read&#x60;,&#x60;meeting:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String userId = "30R7kT7bTIKSNUFEuH_Qlg"; // The user's user ID or email address. For user-level apps, pass [the `me` value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword).
    try {
      MeetingsListUpcomingMeetingsResponse result = client
              .meetings
              .listUpcomingMeetings(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalRecords());
      System.out.println(result.getMeetings());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listUpcomingMeetings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MeetingsListUpcomingMeetingsResponse> response = client
              .meetings
              .listUpcomingMeetings(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#listUpcomingMeetings");
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
| **userId** | **String**| The user&#39;s user ID or email address. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword). | |

### Return type

[**MeetingsListUpcomingMeetingsResponse**](MeetingsListUpcomingMeetingsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; List of upcoming meeting objects returned. |  -  |

<a name="livestreamStatusUpdate"></a>
# **livestreamStatusUpdate**
> livestreamStatusUpdate(meetingId).meetingsLivestreamStatusUpdateRequest(meetingsLivestreamStatusUpdateRequest).execute();

Update Live Stream Status

Zoom allows users to [livestream a meeting](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service) to a custom platform. Update the status of a meeting&#39;s livestream.          **Prerequisites:**     * Meeting host must have a Pro license.       **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String action = "start"; // Update the status of a live stream.  The value can be one of the following:     `start`: Start a live stream.      `stop`: Stop an ongoing live stream.
    MeetingsLivestreamStatusUpdateRequestSettings settings = new MeetingsLivestreamStatusUpdateRequestSettings();
    try {
      client
              .meetings
              .livestreamStatusUpdate(meetingId)
              .action(action)
              .settings(settings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#livestreamStatusUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .livestreamStatusUpdate(meetingId)
              .action(action)
              .settings(settings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#livestreamStatusUpdate");
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
| **meetingsLivestreamStatusUpdateRequest** | [**MeetingsLivestreamStatusUpdateRequest**](MeetingsLivestreamStatusUpdateRequest.md)| Meeting | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting livestream updated.   |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access webinar info.&lt;br&gt;  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist.&lt;br&gt;   |  -  |

<a name="pollDelete"></a>
# **pollDelete**
> pollDelete(meetingId, pollId).execute();

Delete a meeting poll

Polls allow the meeting host to survey attendees. Delete a meeting [poll](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings).     **Prerequisites**:     * Host user type must be **Pro**. * Polling feature should be enabled in the host&#39;s account. * Meeting must be a scheduled meeting. Instant meetings do not have polling features enabled.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    try {
      client
              .meetings
              .pollDelete(meetingId, pollId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#pollDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .pollDelete(meetingId, pollId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#pollDelete");
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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting Poll deleted |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;4400&#x60; &lt;br&gt; Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;404&#x60; &lt;br&gt; Meeting Poll not found   |  -  |

<a name="removeMeeting"></a>
# **removeMeeting**
> removeMeeting(meetingId).occurrenceId(occurrenceId).scheduleForReminder(scheduleForReminder).cancelMeetingReminder(cancelMeetingReminder).execute();

Delete a meeting

Delete a meeting.            **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    Boolean scheduleForReminder = true; // `true`: Notify host and alternative host about the meeting cancellation via email. `false`: Do not send any email notification.
    Boolean cancelMeetingReminder = true; // `true`: Notify registrants about the meeting cancellation via email.   `false`: Do not send any email notification to meeting registrants.   The default value of this field is `false`.
    try {
      client
              .meetings
              .removeMeeting(meetingId)
              .occurrenceId(occurrenceId)
              .scheduleForReminder(scheduleForReminder)
              .cancelMeetingReminder(cancelMeetingReminder)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#removeMeeting");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .removeMeeting(meetingId)
              .occurrenceId(occurrenceId)
              .scheduleForReminder(scheduleForReminder)
              .cancelMeetingReminder(cancelMeetingReminder)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#removeMeeting");
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
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **scheduleForReminder** | **Boolean**| &#x60;true&#x60;: Notify host and alternative host about the meeting cancellation via email. &#x60;false&#x60;: Do not send any email notification. | [optional] |
| **cancelMeetingReminder** | **Boolean**| &#x60;true&#x60;: Notify registrants about the meeting cancellation via email.   &#x60;false&#x60;: Do not send any email notification to meeting registrants.   The default value of this field is &#x60;false&#x60;. | [optional] |

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
| **204** | **HTTP Status Code**: &#x60;204&#x60;      Meeting deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.&lt;br&gt;  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access meeting information.&lt;br&gt;Invalid occurrence_id.&lt;br&gt;  **Error Code:** &#x60;3002&#x60; &lt;br&gt; Sorry, you cannot delete this meeting since it is in progress.&lt;br&gt;  **Error Code:** &#x60;3003&#x60; &lt;br&gt; You are not the meeting host.&lt;br&gt;  **Error Code:** &#x60;3007&#x60; &lt;br&gt; Sorry, you cannot delete this meeting since it has ended.&lt;br&gt;  **Error Code:** &#x60;3018&#x60; &lt;br&gt; Not allowed to delete PMI.&lt;br&gt;  **Error Code:** &#x60;3037&#x60; &lt;br&gt; Not allowed to delete PAC.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: {userId}.&lt;br&gt;  **Error Code:** &#x60;3001&#x60; &lt;br&gt; Meeting with this {meetingId} is not found or has expired.   |  -  |

<a name="updateDetails"></a>
# **updateDetails**
> updateDetails(meetingId).occurrenceId(occurrenceId).meetingsUpdateDetailsRequest(meetingsUpdateDetailsRequest).execute();

Update a meeting

Update meeting details.  **Note**  * The &#x60;start_time&#x60; value **must** be a future date. If the value is omitted or a date is in the past, the API ignores this value and does **not** update any recurring meetings.  * The &#x60;recurrence&#x60; object is **required**. * This API has a rate limit of **100 requests per day**. You can update a meeting for a maximum of **100 times within a 24-hour period**.      **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Meeting IDs can be greater than 10 digits.
    String agenda = "agenda_example"; // Meeting description.
    Integer duration = 56; // Meeting duration in minutes. Used for scheduled meetings only.
    String password = "password_example"; // Meeting passcode. Passcodes may only contain these characters [a-z A-Z 0-9 @ - _ *] and can have a maximum of 10 characters.  **Note** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, view those requirements by calling either the [**Get user settings**](https://developers.zoom.us) API or the [**Get account settings**](https://developers.zoom.us) API.
    Boolean preSchedule = false; // Whether to create a prescheduled meeting through the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This **only** supports the meeting `type` value of `2` - scheduled meetings- and `3` - recurring meetings with no fixed time.  * `true` - Create a prescheduled meeting.  * `false` - Create a regular meeting.
    String scheduleFor = "scheduleFor_example"; // The email address or `userId` of the user to schedule a meeting for.
    MeetingsUpdateDetailsRequestRecurrence recurrence = new MeetingsUpdateDetailsRequestRecurrence();
    MeetingsUpdateDetailsRequestSettings settings = new MeetingsUpdateDetailsRequestSettings();
    OffsetDateTime startTime = OffsetDateTime.now(); // Meeting start time. When using a format like `yyyy-MM-dd'T'HH:mm:ss'Z'`, always use GMT time. When using a format like `yyyy-MM-dd'T'HH:mm:ss`, use local time and specify the time zone. Only used for scheduled meetings and recurring meetings with a fixed time.
    String templateId = "templateId_example"; // Unique identifier of the meeting template.   [Schedule the meeting from a meeting template](https://support.zoom.us/hc/en-us/articles/360036559151-Meeting-templates#h_86f06cff-0852-4998-81c5-c83663c176fb). Retrieve this field's value by calling the [List meeting templates](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods/#operation/listMeetingTemplates) API.
    String timezone = "timezone_example"; // The timezone to assign to the `start_time` value. Only use this field ifor scheduled or recurring meetings with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
    String topic = "topic_example"; // Meeting topic.
    List<MeetingsUpdateDetailsRequestTrackingFieldsInner> trackingFields = Arrays.asList(); // Tracking fields.
    Integer type = 1; // Meeting types.  `1` - Instant meeting.    `2` - Scheduled meeting.    `3` - Recurring meeting with no fixed time.    `8` - Recurring meeting with a fixed time.
    String occurrenceId = "1648194360000"; // Meeting occurrence ID. Support change of agenda, `start_time`, duration, or settings {`host_video`, `participant_video`, `join_before_host`, `mute_upon_entry`, `waiting_room`, `watermark`, `auto_recording`}.
    try {
      client
              .meetings
              .updateDetails(meetingId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .preSchedule(preSchedule)
              .scheduleFor(scheduleFor)
              .recurrence(recurrence)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateDetails(meetingId)
              .agenda(agenda)
              .duration(duration)
              .password(password)
              .preSchedule(preSchedule)
              .scheduleFor(scheduleFor)
              .recurrence(recurrence)
              .settings(settings)
              .startTime(startTime)
              .templateId(templateId)
              .timezone(timezone)
              .topic(topic)
              .trackingFields(trackingFields)
              .type(type)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateDetails");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long format integer and **not** an integer. Meeting IDs can be greater than 10 digits. | |
| **occurrenceId** | **String**| Meeting occurrence ID. Support change of agenda, &#x60;start_time&#x60;, duration, or settings {&#x60;host_video&#x60;, &#x60;participant_video&#x60;, &#x60;join_before_host&#x60;, &#x60;mute_upon_entry&#x60;, &#x60;waiting_room&#x60;, &#x60;watermark&#x60;, &#x60;auto_recording&#x60;}. | [optional] |
| **meetingsUpdateDetailsRequest** | [**MeetingsUpdateDetailsRequest**](MeetingsUpdateDetailsRequest.md)| Meeting | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Meeting updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Your user account is not allowed meeting hosting and scheduling capabilities. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  The value that you entered in the &#x60;schedule_for&#x60; field is invalid. Enter a valid value and try again. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid &#x60;enforce_login_domains&#x60;. Separate multiple domains with semicolons. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access webinar info. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Instant meetings do not support the &#x60;schedule_for&#x60; parameter, and you can&#39;t schedule an instant meeting for another user. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Users in &#39;{userId}&#39; have been blocked from joining meetings and webinars. To unblock them, go to the **Settings** page in the Zoom web portal and update **Block users in specific domains from joining meetings and webinars**. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  You cannot schedule a meeting for {userId} &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Prescheduling is only available for scheduled meetings (type 2) and recurring meetings with no fixed time (type 3). &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Unable to schedule for a user outside of your account for a meeting with continuous chat. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting does not exist: {meetingId}. &lt;br&gt;  |  -  |
| **429** | **HTTP Status Code:** &#x60;429&#x60; &lt;br&gt;  Too Many Requests      |  -  |

<a name="updateLivestream"></a>
# **updateLivestream**
> updateLivestream(meetingId).meetingsUpdateLivestreamRequest(meetingsUpdateLivestreamRequest).execute();

Update a livestream

Update a meeting&#39;s livestream information. Zoom allows users to [livestream a meeting](https://support.zoom.us/hc/en-us/articles/115001777826-Live-Streaming-Meetings-or-Webinars-Using-a-Custom-Service) to a custom platform.  **Prerequisites:**  * Meeting host must have a Pro license.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    URI pageUrl = new URI(); // The live stream page URL.
    String streamKey = "streamKey_example"; // Stream name and key.
    String streamUrl = "streamUrl_example"; // Streaming URL.
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String resolution = "resolution_example"; // The number of pixels in each dimension that the video camera can display, required when a user enables 1080p. Use a value of `720p` or `1080p`
    try {
      client
              .meetings
              .updateLivestream(pageUrl, streamKey, streamUrl, meetingId)
              .resolution(resolution)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateLivestream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateLivestream(pageUrl, streamKey, streamUrl, meetingId)
              .resolution(resolution)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateLivestream");
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
| **meetingsUpdateLivestreamRequest** | [**MeetingsUpdateLivestreamRequest**](MeetingsUpdateLivestreamRequest.md)| Meeting | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Meeting livestream updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.&lt;br&gt;  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access webinar info.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} does not exist.   |  -  |

<a name="updateMeetingPoll"></a>
# **updateMeetingPoll**
> updateMeetingPoll(meetingId, pollId).meetingsUpdateMeetingPollRequest(meetingsUpdateMeetingPollRequest).execute();

Update a meeting poll

Polls allow the meeting host to survey attendees. Update information of a specific meeting [poll](https://support.zoom.us/hc/en-us/articles/213756303-Polling-for-Meetings)            **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String pollId = "QalIoKWLTJehBJ8e1xRrbQ"; // The poll ID
    String title = "title_example"; // The poll's title, up to 64 characters.
    Boolean anonymous = false; // Allow meeting participants to answer poll questions anonymously.   This value defaults to `false`.
    Integer pollType = 1; // The type of poll:  * `1` &mdash; Poll.  * `2` &mdash; Advanced Poll. This feature must be enabled in your Zoom account.  * `3` &mdash; Quiz. This feature must be enabled in your Zoom account.    This value defaults to `1`.
    List<MeetingsUpdateMeetingPollRequestQuestionsInner> questions = Arrays.asList(); // Information about the poll's questions.
    try {
      client
              .meetings
              .updateMeetingPoll(meetingId, pollId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMeetingPoll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateMeetingPoll(meetingId, pollId)
              .title(title)
              .anonymous(anonymous)
              .pollType(pollType)
              .questions(questions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMeetingPoll");
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
| **pollId** | **String**| The poll ID | |
| **meetingsUpdateMeetingPollRequest** | [**MeetingsUpdateMeetingPollRequest**](MeetingsUpdateMeetingPollRequest.md)| Meeting Poll | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;      Meeting Poll Updated |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;4400&#x60; &lt;br&gt; * Meeting polls disabled. To enable this feature, enable the \&quot;Meeting Polls/Quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  * Advanced meeting polls disabled. To enable this feature, enable the \&quot;Allow host to create advanced polls and quizzes\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;404&#x60; &lt;br&gt; Meeting Poll not found   |  -  |

<a name="updateMeetingStatus"></a>
# **updateMeetingStatus**
> updateMeetingStatus(meetingId).meetingsUpdateMeetingStatusRequest(meetingsUpdateMeetingStatusRequest).execute();

Update meeting status

Update the status of a meeting.            **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String action = "end"; // `end` - End a meeting.     `recover` - [Recover](https://support.zoom.us/hc/en-us/articles/360038297111-Recover-a-deleted-meeting) a deleted meeting. 
    try {
      client
              .meetings
              .updateMeetingStatus(meetingId)
              .action(action)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMeetingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateMeetingStatus(meetingId)
              .action(action)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMeetingStatus");
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
| **meetingsUpdateMeetingStatusRequest** | [**MeetingsUpdateMeetingStatusRequest**](MeetingsUpdateMeetingStatusRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Meeting updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access meeting info.  **Error Code:** &#x60;3003&#x60; &lt;br&gt; You&#39;re not the meeting host.  **Error Code:** &#x60;3063&#x60; &lt;br&gt; Can not end on-premise user&#39;s meeting: {meetingId}.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; Meeting host does not exist: {userId}.   |  -  |

<a name="updateMessage"></a>
# **updateMessage**
> updateMessage(meetingId, messageId).meetingsUpdateMessageRequest(meetingsUpdateMessageRequest).execute();

Update a live meeting message

Update a message in a live meeting, based on ID. **Prerequisites:** * Have Zoom enable the DLP for the in-meeting chat feature to use this API.  **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String messageContent = "messageContent_example"; // The content of the chat message.
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long-format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    String messageId = "MS17MDQ5NjE4QjYtRjk4Ny00REEwLUFBQUItMTg3QTY0RjU2MzhFfQ=="; // The live meeting chat message's unique identifier (UUID), in base64-encoded format.
    try {
      client
              .meetings
              .updateMessage(messageContent, meetingId, messageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateMessage(messageContent, meetingId, messageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateMessage");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long-format integer and **not** an integer. Meeting IDs can exceed 10 digits. | |
| **messageId** | **String**| The live meeting chat message&#39;s unique identifier (UUID), in base64-encoded format. | |
| **meetingsUpdateMessageRequest** | [**MeetingsUpdateMessageRequest**](MeetingsUpdateMessageRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; &lt;br&gt;  Meeting chat message updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  DLP is not enabled on this account &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting {meetingId} does not exist. &lt;br&gt;  |  -  |

<a name="updateRegistrantStatus"></a>
# **updateRegistrantStatus**
> updateRegistrantStatus(meetingId).occurrenceId(occurrenceId).meetingsUpdateRegistrantStatusRequest(meetingsUpdateRegistrantStatusRequest).execute();

Update registrant&#39;s status

Update a meeting registrant&#39;s status by either approving, cancelling or denying a registrant from joining the meeting.            **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    String action = "approve"; // Registrant Status:    `approve` - Approve registrant.    `cancel` - Cancel previously approved registrant's registration.    `deny` - Deny registrant.
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, you must store it as a long format integer and **not** an integer. Meeting IDs can exceed 10 digits.
    List<MeetingsUpdateRegistrantStatusRequestRegistrantsInner> registrants = Arrays.asList(); // List of registrants.
    String occurrenceId = "1648194360000"; // The meeting or webinar occurrence ID.
    try {
      client
              .meetings
              .updateRegistrantStatus(action, meetingId)
              .registrants(registrants)
              .occurrenceId(occurrenceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateRegistrantStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateRegistrantStatus(action, meetingId)
              .registrants(registrants)
              .occurrenceId(occurrenceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateRegistrantStatus");
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
| **occurrenceId** | **String**| The meeting or webinar occurrence ID. | [optional] |
| **meetingsUpdateRegistrantStatusRequest** | [**MeetingsUpdateRegistrantStatusRequest**](MeetingsUpdateRegistrantStatusRequest.md)|  | [optional] |

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
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;1010&#x60; &lt;br&gt; User does not belong to this account: {accountId}.&lt;br&gt;  **Error Code:** &#x60;3000&#x60; &lt;br&gt; Cannot access meeting information.&lt;br&gt;  **Error Code:** &#x60;3003&#x60; &lt;br&gt; You&#39;re not the meeting host.  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: {userId}.&lt;br&gt;   |  -  |

<a name="updateRegistrationQuestions"></a>
# **updateRegistrationQuestions**
> updateRegistrationQuestions(meetingId).meetingsUpdateRegistrationQuestionsRequest(meetingsUpdateRegistrationQuestionsRequest).execute();

Update registration questions

Update registration questions that will be displayed to users while [registering for a meeting](https://support.zoom.us/hc/en-us/articles/211579443-Registration-for-Meetings).            **Scopes:** &#x60;meeting:write&#x60;,&#x60;meeting:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    List<MeetingsUpdateRegistrationQuestionsRequestCustomQuestionsInner> customQuestions = Arrays.asList(); // Array of Registrant Custom Questions
    List<MeetingsUpdateRegistrationQuestionsRequestQuestionsInner> questions = Arrays.asList(); // Array of Registrant Questions
    try {
      client
              .meetings
              .updateRegistrationQuestions(meetingId)
              .customQuestions(customQuestions)
              .questions(questions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateRegistrationQuestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateRegistrationQuestions(meetingId)
              .customQuestions(customQuestions)
              .questions(questions)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateRegistrationQuestions");
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
| **meetingsUpdateRegistrationQuestionsRequest** | [**MeetingsUpdateRegistrationQuestionsRequest**](MeetingsUpdateRegistrationQuestionsRequest.md)| Meeting Registrant Questions | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Meeting Registrant Questions Updated |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;3161&#x60; &lt;br&gt; Meeting hosting and scheduling capabilities are not allowed for your user account.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="updateSurvey"></a>
# **updateSurvey**
> updateSurvey(meetingId).meetingsUpdateSurveyRequest(meetingsUpdateSurveyRequest).execute();

Update a meeting survey

Update a [meeting survey](https://support.zoom.us/hc/en-us/articles/4404969060621-Post-meeting-survey-and-reporting).  **Prerequisites:** * The host must be a **Pro** user type. * The [**Meeting Survey**](https://support.zoom.us/hc/en-us/articles/4404939095053-Enabling-meeting-surveys) feature is enabled in the host&#39;s account. * The meeting must be a scheduled meeting. Instant meetings do not have survey features enabled.  **Scopes:** &#x60;meeting:write:admin&#x60;,&#x60;meeting:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;LIGHT&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MeetingsApi;
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
    Long meetingId = 85746065L; // The meeting's ID.    When storing this value in your database, store it as a long-format integer and **not** a simple integer. Meeting IDs can be over 10 digits.
    MeetingsUpdateSurveyRequestCustomSurvey customSurvey = new MeetingsUpdateSurveyRequestCustomSurvey();
    Boolean showInTheBrowser = true; // Whether the **Show in the browser when the meeting ends** option is enabled.  * `true` - Enabled.  * `false` - Disabled.    This value defaults to `true`.
    String thirdPartySurvey = "thirdPartySurvey_example"; // The link to the third party meeting survey.
    try {
      client
              .meetings
              .updateSurvey(meetingId)
              .customSurvey(customSurvey)
              .showInTheBrowser(showInTheBrowser)
              .thirdPartySurvey(thirdPartySurvey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateSurvey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .meetings
              .updateSurvey(meetingId)
              .customSurvey(customSurvey)
              .showInTheBrowser(showInTheBrowser)
              .thirdPartySurvey(thirdPartySurvey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MeetingsApi#updateSurvey");
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
| **meetingId** | **Long**| The meeting&#39;s ID.    When storing this value in your database, store it as a long-format integer and **not** a simple integer. Meeting IDs can be over 10 digits. | |
| **meetingsUpdateSurveyRequest** | [**MeetingsUpdateSurveyRequest**](MeetingsUpdateSurveyRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;       Meeting survey updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid meeting ID. &lt;br&gt; **Error Code:** &#x60;300&#x60; &lt;br&gt;  Invalid third party survey: {third_party_survey}. &lt;br&gt; **Error Code:** &#x60;3161&#x60; &lt;br&gt;  Meeting hosting and scheduling capabilities are not allowed for your user account. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Cannot access Webinar information. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Meeting survey disabled. To enable this feature, enable the \&quot;Meeting Survey\&quot; setting in the Zoom web portal&#39;s \&quot;Settings\&quot; interface. &lt;br&gt; **Error Code:** &#x60;3000&#x60; &lt;br&gt;  Not allowed host to use a 3rd-party survey link. To use this feature, enable the \&quot;Allow host to use a 3rd-party survey link\&quot; setting in the \&quot;Account Settings\&quot; page of the Zoom web portal. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;300&#x60; &lt;br&gt;  Meeting ID does not exist. &lt;br&gt; **Error Code:** &#x60;3001&#x60; &lt;br&gt;  Meeting does not exist: {meetingId}. &lt;br&gt;  |  -  |

