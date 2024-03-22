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
import com.konfigthis.client.model.ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner;
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
 * ReportsGetMeetingSurveyReportResponseSurveyAnswersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetMeetingSurveyReportResponseSurveyAnswersInner {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ANSWER_DETAILS = "answer_details";
  @SerializedName(SERIALIZED_NAME_ANSWER_DETAILS)
  private List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner> answerDetails = null;

  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner() {
  }

  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The participant&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jchill@example.com", value = "The participant's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The participant&#39;s display name. **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id&#x3D;zm_kb&amp;sysparm_article&#x3D;KB0057559), the participant&#39;s survey information is kept anonymous and the &#x60;name&#x60; field will return the &amp;quot;Anonymous Attendee&amp;quot; value.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jill Chill", value = "The participant's display name. **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id=zm_kb&sysparm_article=KB0057559), the participant's survey information is kept anonymous and the `name` field will return the &quot;Anonymous Attendee&quot; value.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The participant&#39;s first name. If the **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id&#x3D;zm_kb&amp;sysparm_article&#x3D;KB0057559), the participant&#39;s survey information is kept anonymous and the &#x60;first_name&#x60; field will return the &amp;quot;Anonymous Attendee&amp;quot; value.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jill", value = "The participant's first name. If the **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id=zm_kb&sysparm_article=KB0057559), the participant's survey information is kept anonymous and the `first_name` field will return the &quot;Anonymous Attendee&quot; value.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The participant&#39;s last name. If the **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id&#x3D;zm_kb&amp;sysparm_article&#x3D;KB0057559), the participant&#39;s survey information is kept anonymous and the &#x60;last_name&#x60; field will return the &amp;quot;Anonymous Attendee&amp;quot; value.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chill", value = "The participant's last name. If the **Allow participants to answer questions anonymously** setting is enabled for a [survey](https://support.zoom.com/hc/en/article?id=zm_kb&sysparm_article=KB0057559), the participant's survey information is kept anonymous and the `last_name` field will return the &quot;Anonymous Attendee&quot; value.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner answerDetails(List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner> answerDetails) {
    
    
    
    
    this.answerDetails = answerDetails;
    return this;
  }

  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner addAnswerDetailsItem(ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner answerDetailsItem) {
    if (this.answerDetails == null) {
      this.answerDetails = new ArrayList<>();
    }
    this.answerDetails.add(answerDetailsItem);
    return this;
  }

   /**
   * Information about the user&#39;s questions and answers.
   * @return answerDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the user's questions and answers.")

  public List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner> getAnswerDetails() {
    return answerDetails;
  }


  public void setAnswerDetails(List<ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner> answerDetails) {
    
    
    
    this.answerDetails = answerDetails;
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
   * @return the ReportsGetMeetingSurveyReportResponseSurveyAnswersInner instance itself
   */
  public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner putAdditionalProperty(String key, Object value) {
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
    ReportsGetMeetingSurveyReportResponseSurveyAnswersInner reportsGetMeetingSurveyReportResponseSurveyAnswersInner = (ReportsGetMeetingSurveyReportResponseSurveyAnswersInner) o;
    return Objects.equals(this.email, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.email) &&
        Objects.equals(this.name, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.name) &&
        Objects.equals(this.firstName, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.firstName) &&
        Objects.equals(this.lastName, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.lastName) &&
        Objects.equals(this.answerDetails, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.answerDetails)&&
        Objects.equals(this.additionalProperties, reportsGetMeetingSurveyReportResponseSurveyAnswersInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, firstName, lastName, answerDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetMeetingSurveyReportResponseSurveyAnswersInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    answerDetails: ").append(toIndentedString(answerDetails)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("answer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetMeetingSurveyReportResponseSurveyAnswersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetMeetingSurveyReportResponseSurveyAnswersInner is not found in the empty JSON string", ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (jsonObj.get("answer_details") != null && !jsonObj.get("answer_details").isJsonNull()) {
        JsonArray jsonArrayanswerDetails = jsonObj.getAsJsonArray("answer_details");
        if (jsonArrayanswerDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("answer_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `answer_details` to be an array in the JSON string but got `%s`", jsonObj.get("answer_details").toString()));
          }

          // validate the optional field `answer_details` (array)
          for (int i = 0; i < jsonArrayanswerDetails.size(); i++) {
            ReportsGetMeetingSurveyReportResponseSurveyAnswersInnerAnswerDetailsInner.validateJsonObject(jsonArrayanswerDetails.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetMeetingSurveyReportResponseSurveyAnswersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetMeetingSurveyReportResponseSurveyAnswersInner>() {
           @Override
           public void write(JsonWriter out, ReportsGetMeetingSurveyReportResponseSurveyAnswersInner value) throws IOException {
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
           public ReportsGetMeetingSurveyReportResponseSurveyAnswersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetMeetingSurveyReportResponseSurveyAnswersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetMeetingSurveyReportResponseSurveyAnswersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetMeetingSurveyReportResponseSurveyAnswersInner
  * @throws IOException if the JSON string is invalid with respect to ReportsGetMeetingSurveyReportResponseSurveyAnswersInner
  */
  public static ReportsGetMeetingSurveyReportResponseSurveyAnswersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetMeetingSurveyReportResponseSurveyAnswersInner.class);
  }

 /**
  * Convert an instance of ReportsGetMeetingSurveyReportResponseSurveyAnswersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

