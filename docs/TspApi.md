# TspApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserTspAccount**](TspApi.md#addUserTspAccount) | **POST** /users/{userId}/tsp | Add a user&#39;s TSP account |
| [**deleteUserTspAccount**](TspApi.md#deleteUserTspAccount) | **DELETE** /users/{userId}/tsp/{tspId} | Delete a user&#39;s TSP account |
| [**getAccountInfo**](TspApi.md#getAccountInfo) | **GET** /tsp | Get account&#39;s TSP information |
| [**getUserTspAccount**](TspApi.md#getUserTspAccount) | **GET** /users/{userId}/tsp/{tspId} | Get a user&#39;s TSP account |
| [**listUserTspAccounts**](TspApi.md#listUserTspAccounts) | **GET** /users/{userId}/tsp | List user&#39;s TSP accounts |
| [**setGlobalDialInUrl**](TspApi.md#setGlobalDialInUrl) | **PATCH** /users/{userId}/tsp/settings | Set global dial-in URL for a TSP user |
| [**updateAccountTspInformation**](TspApi.md#updateAccountTspInformation) | **PATCH** /tsp | Update account&#39;s TSP information |
| [**updateUserTspAccount**](TspApi.md#updateUserTspAccount) | **PATCH** /users/{userId}/tsp/{tspId} | Update a TSP account |


<a name="addUserTspAccount"></a>
# **addUserTspAccount**
> TspAddUserTspAccountResponse addUserTspAccount(userId).tspAddUserTspAccountRequest(tspAddUserTspAccountRequest).execute();

Add a user&#39;s TSP account

Add a user&#39;s TSP account.            **Scopes:** &#x60;tsp:write:admin&#x60;,&#x60;tsp:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    String conferenceCode = "conferenceCode_example"; // Conference code: numeric value, length is less than 16.
    String leaderPin = "leaderPin_example"; // Leader PIN: numeric value, length is less than 16.
    Object userId = null; // The user ID or email address of the user. For user-level apps, pass the `me` value.
    List<TspAddUserTspAccountRequestDialInNumbersInner> dialInNumbers = Arrays.asList(); // List of dial in numbers.
    String tspBridge = "US_TSP_TB"; // Telephony bridge
    try {
      TspAddUserTspAccountResponse result = client
              .tsp
              .addUserTspAccount(conferenceCode, leaderPin, userId)
              .dialInNumbers(dialInNumbers)
              .tspBridge(tspBridge)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getConferenceCode());
      System.out.println(result.getDialInNumbers());
      System.out.println(result.getLeaderPin());
      System.out.println(result.getTspBridge());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#addUserTspAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TspAddUserTspAccountResponse> response = client
              .tsp
              .addUserTspAccount(conferenceCode, leaderPin, userId)
              .dialInNumbers(dialInNumbers)
              .tspBridge(tspBridge)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#addUserTspAccount");
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
| **tspAddUserTspAccountRequest** | [**TspAddUserTspAccountRequest**](TspAddUserTspAccountRequest.md)| TSP account. | [optional] |

### Return type

[**TspAddUserTspAccountResponse**](TspAddUserTspAccountResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     TSP account added. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account has not enabled TSP.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; Media link is required for AT&amp;T TSP accounts.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; You can add a max of two tsp configs.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: $userId.&lt;br&gt;  **Error Code:** &#x60;1120&#x60; &lt;br&gt; A valid invitation to join the Zoom account was not found for this user.&lt;br&gt; This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

<a name="deleteUserTspAccount"></a>
# **deleteUserTspAccount**
> deleteUserTspAccount(userId, tspId).execute();

Delete a user&#39;s TSP account

Delete a user&#39;s TSP account.            **Scopes:** &#x60;tsp:write:admin&#x60;,&#x60;tsp:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    String tspId = "1"; // TSP account ID.
    try {
      client
              .tsp
              .deleteUserTspAccount(userId, tspId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#deleteUserTspAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tsp
              .deleteUserTspAccount(userId, tspId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#deleteUserTspAccount");
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
| **tspId** | **String**| TSP account ID. | [enum: 1, 2] |

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
| **204** | **Status Code:** &#x60;204&#x60; **No Content**     TSP account deleted. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account not enable TSP.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; The TSP id provided does not exist.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; TSP Config does not exist.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; At least one tsp config must be available.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: $userId.&lt;br&gt;  **Error Code:** &#x60;1120&#x60; &lt;br&gt; A valid invitation to join the Zoom account was not found for this user.&lt;br&gt; This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

<a name="getAccountInfo"></a>
# **getAccountInfo**
> TspGetAccountInfoResponse getAccountInfo().execute();

Get account&#39;s TSP information

Get information on Telephony Service Provider on an account level.          **Prerequisites:**     * A Pro or a higher plan.  **Scopes:** &#x60;tsp:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
      TspGetAccountInfoResponse result = client
              .tsp
              .getAccountInfo()
              .execute();
      System.out.println(result);
      System.out.println(result.getDialInNumberUnrestricted());
      System.out.println(result.getDialInNumbers());
      System.out.println(result.getEnable());
      System.out.println(result.getMasterAccountSettingExtended());
      System.out.println(result.getModifyCredentialForbidden());
      System.out.println(result.getTspBridge());
      System.out.println(result.getTspEnabled());
      System.out.println(result.getTspProvider());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#getAccountInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TspGetAccountInfoResponse> response = client
              .tsp
              .getAccountInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#getAccountInfo");
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

[**TspGetAccountInfoResponse**](TspGetAccountInfoResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     TSP account detail returned successfully. |  -  |

<a name="getUserTspAccount"></a>
# **getUserTspAccount**
> TspGetUserTspAccountResponse getUserTspAccount(userId, tspId).execute();

Get a user&#39;s TSP account

Each user can have a maximum of two TSP accounts. Use this API to retrieve details of a specific TSP account enabled for a specific user.            **Scopes:** &#x60;tsp:read:admin&#x60;,&#x60;tsp:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    String tspId = "1"; // TSP account ID.
    try {
      TspGetUserTspAccountResponse result = client
              .tsp
              .getUserTspAccount(userId, tspId)
              .execute();
      System.out.println(result);
      System.out.println(result.getConferenceCode());
      System.out.println(result.getDialInNumbers());
      System.out.println(result.getId());
      System.out.println(result.getLeaderPin());
      System.out.println(result.getTspBridge());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#getUserTspAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TspGetUserTspAccountResponse> response = client
              .tsp
              .getUserTspAccount(userId, tspId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#getUserTspAccount");
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
| **tspId** | **String**| TSP account ID. | [enum: 1, 2] |

### Return type

[**TspGetUserTspAccountResponse**](TspGetUserTspAccountResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     TSP account retrieved successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; The TSP id provided does not exist.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; TSP Config does not exist.&lt;br&gt;  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account has not enabled TSP.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: $userId.&lt;br&gt;  **Error Code:** &#x60;1120&#x60; &lt;br&gt; A valid invitation to join the Zoom account was not found for this user.&lt;br&gt; This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

<a name="listUserTspAccounts"></a>
# **listUserTspAccounts**
> TspListUserTspAccountsResponse listUserTspAccounts(userId).execute();

List user&#39;s TSP accounts

A user can have a maximum of two TSP accounts. Use this API to list all TSP accounts of a user.            **Scopes:** &#x60;tsp:read:admin&#x60;,&#x60;tsp:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    try {
      TspListUserTspAccountsResponse result = client
              .tsp
              .listUserTspAccounts(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTspAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#listUserTspAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TspListUserTspAccountsResponse> response = client
              .tsp
              .listUserTspAccounts(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#listUserTspAccounts");
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

### Return type

[**TspListUserTspAccountsResponse**](TspListUserTspAccountsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     TSP account list returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account has not enabled TSP.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: $userId.&lt;br&gt;  **Error Code:** &#x60;1120&#x60; &lt;br&gt; A valid invitation to join the Zoom account was not found for this user.&lt;br&gt; This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

<a name="setGlobalDialInUrl"></a>
# **setGlobalDialInUrl**
> setGlobalDialInUrl(userId).tspSetGlobalDialInUrlRequest(tspSetGlobalDialInUrlRequest).execute();

Set global dial-in URL for a TSP user

A global dial-in page can provide a list of global access numbers using which audio conferencing can be conducted. By calling this API, you can set the url for the global dial-in page of a user whose Zoom account has TSP and special TSP with third-party audio conferencing options enabled. &amp;lt;p&amp;gt;&amp;lt;/p&amp;gt;   **Scopes:** &#x60;tsp:write:admin&#x60;,&#x60;tsp:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    String userId = "6dfgdfgdg444447b0egga"; // The userId or email address of the user.
    String audioUrl = "audioUrl_example"; // The global dial-in URL for a TSP enabled account. The URL must be valid with a max-length of 512 characters.
    try {
      client
              .tsp
              .setGlobalDialInUrl(userId)
              .audioUrl(audioUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#setGlobalDialInUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tsp
              .setGlobalDialInUrl(userId)
              .audioUrl(audioUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#setGlobalDialInUrl");
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
| **userId** | **String**| The userId or email address of the user. | |
| **tspSetGlobalDialInUrlRequest** | [**TspSetGlobalDialInUrlRequest**](TspSetGlobalDialInUrlRequest.md)| Global dial-in URL of the user. | [optional] |

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
| **204** | **Status Code:** &#x60;204&#x60; **No Content**      URL set successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2000&#x60; &lt;br&gt; Not TSP special account.&lt;br&gt;  Ths error means that the account does not have special TSP privilege. Contact Zoom Developer Support for details.&lt;br&gt;  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account not enable TSP   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} not exist or not belong to this account.  **Error Code:** &#x60;1120&#x60; &lt;br&gt; Invite not exist.  This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

<a name="updateAccountTspInformation"></a>
# **updateAccountTspInformation**
> updateAccountTspInformation().tspUpdateAccountTspInformationRequest(tspUpdateAccountTspInformationRequest).execute();

Update account&#39;s TSP information

Update information of the Telephony Service Provider set up on an account.     **Prerequisites**:     TSP account option should be enabled.       **Scopes:** &#x60;tsp:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    Boolean dialInNumberUnrestricted = true; // Control restriction on account users adding a TSP number outside of account's dial in numbers.
    Boolean enable = true; // Enable 3rd party audio conferencing for account users
    Boolean masterAccountSettingExtended = true; // For master account, extend its TSP setting to all sub accounts. For sub account, extend TSP setting from master account.
    Boolean modifyCredentialForbidden = true; // Control restriction on account users being able to modify their TSP credentials.
    String tspBridge = "US_TSP_TB"; // Telephony bridge
    Boolean tspEnabled = true; // Enable TSP feature for account. This has to be enabled to use any other tsp settings/features.
    String tspProvider = "tspProvider_example"; // 3rd party audio conferencing provider
    try {
      client
              .tsp
              .updateAccountTspInformation()
              .dialInNumberUnrestricted(dialInNumberUnrestricted)
              .enable(enable)
              .masterAccountSettingExtended(masterAccountSettingExtended)
              .modifyCredentialForbidden(modifyCredentialForbidden)
              .tspBridge(tspBridge)
              .tspEnabled(tspEnabled)
              .tspProvider(tspProvider)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#updateAccountTspInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tsp
              .updateAccountTspInformation()
              .dialInNumberUnrestricted(dialInNumberUnrestricted)
              .enable(enable)
              .masterAccountSettingExtended(masterAccountSettingExtended)
              .modifyCredentialForbidden(modifyCredentialForbidden)
              .tspBridge(tspBridge)
              .tspEnabled(tspEnabled)
              .tspProvider(tspProvider)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#updateAccountTspInformation");
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
| **tspUpdateAccountTspInformationRequest** | [**TspUpdateAccountTspInformationRequest**](TspUpdateAccountTspInformationRequest.md)| TSP Account | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content**     TSP Account updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: tsp_bridge.   |  -  |

<a name="updateUserTspAccount"></a>
# **updateUserTspAccount**
> updateUserTspAccount(userId, tspId).tspUpdateUserTspAccountRequest(tspUpdateUserTspAccountRequest).execute();

Update a TSP account

Update a user&#39;s TSP account.            **Scopes:** &#x60;tsp:write:admin&#x60;,&#x60;tsp:write&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TspApi;
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
    String conferenceCode = "conferenceCode_example"; // Conference code: numeric value, length is less than 16.
    String leaderPin = "leaderPin_example"; // Leader PIN: numeric value, length is less than 16.
    Object userId = null; // The user ID or email address of the user. For user-level apps, pass the `me` value.
    String tspId = "1"; // TSP account ID.
    List<TspUpdateUserTspAccountRequestDialInNumbersInner> dialInNumbers = Arrays.asList(); // List of dial in numbers.
    String tspBridge = "US_TSP_TB"; // Telephony bridge
    try {
      client
              .tsp
              .updateUserTspAccount(conferenceCode, leaderPin, userId, tspId)
              .dialInNumbers(dialInNumbers)
              .tspBridge(tspBridge)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#updateUserTspAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tsp
              .updateUserTspAccount(conferenceCode, leaderPin, userId, tspId)
              .dialInNumbers(dialInNumbers)
              .tspBridge(tspBridge)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TspApi#updateUserTspAccount");
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
| **tspId** | **String**| TSP account ID. | [enum: 1, 2] |
| **tspUpdateUserTspAccountRequest** | [**TspUpdateUserTspAccountRequest**](TspUpdateUserTspAccountRequest.md)| TSP account. | [optional] |

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
| **204** | **HTTP Status Code:**&#x60;204&#x60; **No Content**     TSP account updated. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;2024&#x60; &lt;br&gt; Account has not enabled TSP.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; The TSP id provided does not exist.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; TSP Config does not exist.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; At least one tsp config must be available.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; Media link is required for AT&amp;T TSP accounts.  **Error Code:** &#x60;300&#x60; &lt;br&gt; Invalid parameter: tsp_bridge.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User does not exist: $userId.&lt;br&gt;  **Error Code:** &#x60;1120&#x60; &lt;br&gt; A valid invitation to join the Zoom account was not found for this user.&lt;br&gt; This error is thrown if you added a user in your account but the user did not accept the invitation on time and the invitation expired - thus making the userId invalid.   |  -  |

