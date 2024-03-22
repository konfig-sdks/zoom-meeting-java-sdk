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
import java.time.OffsetDateTime;

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
 * Occurrence object. This object is only returned for recurring webinars.
 */
@ApiModel(description = "Occurrence object. This object is only returned for recurring webinars.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsAddRegistrantResponseOccurrencesInner {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_OCCURRENCE_ID = "occurrence_id";
  @SerializedName(SERIALIZED_NAME_OCCURRENCE_ID)
  private String occurrenceId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public WebinarsAddRegistrantResponseOccurrencesInner() {
  }

  public WebinarsAddRegistrantResponseOccurrencesInner duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "Duration.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public WebinarsAddRegistrantResponseOccurrencesInner occurrenceId(String occurrenceId) {
    
    
    
    
    this.occurrenceId = occurrenceId;
    return this;
  }

   /**
   * Occurrence ID: Unique identifier that identifies an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences.
   * @return occurrenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1648194360000", value = "Occurrence ID: Unique identifier that identifies an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences.")

  public String getOccurrenceId() {
    return occurrenceId;
  }


  public void setOccurrenceId(String occurrenceId) {
    
    
    
    this.occurrenceId = occurrenceId;
  }


  public WebinarsAddRegistrantResponseOccurrencesInner startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-25T07:46Z", value = "Start time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public WebinarsAddRegistrantResponseOccurrencesInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Occurrence status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "available", value = "Occurrence status.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
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
   * @return the WebinarsAddRegistrantResponseOccurrencesInner instance itself
   */
  public WebinarsAddRegistrantResponseOccurrencesInner putAdditionalProperty(String key, Object value) {
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
    WebinarsAddRegistrantResponseOccurrencesInner webinarsAddRegistrantResponseOccurrencesInner = (WebinarsAddRegistrantResponseOccurrencesInner) o;
    return Objects.equals(this.duration, webinarsAddRegistrantResponseOccurrencesInner.duration) &&
        Objects.equals(this.occurrenceId, webinarsAddRegistrantResponseOccurrencesInner.occurrenceId) &&
        Objects.equals(this.startTime, webinarsAddRegistrantResponseOccurrencesInner.startTime) &&
        Objects.equals(this.status, webinarsAddRegistrantResponseOccurrencesInner.status)&&
        Objects.equals(this.additionalProperties, webinarsAddRegistrantResponseOccurrencesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, occurrenceId, startTime, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsAddRegistrantResponseOccurrencesInner {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    occurrenceId: ").append(toIndentedString(occurrenceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("occurrence_id");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsAddRegistrantResponseOccurrencesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsAddRegistrantResponseOccurrencesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsAddRegistrantResponseOccurrencesInner is not found in the empty JSON string", WebinarsAddRegistrantResponseOccurrencesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("occurrence_id") != null && !jsonObj.get("occurrence_id").isJsonNull()) && !jsonObj.get("occurrence_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `occurrence_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("occurrence_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsAddRegistrantResponseOccurrencesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsAddRegistrantResponseOccurrencesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsAddRegistrantResponseOccurrencesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsAddRegistrantResponseOccurrencesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsAddRegistrantResponseOccurrencesInner>() {
           @Override
           public void write(JsonWriter out, WebinarsAddRegistrantResponseOccurrencesInner value) throws IOException {
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
           public WebinarsAddRegistrantResponseOccurrencesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsAddRegistrantResponseOccurrencesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsAddRegistrantResponseOccurrencesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsAddRegistrantResponseOccurrencesInner
  * @throws IOException if the JSON string is invalid with respect to WebinarsAddRegistrantResponseOccurrencesInner
  */
  public static WebinarsAddRegistrantResponseOccurrencesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsAddRegistrantResponseOccurrencesInner.class);
  }

 /**
  * Convert an instance of WebinarsAddRegistrantResponseOccurrencesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

