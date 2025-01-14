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
import com.konfigthis.client.model.TspGetAccountInfoResponseDialInNumbersInner;
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
 * TspGetAccountInfoResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TspGetAccountInfoResponse {
  public static final String SERIALIZED_NAME_DIAL_IN_NUMBER_UNRESTRICTED = "dial_in_number_unrestricted";
  @SerializedName(SERIALIZED_NAME_DIAL_IN_NUMBER_UNRESTRICTED)
  private Boolean dialInNumberUnrestricted;

  public static final String SERIALIZED_NAME_DIAL_IN_NUMBERS = "dial_in_numbers";
  @SerializedName(SERIALIZED_NAME_DIAL_IN_NUMBERS)
  private List<TspGetAccountInfoResponseDialInNumbersInner> dialInNumbers = null;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_MASTER_ACCOUNT_SETTING_EXTENDED = "master_account_setting_extended";
  @SerializedName(SERIALIZED_NAME_MASTER_ACCOUNT_SETTING_EXTENDED)
  private Boolean masterAccountSettingExtended;

  public static final String SERIALIZED_NAME_MODIFY_CREDENTIAL_FORBIDDEN = "modify_credential_forbidden";
  @SerializedName(SERIALIZED_NAME_MODIFY_CREDENTIAL_FORBIDDEN)
  private Boolean modifyCredentialForbidden;

  /**
   * Telephony bridge zone
   */
  @JsonAdapter(TspBridgeEnum.Adapter.class)
 public enum TspBridgeEnum {
    US_TSP_TB("US_TSP_TB"),
    
    EU_TSP_TB("EU_TSP_TB");

    private String value;

    TspBridgeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TspBridgeEnum fromValue(String value) {
      for (TspBridgeEnum b : TspBridgeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TspBridgeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TspBridgeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TspBridgeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TspBridgeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TSP_BRIDGE = "tsp_bridge";
  @SerializedName(SERIALIZED_NAME_TSP_BRIDGE)
  private TspBridgeEnum tspBridge;

  public static final String SERIALIZED_NAME_TSP_ENABLED = "tsp_enabled";
  @SerializedName(SERIALIZED_NAME_TSP_ENABLED)
  private Boolean tspEnabled;

  public static final String SERIALIZED_NAME_TSP_PROVIDER = "tsp_provider";
  @SerializedName(SERIALIZED_NAME_TSP_PROVIDER)
  private String tspProvider;

  public TspGetAccountInfoResponse() {
  }

  public TspGetAccountInfoResponse dialInNumberUnrestricted(Boolean dialInNumberUnrestricted) {
    
    
    
    
    this.dialInNumberUnrestricted = dialInNumberUnrestricted;
    return this;
  }

   /**
   * Control restriction on account users adding a TSP number outside of account&#39;s dial in numbers.
   * @return dialInNumberUnrestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Control restriction on account users adding a TSP number outside of account's dial in numbers.")

  public Boolean getDialInNumberUnrestricted() {
    return dialInNumberUnrestricted;
  }


  public void setDialInNumberUnrestricted(Boolean dialInNumberUnrestricted) {
    
    
    
    this.dialInNumberUnrestricted = dialInNumberUnrestricted;
  }


  public TspGetAccountInfoResponse dialInNumbers(List<TspGetAccountInfoResponseDialInNumbersInner> dialInNumbers) {
    
    
    
    
    this.dialInNumbers = dialInNumbers;
    return this;
  }

  public TspGetAccountInfoResponse addDialInNumbersItem(TspGetAccountInfoResponseDialInNumbersInner dialInNumbersItem) {
    if (this.dialInNumbers == null) {
      this.dialInNumbers = new ArrayList<>();
    }
    this.dialInNumbers.add(dialInNumbersItem);
    return this;
  }

   /**
   * Get dialInNumbers
   * @return dialInNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TspGetAccountInfoResponseDialInNumbersInner> getDialInNumbers() {
    return dialInNumbers;
  }


  public void setDialInNumbers(List<TspGetAccountInfoResponseDialInNumbersInner> dialInNumbers) {
    
    
    
    this.dialInNumbers = dialInNumbers;
  }


  public TspGetAccountInfoResponse enable(Boolean enable) {
    
    
    
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable Telephony Service Provider for account users.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable Telephony Service Provider for account users.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    
    
    
    this.enable = enable;
  }


  public TspGetAccountInfoResponse masterAccountSettingExtended(Boolean masterAccountSettingExtended) {
    
    
    
    
    this.masterAccountSettingExtended = masterAccountSettingExtended;
    return this;
  }

   /**
   * For master account, extend its TSP setting to all sub accounts. For sub account, extend TSP setting from master account.
   * @return masterAccountSettingExtended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "For master account, extend its TSP setting to all sub accounts. For sub account, extend TSP setting from master account.")

  public Boolean getMasterAccountSettingExtended() {
    return masterAccountSettingExtended;
  }


  public void setMasterAccountSettingExtended(Boolean masterAccountSettingExtended) {
    
    
    
    this.masterAccountSettingExtended = masterAccountSettingExtended;
  }


  public TspGetAccountInfoResponse modifyCredentialForbidden(Boolean modifyCredentialForbidden) {
    
    
    
    
    this.modifyCredentialForbidden = modifyCredentialForbidden;
    return this;
  }

   /**
   * Control restriction on account users being able to modify their TSP credentials.
   * @return modifyCredentialForbidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Control restriction on account users being able to modify their TSP credentials.")

  public Boolean getModifyCredentialForbidden() {
    return modifyCredentialForbidden;
  }


  public void setModifyCredentialForbidden(Boolean modifyCredentialForbidden) {
    
    
    
    this.modifyCredentialForbidden = modifyCredentialForbidden;
  }


  public TspGetAccountInfoResponse tspBridge(TspBridgeEnum tspBridge) {
    
    
    
    
    this.tspBridge = tspBridge;
    return this;
  }

   /**
   * Telephony bridge zone
   * @return tspBridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US_TSP_TB", value = "Telephony bridge zone")

  public TspBridgeEnum getTspBridge() {
    return tspBridge;
  }


  public void setTspBridge(TspBridgeEnum tspBridge) {
    
    
    
    this.tspBridge = tspBridge;
  }


  public TspGetAccountInfoResponse tspEnabled(Boolean tspEnabled) {
    
    
    
    
    this.tspEnabled = tspEnabled;
    return this;
  }

   /**
   * Enable TSP feature for account. This has to be enabled to use any other tsp settings/features.
   * @return tspEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable TSP feature for account. This has to be enabled to use any other tsp settings/features.")

  public Boolean getTspEnabled() {
    return tspEnabled;
  }


  public void setTspEnabled(Boolean tspEnabled) {
    
    
    
    this.tspEnabled = tspEnabled;
  }


  public TspGetAccountInfoResponse tspProvider(String tspProvider) {
    
    
    
    
    this.tspProvider = tspProvider;
    return this;
  }

   /**
   * Telephony Service Provider.
   * @return tspProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "someprovidername", value = "Telephony Service Provider.")

  public String getTspProvider() {
    return tspProvider;
  }


  public void setTspProvider(String tspProvider) {
    
    
    
    this.tspProvider = tspProvider;
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
   * @return the TspGetAccountInfoResponse instance itself
   */
  public TspGetAccountInfoResponse putAdditionalProperty(String key, Object value) {
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
    TspGetAccountInfoResponse tspGetAccountInfoResponse = (TspGetAccountInfoResponse) o;
    return Objects.equals(this.dialInNumberUnrestricted, tspGetAccountInfoResponse.dialInNumberUnrestricted) &&
        Objects.equals(this.dialInNumbers, tspGetAccountInfoResponse.dialInNumbers) &&
        Objects.equals(this.enable, tspGetAccountInfoResponse.enable) &&
        Objects.equals(this.masterAccountSettingExtended, tspGetAccountInfoResponse.masterAccountSettingExtended) &&
        Objects.equals(this.modifyCredentialForbidden, tspGetAccountInfoResponse.modifyCredentialForbidden) &&
        Objects.equals(this.tspBridge, tspGetAccountInfoResponse.tspBridge) &&
        Objects.equals(this.tspEnabled, tspGetAccountInfoResponse.tspEnabled) &&
        Objects.equals(this.tspProvider, tspGetAccountInfoResponse.tspProvider)&&
        Objects.equals(this.additionalProperties, tspGetAccountInfoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialInNumberUnrestricted, dialInNumbers, enable, masterAccountSettingExtended, modifyCredentialForbidden, tspBridge, tspEnabled, tspProvider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TspGetAccountInfoResponse {\n");
    sb.append("    dialInNumberUnrestricted: ").append(toIndentedString(dialInNumberUnrestricted)).append("\n");
    sb.append("    dialInNumbers: ").append(toIndentedString(dialInNumbers)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    masterAccountSettingExtended: ").append(toIndentedString(masterAccountSettingExtended)).append("\n");
    sb.append("    modifyCredentialForbidden: ").append(toIndentedString(modifyCredentialForbidden)).append("\n");
    sb.append("    tspBridge: ").append(toIndentedString(tspBridge)).append("\n");
    sb.append("    tspEnabled: ").append(toIndentedString(tspEnabled)).append("\n");
    sb.append("    tspProvider: ").append(toIndentedString(tspProvider)).append("\n");
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
    openapiFields.add("dial_in_number_unrestricted");
    openapiFields.add("dial_in_numbers");
    openapiFields.add("enable");
    openapiFields.add("master_account_setting_extended");
    openapiFields.add("modify_credential_forbidden");
    openapiFields.add("tsp_bridge");
    openapiFields.add("tsp_enabled");
    openapiFields.add("tsp_provider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TspGetAccountInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TspGetAccountInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TspGetAccountInfoResponse is not found in the empty JSON string", TspGetAccountInfoResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("dial_in_numbers") != null && !jsonObj.get("dial_in_numbers").isJsonNull()) {
        JsonArray jsonArraydialInNumbers = jsonObj.getAsJsonArray("dial_in_numbers");
        if (jsonArraydialInNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dial_in_numbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dial_in_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("dial_in_numbers").toString()));
          }

          // validate the optional field `dial_in_numbers` (array)
          for (int i = 0; i < jsonArraydialInNumbers.size(); i++) {
            TspGetAccountInfoResponseDialInNumbersInner.validateJsonObject(jsonArraydialInNumbers.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("tsp_bridge") != null && !jsonObj.get("tsp_bridge").isJsonNull()) && !jsonObj.get("tsp_bridge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tsp_bridge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tsp_bridge").toString()));
      }
      if ((jsonObj.get("tsp_provider") != null && !jsonObj.get("tsp_provider").isJsonNull()) && !jsonObj.get("tsp_provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tsp_provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tsp_provider").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TspGetAccountInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TspGetAccountInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TspGetAccountInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TspGetAccountInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TspGetAccountInfoResponse>() {
           @Override
           public void write(JsonWriter out, TspGetAccountInfoResponse value) throws IOException {
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
           public TspGetAccountInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TspGetAccountInfoResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TspGetAccountInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TspGetAccountInfoResponse
  * @throws IOException if the JSON string is invalid with respect to TspGetAccountInfoResponse
  */
  public static TspGetAccountInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TspGetAccountInfoResponse.class);
  }

 /**
  * Convert an instance of TspGetAccountInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

