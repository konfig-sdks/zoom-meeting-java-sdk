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
 * WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SIGN_LANGUAGE = "sign_language";
  @SerializedName(SERIALIZED_NAME_SIGN_LANGUAGE)
  private String signLanguage;

  public WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner() {
  }

  public WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The interpreter&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "interpreter@example.com", value = "The interpreter's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner signLanguage(String signLanguage) {
    
    
    
    
    this.signLanguage = signLanguage;
    return this;
  }

   /**
   * The interpreter&#39;s sign language.    To get this value, use the &#x60;sign_language_interpretation&#x60; object&#39;s &#x60;languages&#x60; and &#x60;custom_languages&#x60; values in the [**Get user settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/userSettings) API response.
   * @return signLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "American", value = "The interpreter's sign language.    To get this value, use the `sign_language_interpretation` object's `languages` and `custom_languages` values in the [**Get user settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/userSettings) API response.")

  public String getSignLanguage() {
    return signLanguage;
  }


  public void setSignLanguage(String signLanguage) {
    
    
    
    this.signLanguage = signLanguage;
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
   * @return the WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner instance itself
   */
  public WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner putAdditionalProperty(String key, Object value) {
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
    WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner webinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner = (WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner) o;
    return Objects.equals(this.email, webinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.email) &&
        Objects.equals(this.signLanguage, webinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.signLanguage)&&
        Objects.equals(this.additionalProperties, webinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, signLanguage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signLanguage: ").append(toIndentedString(signLanguage)).append("\n");
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
    openapiFields.add("sign_language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner is not found in the empty JSON string", WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("sign_language") != null && !jsonObj.get("sign_language").isJsonNull()) && !jsonObj.get("sign_language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner>() {
           @Override
           public void write(JsonWriter out, WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner value) throws IOException {
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
           public WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner
  * @throws IOException if the JSON string is invalid with respect to WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner
  */
  public static WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner.class);
  }

 /**
  * Convert an instance of WebinarsCreateWebinarRequestSettingsSignLanguageInterpretationInterpretersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

