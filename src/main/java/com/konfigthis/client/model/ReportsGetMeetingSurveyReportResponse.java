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
import com.konfigthis.client.model.ReportsGetMeetingSurveyReportResponseSurveyAnswersInner;
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
 * ReportsGetMeetingSurveyReportResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetMeetingSurveyReportResponse {
  public static final String SERIALIZED_NAME_MEETING_ID = "meeting_id";
  @SerializedName(SERIALIZED_NAME_MEETING_ID)
  private Long meetingId;

  public static final String SERIALIZED_NAME_MEETING_UUID = "meeting_uuid";
  @SerializedName(SERIALIZED_NAME_MEETING_UUID)
  private String meetingUuid;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SURVEY_ID = "survey_id";
  @SerializedName(SERIALIZED_NAME_SURVEY_ID)
  private String surveyId;

  public static final String SERIALIZED_NAME_SURVEY_NAME = "survey_name";
  @SerializedName(SERIALIZED_NAME_SURVEY_NAME)
  private String surveyName;

  public static final String SERIALIZED_NAME_SURVEY_ANSWERS = "survey_answers";
  @SerializedName(SERIALIZED_NAME_SURVEY_ANSWERS)
  private List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner> surveyAnswers = null;

  public ReportsGetMeetingSurveyReportResponse() {
  }

  public ReportsGetMeetingSurveyReportResponse meetingId(Long meetingId) {
    
    
    
    
    this.meetingId = meetingId;
    return this;
  }

   /**
   * The meeting ID.
   * @return meetingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The meeting ID.")

  public Long getMeetingId() {
    return meetingId;
  }


  public void setMeetingId(Long meetingId) {
    
    
    
    this.meetingId = meetingId;
  }


  public ReportsGetMeetingSurveyReportResponse meetingUuid(String meetingUuid) {
    
    
    
    
    this.meetingUuid = meetingUuid;
    return this;
  }

   /**
   * The meeting&#39;s universally unique identifier (UUID). Each meeting instance generates a meeting UUID.
   * @return meetingUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4444AAAiAAAAAiAiAiiAii==", value = "The meeting's universally unique identifier (UUID). Each meeting instance generates a meeting UUID.")

  public String getMeetingUuid() {
    return meetingUuid;
  }


  public void setMeetingUuid(String meetingUuid) {
    
    
    
    this.meetingUuid = meetingUuid;
  }


  public ReportsGetMeetingSurveyReportResponse startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The meeting&#39;s start time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-01T12:34:12.660Z", value = "The meeting's start time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public ReportsGetMeetingSurveyReportResponse surveyId(String surveyId) {
    
    
    
    
    this.surveyId = surveyId;
    return this;
  }

   /**
   * The survey&#39;s ID
   * @return surveyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8SFHRTGHAAAiAAAAAiAiAiiAii==", value = "The survey's ID")

  public String getSurveyId() {
    return surveyId;
  }


  public void setSurveyId(String surveyId) {
    
    
    
    this.surveyId = surveyId;
  }


  public ReportsGetMeetingSurveyReportResponse surveyName(String surveyName) {
    
    
    
    
    this.surveyName = surveyName;
    return this;
  }

   /**
   * The name of survey
   * @return surveyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Survey of this meeting", value = "The name of survey")

  public String getSurveyName() {
    return surveyName;
  }


  public void setSurveyName(String surveyName) {
    
    
    
    this.surveyName = surveyName;
  }


  public ReportsGetMeetingSurveyReportResponse surveyAnswers(List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner> surveyAnswers) {
    
    
    
    
    this.surveyAnswers = surveyAnswers;
    return this;
  }

  public ReportsGetMeetingSurveyReportResponse addSurveyAnswersItem(ReportsGetMeetingSurveyReportResponseSurveyAnswersInner surveyAnswersItem) {
    if (this.surveyAnswers == null) {
      this.surveyAnswers = new ArrayList<>();
    }
    this.surveyAnswers.add(surveyAnswersItem);
    return this;
  }

   /**
   * Information about the survey questions and answers.
   * @return surveyAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the survey questions and answers.")

  public List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner> getSurveyAnswers() {
    return surveyAnswers;
  }


  public void setSurveyAnswers(List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner> surveyAnswers) {
    
    
    
    this.surveyAnswers = surveyAnswers;
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
   * @return the ReportsGetMeetingSurveyReportResponse instance itself
   */
  public ReportsGetMeetingSurveyReportResponse putAdditionalProperty(String key, Object value) {
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
    ReportsGetMeetingSurveyReportResponse reportsGetMeetingSurveyReportResponse = (ReportsGetMeetingSurveyReportResponse) o;
    return Objects.equals(this.meetingId, reportsGetMeetingSurveyReportResponse.meetingId) &&
        Objects.equals(this.meetingUuid, reportsGetMeetingSurveyReportResponse.meetingUuid) &&
        Objects.equals(this.startTime, reportsGetMeetingSurveyReportResponse.startTime) &&
        Objects.equals(this.surveyId, reportsGetMeetingSurveyReportResponse.surveyId) &&
        Objects.equals(this.surveyName, reportsGetMeetingSurveyReportResponse.surveyName) &&
        Objects.equals(this.surveyAnswers, reportsGetMeetingSurveyReportResponse.surveyAnswers)&&
        Objects.equals(this.additionalProperties, reportsGetMeetingSurveyReportResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meetingId, meetingUuid, startTime, surveyId, surveyName, surveyAnswers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetMeetingSurveyReportResponse {\n");
    sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
    sb.append("    meetingUuid: ").append(toIndentedString(meetingUuid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyName: ").append(toIndentedString(surveyName)).append("\n");
    sb.append("    surveyAnswers: ").append(toIndentedString(surveyAnswers)).append("\n");
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
    openapiFields.add("meeting_id");
    openapiFields.add("meeting_uuid");
    openapiFields.add("start_time");
    openapiFields.add("survey_id");
    openapiFields.add("survey_name");
    openapiFields.add("survey_answers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetMeetingSurveyReportResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetMeetingSurveyReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetMeetingSurveyReportResponse is not found in the empty JSON string", ReportsGetMeetingSurveyReportResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("meeting_uuid") != null && !jsonObj.get("meeting_uuid").isJsonNull()) && !jsonObj.get("meeting_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meeting_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meeting_uuid").toString()));
      }
      if ((jsonObj.get("survey_id") != null && !jsonObj.get("survey_id").isJsonNull()) && !jsonObj.get("survey_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `survey_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("survey_id").toString()));
      }
      if ((jsonObj.get("survey_name") != null && !jsonObj.get("survey_name").isJsonNull()) && !jsonObj.get("survey_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `survey_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("survey_name").toString()));
      }
      if (jsonObj.get("survey_answers") != null && !jsonObj.get("survey_answers").isJsonNull()) {
        JsonArray jsonArraysurveyAnswers = jsonObj.getAsJsonArray("survey_answers");
        if (jsonArraysurveyAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("survey_answers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `survey_answers` to be an array in the JSON string but got `%s`", jsonObj.get("survey_answers").toString()));
          }

          // validate the optional field `survey_answers` (array)
          for (int i = 0; i < jsonArraysurveyAnswers.size(); i++) {
            ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.validateJsonObject(jsonArraysurveyAnswers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetMeetingSurveyReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetMeetingSurveyReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetMeetingSurveyReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetMeetingSurveyReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetMeetingSurveyReportResponse>() {
           @Override
           public void write(JsonWriter out, ReportsGetMeetingSurveyReportResponse value) throws IOException {
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
           public ReportsGetMeetingSurveyReportResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetMeetingSurveyReportResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetMeetingSurveyReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetMeetingSurveyReportResponse
  * @throws IOException if the JSON string is invalid with respect to ReportsGetMeetingSurveyReportResponse
  */
  public static ReportsGetMeetingSurveyReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetMeetingSurveyReportResponse.class);
  }

 /**
  * Convert an instance of ReportsGetMeetingSurveyReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
