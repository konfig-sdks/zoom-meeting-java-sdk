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
 * DevicesUpdateDeviceNameRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DevicesUpdateDeviceNameRequest {
  public static final String SERIALIZED_NAME_DEVICE_NAME = "device_name";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  /**
   * Device Type:    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
 public enum DeviceTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_3(3);

    private Integer value;

    DeviceTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(Integer value) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DeviceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private DeviceTypeEnum deviceType;

  public DevicesUpdateDeviceNameRequest() {
  }

  public DevicesUpdateDeviceNameRequest deviceName(String deviceName) {
    
    
    
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The name of the device.
   * @return deviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My device", required = true, value = "The name of the device.")

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    
    
    
    this.deviceName = deviceName;
  }


  public DevicesUpdateDeviceNameRequest tag(String tag) {
    
    
    
    
    this.tag = tag;
    return this;
  }

   /**
   * The name of the tag.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "personal rooms", value = "The name of the tag.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    
    
    
    this.tag = tag;
  }


  public DevicesUpdateDeviceNameRequest roomId(String roomId) {
    
    
    
    
    this.roomId = roomId;
    return this;
  }

   /**
   * id of the Zoom Room.
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "72afdc13-a289-40c3-b358-50c8b8de", value = "id of the Zoom Room.")

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    
    
    
    this.roomId = roomId;
  }


  public DevicesUpdateDeviceNameRequest deviceType(DeviceTypeEnum deviceType) {
    
    
    
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Device Type:    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", value = "Device Type:    `0` - Zoom Rooms Computer.    `1` - Zoom Rooms Controller.    `2` - Zoom Rooms Scheduling Display.")

  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(DeviceTypeEnum deviceType) {
    
    
    
    this.deviceType = deviceType;
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
   * @return the DevicesUpdateDeviceNameRequest instance itself
   */
  public DevicesUpdateDeviceNameRequest putAdditionalProperty(String key, Object value) {
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
    DevicesUpdateDeviceNameRequest devicesUpdateDeviceNameRequest = (DevicesUpdateDeviceNameRequest) o;
    return Objects.equals(this.deviceName, devicesUpdateDeviceNameRequest.deviceName) &&
        Objects.equals(this.tag, devicesUpdateDeviceNameRequest.tag) &&
        Objects.equals(this.roomId, devicesUpdateDeviceNameRequest.roomId) &&
        Objects.equals(this.deviceType, devicesUpdateDeviceNameRequest.deviceType)&&
        Objects.equals(this.additionalProperties, devicesUpdateDeviceNameRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, tag, roomId, deviceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesUpdateDeviceNameRequest {\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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
    openapiFields.add("device_name");
    openapiFields.add("tag");
    openapiFields.add("room_id");
    openapiFields.add("device_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DevicesUpdateDeviceNameRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DevicesUpdateDeviceNameRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DevicesUpdateDeviceNameRequest is not found in the empty JSON string", DevicesUpdateDeviceNameRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DevicesUpdateDeviceNameRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("device_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_name").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("room_id") != null && !jsonObj.get("room_id").isJsonNull()) && !jsonObj.get("room_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `room_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("room_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DevicesUpdateDeviceNameRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DevicesUpdateDeviceNameRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DevicesUpdateDeviceNameRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DevicesUpdateDeviceNameRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DevicesUpdateDeviceNameRequest>() {
           @Override
           public void write(JsonWriter out, DevicesUpdateDeviceNameRequest value) throws IOException {
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
           public DevicesUpdateDeviceNameRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DevicesUpdateDeviceNameRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DevicesUpdateDeviceNameRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DevicesUpdateDeviceNameRequest
  * @throws IOException if the JSON string is invalid with respect to DevicesUpdateDeviceNameRequest
  */
  public static DevicesUpdateDeviceNameRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DevicesUpdateDeviceNameRequest.class);
  }

 /**
  * Convert an instance of DevicesUpdateDeviceNameRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

