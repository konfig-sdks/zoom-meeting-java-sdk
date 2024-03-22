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
import com.konfigthis.client.model.TspAddUserTspAccountResponseDialInNumbersInner;
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
 * List of TSP accounts.
 */
@ApiModel(description = "List of TSP accounts.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TspAddUserTspAccountResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONFERENCE_CODE = "conference_code";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_CODE)
  private String conferenceCode;

  public static final String SERIALIZED_NAME_DIAL_IN_NUMBERS = "dial_in_numbers";
  @SerializedName(SERIALIZED_NAME_DIAL_IN_NUMBERS)
  private List<TspAddUserTspAccountResponseDialInNumbersInner> dialInNumbers = null;

  public static final String SERIALIZED_NAME_LEADER_PIN = "leader_pin";
  @SerializedName(SERIALIZED_NAME_LEADER_PIN)
  private String leaderPin;

  /**
   * Telephony bridge
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

  public TspAddUserTspAccountResponse() {
  }

  public TspAddUserTspAccountResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the TSP account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the TSP account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TspAddUserTspAccountResponse conferenceCode(String conferenceCode) {
    
    
    if (conferenceCode != null && conferenceCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for conferenceCode. Length must be greater than or equal to 1.");
    }
    
    this.conferenceCode = conferenceCode;
    return this;
  }

   /**
   * Conference code: numeric value, length is less than 16.
   * @return conferenceCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0125", required = true, value = "Conference code: numeric value, length is less than 16.")

  public String getConferenceCode() {
    return conferenceCode;
  }


  public void setConferenceCode(String conferenceCode) {
    
    
    if (conferenceCode != null && conferenceCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for conferenceCode. Length must be greater than or equal to 1.");
    }
    this.conferenceCode = conferenceCode;
  }


  public TspAddUserTspAccountResponse dialInNumbers(List<TspAddUserTspAccountResponseDialInNumbersInner> dialInNumbers) {
    
    
    
    
    this.dialInNumbers = dialInNumbers;
    return this;
  }

  public TspAddUserTspAccountResponse addDialInNumbersItem(TspAddUserTspAccountResponseDialInNumbersInner dialInNumbersItem) {
    if (this.dialInNumbers == null) {
      this.dialInNumbers = new ArrayList<>();
    }
    this.dialInNumbers.add(dialInNumbersItem);
    return this;
  }

   /**
   * List of dial in numbers.
   * @return dialInNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dial in numbers.")

  public List<TspAddUserTspAccountResponseDialInNumbersInner> getDialInNumbers() {
    return dialInNumbers;
  }


  public void setDialInNumbers(List<TspAddUserTspAccountResponseDialInNumbersInner> dialInNumbers) {
    
    
    
    this.dialInNumbers = dialInNumbers;
  }


  public TspAddUserTspAccountResponse leaderPin(String leaderPin) {
    
    
    if (leaderPin != null && leaderPin.length() < 1) {
      throw new IllegalArgumentException("Invalid value for leaderPin. Length must be greater than or equal to 1.");
    }
    
    this.leaderPin = leaderPin;
    return this;
  }

   /**
   * Leader PIN: numeric value, length is less than 16.
   * @return leaderPin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "US_TSP_TB", required = true, value = "Leader PIN: numeric value, length is less than 16.")

  public String getLeaderPin() {
    return leaderPin;
  }


  public void setLeaderPin(String leaderPin) {
    
    
    if (leaderPin != null && leaderPin.length() < 1) {
      throw new IllegalArgumentException("Invalid value for leaderPin. Length must be greater than or equal to 1.");
    }
    this.leaderPin = leaderPin;
  }


  public TspAddUserTspAccountResponse tspBridge(TspBridgeEnum tspBridge) {
    
    
    
    
    this.tspBridge = tspBridge;
    return this;
  }

   /**
   * Telephony bridge
   * @return tspBridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US_TSP_TB", value = "Telephony bridge")

  public TspBridgeEnum getTspBridge() {
    return tspBridge;
  }


  public void setTspBridge(TspBridgeEnum tspBridge) {
    
    
    
    this.tspBridge = tspBridge;
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
   * @return the TspAddUserTspAccountResponse instance itself
   */
  public TspAddUserTspAccountResponse putAdditionalProperty(String key, Object value) {
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
    TspAddUserTspAccountResponse tspAddUserTspAccountResponse = (TspAddUserTspAccountResponse) o;
    return Objects.equals(this.id, tspAddUserTspAccountResponse.id) &&
        Objects.equals(this.conferenceCode, tspAddUserTspAccountResponse.conferenceCode) &&
        Objects.equals(this.dialInNumbers, tspAddUserTspAccountResponse.dialInNumbers) &&
        Objects.equals(this.leaderPin, tspAddUserTspAccountResponse.leaderPin) &&
        Objects.equals(this.tspBridge, tspAddUserTspAccountResponse.tspBridge)&&
        Objects.equals(this.additionalProperties, tspAddUserTspAccountResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conferenceCode, dialInNumbers, leaderPin, tspBridge, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TspAddUserTspAccountResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conferenceCode: ").append(toIndentedString(conferenceCode)).append("\n");
    sb.append("    dialInNumbers: ").append(toIndentedString(dialInNumbers)).append("\n");
    sb.append("    leaderPin: ").append(toIndentedString(leaderPin)).append("\n");
    sb.append("    tspBridge: ").append(toIndentedString(tspBridge)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("conference_code");
    openapiFields.add("dial_in_numbers");
    openapiFields.add("leader_pin");
    openapiFields.add("tsp_bridge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("conference_code");
    openapiRequiredFields.add("leader_pin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TspAddUserTspAccountResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TspAddUserTspAccountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TspAddUserTspAccountResponse is not found in the empty JSON string", TspAddUserTspAccountResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TspAddUserTspAccountResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("conference_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conference_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conference_code").toString()));
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
            TspAddUserTspAccountResponseDialInNumbersInner.validateJsonObject(jsonArraydialInNumbers.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("leader_pin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leader_pin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leader_pin").toString()));
      }
      if ((jsonObj.get("tsp_bridge") != null && !jsonObj.get("tsp_bridge").isJsonNull()) && !jsonObj.get("tsp_bridge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tsp_bridge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tsp_bridge").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TspAddUserTspAccountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TspAddUserTspAccountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TspAddUserTspAccountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TspAddUserTspAccountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TspAddUserTspAccountResponse>() {
           @Override
           public void write(JsonWriter out, TspAddUserTspAccountResponse value) throws IOException {
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
           public TspAddUserTspAccountResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TspAddUserTspAccountResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TspAddUserTspAccountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TspAddUserTspAccountResponse
  * @throws IOException if the JSON string is invalid with respect to TspAddUserTspAccountResponse
  */
  public static TspAddUserTspAccountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TspAddUserTspAccountResponse.class);
  }

 /**
  * Convert an instance of TspAddUserTspAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

