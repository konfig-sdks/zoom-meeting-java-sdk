# SipPhoneApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePhone**](SipPhoneApi.md#deletePhone) | **DELETE** /sip_phones/{phoneId} | Delete SIP phone |
| [**enableUserSipPhone**](SipPhoneApi.md#enableUserSipPhone) | **POST** /sip_phones | Enable SIP phone |
| [**list**](SipPhoneApi.md#list) | **GET** /sip_phones | List SIP phones |
| [**updateSpecificPhone**](SipPhoneApi.md#updateSpecificPhone) | **PATCH** /sip_phones/{phoneId} | Update SIP phone |


<a name="deletePhone"></a>
# **deletePhone**
> deletePhone(phoneId).execute();

Delete SIP phone

Use this API to delete a Zoom account&#39;s SIP phone.    **Prerequisites**:  * Currently only supported on Cisco and Avaya PBX systems.  * The user must enable **SIP Phone Integration** by contacting the [Zoom Sales](https://zoom.us/contactsales) team.  **Scopes:** &#x60;sip_phone:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SipPhoneApi;
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
    String phoneId = "123456"; // The SIP phone ID. It can be retrieved from the List SIP Phones API.
    try {
      client
              .sipPhone
              .deletePhone(phoneId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#deletePhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .sipPhone
              .deletePhone(phoneId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#deletePhone");
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
| **phoneId** | **String**| The SIP phone ID. It can be retrieved from the List SIP Phones API. | |

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
| **200** | **Error Code:** &#x60;200&#x60;    Permission missing: Enable SIP Phone Integration by contacting a Zoom Admin first. |  -  |
| **204** | **HTTP Status Code:** &#x60;204&#x60;     SIP Phone deleted. |  -  |

<a name="enableUserSipPhone"></a>
# **enableUserSipPhone**
> SipPhoneEnableUserSipPhoneResponse enableUserSipPhone().sipPhoneEnableUserSipPhoneRequest(sipPhoneEnableUserSipPhoneRequest).execute();

Enable SIP phone

Zoom&#39;s Phone System Integration (PSI), also referred as SIP phones, enables an organization to leverage the Zoom client to complete a softphone registration to supported premise based PBX system. End users will have the ability to have softphone functionality within a single client while maintaining a comparable interface to Zoom Phone. Use this API to enable a user to use SIP phone.          **Prerequisites**: * Currently only supported on Cisco and Avaya PBX systems.  * The account owner or account admin must first enable SIP Phone Integration by contacting the [Sales](https://zoom.us/contactsales) team.       **Scopes:** &#x60;sip_phone:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SipPhoneApi;
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
    String authorizationName = "authorizationName_example"; // The authorization name of the user that is registered for SIP phone.
    String domain = "domain_example"; // The name or IP address of your provider's SIP domain (example: CDC.WEB). 
    String password = "password_example"; // The password generated for the user in the SIP account.
    String proxyServer = "proxyServer_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
    String registerServer = "registerServer_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    String userEmail = "userEmail_example"; // The email address of the user to associate with the SIP Phone. Can add `.win`, `.mac`, `.android`, `.ipad`, `.iphone`, `.linux`, `.pc`, `.mobile`, `.pad` at the end of the email (for example, `user@example.com.mac`) to add accounts for different platforms for the same user.
    String userName = "userName_example"; // The phone number associated with the user in the SIP account.
    String voiceMail = "voiceMail_example"; // The number to dial for checking voicemail.
    String proxyServer2 = "proxyServer2_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server, or empty.
    String proxyServer3 = "proxyServer3_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server, or empty.
    String registerServer2 = "registerServer2_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    String registerServer3 = "registerServer3_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    Integer registrationExpireTime = 60; // The number of minutes after which the SIP registration of the Zoom client user will expire, and the client will auto register to the SIP server.
    String transportProtocol = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    String transportProtocol2 = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    String transportProtocol3 = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    try {
      SipPhoneEnableUserSipPhoneResponse result = client
              .sipPhone
              .enableUserSipPhone(authorizationName, domain, password, proxyServer, registerServer, userEmail, userName, voiceMail)
              .proxyServer2(proxyServer2)
              .proxyServer3(proxyServer3)
              .registerServer2(registerServer2)
              .registerServer3(registerServer3)
              .registrationExpireTime(registrationExpireTime)
              .transportProtocol(transportProtocol)
              .transportProtocol2(transportProtocol2)
              .transportProtocol3(transportProtocol3)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAuthorizationName());
      System.out.println(result.getDomain());
      System.out.println(result.getPassword());
      System.out.println(result.getProxyServer());
      System.out.println(result.getProxyServer2());
      System.out.println(result.getProxyServer3());
      System.out.println(result.getRegisterServer());
      System.out.println(result.getRegisterServer2());
      System.out.println(result.getRegisterServer3());
      System.out.println(result.getRegistrationExpireTime());
      System.out.println(result.getTransportProtocol());
      System.out.println(result.getTransportProtocol2());
      System.out.println(result.getTransportProtocol3());
      System.out.println(result.getUserEmail());
      System.out.println(result.getUserName());
      System.out.println(result.getVoiceMail());
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#enableUserSipPhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SipPhoneEnableUserSipPhoneResponse> response = client
              .sipPhone
              .enableUserSipPhone(authorizationName, domain, password, proxyServer, registerServer, userEmail, userName, voiceMail)
              .proxyServer2(proxyServer2)
              .proxyServer3(proxyServer3)
              .registerServer2(registerServer2)
              .registerServer3(registerServer3)
              .registrationExpireTime(registrationExpireTime)
              .transportProtocol(transportProtocol)
              .transportProtocol2(transportProtocol2)
              .transportProtocol3(transportProtocol3)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#enableUserSipPhone");
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
| **sipPhoneEnableUserSipPhoneRequest** | [**SipPhoneEnableUserSipPhoneRequest**](SipPhoneEnableUserSipPhoneRequest.md)|  | [optional] |

### Return type

[**SipPhoneEnableUserSipPhoneResponse**](SipPhoneEnableUserSipPhoneResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     SIP Phone Created.  |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; Permission missing: Enable SIP Phone Integration by contacting a Zoom Admin first.&lt;br&gt;  **Error Code:** &#x60;300&#x60; &lt;br&gt; SIP Phone with the same email already exists.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1001&#x60; &lt;br&gt; User {userId} not exist or not belong to this account.   |  -  |

<a name="list"></a>
# **list**
> SipPhoneListResponse list().pageNumber(pageNumber).searchKey(searchKey).pageSize(pageSize).nextPageToken(nextPageToken).execute();

List SIP phones

Zoom&#39;s Phone System Integration (PSI), also referred as SIP phones, enables an organization to leverage the Zoom client to complete a softphone registration to supported premise based PBX system. End users will have the ability to have softphone functionality within a single client while maintaining a comparable interface to Zoom Phone. Use this API to list SIP phones on an account.          **Prerequisites**: * Currently only supported on Cisco and Avaya PBX systems.  * User must enable SIP Phone Integration by contacting the [Sales](https://zoom.us/contactsales) team.       **Scopes:** &#x60;sip_phone:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SipPhoneApi;
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
    Integer pageNumber = 1; // **Deprecated.** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    String searchKey = "jchill@example.com"; // User name or email address of a user. If this parameter is provided, only the SIP phone system integration enabled for that specific user will be returned. Otherwise, all SIP phones on an account will be returned.
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "Tva2CuIdTgsv8wAnhyAdU3m06Y2HuLQtlh3"; // The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
    try {
      SipPhoneListResponse result = client
              .sipPhone
              .list()
              .pageNumber(pageNumber)
              .searchKey(searchKey)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageCount());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPageSize());
      System.out.println(result.getPhones());
      System.out.println(result.getTotalRecords());
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SipPhoneListResponse> response = client
              .sipPhone
              .list()
              .pageNumber(pageNumber)
              .searchKey(searchKey)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#list");
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
| **pageNumber** | **Integer**| **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |
| **searchKey** | **String**| User name or email address of a user. If this parameter is provided, only the SIP phone system integration enabled for that specific user will be returned. Otherwise, all SIP phones on an account will be returned. | [optional] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] |
| **nextPageToken** | **String**| The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes. | [optional] |

### Return type

[**SipPhoneListResponse**](SipPhoneListResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     SIP Phones listed successfully.  **Error Code:** &#x60;200&#x60;     Permission missing: Enable SIP Phone Integration by contacting a Zoom Admin first. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request   |  -  |

<a name="updateSpecificPhone"></a>
# **updateSpecificPhone**
> updateSpecificPhone(phoneId).sipPhoneUpdateSpecificPhoneRequest(sipPhoneUpdateSpecificPhoneRequest).execute();

Update SIP phone

Zoom&#39;s Phone System Integration (PSI), also referred as SIP phones, enables an organization to leverage the Zoom client to complete a softphone registration to supported premise based PBX system. End users will have the ability to have softphone functionality within a single client while maintaining a comparable interface to Zoom Phone. Use this API to update information of a specific SIP Phone on a Zoom account.          **Prerequisites**: * Currently only supported on Cisco and Avaya PBX systems.  * The account owner or account admin must first enable SIP Phone Integration by contacting the [Sales](https://zoom.us/contactsales) team.       **Scopes:** &#x60;sip_phone:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SipPhoneApi;
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
    String authorizationName = "authorizationName_example"; // The authorization name of the user that is registered for SIP phone.
    String domain = "domain_example"; // The name or IP address of your provider's SIP domain (example: CDC.WEB). 
    String password = "password_example"; // The password generated for the user in the SIP account.
    String proxyServer = "proxyServer_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
    String proxyServer2 = "proxyServer2_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
    String proxyServer3 = "proxyServer3_example"; // The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
    String registerServer = "registerServer_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    String registerServer2 = "registerServer2_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    String registerServer3 = "registerServer3_example"; // The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
    String userName = "userName_example"; // The phone number associated with the user in the SIP account.
    String voiceMail = "voiceMail_example"; // The number to dial for checking voicemail.
    String phoneId = "123456"; // The SIP phone ID. This can be retrieved from the List SIP Phones API.
    Integer registrationExpireTime = 60; // The number of minutes after which the SIP registration of the Zoom client user will expire, and the client will auto register to the SIP server.
    String transportProtocol = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    String transportProtocol2 = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    String transportProtocol3 = "UDP"; // Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.
    try {
      client
              .sipPhone
              .updateSpecificPhone(authorizationName, domain, password, proxyServer, proxyServer2, proxyServer3, registerServer, registerServer2, registerServer3, userName, voiceMail, phoneId)
              .registrationExpireTime(registrationExpireTime)
              .transportProtocol(transportProtocol)
              .transportProtocol2(transportProtocol2)
              .transportProtocol3(transportProtocol3)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#updateSpecificPhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .sipPhone
              .updateSpecificPhone(authorizationName, domain, password, proxyServer, proxyServer2, proxyServer3, registerServer, registerServer2, registerServer3, userName, voiceMail, phoneId)
              .registrationExpireTime(registrationExpireTime)
              .transportProtocol(transportProtocol)
              .transportProtocol2(transportProtocol2)
              .transportProtocol3(transportProtocol3)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SipPhoneApi#updateSpecificPhone");
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
| **phoneId** | **String**| The SIP phone ID. This can be retrieved from the List SIP Phones API. | |
| **sipPhoneUpdateSpecificPhoneRequest** | [**SipPhoneUpdateSpecificPhoneRequest**](SipPhoneUpdateSpecificPhoneRequest.md)|  | [optional] |

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
| **200** | **Error Code:** &#x60;200&#x60;     Permission missing: Enable SIP Phone Integration by contacting a Zoom Admin first.  |  -  |
| **204** | **HTTP Status Code:** &#x60;204&#x60;     SIP Phone information updated successfully.  |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request   |  -  |

