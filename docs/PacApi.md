# PacApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAccounts**](PacApi.md#listAccounts) | **GET** /users/{userId}/pac | List a user&#39;s PAC accounts |


<a name="listAccounts"></a>
# **listAccounts**
> PacListAccountsResponse listAccounts(userId).execute();

List a user&#39;s PAC accounts

Retrieve a list of a user&#39;s [personal audio conference (PAC)](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) accounts. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.    PAC allows Pro or higher account holders to host meetings through PSTN (phone dial-in) only.    **Prerequisites**  * A Pro or higher plan with an [Audio Conferencing](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) subscription.  * The [**Personal Audio Conference**](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference#h_01F5BPM447M6QDJXX50RSFXKJ3) setting enabled in the user&#39;s profile.  **Scopes:** &#x60;pac:read:admin&#x60;,&#x60;pac:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacApi;
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
    try {
      PacListAccountsResponse result = client
              .pac
              .listAccounts(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPacAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacApi#listAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PacListAccountsResponse> response = client
              .pac
              .listAccounts(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacApi#listAccounts");
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

### Return type

[**PacListAccountsResponse**](PacListAccountsResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;       PAC account list returned. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;2024&#x60; &lt;br&gt;  User does not have PAC enabled. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;1001&#x60; &lt;br&gt;  User does not exist: $userId &lt;br&gt;  |  -  |

