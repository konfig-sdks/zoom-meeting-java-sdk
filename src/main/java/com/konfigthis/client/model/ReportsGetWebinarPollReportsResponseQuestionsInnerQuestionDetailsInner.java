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
 * ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner {
  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer;

  public static final String SERIALIZED_NAME_DATE_TIME = "date_time";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private String dateTime;

  public static final String SERIALIZED_NAME_POLLING_ID = "polling_id";
  @SerializedName(SERIALIZED_NAME_POLLING_ID)
  private String pollingId;

  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner() {
  }

  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner answer(String answer) {
    
    
    
    
    this.answer = answer;
    return this;
  }

   /**
   * The user&#39;s given answer.
   * @return answer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I am wonderful.", value = "The user's given answer.")

  public String getAnswer() {
    return answer;
  }


  public void setAnswer(String answer) {
    
    
    
    this.answer = answer;
  }


  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner dateTime(String dateTime) {
    
    
    
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date and time at which the user answered the poll question.
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-01T12:37:12.660Z", value = "The date and time at which the user answered the poll question.")

  public String getDateTime() {
    return dateTime;
  }


  public void setDateTime(String dateTime) {
    
    
    
    this.dateTime = dateTime;
  }


  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner pollingId(String pollingId) {
    
    
    
    
    this.pollingId = pollingId;
    return this;
  }

   /**
   * The poll&#39;s ID.
   * @return pollingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "798fGJEWrA", value = "The poll's ID.")

  public String getPollingId() {
    return pollingId;
  }


  public void setPollingId(String pollingId) {
    
    
    
    this.pollingId = pollingId;
  }


  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner question(String question) {
    
    
    
    
    this.question = question;
    return this;
  }

   /**
   * The poll question.
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "How are you?", value = "The poll question.")

  public String getQuestion() {
    return question;
  }


  public void setQuestion(String question) {
    
    
    
    this.question = question;
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
   * @return the ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner instance itself
   */
  public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner putAdditionalProperty(String key, Object value) {
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
    ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner = (ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner) o;
    return Objects.equals(this.answer, reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.answer) &&
        Objects.equals(this.dateTime, reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.dateTime) &&
        Objects.equals(this.pollingId, reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.pollingId) &&
        Objects.equals(this.question, reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.question)&&
        Objects.equals(this.additionalProperties, reportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, dateTime, pollingId, question, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner {\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    pollingId: ").append(toIndentedString(pollingId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
    openapiFields.add("answer");
    openapiFields.add("date_time");
    openapiFields.add("polling_id");
    openapiFields.add("question");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner is not found in the empty JSON string", ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("answer") != null && !jsonObj.get("answer").isJsonNull()) && !jsonObj.get("answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer").toString()));
      }
      if ((jsonObj.get("date_time") != null && !jsonObj.get("date_time").isJsonNull()) && !jsonObj.get("date_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_time").toString()));
      }
      if ((jsonObj.get("polling_id") != null && !jsonObj.get("polling_id").isJsonNull()) && !jsonObj.get("polling_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `polling_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("polling_id").toString()));
      }
      if ((jsonObj.get("question") != null && !jsonObj.get("question").isJsonNull()) && !jsonObj.get("question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner>() {
           @Override
           public void write(JsonWriter out, ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner value) throws IOException {
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
           public ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner
  * @throws IOException if the JSON string is invalid with respect to ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner
  */
  public static ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner.class);
  }

 /**
  * Convert an instance of ReportsGetWebinarPollReportsResponseQuestionsInnerQuestionDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

