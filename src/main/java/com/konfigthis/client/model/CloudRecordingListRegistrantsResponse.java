/*
 * Zoom Meeting API
 * The Zoom Meeting APIs let developers to access information from Zoom. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CloudRecordingListRegistrantsResponseRegistrantsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Information about the meeting cloud recording registrant.
 */
@ApiModel(description = "Information about the meeting cloud recording registrant.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CloudRecordingListRegistrantsResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "next_page_token";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "page_count";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber = 1;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = 30;

  public static final String SERIALIZED_NAME_TOTAL_RECORDS = "total_records";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDS)
  private Integer totalRecords;

  public static final String SERIALIZED_NAME_REGISTRANTS = "registrants";
  @SerializedName(SERIALIZED_NAME_REGISTRANTS)
  private List<CloudRecordingListRegistrantsResponseRegistrantsInner> registrants = null;

  public CloudRecordingListRegistrantsResponse() {
  }

  public CloudRecordingListRegistrantsResponse nextPageToken(String nextPageToken) {
    
    
    
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "w7587w4eiyfsudgf", value = "The next page token is used to paginate through large result sets. A next page token will be returned whenever the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.")

  public String getNextPageToken() {
    return nextPageToken;
  }


  public void setNextPageToken(String nextPageToken) {
    
    
    
    this.nextPageToken = nextPageToken;
  }


  public CloudRecordingListRegistrantsResponse pageCount(Integer pageCount) {
    
    
    
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages returned for the request made.
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of pages returned for the request made.")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    
    
    
    this.pageCount = pageCount;
  }


  public CloudRecordingListRegistrantsResponse pageNumber(Integer pageNumber) {
    
    
    
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * **Deprecated.** We will no longer support this field in a future release. Instead, use the &#x60;next_page_token&#x60; for pagination.
   * @return pageNumber
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "**Deprecated.** We will no longer support this field in a future release. Instead, use the `next_page_token` for pagination.")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    
    
    
    this.pageNumber = pageNumber;
  }


  public CloudRecordingListRegistrantsResponse pageSize(Integer pageSize) {
    
    if (pageSize != null && pageSize > 300) {
      throw new IllegalArgumentException("Invalid value for pageSize. Must be less than or equal to 300.");
    }
    
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of records returned with a single API call.
   * maximum: 300
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "The number of records returned with a single API call.")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    
    if (pageSize != null && pageSize > 300) {
      throw new IllegalArgumentException("Invalid value for pageSize. Must be less than or equal to 300.");
    }
    
    this.pageSize = pageSize;
  }


  public CloudRecordingListRegistrantsResponse totalRecords(Integer totalRecords) {
    
    
    
    
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * The total number of all the records available across pages.
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The total number of all the records available across pages.")

  public Integer getTotalRecords() {
    return totalRecords;
  }


  public void setTotalRecords(Integer totalRecords) {
    
    
    
    this.totalRecords = totalRecords;
  }


  public CloudRecordingListRegistrantsResponse registrants(List<CloudRecordingListRegistrantsResponseRegistrantsInner> registrants) {
    
    
    
    
    this.registrants = registrants;
    return this;
  }

  public CloudRecordingListRegistrantsResponse addRegistrantsItem(CloudRecordingListRegistrantsResponseRegistrantsInner registrantsItem) {
    if (this.registrants == null) {
      this.registrants = new ArrayList<>();
    }
    this.registrants.add(registrantsItem);
    return this;
  }

   /**
   * Information about the cloud recording registrants.
   * @return registrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the cloud recording registrants.")

  public List<CloudRecordingListRegistrantsResponseRegistrantsInner> getRegistrants() {
    return registrants;
  }


  public void setRegistrants(List<CloudRecordingListRegistrantsResponseRegistrantsInner> registrants) {
    
    
    
    this.registrants = registrants;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CloudRecordingListRegistrantsResponse instance itself
   */
  public CloudRecordingListRegistrantsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRecordingListRegistrantsResponse cloudRecordingListRegistrantsResponse = (CloudRecordingListRegistrantsResponse) o;
    return Objects.equals(this.nextPageToken, cloudRecordingListRegistrantsResponse.nextPageToken) &&
        Objects.equals(this.pageCount, cloudRecordingListRegistrantsResponse.pageCount) &&
        Objects.equals(this.pageNumber, cloudRecordingListRegistrantsResponse.pageNumber) &&
        Objects.equals(this.pageSize, cloudRecordingListRegistrantsResponse.pageSize) &&
        Objects.equals(this.totalRecords, cloudRecordingListRegistrantsResponse.totalRecords) &&
        Objects.equals(this.registrants, cloudRecordingListRegistrantsResponse.registrants)&&
        Objects.equals(this.additionalProperties, cloudRecordingListRegistrantsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pageCount, pageNumber, pageSize, totalRecords, registrants, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRecordingListRegistrantsResponse {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    registrants: ").append(toIndentedString(registrants)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("next_page_token");
    openapiFields.add("page_count");
    openapiFields.add("page_number");
    openapiFields.add("page_size");
    openapiFields.add("total_records");
    openapiFields.add("registrants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudRecordingListRegistrantsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CloudRecordingListRegistrantsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRecordingListRegistrantsResponse is not found in the empty JSON string", CloudRecordingListRegistrantsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("next_page_token") != null && !jsonObj.get("next_page_token").isJsonNull()) && !jsonObj.get("next_page_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page_token").toString()));
      }
      if (jsonObj.get("registrants") != null && !jsonObj.get("registrants").isJsonNull()) {
        JsonArray jsonArrayregistrants = jsonObj.getAsJsonArray("registrants");
        if (jsonArrayregistrants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("registrants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `registrants` to be an array in the JSON string but got `%s`", jsonObj.get("registrants").toString()));
          }

          // validate the optional field `registrants` (array)
          for (int i = 0; i < jsonArrayregistrants.size(); i++) {
            CloudRecordingListRegistrantsResponseRegistrantsInner.validateJsonObject(jsonArrayregistrants.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRecordingListRegistrantsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRecordingListRegistrantsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRecordingListRegistrantsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRecordingListRegistrantsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRecordingListRegistrantsResponse>() {
           @Override
           public void write(JsonWriter out, CloudRecordingListRegistrantsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudRecordingListRegistrantsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudRecordingListRegistrantsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudRecordingListRegistrantsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudRecordingListRegistrantsResponse
  * @throws IOException if the JSON string is invalid with respect to CloudRecordingListRegistrantsResponse
  */
  public static CloudRecordingListRegistrantsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRecordingListRegistrantsResponse.class);
  }

 /**
  * Convert an instance of CloudRecordingListRegistrantsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

