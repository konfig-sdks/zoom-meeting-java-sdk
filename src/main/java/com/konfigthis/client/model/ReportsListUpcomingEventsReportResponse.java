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
import com.konfigthis.client.model.ReportsListUpcomingEventsReportResponseUpcomingEventsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * ReportsListUpcomingEventsReportResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsListUpcomingEventsReportResponse {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private LocalDate from;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "next_page_token";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = 30;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private LocalDate to;

  public static final String SERIALIZED_NAME_UPCOMING_EVENTS = "upcoming_events";
  @SerializedName(SERIALIZED_NAME_UPCOMING_EVENTS)
  private List<ReportsListUpcomingEventsReportResponseUpcomingEventsInner> upcomingEvents = null;

  public ReportsListUpcomingEventsReportResponse() {
  }

  public ReportsListUpcomingEventsReportResponse from(LocalDate from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * The report&#39;s start date. This value must be within the past six months.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Feb 28 16:00:00 PST 2022", value = "The report's start date. This value must be within the past six months.")

  public LocalDate getFrom() {
    return from;
  }


  public void setFrom(LocalDate from) {
    
    
    
    this.from = from;
  }


  public ReportsListUpcomingEventsReportResponse nextPageToken(String nextPageToken) {
    
    
    
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The next page token is used to paginate through large result sets. A next page token returns when the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b43YBRLJFg3V4vsSpxvGdKIGtNbxn9h9If2", value = "The next page token is used to paginate through large result sets. A next page token returns when the set of available results exceeds the current page size. The expiration period for this token is 15 minutes.")

  public String getNextPageToken() {
    return nextPageToken;
  }


  public void setNextPageToken(String nextPageToken) {
    
    
    
    this.nextPageToken = nextPageToken;
  }


  public ReportsListUpcomingEventsReportResponse pageSize(Integer pageSize) {
    
    if (pageSize != null && pageSize > 300) {
      throw new IllegalArgumentException("Invalid value for pageSize. Must be less than or equal to 300.");
    }
    
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of records returned in a single API call.
   * maximum: 300
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "The number of records returned in a single API call.")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    
    if (pageSize != null && pageSize > 300) {
      throw new IllegalArgumentException("Invalid value for pageSize. Must be less than or equal to 300.");
    }
    
    this.pageSize = pageSize;
  }


  public ReportsListUpcomingEventsReportResponse to(LocalDate to) {
    
    
    
    
    this.to = to;
    return this;
  }

   /**
   * The report&#39;s end date. This value must be within the past six months and cannot exceed a month from the &#x60;from&#x60; value.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Mar 24 17:00:00 PDT 2022", value = "The report's end date. This value must be within the past six months and cannot exceed a month from the `from` value.")

  public LocalDate getTo() {
    return to;
  }


  public void setTo(LocalDate to) {
    
    
    
    this.to = to;
  }


  public ReportsListUpcomingEventsReportResponse upcomingEvents(List<ReportsListUpcomingEventsReportResponseUpcomingEventsInner> upcomingEvents) {
    
    
    
    
    this.upcomingEvents = upcomingEvents;
    return this;
  }

  public ReportsListUpcomingEventsReportResponse addUpcomingEventsItem(ReportsListUpcomingEventsReportResponseUpcomingEventsInner upcomingEventsItem) {
    if (this.upcomingEvents == null) {
      this.upcomingEvents = new ArrayList<>();
    }
    this.upcomingEvents.add(upcomingEventsItem);
    return this;
  }

   /**
   * Information about the upcoming event.
   * @return upcomingEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the upcoming event.")

  public List<ReportsListUpcomingEventsReportResponseUpcomingEventsInner> getUpcomingEvents() {
    return upcomingEvents;
  }


  public void setUpcomingEvents(List<ReportsListUpcomingEventsReportResponseUpcomingEventsInner> upcomingEvents) {
    
    
    
    this.upcomingEvents = upcomingEvents;
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
   * @return the ReportsListUpcomingEventsReportResponse instance itself
   */
  public ReportsListUpcomingEventsReportResponse putAdditionalProperty(String key, Object value) {
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
    ReportsListUpcomingEventsReportResponse reportsListUpcomingEventsReportResponse = (ReportsListUpcomingEventsReportResponse) o;
    return Objects.equals(this.from, reportsListUpcomingEventsReportResponse.from) &&
        Objects.equals(this.nextPageToken, reportsListUpcomingEventsReportResponse.nextPageToken) &&
        Objects.equals(this.pageSize, reportsListUpcomingEventsReportResponse.pageSize) &&
        Objects.equals(this.to, reportsListUpcomingEventsReportResponse.to) &&
        Objects.equals(this.upcomingEvents, reportsListUpcomingEventsReportResponse.upcomingEvents)&&
        Objects.equals(this.additionalProperties, reportsListUpcomingEventsReportResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, nextPageToken, pageSize, to, upcomingEvents, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsListUpcomingEventsReportResponse {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    upcomingEvents: ").append(toIndentedString(upcomingEvents)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("next_page_token");
    openapiFields.add("page_size");
    openapiFields.add("to");
    openapiFields.add("upcoming_events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsListUpcomingEventsReportResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsListUpcomingEventsReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsListUpcomingEventsReportResponse is not found in the empty JSON string", ReportsListUpcomingEventsReportResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("next_page_token") != null && !jsonObj.get("next_page_token").isJsonNull()) && !jsonObj.get("next_page_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page_token").toString()));
      }
      if (jsonObj.get("upcoming_events") != null && !jsonObj.get("upcoming_events").isJsonNull()) {
        JsonArray jsonArrayupcomingEvents = jsonObj.getAsJsonArray("upcoming_events");
        if (jsonArrayupcomingEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("upcoming_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `upcoming_events` to be an array in the JSON string but got `%s`", jsonObj.get("upcoming_events").toString()));
          }

          // validate the optional field `upcoming_events` (array)
          for (int i = 0; i < jsonArrayupcomingEvents.size(); i++) {
            ReportsListUpcomingEventsReportResponseUpcomingEventsInner.validateJsonObject(jsonArrayupcomingEvents.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsListUpcomingEventsReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsListUpcomingEventsReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsListUpcomingEventsReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsListUpcomingEventsReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsListUpcomingEventsReportResponse>() {
           @Override
           public void write(JsonWriter out, ReportsListUpcomingEventsReportResponse value) throws IOException {
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
           public ReportsListUpcomingEventsReportResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsListUpcomingEventsReportResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsListUpcomingEventsReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsListUpcomingEventsReportResponse
  * @throws IOException if the JSON string is invalid with respect to ReportsListUpcomingEventsReportResponse
  */
  public static ReportsListUpcomingEventsReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsListUpcomingEventsReportResponse.class);
  }

 /**
  * Convert an instance of ReportsListUpcomingEventsReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
