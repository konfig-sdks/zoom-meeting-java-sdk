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
import com.konfigthis.client.model.PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner;
import com.konfigthis.client.model.PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner;
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
 * PacListAccountsResponsePacAccountsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PacListAccountsResponsePacAccountsInner {
  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conference_id";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private Long conferenceId;

  public static final String SERIALIZED_NAME_DEDICATED_DIAL_IN_NUMBER = "dedicated_dial_in_number";
  @SerializedName(SERIALIZED_NAME_DEDICATED_DIAL_IN_NUMBER)
  private List<PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner> dedicatedDialInNumber = null;

  public static final String SERIALIZED_NAME_GLOBAL_DIAL_IN_NUMBERS = "global_dial_in_numbers";
  @SerializedName(SERIALIZED_NAME_GLOBAL_DIAL_IN_NUMBERS)
  private List<PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner> globalDialInNumbers = null;

  public static final String SERIALIZED_NAME_LISTEN_ONLY_PASSWORD = "listen_only_password";
  @SerializedName(SERIALIZED_NAME_LISTEN_ONLY_PASSWORD)
  private String listenOnlyPassword;

  public static final String SERIALIZED_NAME_PARTICIPANT_PASSWORD = "participant_password";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_PASSWORD)
  private String participantPassword;

  public PacListAccountsResponsePacAccountsInner() {
  }

  public PacListAccountsResponsePacAccountsInner conferenceId(Long conferenceId) {
    
    
    
    
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * The conference ID.
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111111", value = "The conference ID.")

  public Long getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(Long conferenceId) {
    
    
    
    this.conferenceId = conferenceId;
  }


  public PacListAccountsResponsePacAccountsInner dedicatedDialInNumber(List<PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner> dedicatedDialInNumber) {
    
    
    
    
    this.dedicatedDialInNumber = dedicatedDialInNumber;
    return this;
  }

  public PacListAccountsResponsePacAccountsInner addDedicatedDialInNumberItem(PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner dedicatedDialInNumberItem) {
    if (this.dedicatedDialInNumber == null) {
      this.dedicatedDialInNumber = new ArrayList<>();
    }
    this.dedicatedDialInNumber.add(dedicatedDialInNumberItem);
    return this;
  }

   /**
   * Information about the account&#39;s dedicated dial-in numbers.
   * @return dedicatedDialInNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the account's dedicated dial-in numbers.")

  public List<PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner> getDedicatedDialInNumber() {
    return dedicatedDialInNumber;
  }


  public void setDedicatedDialInNumber(List<PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner> dedicatedDialInNumber) {
    
    
    
    this.dedicatedDialInNumber = dedicatedDialInNumber;
  }


  public PacListAccountsResponsePacAccountsInner globalDialInNumbers(List<PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner> globalDialInNumbers) {
    
    
    
    
    this.globalDialInNumbers = globalDialInNumbers;
    return this;
  }

  public PacListAccountsResponsePacAccountsInner addGlobalDialInNumbersItem(PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner globalDialInNumbersItem) {
    if (this.globalDialInNumbers == null) {
      this.globalDialInNumbers = new ArrayList<>();
    }
    this.globalDialInNumbers.add(globalDialInNumbersItem);
    return this;
  }

   /**
   * Information about the account&#39;s global dial-in numbers.
   * @return globalDialInNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the account's global dial-in numbers.")

  public List<PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner> getGlobalDialInNumbers() {
    return globalDialInNumbers;
  }


  public void setGlobalDialInNumbers(List<PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner> globalDialInNumbers) {
    
    
    
    this.globalDialInNumbers = globalDialInNumbers;
  }


  public PacListAccountsResponsePacAccountsInner listenOnlyPassword(String listenOnlyPassword) {
    
    
    
    
    this.listenOnlyPassword = listenOnlyPassword;
    return this;
  }

   /**
   * The listen-only password, up to six characters in length.
   * @return listenOnlyPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3c2b1a", value = "The listen-only password, up to six characters in length.")

  public String getListenOnlyPassword() {
    return listenOnlyPassword;
  }


  public void setListenOnlyPassword(String listenOnlyPassword) {
    
    
    
    this.listenOnlyPassword = listenOnlyPassword;
  }


  public PacListAccountsResponsePacAccountsInner participantPassword(String participantPassword) {
    
    
    
    
    this.participantPassword = participantPassword;
    return this;
  }

   /**
   * The participant password, up to six characters in length.
   * @return participantPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a1b2c3", value = "The participant password, up to six characters in length.")

  public String getParticipantPassword() {
    return participantPassword;
  }


  public void setParticipantPassword(String participantPassword) {
    
    
    
    this.participantPassword = participantPassword;
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
   * @return the PacListAccountsResponsePacAccountsInner instance itself
   */
  public PacListAccountsResponsePacAccountsInner putAdditionalProperty(String key, Object value) {
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
    PacListAccountsResponsePacAccountsInner pacListAccountsResponsePacAccountsInner = (PacListAccountsResponsePacAccountsInner) o;
    return Objects.equals(this.conferenceId, pacListAccountsResponsePacAccountsInner.conferenceId) &&
        Objects.equals(this.dedicatedDialInNumber, pacListAccountsResponsePacAccountsInner.dedicatedDialInNumber) &&
        Objects.equals(this.globalDialInNumbers, pacListAccountsResponsePacAccountsInner.globalDialInNumbers) &&
        Objects.equals(this.listenOnlyPassword, pacListAccountsResponsePacAccountsInner.listenOnlyPassword) &&
        Objects.equals(this.participantPassword, pacListAccountsResponsePacAccountsInner.participantPassword)&&
        Objects.equals(this.additionalProperties, pacListAccountsResponsePacAccountsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceId, dedicatedDialInNumber, globalDialInNumbers, listenOnlyPassword, participantPassword, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacListAccountsResponsePacAccountsInner {\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    dedicatedDialInNumber: ").append(toIndentedString(dedicatedDialInNumber)).append("\n");
    sb.append("    globalDialInNumbers: ").append(toIndentedString(globalDialInNumbers)).append("\n");
    sb.append("    listenOnlyPassword: ").append(toIndentedString(listenOnlyPassword)).append("\n");
    sb.append("    participantPassword: ").append(toIndentedString(participantPassword)).append("\n");
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
    openapiFields.add("conference_id");
    openapiFields.add("dedicated_dial_in_number");
    openapiFields.add("global_dial_in_numbers");
    openapiFields.add("listen_only_password");
    openapiFields.add("participant_password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PacListAccountsResponsePacAccountsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PacListAccountsResponsePacAccountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PacListAccountsResponsePacAccountsInner is not found in the empty JSON string", PacListAccountsResponsePacAccountsInner.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("dedicated_dial_in_number") != null && !jsonObj.get("dedicated_dial_in_number").isJsonNull()) {
        JsonArray jsonArraydedicatedDialInNumber = jsonObj.getAsJsonArray("dedicated_dial_in_number");
        if (jsonArraydedicatedDialInNumber != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dedicated_dial_in_number").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dedicated_dial_in_number` to be an array in the JSON string but got `%s`", jsonObj.get("dedicated_dial_in_number").toString()));
          }

          // validate the optional field `dedicated_dial_in_number` (array)
          for (int i = 0; i < jsonArraydedicatedDialInNumber.size(); i++) {
            PacListAccountsResponsePacAccountsInnerDedicatedDialInNumberInner.validateJsonObject(jsonArraydedicatedDialInNumber.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("global_dial_in_numbers") != null && !jsonObj.get("global_dial_in_numbers").isJsonNull()) {
        JsonArray jsonArrayglobalDialInNumbers = jsonObj.getAsJsonArray("global_dial_in_numbers");
        if (jsonArrayglobalDialInNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("global_dial_in_numbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `global_dial_in_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("global_dial_in_numbers").toString()));
          }

          // validate the optional field `global_dial_in_numbers` (array)
          for (int i = 0; i < jsonArrayglobalDialInNumbers.size(); i++) {
            PacListAccountsResponsePacAccountsInnerGlobalDialInNumbersInner.validateJsonObject(jsonArrayglobalDialInNumbers.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("listen_only_password") != null && !jsonObj.get("listen_only_password").isJsonNull()) && !jsonObj.get("listen_only_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listen_only_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listen_only_password").toString()));
      }
      if ((jsonObj.get("participant_password") != null && !jsonObj.get("participant_password").isJsonNull()) && !jsonObj.get("participant_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participant_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participant_password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PacListAccountsResponsePacAccountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PacListAccountsResponsePacAccountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PacListAccountsResponsePacAccountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PacListAccountsResponsePacAccountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PacListAccountsResponsePacAccountsInner>() {
           @Override
           public void write(JsonWriter out, PacListAccountsResponsePacAccountsInner value) throws IOException {
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
           public PacListAccountsResponsePacAccountsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PacListAccountsResponsePacAccountsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PacListAccountsResponsePacAccountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PacListAccountsResponsePacAccountsInner
  * @throws IOException if the JSON string is invalid with respect to PacListAccountsResponsePacAccountsInner
  */
  public static PacListAccountsResponsePacAccountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PacListAccountsResponsePacAccountsInner.class);
  }

 /**
  * Convert an instance of PacListAccountsResponsePacAccountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

