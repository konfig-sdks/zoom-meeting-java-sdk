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
 * Information about the device.
 */
@ApiModel(description = "Information about the device.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DevicesGetDetailResponse {
  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

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

  public static final String SERIALIZED_NAME_PLATFORM_OS = "platform_os";
  @SerializedName(SERIALIZED_NAME_PLATFORM_OS)
  private String platformOs;

  public static final String SERIALIZED_NAME_APP_VERSION = "app_version";
  @SerializedName(SERIALIZED_NAME_APP_VERSION)
  private String appVersion;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_ENROLLED_IN_ZDM = "enrolled_in_zdm";
  @SerializedName(SERIALIZED_NAME_ENROLLED_IN_ZDM)
  private Boolean enrolledInZdm;

  public static final String SERIALIZED_NAME_CONNECTED_TO_ZDM = "connected_to_zdm";
  @SerializedName(SERIALIZED_NAME_CONNECTED_TO_ZDM)
  private Boolean connectedToZdm;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private String roomId;

  public static final String SERIALIZED_NAME_ROOM_NAME = "room_name";
  @SerializedName(SERIALIZED_NAME_ROOM_NAME)
  private String roomName;

  /**
   * Filter devices by device type.   Device Type:    &#x60;-1&#x60; - All Zoom Room device(0,1,2,3,4,6).    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.    &#x60;3&#x60; - Zoom Rooms Control System.    &#x60;4&#x60; - Zoom Rooms Whiteboard.    &#x60;5&#x60; - Zoom Phone Appliance.    &#x60;6&#x60; - Zoom Rooms Computer (with Controller).
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
 public enum DeviceTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

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

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdk_version";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  /**
   * Filter devices by status.    Device Status:    &#x60;0&#x60; - offline.    &#x60;1&#x60; - online.    &#x60;-1&#x60; - unlink
   */
  @JsonAdapter(DeviceStatusEnum.Adapter.class)
 public enum DeviceStatusEnum {
    NUMBER_MINUS_1(-1),
    
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    DeviceStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceStatusEnum fromValue(Integer value) {
      for (DeviceStatusEnum b : DeviceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeviceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceStatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DeviceStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEVICE_STATUS = "device_status";
  @SerializedName(SERIALIZED_NAME_DEVICE_STATUS)
  private DeviceStatusEnum deviceStatus;

  public static final String SERIALIZED_NAME_LAST_ONLINE = "last_online";
  @SerializedName(SERIALIZED_NAME_LAST_ONLINE)
  private String lastOnline;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public DevicesGetDetailResponse() {
  }

  public DevicesGetDetailResponse deviceId(String deviceId) {
    
    
    
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device&#39;s unique identifier.
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "F1C6E9DF-429E-4FA1-85DA-AC95464F3D18", value = "The device's unique identifier.")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    
    
    
    this.deviceId = deviceId;
  }


  public DevicesGetDetailResponse deviceName(String deviceName) {
    
    
    
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The name of the device.
   * @return deviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My device", value = "The name of the device.")

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    
    
    
    this.deviceName = deviceName;
  }


  public DevicesGetDetailResponse macAddress(String macAddress) {
    
    
    
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * The device&#39;s MAC address.
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01-23-45-67-89-AB", value = "The device's MAC address.")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    
    
    
    this.macAddress = macAddress;
  }


  public DevicesGetDetailResponse serialNumber(String serialNumber) {
    
    
    
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The device&#39;s serial number.
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6NRN2A0", value = "The device's serial number.")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    
    
    
    this.serialNumber = serialNumber;
  }


  public DevicesGetDetailResponse vendor(String vendor) {
    
    
    
    
    this.vendor = vendor;
    return this;
  }

   /**
   * The device&#39;s manufacturer.
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Poly", value = "The device's manufacturer.")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    
    
    
    this.vendor = vendor;
  }


  public DevicesGetDetailResponse model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * The device&#39;s model.
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "StudioX30", value = "The device's model.")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public DevicesGetDetailResponse platformOs(String platformOs) {
    
    
    
    
    this.platformOs = platformOs;
    return this;
  }

   /**
   * The device&#39;s platform.
   * @return platformOs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Epos expandvision5 1.2.22315.04", value = "The device's platform.")

  public String getPlatformOs() {
    return platformOs;
  }


  public void setPlatformOs(String platformOs) {
    
    
    
    this.platformOs = platformOs;
  }


  public DevicesGetDetailResponse appVersion(String appVersion) {
    
    
    
    
    this.appVersion = appVersion;
    return this;
  }

   /**
   * App version of Zoom Rooms.
   * @return appVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.13.0.5762", value = "App version of Zoom Rooms.")

  public String getAppVersion() {
    return appVersion;
  }


  public void setAppVersion(String appVersion) {
    
    
    
    this.appVersion = appVersion;
  }


  public DevicesGetDetailResponse tag(String tag) {
    
    
    
    
    this.tag = tag;
    return this;
  }

   /**
   * The tag&#39;s name.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "personal rooms", value = "The tag's name.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    
    
    
    this.tag = tag;
  }


  public DevicesGetDetailResponse enrolledInZdm(Boolean enrolledInZdm) {
    
    
    
    
    this.enrolledInZdm = enrolledInZdm;
    return this;
  }

   /**
   * Whether the device is enrolled in ZDM (Zoom Device Management).
   * @return enrolledInZdm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the device is enrolled in ZDM (Zoom Device Management).")

  public Boolean getEnrolledInZdm() {
    return enrolledInZdm;
  }


  public void setEnrolledInZdm(Boolean enrolledInZdm) {
    
    
    
    this.enrolledInZdm = enrolledInZdm;
  }


  public DevicesGetDetailResponse connectedToZdm(Boolean connectedToZdm) {
    
    
    
    
    this.connectedToZdm = connectedToZdm;
    return this;
  }

   /**
   * Whether the device is connected to ZDM (Zoom Device Management).
   * @return connectedToZdm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the device is connected to ZDM (Zoom Device Management).")

  public Boolean getConnectedToZdm() {
    return connectedToZdm;
  }


  public void setConnectedToZdm(Boolean connectedToZdm) {
    
    
    
    this.connectedToZdm = connectedToZdm;
  }


  public DevicesGetDetailResponse roomId(String roomId) {
    
    
    
    
    this.roomId = roomId;
    return this;
  }

   /**
   * The Zoom Room&#39;s ID.
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "72afdc13-a289-40c3-b358-50c8b8de", value = "The Zoom Room's ID.")

  public String getRoomId() {
    return roomId;
  }


  public void setRoomId(String roomId) {
    
    
    
    this.roomId = roomId;
  }


  public DevicesGetDetailResponse roomName(String roomName) {
    
    
    
    
    this.roomName = roomName;
    return this;
  }

   /**
   * The Zoom Room&#39;s name.
   * @return roomName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Personal Meeting Room", value = "The Zoom Room's name.")

  public String getRoomName() {
    return roomName;
  }


  public void setRoomName(String roomName) {
    
    
    
    this.roomName = roomName;
  }


  public DevicesGetDetailResponse deviceType(DeviceTypeEnum deviceType) {
    
    
    
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Filter devices by device type.   Device Type:    &#x60;-1&#x60; - All Zoom Room device(0,1,2,3,4,6).    &#x60;0&#x60; - Zoom Rooms Computer.    &#x60;1&#x60; - Zoom Rooms Controller.    &#x60;2&#x60; - Zoom Rooms Scheduling Display.    &#x60;3&#x60; - Zoom Rooms Control System.    &#x60;4&#x60; - Zoom Rooms Whiteboard.    &#x60;5&#x60; - Zoom Phone Appliance.    &#x60;6&#x60; - Zoom Rooms Computer (with Controller).
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_0", value = "Filter devices by device type.   Device Type:    `-1` - All Zoom Room device(0,1,2,3,4,6).    `0` - Zoom Rooms Computer.    `1` - Zoom Rooms Controller.    `2` - Zoom Rooms Scheduling Display.    `3` - Zoom Rooms Control System.    `4` - Zoom Rooms Whiteboard.    `5` - Zoom Phone Appliance.    `6` - Zoom Rooms Computer (with Controller).")

  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(DeviceTypeEnum deviceType) {
    
    
    
    this.deviceType = deviceType;
  }


  public DevicesGetDetailResponse sdkVersion(String sdkVersion) {
    
    
    
    
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * The SDK version.
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.0.11", value = "The SDK version.")

  public String getSdkVersion() {
    return sdkVersion;
  }


  public void setSdkVersion(String sdkVersion) {
    
    
    
    this.sdkVersion = sdkVersion;
  }


  public DevicesGetDetailResponse deviceStatus(DeviceStatusEnum deviceStatus) {
    
    
    
    
    this.deviceStatus = deviceStatus;
    return this;
  }

   /**
   * Filter devices by status.    Device Status:    &#x60;0&#x60; - offline.    &#x60;1&#x60; - online.    &#x60;-1&#x60; - unlink
   * @return deviceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_0", value = "Filter devices by status.    Device Status:    `0` - offline.    `1` - online.    `-1` - unlink")

  public DeviceStatusEnum getDeviceStatus() {
    return deviceStatus;
  }


  public void setDeviceStatus(DeviceStatusEnum deviceStatus) {
    
    
    
    this.deviceStatus = deviceStatus;
  }


  public DevicesGetDetailResponse lastOnline(String lastOnline) {
    
    
    
    
    this.lastOnline = lastOnline;
    return this;
  }

   /**
   * The time when the device was last online.
   * @return lastOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-27T10:23:15Z", value = "The time when the device was last online.")

  public String getLastOnline() {
    return lastOnline;
  }


  public void setLastOnline(String lastOnline) {
    
    
    
    this.lastOnline = lastOnline;
  }


  public DevicesGetDetailResponse userEmail(String userEmail) {
    
    
    
    
    this.userEmail = userEmail;
    return this;
  }

   /**
   * The phone device&#39;s owner.
   * @return userEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test-user@ya.us", value = "The phone device's owner.")

  public String getUserEmail() {
    return userEmail;
  }


  public void setUserEmail(String userEmail) {
    
    
    
    this.userEmail = userEmail;
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
   * @return the DevicesGetDetailResponse instance itself
   */
  public DevicesGetDetailResponse putAdditionalProperty(String key, Object value) {
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
    DevicesGetDetailResponse devicesGetDetailResponse = (DevicesGetDetailResponse) o;
    return Objects.equals(this.deviceId, devicesGetDetailResponse.deviceId) &&
        Objects.equals(this.deviceName, devicesGetDetailResponse.deviceName) &&
        Objects.equals(this.macAddress, devicesGetDetailResponse.macAddress) &&
        Objects.equals(this.serialNumber, devicesGetDetailResponse.serialNumber) &&
        Objects.equals(this.vendor, devicesGetDetailResponse.vendor) &&
        Objects.equals(this.model, devicesGetDetailResponse.model) &&
        Objects.equals(this.platformOs, devicesGetDetailResponse.platformOs) &&
        Objects.equals(this.appVersion, devicesGetDetailResponse.appVersion) &&
        Objects.equals(this.tag, devicesGetDetailResponse.tag) &&
        Objects.equals(this.enrolledInZdm, devicesGetDetailResponse.enrolledInZdm) &&
        Objects.equals(this.connectedToZdm, devicesGetDetailResponse.connectedToZdm) &&
        Objects.equals(this.roomId, devicesGetDetailResponse.roomId) &&
        Objects.equals(this.roomName, devicesGetDetailResponse.roomName) &&
        Objects.equals(this.deviceType, devicesGetDetailResponse.deviceType) &&
        Objects.equals(this.sdkVersion, devicesGetDetailResponse.sdkVersion) &&
        Objects.equals(this.deviceStatus, devicesGetDetailResponse.deviceStatus) &&
        Objects.equals(this.lastOnline, devicesGetDetailResponse.lastOnline) &&
        Objects.equals(this.userEmail, devicesGetDetailResponse.userEmail)&&
        Objects.equals(this.additionalProperties, devicesGetDetailResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, deviceName, macAddress, serialNumber, vendor, model, platformOs, appVersion, tag, enrolledInZdm, connectedToZdm, roomId, roomName, deviceType, sdkVersion, deviceStatus, lastOnline, userEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesGetDetailResponse {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    platformOs: ").append(toIndentedString(platformOs)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    enrolledInZdm: ").append(toIndentedString(enrolledInZdm)).append("\n");
    sb.append("    connectedToZdm: ").append(toIndentedString(connectedToZdm)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    deviceStatus: ").append(toIndentedString(deviceStatus)).append("\n");
    sb.append("    lastOnline: ").append(toIndentedString(lastOnline)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
    openapiFields.add("device_id");
    openapiFields.add("device_name");
    openapiFields.add("mac_address");
    openapiFields.add("serial_number");
    openapiFields.add("vendor");
    openapiFields.add("model");
    openapiFields.add("platform_os");
    openapiFields.add("app_version");
    openapiFields.add("tag");
    openapiFields.add("enrolled_in_zdm");
    openapiFields.add("connected_to_zdm");
    openapiFields.add("room_id");
    openapiFields.add("room_name");
    openapiFields.add("device_type");
    openapiFields.add("sdk_version");
    openapiFields.add("device_status");
    openapiFields.add("last_online");
    openapiFields.add("user_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DevicesGetDetailResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DevicesGetDetailResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DevicesGetDetailResponse is not found in the empty JSON string", DevicesGetDetailResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("device_id") != null && !jsonObj.get("device_id").isJsonNull()) && !jsonObj.get("device_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id").toString()));
      }
      if ((jsonObj.get("device_name") != null && !jsonObj.get("device_name").isJsonNull()) && !jsonObj.get("device_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_name").toString()));
      }
      if ((jsonObj.get("mac_address") != null && !jsonObj.get("mac_address").isJsonNull()) && !jsonObj.get("mac_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac_address").toString()));
      }
      if ((jsonObj.get("serial_number") != null && !jsonObj.get("serial_number").isJsonNull()) && !jsonObj.get("serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_number").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("platform_os") != null && !jsonObj.get("platform_os").isJsonNull()) && !jsonObj.get("platform_os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_os").toString()));
      }
      if ((jsonObj.get("app_version") != null && !jsonObj.get("app_version").isJsonNull()) && !jsonObj.get("app_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_version").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("room_id") != null && !jsonObj.get("room_id").isJsonNull()) && !jsonObj.get("room_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `room_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("room_id").toString()));
      }
      if ((jsonObj.get("room_name") != null && !jsonObj.get("room_name").isJsonNull()) && !jsonObj.get("room_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `room_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("room_name").toString()));
      }
      if ((jsonObj.get("sdk_version") != null && !jsonObj.get("sdk_version").isJsonNull()) && !jsonObj.get("sdk_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdk_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdk_version").toString()));
      }
      if ((jsonObj.get("last_online") != null && !jsonObj.get("last_online").isJsonNull()) && !jsonObj.get("last_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_online").toString()));
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DevicesGetDetailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DevicesGetDetailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DevicesGetDetailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DevicesGetDetailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DevicesGetDetailResponse>() {
           @Override
           public void write(JsonWriter out, DevicesGetDetailResponse value) throws IOException {
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
           public DevicesGetDetailResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DevicesGetDetailResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DevicesGetDetailResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DevicesGetDetailResponse
  * @throws IOException if the JSON string is invalid with respect to DevicesGetDetailResponse
  */
  public static DevicesGetDetailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DevicesGetDetailResponse.class);
  }

 /**
  * Convert an instance of DevicesGetDetailResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
