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
import com.konfigthis.client.model.WebinarsCreateInviteLinksRequestAttendeesInner;
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
 * Invite Links
 */
@ApiModel(description = "Invite Links")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsCreateInviteLinksRequest {
  public static final String SERIALIZED_NAME_ATTENDEES = "attendees";
  @SerializedName(SERIALIZED_NAME_ATTENDEES)
  private List<WebinarsCreateInviteLinksRequestAttendeesInner> attendees = null;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl = 7200l;

  public WebinarsCreateInviteLinksRequest() {
  }

  public WebinarsCreateInviteLinksRequest attendees(List<WebinarsCreateInviteLinksRequestAttendeesInner> attendees) {
    
    
    
    
    this.attendees = attendees;
    return this;
  }

  public WebinarsCreateInviteLinksRequest addAttendeesItem(WebinarsCreateInviteLinksRequestAttendeesInner attendeesItem) {
    if (this.attendees == null) {
      this.attendees = new ArrayList<>();
    }
    this.attendees.add(attendeesItem);
    return this;
  }

   /**
   * The attendees list.
   * @return attendees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attendees list.")

  public List<WebinarsCreateInviteLinksRequestAttendeesInner> getAttendees() {
    return attendees;
  }


  public void setAttendees(List<WebinarsCreateInviteLinksRequestAttendeesInner> attendees) {
    
    
    
    this.attendees = attendees;
  }


  public WebinarsCreateInviteLinksRequest ttl(Long ttl) {
    if (ttl != null && ttl < 0) {
      throw new IllegalArgumentException("Invalid value for ttl. Must be greater than or equal to 0.");
    }
    if (ttl != null && ttl > 7776000) {
      throw new IllegalArgumentException("Invalid value for ttl. Must be less than or equal to 7776000.");
    }
    
    
    this.ttl = ttl;
    return this;
  }

   /**
   * The invite link&#39;s expiration time, in seconds.   This value defaults to &#x60;7200&#x60;.
   * minimum: 0
   * maximum: 7776000
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The invite link's expiration time, in seconds.   This value defaults to `7200`.")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    if (ttl != null && ttl < 0) {
      throw new IllegalArgumentException("Invalid value for ttl. Must be greater than or equal to 0.");
    }
    if (ttl != null && ttl > 7776000) {
      throw new IllegalArgumentException("Invalid value for ttl. Must be less than or equal to 7776000.");
    }
    
    this.ttl = ttl;
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
   * @return the WebinarsCreateInviteLinksRequest instance itself
   */
  public WebinarsCreateInviteLinksRequest putAdditionalProperty(String key, Object value) {
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
    WebinarsCreateInviteLinksRequest webinarsCreateInviteLinksRequest = (WebinarsCreateInviteLinksRequest) o;
    return Objects.equals(this.attendees, webinarsCreateInviteLinksRequest.attendees) &&
        Objects.equals(this.ttl, webinarsCreateInviteLinksRequest.ttl)&&
        Objects.equals(this.additionalProperties, webinarsCreateInviteLinksRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendees, ttl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsCreateInviteLinksRequest {\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("attendees");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsCreateInviteLinksRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsCreateInviteLinksRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsCreateInviteLinksRequest is not found in the empty JSON string", WebinarsCreateInviteLinksRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("attendees") != null && !jsonObj.get("attendees").isJsonNull()) {
        JsonArray jsonArrayattendees = jsonObj.getAsJsonArray("attendees");
        if (jsonArrayattendees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attendees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attendees` to be an array in the JSON string but got `%s`", jsonObj.get("attendees").toString()));
          }

          // validate the optional field `attendees` (array)
          for (int i = 0; i < jsonArrayattendees.size(); i++) {
            WebinarsCreateInviteLinksRequestAttendeesInner.validateJsonObject(jsonArrayattendees.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsCreateInviteLinksRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsCreateInviteLinksRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsCreateInviteLinksRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsCreateInviteLinksRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsCreateInviteLinksRequest>() {
           @Override
           public void write(JsonWriter out, WebinarsCreateInviteLinksRequest value) throws IOException {
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
           public WebinarsCreateInviteLinksRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsCreateInviteLinksRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsCreateInviteLinksRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsCreateInviteLinksRequest
  * @throws IOException if the JSON string is invalid with respect to WebinarsCreateInviteLinksRequest
  */
  public static WebinarsCreateInviteLinksRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsCreateInviteLinksRequest.class);
  }

 /**
  * Convert an instance of WebinarsCreateInviteLinksRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

