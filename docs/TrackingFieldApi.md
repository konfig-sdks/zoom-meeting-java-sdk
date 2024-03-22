# TrackingFieldApi

All URIs are relative to *https://api.zoom.us/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createField**](TrackingFieldApi.md#createField) | **POST** /tracking_fields | Create a tracking field |
| [**deleteField**](TrackingFieldApi.md#deleteField) | **DELETE** /tracking_fields/{fieldId} | Delete a tracking field |
| [**get**](TrackingFieldApi.md#get) | **GET** /tracking_fields/{fieldId} | Get a tracking field |
| [**list**](TrackingFieldApi.md#list) | **GET** /tracking_fields | List tracking fields |
| [**update**](TrackingFieldApi.md#update) | **PATCH** /tracking_fields/{fieldId} | Update a tracking field |


<a name="createField"></a>
# **createField**
> TrackingFieldCreateFieldResponse createField().trackingFieldCreateFieldRequest(trackingFieldCreateFieldRequest).execute();

Create a tracking field

Use this API to create a new [tracking field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields). Tracking fields let you analyze usage by various fields within an organization. When scheduling a meeting, tracking fields will be included in the meeting options.   **Prerequisites:**  * A Business, Education, API or higher plan.  **Scopes:** &#x60;tracking_fields:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingFieldApi;
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
    String field = "field_example"; // Label/ Name for the tracking field.
    List<String> recommendedValues = Arrays.asList(); // Array of recommended values
    Boolean required = true; // Tracking Field Required
    Boolean visible = true; // Tracking Field Visible
    try {
      TrackingFieldCreateFieldResponse result = client
              .trackingField
              .createField()
              .field(field)
              .recommendedValues(recommendedValues)
              .required(required)
              .visible(visible)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getField());
      System.out.println(result.getRecommendedValues());
      System.out.println(result.getRequired());
      System.out.println(result.getVisible());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#createField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackingFieldCreateFieldResponse> response = client
              .trackingField
              .createField()
              .field(field)
              .recommendedValues(recommendedValues)
              .required(required)
              .visible(visible)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#createField");
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
| **trackingFieldCreateFieldRequest** | [**TrackingFieldCreateFieldRequest**](TrackingFieldCreateFieldRequest.md)| Tracking Field | [optional] |

### Return type

[**TrackingFieldCreateFieldResponse**](TrackingFieldCreateFieldResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | **HTTP Status Code:** &#x60;201&#x60;     Tracking Field created |  -  |

<a name="deleteField"></a>
# **deleteField**
> deleteField(fieldId).execute();

Delete a tracking field

Use this API to delete a [tracking field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields).   **Prerequisites:**  * A Business, Education, API or higher plan.  **Scopes:** &#x60;tracking_fields:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingFieldApi;
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
    String fieldId = "a32CJji-weJ92"; // The Tracking Field ID
    try {
      client
              .trackingField
              .deleteField(fieldId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#deleteField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trackingField
              .deleteField(fieldId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#deleteField");
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
| **fieldId** | **String**| The Tracking Field ID | |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Tracking Field deleted |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="get"></a>
# **get**
> TrackingFieldGetResponse get(fieldId).execute();

Get a tracking field

Use this API to return information about a [tracking field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields).   **Prerequisites:**  * A Business, Education, API or higher plan.  **Scopes:** &#x60;tracking_fields:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingFieldApi;
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
    String fieldId = "a32CJji-weJ92"; // The Tracking Field ID
    try {
      TrackingFieldGetResponse result = client
              .trackingField
              .get(fieldId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getField());
      System.out.println(result.getRecommendedValues());
      System.out.println(result.getRequired());
      System.out.println(result.getVisible());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackingFieldGetResponse> response = client
              .trackingField
              .get(fieldId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#get");
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
| **fieldId** | **String**| The Tracking Field ID | |

### Return type

[**TrackingFieldGetResponse**](TrackingFieldGetResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     Tracking Field object returned |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

<a name="list"></a>
# **list**
> TrackingFieldListResponse list().execute();

List tracking fields

Use this API to list all the [tracking fields](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields) on your Zoom account. Tracking fields let you analyze usage by various fields within an organization.   **Prerequisites:**  * A Business, Education, API or higher plan.  **Scopes:** &#x60;tracking_fields:read:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Medium&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingFieldApi;
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
      TrackingFieldListResponse result = client
              .trackingField
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalRecords());
      System.out.println(result.getTrackingFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackingFieldListResponse> response = client
              .trackingField
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#list");
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

[**TrackingFieldListResponse**](TrackingFieldListResponse.md)

### Authorization

[openapi_authorization](../README.md#openapi_authorization), [openapi_oauth](../README.md#openapi_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **HTTP Status Code:** &#x60;200&#x60;     List of Tracking Fields returned. |  -  |

<a name="update"></a>
# **update**
> update(fieldId).trackingFieldUpdateRequest(trackingFieldUpdateRequest).execute();

Update a tracking field

Use this API to update a [tracking field](https://support.zoom.us/hc/en-us/articles/115000293426-Scheduling-Tracking-Fields).   **Prerequisites:**  * A Business, Education, API or higher plan.  **Scopes:** &#x60;tracking_fields:write:admin&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZoomMeeting;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackingFieldApi;
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
    String fieldId = "a32CJji-weJ92"; // The Tracking Field ID
    String field = "field_example"; // Label/ Name for the tracking field.
    List<String> recommendedValues = Arrays.asList(); // Array of recommended values
    Boolean required = true; // Tracking Field Required
    Boolean visible = true; // Tracking Field Visible
    try {
      client
              .trackingField
              .update(fieldId)
              .field(field)
              .recommendedValues(recommendedValues)
              .required(required)
              .visible(visible)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trackingField
              .update(fieldId)
              .field(field)
              .recommendedValues(recommendedValues)
              .required(required)
              .visible(visible)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackingFieldApi#update");
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
| **fieldId** | **String**| The Tracking Field ID | |
| **trackingFieldUpdateRequest** | [**TrackingFieldUpdateRequest**](TrackingFieldUpdateRequest.md)|  | [optional] |

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
| **204** | **HTTP Status Code:** &#x60;204&#x60;     Tracking Field updated |  -  |
| **404** | **HTTP Status Code:** &#x60;404&#x60; &lt;br&gt;  Not Found   |  -  |

