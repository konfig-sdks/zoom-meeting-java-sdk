# DevicesApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignDeviceZpaAssignment**](DevicesApi.md#assignDeviceZpaAssignment) | **POST** /devices/zpa/assignment | Assign a device to a user or commonarea |
| [**changeDeviceAssociation**](DevicesApi.md#changeDeviceAssociation) | **PATCH** /devices/{deviceId}/assignment | Change device association |
| [**createNewDevice**](DevicesApi.md#createNewDevice) | **POST** /devices | Add a new device |
| [**getDetail**](DevicesApi.md#getDetail) | **GET** /devices/{deviceId} | Get device detail |
| [**getZpaVersionInfo**](DevicesApi.md#getZpaVersionInfo) | **GET** /devices/zpa/zdm_groups/{zdmGroupId}/versions | Get ZPA version info |
| [**list**](DevicesApi.md#list) | **GET** /devices | List devices |
| [**listZdmGroupInfo**](DevicesApi.md#listZdmGroupInfo) | **GET** /devices/groups | Get zdm group info |
| [**removeDeviceZMD**](DevicesApi.md#removeDeviceZMD) | **DELETE** /devices/{deviceId} | Delete device |
| [**removeZpaDeviceByVendorAndMacAddress**](DevicesApi.md#removeZpaDeviceByVendorAndMacAddress) | **DELETE** /devices/zpa/vendors/{vendor}/mac_addresses/{macAddress} | Delete ZPA device by vendor and mac address |
| [**updateDeviceName**](DevicesApi.md#updateDeviceName) | **PATCH** /devices/{deviceId} | Change device  |
| [**upgradeZpaOsApp**](DevicesApi.md#upgradeZpaOsApp) | **POST** /devices/zpa/upgrade | upgrade zpa os/app |


<a name="assignDeviceZpaAssignment"></a>
# **assignDeviceZpaAssignment**
> assignDeviceZpaAssignment().devicesAssignDeviceZpaAssignmentRequest(devicesAssignDeviceZpaAssignmentRequest).execute();

Assign a device to a user or commonarea

Assign a device to a user or common area, or move a device to another user or common area, or remove a device.  **Prerequisites:** * Device must be enrolled in Zoom Device Management (ZDM).  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String macAddress = "macAddress_example"; // The device's mac address.
    String vendor = "vendor_example"; // The device's manufacturer.
    String extensionNumber = "extensionNumber_example"; // The extension number.
    try {
      client
              .devices
              .assignDeviceZpaAssignment(macAddress, vendor)
              .extensionNumber(extensionNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#assignDeviceZpaAssignment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .assignDeviceZpaAssignment(macAddress, vendor)
              .extensionNumber(extensionNumber)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#assignDeviceZpaAssignment");
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
| **devicesAssignDeviceZpaAssignmentRequest** | [**DevicesAssignDeviceZpaAssignmentRequest**](DevicesAssignDeviceZpaAssignmentRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content**   Request processed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;30055003&#x60; &lt;br&gt;  Device vendor does not support. &lt;br&gt; **Error Code:** &#x60;30055007&#x60; &lt;br&gt;  Mac address is wrong. &lt;br&gt; **Error Code:** &#x60;30051039&#x60; &lt;br&gt;  Device not exists. &lt;br&gt; **Error Code:** &#x60;30055002&#x60; &lt;br&gt;  AUTO RECEPTIONIST user can not assign to device. &lt;br&gt; **Error Code:** &#x60;30055009&#x60; &lt;br&gt;  User not have phone plan. &lt;br&gt; **Error Code:** &#x60;30052024&#x60; &lt;br&gt;  Extension number not exists. &lt;br&gt; **Error Code:** &#x60;30055002&#x60; &lt;br&gt;  Missing required input. &lt;br&gt;  |  -  |

<a name="changeDeviceAssociation"></a>
# **changeDeviceAssociation**
> changeDeviceAssociation(deviceId).devicesChangeDeviceAssociationRequest(devicesChangeDeviceAssociationRequest).execute();

Change device association

This Device API lets you change device association from one Zoom Room to another.   **Prerequisites:** * Device must be enrolled in ZMD (Zoom Device Management)     **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String deviceId = "F1C6E9DF-429E-4FA1-85DA-AC95464F3D18"; // Unique identifier of the device.
    String roomId = "roomId_example"; // The Zoom Room ID which device is being associated to. The `room_id` is required when `assign` is selected for `action` field.
    String appType = "ZR"; // Specify one of the following values for this field:  `ZR`: Zoom Room Computer.     `ZRC`: Zoom Room Controller.     `ZRP`: Scheduling Display.     `ZRW`: Companion Whiteboard.
    try {
      client
              .devices
              .changeDeviceAssociation(deviceId)
              .roomId(roomId)
              .appType(appType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#changeDeviceAssociation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .changeDeviceAssociation(deviceId)
              .roomId(roomId)
              .appType(appType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#changeDeviceAssociation");
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
| **deviceId** | **String**| Unique identifier of the device. | |
| **devicesChangeDeviceAssociationRequest** | [**DevicesChangeDeviceAssociationRequest**](DevicesChangeDeviceAssociationRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content**     Request processed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;8500&#x60; &lt;br&gt; Device not enrolled in Zoom Device Management.  **Error Code:** &#x60;8501&#x60; &lt;br&gt; Device does not support this app.  **Error Code:** &#x60;8502&#x60; &lt;br&gt; Room does not support this app.   |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found  **Error Code:** &#x60;1012&#x60; &lt;br&gt; Room does not exist: {roomId}.  **Error Code:** &#x60;8503&#x60; &lt;br&gt; Device does not exist: {deviceId}.   |  -  |

<a name="createNewDevice"></a>
# **createNewDevice**
> createNewDevice().devicesCreateNewDeviceRequest(devicesCreateNewDeviceRequest).execute();

Add a new device

Add a new device to Zoom account.   **Scope:** &#x60;device:write:admin&#x60;       **[Rate Limit Label](https://developers.zoom.us/docs/api/rest/rate-limits/):** &#x60;Medium&#x60;  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String deviceName = "deviceName_example"; // The device's name.
    String macAddress = "macAddress_example"; // The device's mac address.
    String serialNumber = "serialNumber_example"; // The device's serial number.
    String vendor = "vendor_example"; // The device's manufacturer.
    String model = "model_example"; // The device's model.
    Integer deviceType = 0; // Device type.    `0` - Zoom Rooms computer.    `1` - Zoom Rooms controller.    `5` - Zoom Phone appliance.
    String roomId = "roomId_example"; // The Zoom Room's ID. Only for Zoom Room devices.
    String userEmail = "userEmail_example"; // User email for assigning the Zoom Phone device. Only for Zoom Phone devices.
    String tag = "tag_example"; // The name of the tag.
    String zdmGroupId = "zdmGroupId_example"; // The ZDM group ID.
    String extensionNumber = "extensionNumber_example"; // The extension number.
    try {
      client
              .devices
              .createNewDevice(deviceName, macAddress, serialNumber, vendor, model, deviceType)
              .roomId(roomId)
              .userEmail(userEmail)
              .tag(tag)
              .zdmGroupId(zdmGroupId)
              .extensionNumber(extensionNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createNewDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .createNewDevice(deviceName, macAddress, serialNumber, vendor, model, deviceType)
              .roomId(roomId)
              .userEmail(userEmail)
              .tag(tag)
              .zdmGroupId(zdmGroupId)
              .extensionNumber(extensionNumber)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createNewDevice");
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
| **devicesCreateNewDeviceRequest** | [**DevicesCreateNewDeviceRequest**](DevicesCreateNewDeviceRequest.md)|  | [optional] |

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
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;30055001&#x60; &lt;br&gt;  zoom room does not exist.  &lt;br&gt; **Error Code:** &#x60;30055002&#x60; &lt;br&gt;  required param can not be empty or null. &lt;br&gt; **Error Code:** &#x60;30055003&#x60; &lt;br&gt;  device type does not support. &lt;br&gt; **Error Code:** &#x60;30055004&#x60; &lt;br&gt;  model or vendor not exist. &lt;br&gt; **Error Code:** &#x60;30055005&#x60; &lt;br&gt;  tag length can not be more than 64. &lt;br&gt; **Error Code:** &#x60;30055006&#x60; &lt;br&gt;  device has already exist. &lt;br&gt; **Error Code:** &#x60;30055007&#x60; &lt;br&gt;  invalid mac address. &lt;br&gt; **Error Code:** &#x60;30055008&#x60; &lt;br&gt;  no permission. &lt;br&gt; **Error Code:** &#x60;30055009&#x60; &lt;br&gt;  email does not have plan. &lt;br&gt;  |  -  |

<a name="getDetail"></a>
# **getDetail**
> DevicesGetDetailResponse getDetail(deviceId).execute();

Get device detail

Retrieve a device&#39;s details.  **Scopes:** &#x60;device:read:admin&#x60;,&#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String deviceId = "F1C6E9DF-429E-4FA1-85DA-AC95464F3D18"; // The device's unique identifier.
    try {
      DevicesGetDetailResponse result = client
              .devices
              .getDetail(deviceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeviceId());
      System.out.println(result.getDeviceName());
      System.out.println(result.getMacAddress());
      System.out.println(result.getSerialNumber());
      System.out.println(result.getVendor());
      System.out.println(result.getModel());
      System.out.println(result.getPlatformOs());
      System.out.println(result.getAppVersion());
      System.out.println(result.getTag());
      System.out.println(result.getEnrolledInZdm());
      System.out.println(result.getConnectedToZdm());
      System.out.println(result.getRoomId());
      System.out.println(result.getRoomName());
      System.out.println(result.getDeviceType());
      System.out.println(result.getSdkVersion());
      System.out.println(result.getDeviceStatus());
      System.out.println(result.getLastOnline());
      System.out.println(result.getUserEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicesGetDetailResponse> response = client
              .devices
              .getDetail(deviceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDetail");
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
| **deviceId** | **String**| The device&#39;s unique identifier. | |

### Return type

[**DevicesGetDetailResponse**](DevicesGetDetailResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**    Device detail returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;30055008&#x60; &lt;br&gt;  No permission. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;30055012&#x60; &lt;br&gt;  No found unified deviceId. &lt;br&gt;  |  -  |

<a name="getZpaVersionInfo"></a>
# **getZpaVersionInfo**
> DevicesGetZpaVersionInfoResponse getZpaVersionInfo(zdmGroupId).execute();

Get ZPA version info

Get ZPA firmware and app version information that can be upgraded for devices.  **Scopes:** &#x60;device:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String zdmGroupId = "ff49588c-92c4-4406-99e6-1942d8a61a7b"; // The Zoom Device Management (ZDM) group ID.
    try {
      DevicesGetZpaVersionInfoResponse result = client
              .devices
              .getZpaVersionInfo(zdmGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFirmwareVersions());
      System.out.println(result.getAppVersions());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getZpaVersionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicesGetZpaVersionInfoResponse> response = client
              .devices
              .getZpaVersionInfo(zdmGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getZpaVersionInfo");
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
| **zdmGroupId** | **String**| The Zoom Device Management (ZDM) group ID. | |

### Return type

[**DevicesGetZpaVersionInfoResponse**](DevicesGetZpaVersionInfoResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**  Version detail returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;30051037&#x60; &lt;br&gt;  * AccountId is empty. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;30052027&#x60; &lt;br&gt;  * ZdmGroup not found. &lt;br&gt;  |  -  |

<a name="list"></a>
# **list**
> DevicesListResponse list().searchText(searchText).platformOs(platformOs).isEnrolledInZdm(isEnrolledInZdm).deviceType(deviceType).deviceVendor(deviceVendor).deviceModel(deviceModel).deviceStatus(deviceStatus).pageSize(pageSize).nextPageToken(nextPageToken).execute();

List devices

This API lets you list devices.     **Scopes:** &#x60;device:read:admin&#x60;,&#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String searchText = "poly"; // Filter devices by name or serial number.
    String platformOs = "win"; // Filter devices by platform operating system.
    Boolean isEnrolledInZdm = true; // Filter devices by enrollment of ZDM (Zoom Device Management).
    Integer deviceType = -1; // Filter devices by device type.     Device Type:    `-1` - All Zoom Room device(0,1,2,3,4,6).    `0` - Zoom Rooms Computer.    `1` - Zoom Rooms Controller.    `2` - Zoom Rooms Scheduling Display.    `3` - Zoom Rooms Control System.    `4` -  Zoom Rooms Whiteboard.    `5` - Zoom Phone Appliance.    `6` - Zoom Rooms Computer (with Controller).
    String deviceVendor = "poly"; // Filter devices by vendor.
    String deviceModel = "ep5"; // Filter devices by model.
    Integer deviceStatus = -1; // Filter devices by status.      Device Status:    `0` - offline.    `1` - online.    `-1` - unlink
    Integer pageSize = 30; // The number of records returned within a single API call.
    String nextPageToken = "IAfJX3jsOLW7w3dokmFl84zOa0MAVGyMEB2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period is 15 minutes.
    try {
      DevicesListResponse result = client
              .devices
              .list()
              .searchText(searchText)
              .platformOs(platformOs)
              .isEnrolledInZdm(isEnrolledInZdm)
              .deviceType(deviceType)
              .deviceVendor(deviceVendor)
              .deviceModel(deviceModel)
              .deviceStatus(deviceStatus)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
      System.out.println(result.getDevices());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicesListResponse> response = client
              .devices
              .list()
              .searchText(searchText)
              .platformOs(platformOs)
              .isEnrolledInZdm(isEnrolledInZdm)
              .deviceType(deviceType)
              .deviceVendor(deviceVendor)
              .deviceModel(deviceModel)
              .deviceStatus(deviceStatus)
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#list");
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
| **searchText** | **String**| Filter devices by name or serial number. | [optional] |
| **platformOs** | **String**| Filter devices by platform operating system. | [optional] [enum: win, mac, ipad, iphone, android, linux] |
| **isEnrolledInZdm** | **Boolean**| Filter devices by enrollment of ZDM (Zoom Device Management). | [optional] [default to true] |
| **deviceType** | **Integer**| Filter devices by device type.     Device Type:    &#x60;-1&#x60; - All Zoom Room device(0,1,2,3,4,6).    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.    &#x60;3&#x60; - Zoom Rooms Control System.    &#x60;4&#x60; -  Zoom Rooms Whiteboard.    &#x60;5&#x60; - Zoom Phone Appliance.    &#x60;6&#x60; - Zoom Rooms Computer (with Controller). | [optional] [default to -1] [enum: -1, 0, 1, 2, 3, 4, 5, 6] |
| **deviceVendor** | **String**| Filter devices by vendor. | [optional] |
| **deviceModel** | **String**| Filter devices by model. | [optional] |
| **deviceStatus** | **Integer**| Filter devices by status.      Device Status:    &#x60;0&#x60; - offline.    &#x60;1&#x60; - online.    &#x60;-1&#x60; - unlink | [optional] [default to -1] [enum: -1, 0, 1] |
| **pageSize** | **Integer**| The number of records returned within a single API call. | [optional] [default to 30] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period is 15 minutes. | [optional] |

### Return type

[**DevicesListResponse**](DevicesListResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**     Device detail returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request  **Error Code:** &#x60;30055008&#x60; &lt;br&gt; no permission.   |  -  |

<a name="listZdmGroupInfo"></a>
# **listZdmGroupInfo**
> DevicesListZdmGroupInfoResponse listZdmGroupInfo().pageSize(pageSize).nextPageToken(nextPageToken).execute();

Get zdm group info

Get Zoom Device Manager (ZDM) group information for an account.  **Scopes:** &#x60;device:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    Integer pageSize = 30; // The total number of records returned from a single API call. Default - 30. Max -100.
    String nextPageToken = "BJLYC6PABbAHdjwSkGVQeeR6B1juwHqj3G2"; // Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token's expiration period token is 15 minutes.
    try {
      DevicesListZdmGroupInfoResponse result = client
              .devices
              .listZdmGroupInfo()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getGroups());
      System.out.println(result.getNextPageToken());
      System.out.println(result.getPageSize());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#listZdmGroupInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DevicesListZdmGroupInfoResponse> response = client
              .devices
              .listZdmGroupInfo()
              .pageSize(pageSize)
              .nextPageToken(nextPageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#listZdmGroupInfo");
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
| **pageSize** | **Integer**| The total number of records returned from a single API call. Default - 30. Max -100. | [optional] |
| **nextPageToken** | **String**| Use the next page token to paginate through large result sets. A next page token is returned whenever the set of available results exceeds the current page size. This token&#39;s expiration period token is 15 minutes. | [optional] |

### Return type

[**DevicesListZdmGroupInfoResponse**](DevicesListZdmGroupInfoResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60; **OK**  Version detail returned successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;30051037&#x60; &lt;br&gt;  Invalid parameters. &lt;br&gt;  |  -  |
| **403** | **HTTP Status Code:** &#x60;403&#x60; &lt;br&gt;  Forbidden     **Error Code:** &#x60;30055008&#x60; &lt;br&gt;  No permission. &lt;br&gt;  |  -  |

<a name="removeDeviceZMD"></a>
# **removeDeviceZMD**
> removeDeviceZMD(deviceId).execute();

Delete device

Delete a device from a Zoom account.   **Prerequisites:** * Device must be enrolled in ZMD (Zoom Device Management)  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String deviceId = "F1C6E9DF-429E-4FA1-85DA-AC95464F3D18"; // Unique identifier of the device.
    try {
      client
              .devices
              .removeDeviceZMD(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#removeDeviceZMD");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .removeDeviceZMD(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#removeDeviceZMD");
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
| **deviceId** | **String**| Unique identifier of the device. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content** Device deleted successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;30055008&#x60; &lt;br&gt;  no permission. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;30055012&#x60; &lt;br&gt;  no found unified deviceId. &lt;br&gt;  |  -  |

<a name="removeZpaDeviceByVendorAndMacAddress"></a>
# **removeZpaDeviceByVendorAndMacAddress**
> removeZpaDeviceByVendorAndMacAddress(vendor, macAddress).execute();

Delete ZPA device by vendor and mac address

Remove a ZPA device from the device manager, by vendor and mac address.  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String vendor = "Poly"; // The device's manufacturer.
    String macAddress = "64167ffc0ed7"; // The device's mac address.
    try {
      client
              .devices
              .removeZpaDeviceByVendorAndMacAddress(vendor, macAddress)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#removeZpaDeviceByVendorAndMacAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .removeZpaDeviceByVendorAndMacAddress(vendor, macAddress)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#removeZpaDeviceByVendorAndMacAddress");
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
| **vendor** | **String**| The device&#39;s manufacturer. | |
| **macAddress** | **String**| The device&#39;s mac address. | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content** Device deleted successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;30052026&#x60; &lt;br&gt;  Device is not ZPA. &lt;br&gt; **Error Code:** &#x60;30055003&#x60; &lt;br&gt;  Device vendor does not support. &lt;br&gt; **Error Code:** &#x60;30055007&#x60; &lt;br&gt;  Mac address is wrong. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found     **Error Code:** &#x60;30051039&#x60; &lt;br&gt;  Zdm device not found. &lt;br&gt;  |  -  |

<a name="updateDeviceName"></a>
# **updateDeviceName**
> updateDeviceName(deviceId).devicesUpdateDeviceNameRequest(devicesUpdateDeviceNameRequest).execute();

Change device 

Change device name.   **Prerequisites:** * Device must be enrolled in ZMD (Zoom Device Management)  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;MEDIUM&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String deviceName = "deviceName_example"; // The name of the device.
    String deviceId = "F1C6E9DF-429E-4FA1-85DA-AC95464F3D18"; // Unique identifier of the device.
    String tag = "tag_example"; // The name of the tag.
    String roomId = "roomId_example"; // id of the Zoom Room.
    Integer deviceType = 0; // Device Type:    `0` - Zoom Rooms Computer.    `1` - Zoom Rooms Controller.    `2` - Zoom Rooms Scheduling Display.
    try {
      client
              .devices
              .updateDeviceName(deviceName, deviceId)
              .tag(tag)
              .roomId(roomId)
              .deviceType(deviceType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDeviceName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .updateDeviceName(deviceName, deviceId)
              .tag(tag)
              .roomId(roomId)
              .deviceType(deviceType)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDeviceName");
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
| **deviceId** | **String**| Unique identifier of the device. | |
| **devicesUpdateDeviceNameRequest** | [**DevicesUpdateDeviceNameRequest**](DevicesUpdateDeviceNameRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60; **No Content**    Request processed successfully. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request    **Error Code:** &#x60;30055001&#x60; &lt;br&gt;  zoom room does not exist. . &lt;br&gt; **Error Code:** &#x60;30055002&#x60; &lt;br&gt;  required param can not be empty or null. &lt;br&gt; **Error Code:** &#x60;30055003&#x60; &lt;br&gt;  device type does not support. &lt;br&gt; **Error Code:** &#x60;30055011&#x60; &lt;br&gt;  device is not enrolled. &lt;br&gt; **Error Code:** &#x60;30055013&#x60; &lt;br&gt;  device not support this app. &lt;br&gt; **Error Code:** &#x60;30055014&#x60; &lt;br&gt;  room not support this app. &lt;br&gt;  |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found    **Error Code:** &#x60;30055012&#x60; &lt;br&gt;  Device does not exist: {deviceId}. &lt;br&gt;  |  -  |

<a name="upgradeZpaOsApp"></a>
# **upgradeZpaOsApp**
> upgradeZpaOsApp().devicesUpgradeZpaOsAppRequest(devicesUpgradeZpaOsAppRequest).execute();

upgrade zpa os/app

Upgrade ZPA firmware or app by Zoom Device Manager (ZDM) group ID.  **Scopes:** &#x60;device:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;HEAVY&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DevicesApi;
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
    String zdmGroupId = "zdmGroupId_example"; // The ZDM group ID.
    Object data = null;
    try {
      client
              .devices
              .upgradeZpaOsApp(zdmGroupId, data)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#upgradeZpaOsApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .devices
              .upgradeZpaOsApp(zdmGroupId, data)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#upgradeZpaOsApp");
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
| **devicesUpgradeZpaOsAppRequest** | [**DevicesUpgradeZpaOsAppRequest**](DevicesUpgradeZpaOsAppRequest.md)|  | [optional] |

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
| **202** | The upgrade request has been accepted and is currently being processed. |  -  |
| **400** | **HTTP Status Code:** &#x60;400&#x60; &lt;br&gt;  Bad Request     **Error Code:** &#x60;30052029&#x60; &lt;br&gt;  Missing required input: firmware_versions. &lt;br&gt; **Error Code:** &#x60;30055020&#x60; &lt;br&gt;  Upgrade type dose not exist. &lt;br&gt; **Error Code:** &#x60;30055018&#x60; &lt;br&gt;  Zdm group id dose not exist. &lt;br&gt; **Error Code:** &#x60;30052030&#x60; &lt;br&gt;  Missing required input: app_version. &lt;br&gt;  |  -  |

