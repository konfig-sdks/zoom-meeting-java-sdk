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
import com.konfigthis.client.model.WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner;
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
 * The webinar&#39;s [sign language interpretation settings](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar). Make sure to add the language in the web portal in order to use it in the API. See link for details.   **Note:** If this feature is not enabled on the host&#39;s account, this setting will **not** be applied to the webinar.
 */
@ApiModel(description = "The webinar's [sign language interpretation settings](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar). Make sure to add the language in the web portal in order to use it in the API. See link for details.   **Note:** If this feature is not enabled on the host's account, this setting will **not** be applied to the webinar.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsGetDetailsResponseSettingsSignLanguageInterpretation {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_INTERPRETERS = "interpreters";
  @SerializedName(SERIALIZED_NAME_INTERPRETERS)
  private List<WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner> interpreters = null;

  public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation() {
  }

  public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation enable(Boolean enable) {
    
    
    
    
    this.enable = enable;
    return this;
  }

   /**
   * Whether to enable [sign language interpretation](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar) for the webinar.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to enable [sign language interpretation](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar) for the webinar.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    
    
    
    this.enable = enable;
  }


  public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation interpreters(List<WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner> interpreters) {
    
    
    
    
    this.interpreters = interpreters;
    return this;
  }

  public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation addInterpretersItem(WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner interpretersItem) {
    if (this.interpreters == null) {
      this.interpreters = new ArrayList<>();
    }
    this.interpreters.add(interpretersItem);
    return this;
  }

   /**
   * Information about the webinar&#39;s sign language interpreters.
   * @return interpreters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the webinar's sign language interpreters.")

  public List<WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner> getInterpreters() {
    return interpreters;
  }


  public void setInterpreters(List<WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner> interpreters) {
    
    
    
    this.interpreters = interpreters;
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
   * @return the WebinarsGetDetailsResponseSettingsSignLanguageInterpretation instance itself
   */
  public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation putAdditionalProperty(String key, Object value) {
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
    WebinarsGetDetailsResponseSettingsSignLanguageInterpretation webinarsGetDetailsResponseSettingsSignLanguageInterpretation = (WebinarsGetDetailsResponseSettingsSignLanguageInterpretation) o;
    return Objects.equals(this.enable, webinarsGetDetailsResponseSettingsSignLanguageInterpretation.enable) &&
        Objects.equals(this.interpreters, webinarsGetDetailsResponseSettingsSignLanguageInterpretation.interpreters)&&
        Objects.equals(this.additionalProperties, webinarsGetDetailsResponseSettingsSignLanguageInterpretation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, interpreters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsGetDetailsResponseSettingsSignLanguageInterpretation {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    interpreters: ").append(toIndentedString(interpreters)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("interpreters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsGetDetailsResponseSettingsSignLanguageInterpretation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsGetDetailsResponseSettingsSignLanguageInterpretation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsGetDetailsResponseSettingsSignLanguageInterpretation is not found in the empty JSON string", WebinarsGetDetailsResponseSettingsSignLanguageInterpretation.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("interpreters") != null && !jsonObj.get("interpreters").isJsonNull()) {
        JsonArray jsonArrayinterpreters = jsonObj.getAsJsonArray("interpreters");
        if (jsonArrayinterpreters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("interpreters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `interpreters` to be an array in the JSON string but got `%s`", jsonObj.get("interpreters").toString()));
          }

          // validate the optional field `interpreters` (array)
          for (int i = 0; i < jsonArrayinterpreters.size(); i++) {
            WebinarsGetDetailsResponseSettingsSignLanguageInterpretationInterpretersInner.validateJsonObject(jsonArrayinterpreters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsGetDetailsResponseSettingsSignLanguageInterpretation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsGetDetailsResponseSettingsSignLanguageInterpretation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsGetDetailsResponseSettingsSignLanguageInterpretation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsGetDetailsResponseSettingsSignLanguageInterpretation.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsGetDetailsResponseSettingsSignLanguageInterpretation>() {
           @Override
           public void write(JsonWriter out, WebinarsGetDetailsResponseSettingsSignLanguageInterpretation value) throws IOException {
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
           public WebinarsGetDetailsResponseSettingsSignLanguageInterpretation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsGetDetailsResponseSettingsSignLanguageInterpretation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsGetDetailsResponseSettingsSignLanguageInterpretation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsGetDetailsResponseSettingsSignLanguageInterpretation
  * @throws IOException if the JSON string is invalid with respect to WebinarsGetDetailsResponseSettingsSignLanguageInterpretation
  */
  public static WebinarsGetDetailsResponseSettingsSignLanguageInterpretation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsGetDetailsResponseSettingsSignLanguageInterpretation.class);
  }

 /**
  * Convert an instance of WebinarsGetDetailsResponseSettingsSignLanguageInterpretation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

