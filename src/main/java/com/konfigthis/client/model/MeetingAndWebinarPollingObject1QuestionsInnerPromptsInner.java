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
 * MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner {
  public static final String SERIALIZED_NAME_PROMPT_QUESTION = "prompt_question";
  @SerializedName(SERIALIZED_NAME_PROMPT_QUESTION)
  private String promptQuestion;

  public static final String SERIALIZED_NAME_PROMPT_RIGHT_ANSWERS = "prompt_right_answers";
  @SerializedName(SERIALIZED_NAME_PROMPT_RIGHT_ANSWERS)
  private List<String> promptRightAnswers = null;

  public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner() {
  }

  public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner promptQuestion(String promptQuestion) {
    
    
    
    
    this.promptQuestion = promptQuestion;
    return this;
  }

   /**
   * The question prompt&#39;s title.
   * @return promptQuestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "How are you?", value = "The question prompt's title.")

  public String getPromptQuestion() {
    return promptQuestion;
  }


  public void setPromptQuestion(String promptQuestion) {
    
    
    
    this.promptQuestion = promptQuestion;
  }


  public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner promptRightAnswers(List<String> promptRightAnswers) {
    
    
    
    
    this.promptRightAnswers = promptRightAnswers;
    return this;
  }

  public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner addPromptRightAnswersItem(String promptRightAnswersItem) {
    if (this.promptRightAnswers == null) {
      this.promptRightAnswers = new ArrayList<>();
    }
    this.promptRightAnswers.add(promptRightAnswersItem);
    return this;
  }

   /**
   * The question prompt&#39;s correct answers:  * For &#x60;matching&#x60; polls, you must provide a minimum of two correct answers, up to a maximum of 10 correct answers.  * For &#x60;rank_order&#x60; polls, you can only provide one correct answer.
   * @return promptRightAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The question prompt's correct answers:  * For `matching` polls, you must provide a minimum of two correct answers, up to a maximum of 10 correct answers.  * For `rank_order` polls, you can only provide one correct answer.")

  public List<String> getPromptRightAnswers() {
    return promptRightAnswers;
  }


  public void setPromptRightAnswers(List<String> promptRightAnswers) {
    
    
    
    this.promptRightAnswers = promptRightAnswers;
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
   * @return the MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner instance itself
   */
  public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner putAdditionalProperty(String key, Object value) {
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
    MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner meetingAndWebinarPollingObject1QuestionsInnerPromptsInner = (MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner) o;
    return Objects.equals(this.promptQuestion, meetingAndWebinarPollingObject1QuestionsInnerPromptsInner.promptQuestion) &&
        Objects.equals(this.promptRightAnswers, meetingAndWebinarPollingObject1QuestionsInnerPromptsInner.promptRightAnswers)&&
        Objects.equals(this.additionalProperties, meetingAndWebinarPollingObject1QuestionsInnerPromptsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptQuestion, promptRightAnswers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner {\n");
    sb.append("    promptQuestion: ").append(toIndentedString(promptQuestion)).append("\n");
    sb.append("    promptRightAnswers: ").append(toIndentedString(promptRightAnswers)).append("\n");
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
    openapiFields.add("prompt_question");
    openapiFields.add("prompt_right_answers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner is not found in the empty JSON string", MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("prompt_question") != null && !jsonObj.get("prompt_question").isJsonNull()) && !jsonObj.get("prompt_question").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_question` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt_question").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("prompt_right_answers") != null && !jsonObj.get("prompt_right_answers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_right_answers` to be an array in the JSON string but got `%s`", jsonObj.get("prompt_right_answers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner>() {
           @Override
           public void write(JsonWriter out, MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner value) throws IOException {
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
           public MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner
  * @throws IOException if the JSON string is invalid with respect to MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner
  */
  public static MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner.class);
  }

 /**
  * Convert an instance of MeetingAndWebinarPollingObject1QuestionsInnerPromptsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

