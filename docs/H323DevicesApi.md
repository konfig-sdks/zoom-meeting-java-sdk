# H323DevicesApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDevice**](H323DevicesApi.md#createDevice) | **POST** /h323/devices | Create a H.323/SIP device |
| [**deleteDevice**](H323DevicesApi.md#deleteDevice) | **DELETE** /h323/devices/{deviceId} | Delete a H.323/SIP device |
| [**listDevices**](H323DevicesApi.md#listDevices) | **GET** /h323/devices | List H.323/SIP devices |
| [**updateDeviceInfo**](H323DevicesApi.md#updateDeviceInfo) | **PATCH** /h323/devices/{deviceId} | Update a H.323/SIP device |


<a name="createDevice"></a>
# **createDevice**
> H323DevicesCreateDeviceResponse createDevice().h323DevicesCreateDeviceRequest(h323DevicesCreateDeviceRequest).execute();

Create a H.323/SIP device

A H.323 or SIP device can make a video call to a [Room Connector](https://support.zoom.us/hc/en-us/articles/201363273-Getting-Started-With-H-323-SIP-Room-Connector) to join a Zoom cloud meeting. A Room Connector can also call out to a H.323 or SIP device to join a Zoom cloud meeting. Use this API to add a H.323/SIP device to your Zoom account            **Scopes:** &#x60;h323:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.H323DevicesApi;
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
    String encryption = "auto"; // Device encryption:    `auto` - auto.    `yes` - yes.    `no` - no.
    String ip = "ip_example"; // Device IP.
    String name = "name_example"; // Device name.
    String protocol = "H.323"; // Device protocol:    `H.323` - H.323.    `SIP` - SIP.
    try {
      H323DevicesCreateDeviceResponse result = client
              .h323Devices
              .createDevice(encryption, ip, name, protocol)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEncryption());
      System.out.println(result.getIp());
      System.out.println(result.getName());
      System.out.println(result.getProtocol());
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#createDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<H323DevicesCreateDeviceResponse> response = client
              .h323Devices
              .createDevice(encryption, ip, name, protocol)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#createDevice");
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
| **h323DevicesCreateDeviceRequest** | [**H323DevicesCreateDeviceRequest**](H323DevicesCreateDeviceRequest.md)| H.323/SIP device. | [optional] |

### Return type

[**H323DevicesCreateDeviceResponse**](H323DevicesCreateDeviceResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     H.323/SIP device created. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;200&#x60; &lt;br&gt; No permission.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;2020&#x60; &lt;br&gt; H.323 device&#39;s display name:{displayName} is already in use.   |  -  |

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(deviceId).execute();

Delete a H.323/SIP device

A H.323 or SIP device can make a video call to a [Room Connector](https://support.zoom.us/hc/en-us/articles/201363273-Getting-Started-With-H-323-SIP-Room-Connector) to join a Zoom cloud meeting. A Room Connector can also call out to a H.323 or SIP device to join a Zoom cloud meeting. Use this API to delete a H.323/SIP device from your Zoom account.            **Scopes:** &#x60;h323:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.H323DevicesApi;
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
    String deviceId = "abceHewahkrehwiK"; // The device ID.
    try {
      client
              .h323Devices
              .deleteDevice(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#deleteDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .h323Devices
              .deleteDevice(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#deleteDevice");
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
| **deviceId** | **String**| The device ID. | |

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
| **200** | You do not have the permission to delete this device. |  -  |
| **204** | H.323/SIP device deleted. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="listDevices"></a>
# **listDevices**
> H323DevicesListDevicesResponse listDevices().pageSize(pageSize).pageNumber(pageNumber).nextPageToken(nextPageToken).execute();

List H.323/SIP devices

A H.323 or SIP device can make a video call to a [Room Connector](https://support.zoom.us/hc/en-us/articles/201363273-Getting-Started-With-H-323-SIP-Room-Connector) to join a Zoom cloud meeting. A Room Connector can also call out to a H.323 or SIP device to join a Zoom cloud meeting. Use this API to list all H.323/SIP Devices on a Zoom account.            **Scopes:** &#x60;h323:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.H323DevicesApi;
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
    Integer pageNumber = 1; // **Deprecated.** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      H323DevicesListDevicesResponse result = client
              .h323Devices
              .listDevices()
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
      System.out.println(result.getDevices());
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#listDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<H323DevicesListDevicesResponse> response = client
              .h323Devices
              .listDevices()
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
      System.err.println("Exception when calling H323DevicesApi#listDevices");
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
| **pageNumber** | **Integer**| **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination. | [optional] [default to 1] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**H323DevicesListDevicesResponse**](H323DevicesListDevicesResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of H.323/SIP devices returned.     **Error Code:** &#x60;200&#x60;     No permission. |  -  |

<a name="updateDeviceInfo"></a>
# **updateDeviceInfo**
> updateDeviceInfo(deviceId).h323DevicesUpdateDeviceInfoRequest(h323DevicesUpdateDeviceInfoRequest).execute();

Update a H.323/SIP device

A H.323 or SIP device can make a video call to a [Room Connector](https://support.zoom.us/hc/en-us/articles/201363273-Getting-Started-With-H-323-SIP-Room-Connector) to join a Zoom cloud meeting. A Room Connector can also call out to a H.323 or SIP device to join a Zoom cloud meeting. Use this API to edit information of a H.323/SIP device from your Zoom account.            **Scopes:** &#x60;h323:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.H323DevicesApi;
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
    String encryption = "auto"; // Device encryption:    `auto` - auto.    `yes` - yes.    `no` - no.
    String ip = "ip_example"; // Device IP.
    String name = "name_example"; // Device name.
    String protocol = "H.323"; // Device protocol:    `H.323` - H.323.    `SIP` - SIP.
    String deviceId = "abceHewahkrehwiK"; // The device ID.
    try {
      client
              .h323Devices
              .updateDeviceInfo(encryption, ip, name, protocol, deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#updateDeviceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .h323Devices
              .updateDeviceInfo(encryption, ip, name, protocol, deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling H323DevicesApi#updateDeviceInfo");
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
| **deviceId** | **String**| The device ID. | |
| **h323DevicesUpdateDeviceInfoRequest** | [**H323DevicesUpdateDeviceInfoRequest**](H323DevicesUpdateDeviceInfoRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     H.323/SIP device updated. |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;2020&#x60; &lt;br&gt; H.323 device&#39;s display name:{displayName} is already in use.   |  -  |

