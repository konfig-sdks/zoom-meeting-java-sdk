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
 * DevicesCreateNewDeviceRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DevicesCreateNewDeviceRequest {
  public static final String SERIALIZED_NAME_DEVICE_NAME = "device_name";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  /**
   * Device type.    &#x60;0&#x60; - Zoom Rooms computer.    &#x60;1&#x60; - Zoom Rooms controller.    &#x60;5&#x60; - Zoom Phone appliance.
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
 public enum DeviceTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_5(5);

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

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_ZDM_GROUP_ID = "zdm_group_id";
  @SerializedName(SERIALIZED_NAME_ZDM_GROUP_ID)
  private String zdmGroupId;

  public static final String SERIALIZED_NAME_EXTENSION_NUMBER = "extension_number";
  @SerializedName(SERIALIZED_NAME_EXTENSION_NUMBER)
  private String extensionNumber;

  public DevicesCreateNewDeviceRequest() {
  }

  public DevicesCreateNewDeviceRequest deviceName(String deviceName) {
    
    
    
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The device&#39;s name.
   * @return deviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My device", required = true, value = "The device's name.")

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    
    
    
    this.deviceName = deviceName;
  }


  public DevicesCreateNewDeviceRequest macAddress(String macAddress) {
    
    
    
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The device&#39;s mac address.
   * @return macAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "01-23-45-67-89-AB", required = true, value = "The device's mac address.")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    
    
    
    this.macAddress = macAddress;
  }


  public DevicesCreateNewDeviceRequest serialNumber(String serialNumber) {
    
    
    
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The device&#39;s serial number.
   * @return serialNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6NRN2A0", required = true, value = "The device's serial number.")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    
    
    
    this.serialNumber = serialNumber;
  }


  public DevicesCreateNewDeviceRequest vendor(String vendor) {
    
    
    
    
    this.vendor = vendor;
    return this;
  }

   /**
   * The device&#39;s manufacturer.
   * @return vendor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Poly", required = true, value = "The device's manufacturer.")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    
    
    
    this.vendor = vendor;
  }


  public DevicesCreateNewDeviceRequest model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * The device&#39;s model.
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "StudioX30", required = true, value = "The device's model.")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public DevicesCreateNewDeviceRequest roomId(String roomId) {
    
    
    
    
    this.roomId = roomId;
    return this;
  }

   /**
   * The Zoom Room&#39;s ID. Only for Zoom Room devices.
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "72afdc13-a289-40c3-b358-50c8b8de", value = "The Zoom Room's ID. Only for Zoom Room devices.")

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    
    
    
    this.roomId = roomId;
  }


  public DevicesCreateNewDeviceRequest userEmail(String userEmail) {
    
    
    
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * User email for assigning the Zoom Phone device. Only for Zoom Phone devices.
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test-user@ya.us", value = "User email for assigning the Zoom Phone device. Only for Zoom Phone devices.")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    
    
    
    this.userEmail = userEmail;
  }


  public DevicesCreateNewDeviceRequest deviceType(DeviceTypeEnum deviceType) {
    
    
    
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Device type.    &#x60;0&#x60; - Zoom Rooms computer.    &#x60;1&#x60; - Zoom Rooms controller.    &#x60;5&#x60; - Zoom Phone appliance.
   * @return deviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_0", required = true, value = "Device type.    `0` - Zoom Rooms computer.    `1` - Zoom Rooms controller.    `5` - Zoom Phone appliance.")

  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(DeviceTypeEnum deviceType) {
    
    
    
    this.deviceType = deviceType;
  }


  public DevicesCreateNewDeviceRequest tag(String tag) {
    
    
    
    
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


  public DevicesCreateNewDeviceRequest zdmGroupId(String zdmGroupId) {
    
    
    
    
    this.zdmGroupId = zdmGroupId;
    return this;
  }

   /**
   * The ZDM group ID.
   * @return zdmGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ff49588c-92c4-4406-99e6-1942d8a61a7b", value = "The ZDM group ID.")

  public String getZdmGroupId() {
    return zdmGroupId;
  }


  public void setZdmGroupId(String zdmGroupId) {
    
    
    
    this.zdmGroupId = zdmGroupId;
  }


  public DevicesCreateNewDeviceRequest extensionNumber(String extensionNumber) {
    
    
    
    
    this.extensionNumber = extensionNumber;
    return this;
  }

   /**
   * The extension number.
   * @return extensionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "802", value = "The extension number.")

  public String getExtensionNumber() {
    return extensionNumber;
  }


  public void setExtensionNumber(String extensionNumber) {
    
    
    
    this.extensionNumber = extensionNumber;
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
   * @return the DevicesCreateNewDeviceRequest instance itself
   */
  public DevicesCreateNewDeviceRequest putAdditionalProperty(String key, Object value) {
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
    DevicesCreateNewDeviceRequest devicesCreateNewDeviceRequest = (DevicesCreateNewDeviceRequest) o;
    return Objects.equals(this.deviceName, devicesCreateNewDeviceRequest.deviceName) &&
        Objects.equals(this.macAddress, devicesCreateNewDeviceRequest.macAddress) &&
        Objects.equals(this.serialNumber, devicesCreateNewDeviceRequest.serialNumber) &&
        Objects.equals(this.vendor, devicesCreateNewDeviceRequest.vendor) &&
        Objects.equals(this.model, devicesCreateNewDeviceRequest.model) &&
        Objects.equals(this.roomId, devicesCreateNewDeviceRequest.roomId) &&
        Objects.equals(this.userEmail, devicesCreateNewDeviceRequest.userEmail) &&
        Objects.equals(this.deviceType, devicesCreateNewDeviceRequest.deviceType) &&
        Objects.equals(this.tag, devicesCreateNewDeviceRequest.tag) &&
        Objects.equals(this.zdmGroupId, devicesCreateNewDeviceRequest.zdmGroupId) &&
        Objects.equals(this.extensionNumber, devicesCreateNewDeviceRequest.extensionNumber)&&
        Objects.equals(this.additionalProperties, devicesCreateNewDeviceRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceName, macAddress, serialNumber, vendor, model, roomId, userEmail, deviceType, tag, zdmGroupId, extensionNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesCreateNewDeviceRequest {\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    zdmGroupId: ").append(toIndentedString(zdmGroupId)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
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
    openapiFields.add("mac_address");
    openapiFields.add("serial_number");
    openapiFields.add("vendor");
    openapiFields.add("model");
    openapiFields.add("room_id");
    openapiFields.add("user_email");
    openapiFields.add("device_type");
    openapiFields.add("tag");
    openapiFields.add("zdm_group_id");
    openapiFields.add("extension_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device_name");
    openapiRequiredFields.add("mac_address");
    openapiRequiredFields.add("serial_number");
    openapiRequiredFields.add("vendor");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("device_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DevicesCreateNewDeviceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DevicesCreateNewDeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DevicesCreateNewDeviceRequest is not found in the empty JSON string", DevicesCreateNewDeviceRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DevicesCreateNewDeviceRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("device_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_name").toString()));
      }
      if (!jsonObj.get("mac_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac_address").toString()));
      }
      if (!jsonObj.get("serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_number").toString()));
      }
      if (!jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("room_id") != null && !jsonObj.get("room_id").isJsonNull()) && !jsonObj.get("room_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `room_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("room_id").toString()));
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("zdm_group_id") != null && !jsonObj.get("zdm_group_id").isJsonNull()) && !jsonObj.get("zdm_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zdm_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zdm_group_id").toString()));
      }
      if ((jsonObj.get("extension_number") != null && !jsonObj.get("extension_number").isJsonNull()) && !jsonObj.get("extension_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DevicesCreateNewDeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DevicesCreateNewDeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DevicesCreateNewDeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DevicesCreateNewDeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DevicesCreateNewDeviceRequest>() {
           @Override
           public void write(JsonWriter out, DevicesCreateNewDeviceRequest value) throws IOException {
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
           public DevicesCreateNewDeviceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DevicesCreateNewDeviceRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DevicesCreateNewDeviceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DevicesCreateNewDeviceRequest
  * @throws IOException if the JSON string is invalid with respect to DevicesCreateNewDeviceRequest
  */
  public static DevicesCreateNewDeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DevicesCreateNewDeviceRequest.class);
  }

 /**
  * Convert an instance of DevicesCreateNewDeviceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

