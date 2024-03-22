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
import com.konfigthis.client.model.ReportsGetWebinarPollReportsResponseQuestionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ReportsGetWebinarPollReportsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetWebinarPollReportsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_QUESTIONS = "questions";
  @SerializedName(SERIALIZED_NAME_QUESTIONS)
  private List<ReportsGetWebinarPollReportsResponseQuestionsInner> questions = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public ReportsGetWebinarPollReportsResponse() {
  }

  public ReportsGetWebinarPollReportsResponse id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The webinar ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The webinar ID.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public ReportsGetWebinarPollReportsResponse questions(List<ReportsGetWebinarPollReportsResponseQuestionsInner> questions) {
    
    
    
    
    this.questions = questions;
    return this;
  }

  public ReportsGetWebinarPollReportsResponse addQuestionsItem(ReportsGetWebinarPollReportsResponseQuestionsInner questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Information about the webinar questions.
   * @return questions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the webinar questions.")

  public List<ReportsGetWebinarPollReportsResponseQuestionsInner> getQuestions() {
    return questions;
  }


  public void setQuestions(List<ReportsGetWebinarPollReportsResponseQuestionsInner> questions) {
    
    
    
    this.questions = questions;
  }


  public ReportsGetWebinarPollReportsResponse startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The webinar&#39;s start time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-01T12:34:12.660Z", value = "The webinar's start time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public ReportsGetWebinarPollReportsResponse uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The webinar&#39;s universally unique identifier (UUID). Each webinar instance generates a webinar UUID.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4444AAAiAAAAAiAiAiiAii==", value = "The webinar's universally unique identifier (UUID). Each webinar instance generates a webinar UUID.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
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
   * @return the ReportsGetWebinarPollReportsResponse instance itself
   */
  public ReportsGetWebinarPollReportsResponse putAdditionalProperty(String key, Object value) {
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
    ReportsGetWebinarPollReportsResponse reportsGetWebinarPollReportsResponse = (ReportsGetWebinarPollReportsResponse) o;
    return Objects.equals(this.id, reportsGetWebinarPollReportsResponse.id) &&
        Objects.equals(this.questions, reportsGetWebinarPollReportsResponse.questions) &&
        Objects.equals(this.startTime, reportsGetWebinarPollReportsResponse.startTime) &&
        Objects.equals(this.uuid, reportsGetWebinarPollReportsResponse.uuid)&&
        Objects.equals(this.additionalProperties, reportsGetWebinarPollReportsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, questions, startTime, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetWebinarPollReportsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
    openapiFields.add("questions");
    openapiFields.add("start_time");
    openapiFields.add("uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetWebinarPollReportsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetWebinarPollReportsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetWebinarPollReportsResponse is not found in the empty JSON string", ReportsGetWebinarPollReportsResponse.openapiRequiredFields.toString()));
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
            ReportsGetWebinarPollReportsResponseQuestionsInner.validateJsonObject(jsonArrayquestions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetWebinarPollReportsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetWebinarPollReportsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetWebinarPollReportsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetWebinarPollReportsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetWebinarPollReportsResponse>() {
           @Override
           public void write(JsonWriter out, ReportsGetWebinarPollReportsResponse value) throws IOException {
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
           public ReportsGetWebinarPollReportsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetWebinarPollReportsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetWebinarPollReportsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetWebinarPollReportsResponse
  * @throws IOException if the JSON string is invalid with respect to ReportsGetWebinarPollReportsResponse
  */
  public static ReportsGetWebinarPollReportsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetWebinarPollReportsResponse.class);
  }

 /**
  * Convert an instance of ReportsGetWebinarPollReportsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

