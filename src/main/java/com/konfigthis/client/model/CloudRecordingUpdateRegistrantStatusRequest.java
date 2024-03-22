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
import com.konfigthis.client.model.CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner;
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
 * Registrant Status
 */
@ApiModel(description = "Registrant Status")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CloudRecordingUpdateRegistrantStatusRequest {
  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
 public enum ActionEnum {
    APPROVE("approve"),
    
    DENY("deny");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_REGISTRANTS = "registrants";
  @SerializedName(SERIALIZED_NAME_REGISTRANTS)
  private List<CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner> registrants = null;

  public CloudRecordingUpdateRegistrantStatusRequest() {
  }

  public CloudRecordingUpdateRegistrantStatusRequest action(ActionEnum action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "APPROVE", required = true, value = "")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    
    
    
    this.action = action;
  }


  public CloudRecordingUpdateRegistrantStatusRequest registrants(List<CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner> registrants) {
    
    
    
    
    this.registrants = registrants;
    return this;
  }

  public CloudRecordingUpdateRegistrantStatusRequest addRegistrantsItem(CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner registrantsItem) {
    if (this.registrants == null) {
      this.registrants = new ArrayList<>();
    }
    this.registrants.add(registrantsItem);
    return this;
  }

   /**
   * List of registrants
   * @return registrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of registrants")

  public List<CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner> getRegistrants() {
    return registrants;
  }


  public void setRegistrants(List<CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner> registrants) {
    
    
    
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
   * @return the CloudRecordingUpdateRegistrantStatusRequest instance itself
   */
  public CloudRecordingUpdateRegistrantStatusRequest putAdditionalProperty(String key, Object value) {
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
    CloudRecordingUpdateRegistrantStatusRequest cloudRecordingUpdateRegistrantStatusRequest = (CloudRecordingUpdateRegistrantStatusRequest) o;
    return Objects.equals(this.action, cloudRecordingUpdateRegistrantStatusRequest.action) &&
        Objects.equals(this.registrants, cloudRecordingUpdateRegistrantStatusRequest.registrants)&&
        Objects.equals(this.additionalProperties, cloudRecordingUpdateRegistrantStatusRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, registrants, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRecordingUpdateRegistrantStatusRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("registrants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudRecordingUpdateRegistrantStatusRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CloudRecordingUpdateRegistrantStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRecordingUpdateRegistrantStatusRequest is not found in the empty JSON string", CloudRecordingUpdateRegistrantStatusRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudRecordingUpdateRegistrantStatusRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
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
            CloudRecordingUpdateRegistrantStatusRequestRegistrantsInner.validateJsonObject(jsonArrayregistrants.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRecordingUpdateRegistrantStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRecordingUpdateRegistrantStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRecordingUpdateRegistrantStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRecordingUpdateRegistrantStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRecordingUpdateRegistrantStatusRequest>() {
           @Override
           public void write(JsonWriter out, CloudRecordingUpdateRegistrantStatusRequest value) throws IOException {
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
           public CloudRecordingUpdateRegistrantStatusRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudRecordingUpdateRegistrantStatusRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CloudRecordingUpdateRegistrantStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudRecordingUpdateRegistrantStatusRequest
  * @throws IOException if the JSON string is invalid with respect to CloudRecordingUpdateRegistrantStatusRequest
  */
  public static CloudRecordingUpdateRegistrantStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRecordingUpdateRegistrantStatusRequest.class);
  }

 /**
  * Convert an instance of CloudRecordingUpdateRegistrantStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
