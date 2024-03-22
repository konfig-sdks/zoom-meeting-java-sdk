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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * MeetingsGetLivestreamDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MeetingsGetLivestreamDetailsResponse {
  public static final String SERIALIZED_NAME_PAGE_URL = "page_url";
  @SerializedName(SERIALIZED_NAME_PAGE_URL)
  private String pageUrl;

  public static final String SERIALIZED_NAME_STREAM_KEY = "stream_key";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public static final String SERIALIZED_NAME_STREAM_URL = "stream_url";
  @SerializedName(SERIALIZED_NAME_STREAM_URL)
  private String streamUrl;

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private String resolution;

  public MeetingsGetLivestreamDetailsResponse() {
  }

  public MeetingsGetLivestreamDetailsResponse pageUrl(String pageUrl) {
    
    
    
    
    this.pageUrl = pageUrl;
    return this;
  }

   /**
   * Live streaming page URL. This is the URL using which anyone can view the livestream of the meeting.
   * @return pageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/livestream/123", value = "Live streaming page URL. This is the URL using which anyone can view the livestream of the meeting.")

  public String getPageUrl() {
    return pageUrl;
  }


  public void setPageUrl(String pageUrl) {
    
    
    
    this.pageUrl = pageUrl;
  }


  public MeetingsGetLivestreamDetailsResponse streamKey(String streamKey) {
    
    
    
    
    this.streamKey = streamKey;
    return this;
  }

   /**
   * Stream Key.
   * @return streamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contact-ic@example.com", value = "Stream Key.")

  public String getStreamKey() {
    return streamKey;
  }


  public void setStreamKey(String streamKey) {
    
    
    
    this.streamKey = streamKey;
  }


  public MeetingsGetLivestreamDetailsResponse streamUrl(String streamUrl) {
    
    
    
    
    this.streamUrl = streamUrl;
    return this;
  }

   /**
   * Stream URL.
   * @return streamUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/livestream", value = "Stream URL.")

  public String getStreamUrl() {
    return streamUrl;
  }


  public void setStreamUrl(String streamUrl) {
    
    
    
    this.streamUrl = streamUrl;
  }


  public MeetingsGetLivestreamDetailsResponse resolution(String resolution) {
    
    
    
    
    this.resolution = resolution;
    return this;
  }

   /**
   * The number of pixels in each dimension that the video camera can display.
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "720p", value = "The number of pixels in each dimension that the video camera can display.")

  public String getResolution() {
    return resolution;
  }


  public void setResolution(String resolution) {
    
    
    
    this.resolution = resolution;
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
   * @return the MeetingsGetLivestreamDetailsResponse instance itself
   */
  public MeetingsGetLivestreamDetailsResponse putAdditionalProperty(String key, Object value) {
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
    MeetingsGetLivestreamDetailsResponse meetingsGetLivestreamDetailsResponse = (MeetingsGetLivestreamDetailsResponse) o;
    return Objects.equals(this.pageUrl, meetingsGetLivestreamDetailsResponse.pageUrl) &&
        Objects.equals(this.streamKey, meetingsGetLivestreamDetailsResponse.streamKey) &&
        Objects.equals(this.streamUrl, meetingsGetLivestreamDetailsResponse.streamUrl) &&
        Objects.equals(this.resolution, meetingsGetLivestreamDetailsResponse.resolution)&&
        Objects.equals(this.additionalProperties, meetingsGetLivestreamDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageUrl, streamKey, streamUrl, resolution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingsGetLivestreamDetailsResponse {\n");
    sb.append("    pageUrl: ").append(toIndentedString(pageUrl)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    streamUrl: ").append(toIndentedString(streamUrl)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
    openapiFields.add("page_url");
    openapiFields.add("stream_key");
    openapiFields.add("stream_url");
    openapiFields.add("resolution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeetingsGetLivestreamDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeetingsGetLivestreamDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeetingsGetLivestreamDetailsResponse is not found in the empty JSON string", MeetingsGetLivestreamDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("page_url") != null && !jsonObj.get("page_url").isJsonNull()) && !jsonObj.get("page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_url").toString()));
      }
      if ((jsonObj.get("stream_key") != null && !jsonObj.get("stream_key").isJsonNull()) && !jsonObj.get("stream_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_key").toString()));
      }
      if ((jsonObj.get("stream_url") != null && !jsonObj.get("stream_url").isJsonNull()) && !jsonObj.get("stream_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_url").toString()));
      }
      if ((jsonObj.get("resolution") != null && !jsonObj.get("resolution").isJsonNull()) && !jsonObj.get("resolution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeetingsGetLivestreamDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeetingsGetLivestreamDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeetingsGetLivestreamDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeetingsGetLivestreamDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MeetingsGetLivestreamDetailsResponse>() {
           @Override
           public void write(JsonWriter out, MeetingsGetLivestreamDetailsResponse value) throws IOException {
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
           public MeetingsGetLivestreamDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeetingsGetLivestreamDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeetingsGetLivestreamDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeetingsGetLivestreamDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to MeetingsGetLivestreamDetailsResponse
  */
  public static MeetingsGetLivestreamDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeetingsGetLivestreamDetailsResponse.class);
  }

 /**
  * Convert an instance of MeetingsGetLivestreamDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

