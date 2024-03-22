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
import com.konfigthis.client.model.CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner;
import com.konfigthis.client.model.CloudRecordingListRegistrationQuestionsResponseQuestionsInner;
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
 * Recording Registrant Questions
 */
@ApiModel(description = "Recording Registrant Questions")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CloudRecordingListRegistrationQuestionsResponse {
  public static final String SERIALIZED_NAME_CUSTOM_QUESTIONS = "custom_questions";
  @SerializedName(SERIALIZED_NAME_CUSTOM_QUESTIONS)
  private List<CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner> customQuestions = null;

  public static final String SERIALIZED_NAME_QUESTIONS = "questions";
  @SerializedName(SERIALIZED_NAME_QUESTIONS)
  private List<CloudRecordingListRegistrationQuestionsResponseQuestionsInner> questions = null;

  public CloudRecordingListRegistrationQuestionsResponse() {
  }

  public CloudRecordingListRegistrationQuestionsResponse customQuestions(List<CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner> customQuestions) {
    
    
    
    
    this.customQuestions = customQuestions;
    return this;
  }

  public CloudRecordingListRegistrationQuestionsResponse addCustomQuestionsItem(CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner customQuestionsItem) {
    if (this.customQuestions == null) {
      this.customQuestions = new ArrayList<>();
    }
    this.customQuestions.add(customQuestionsItem);
    return this;
  }

   /**
   * Array of Registrant Custom Questions
   * @return customQuestions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Registrant Custom Questions")

  public List<CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner> getCustomQuestions() {
    return customQuestions;
  }


  public void setCustomQuestions(List<CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner> customQuestions) {
    
    
    
    this.customQuestions = customQuestions;
  }


  public CloudRecordingListRegistrationQuestionsResponse questions(List<CloudRecordingListRegistrationQuestionsResponseQuestionsInner> questions) {
    
    
    
    
    this.questions = questions;
    return this;
  }

  public CloudRecordingListRegistrationQuestionsResponse addQuestionsItem(CloudRecordingListRegistrationQuestionsResponseQuestionsInner questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Array of Registrant Questions
   * @return questions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of Registrant Questions")

  public List<CloudRecordingListRegistrationQuestionsResponseQuestionsInner> getQuestions() {
    return questions;
  }


  public void setQuestions(List<CloudRecordingListRegistrationQuestionsResponseQuestionsInner> questions) {
    
    
    
    this.questions = questions;
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
   * @return the CloudRecordingListRegistrationQuestionsResponse instance itself
   */
  public CloudRecordingListRegistrationQuestionsResponse putAdditionalProperty(String key, Object value) {
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
    CloudRecordingListRegistrationQuestionsResponse cloudRecordingListRegistrationQuestionsResponse = (CloudRecordingListRegistrationQuestionsResponse) o;
    return Objects.equals(this.customQuestions, cloudRecordingListRegistrationQuestionsResponse.customQuestions) &&
        Objects.equals(this.questions, cloudRecordingListRegistrationQuestionsResponse.questions)&&
        Objects.equals(this.additionalProperties, cloudRecordingListRegistrationQuestionsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customQuestions, questions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRecordingListRegistrationQuestionsResponse {\n");
    sb.append("    customQuestions: ").append(toIndentedString(customQuestions)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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
    openapiFields.add("custom_questions");
    openapiFields.add("questions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudRecordingListRegistrationQuestionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CloudRecordingListRegistrationQuestionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRecordingListRegistrationQuestionsResponse is not found in the empty JSON string", CloudRecordingListRegistrationQuestionsResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("custom_questions") != null && !jsonObj.get("custom_questions").isJsonNull()) {
        JsonArray jsonArraycustomQuestions = jsonObj.getAsJsonArray("custom_questions");
        if (jsonArraycustomQuestions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_questions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_questions` to be an array in the JSON string but got `%s`", jsonObj.get("custom_questions").toString()));
          }

          // validate the optional field `custom_questions` (array)
          for (int i = 0; i < jsonArraycustomQuestions.size(); i++) {
            CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner.validateJsonObject(jsonArraycustomQuestions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("questions") != null && !jsonObj.get("questions").isJsonNull()) {
        JsonArray jsonArrayquestions = jsonObj.getAsJsonArray("questions");
        if (jsonArrayquestions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("questions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `questions` to be an array in the JSON string but got `%s`", jsonObj.get("questions").toString()));
          }

          // validate the optional field `questions` (array)
          for (int i = 0; i < jsonArrayquestions.size(); i++) {
            CloudRecordingListRegistrationQuestionsResponseQuestionsInner.validateJsonObject(jsonArrayquestions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRecordingListRegistrationQuestionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRecordingListRegistrationQuestionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRecordingListRegistrationQuestionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRecordingListRegistrationQuestionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRecordingListRegistrationQuestionsResponse>() {
           @Override
           public void write(JsonWriter out, CloudRecordingListRegistrationQuestionsResponse value) throws IOException {
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
           public CloudRecordingListRegistrationQuestionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudRecordingListRegistrationQuestionsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CloudRecordingListRegistrationQuestionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudRecordingListRegistrationQuestionsResponse
  * @throws IOException if the JSON string is invalid with respect to CloudRecordingListRegistrationQuestionsResponse
  */
  public static CloudRecordingListRegistrationQuestionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRecordingListRegistrationQuestionsResponse.class);
  }

 /**
  * Convert an instance of CloudRecordingListRegistrationQuestionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

