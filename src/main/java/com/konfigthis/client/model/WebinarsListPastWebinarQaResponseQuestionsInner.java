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
import com.konfigthis.client.model.WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner;
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
 * WebinarsListPastWebinarQaResponseQuestionsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsListPastWebinarQaResponseQuestionsInner {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUESTION_DETAILS = "question_details";
  @SerializedName(SERIALIZED_NAME_QUESTION_DETAILS)
  private List<WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner> questionDetails = null;

  public WebinarsListPastWebinarQaResponseQuestionsInner() {
  }

  public WebinarsListPastWebinarQaResponseQuestionsInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the user. If the participant is **not** part of the host&#39;s account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jchill@example.com", value = "Email address of the user. If the participant is **not** part of the host's account, this returns an empty string value, with some exceptions. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for details.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public WebinarsListPastWebinarQaResponseQuestionsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user. If &#x60;anonymous&#x60; option is enabled for the Q&amp;amp;A, the participant&#39;s information will be kept anonymous and the value of &#x60;name&#x60; field will be &#x60;Anonymous Attendee&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jill Chill", value = "Name of the user. If `anonymous` option is enabled for the Q&amp;A, the participant's information will be kept anonymous and the value of `name` field will be `Anonymous Attendee`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WebinarsListPastWebinarQaResponseQuestionsInner questionDetails(List<WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner> questionDetails) {
    
    
    
    
    this.questionDetails = questionDetails;
    return this;
  }

  public WebinarsListPastWebinarQaResponseQuestionsInner addQuestionDetailsItem(WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner questionDetailsItem) {
    if (this.questionDetails == null) {
      this.questionDetails = new ArrayList<>();
    }
    this.questionDetails.add(questionDetailsItem);
    return this;
  }

   /**
   * Get questionDetails
   * @return questionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner> getQuestionDetails() {
    return questionDetails;
  }


  public void setQuestionDetails(List<WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner> questionDetails) {
    
    
    
    this.questionDetails = questionDetails;
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
   * @return the WebinarsListPastWebinarQaResponseQuestionsInner instance itself
   */
  public WebinarsListPastWebinarQaResponseQuestionsInner putAdditionalProperty(String key, Object value) {
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
    WebinarsListPastWebinarQaResponseQuestionsInner webinarsListPastWebinarQaResponseQuestionsInner = (WebinarsListPastWebinarQaResponseQuestionsInner) o;
    return Objects.equals(this.email, webinarsListPastWebinarQaResponseQuestionsInner.email) &&
        Objects.equals(this.name, webinarsListPastWebinarQaResponseQuestionsInner.name) &&
        Objects.equals(this.questionDetails, webinarsListPastWebinarQaResponseQuestionsInner.questionDetails)&&
        Objects.equals(this.additionalProperties, webinarsListPastWebinarQaResponseQuestionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, questionDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsListPastWebinarQaResponseQuestionsInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    questionDetails: ").append(toIndentedString(questionDetails)).append("\n");
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
    openapiFields.add("question_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsListPastWebinarQaResponseQuestionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsListPastWebinarQaResponseQuestionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsListPastWebinarQaResponseQuestionsInner is not found in the empty JSON string", WebinarsListPastWebinarQaResponseQuestionsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("question_details") != null && !jsonObj.get("question_details").isJsonNull()) {
        JsonArray jsonArrayquestionDetails = jsonObj.getAsJsonArray("question_details");
        if (jsonArrayquestionDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("question_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `question_details` to be an array in the JSON string but got `%s`", jsonObj.get("question_details").toString()));
          }

          // validate the optional field `question_details` (array)
          for (int i = 0; i < jsonArrayquestionDetails.size(); i++) {
            WebinarsListPastWebinarQaResponseQuestionsInnerQuestionDetailsInner.validateJsonObject(jsonArrayquestionDetails.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsListPastWebinarQaResponseQuestionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsListPastWebinarQaResponseQuestionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsListPastWebinarQaResponseQuestionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsListPastWebinarQaResponseQuestionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsListPastWebinarQaResponseQuestionsInner>() {
           @Override
           public void write(JsonWriter out, WebinarsListPastWebinarQaResponseQuestionsInner value) throws IOException {
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
           public WebinarsListPastWebinarQaResponseQuestionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsListPastWebinarQaResponseQuestionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsListPastWebinarQaResponseQuestionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsListPastWebinarQaResponseQuestionsInner
  * @throws IOException if the JSON string is invalid with respect to WebinarsListPastWebinarQaResponseQuestionsInner
  */
  public static WebinarsListPastWebinarQaResponseQuestionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsListPastWebinarQaResponseQuestionsInner.class);
  }

 /**
  * Convert an instance of WebinarsListPastWebinarQaResponseQuestionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

