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
 * WebinarsCreateWebinarTemplateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsCreateWebinarTemplateRequest {
  public static final String SERIALIZED_NAME_WEBINAR_ID = "webinar_id";
  @SerializedName(SERIALIZED_NAME_WEBINAR_ID)
  private Long webinarId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SAVE_RECURRENCE = "save_recurrence";
  @SerializedName(SERIALIZED_NAME_SAVE_RECURRENCE)
  private Boolean saveRecurrence = false;

  public static final String SERIALIZED_NAME_OVERWRITE = "overwrite";
  @SerializedName(SERIALIZED_NAME_OVERWRITE)
  private Boolean overwrite = false;

  public WebinarsCreateWebinarTemplateRequest() {
  }

  public WebinarsCreateWebinarTemplateRequest webinarId(Long webinarId) {
    
    
    
    
    this.webinarId = webinarId;
    return this;
  }

   /**
   * The webinar ID in long (int64) format.
   * @return webinarId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96172769962", value = "The webinar ID in long (int64) format.")

  public Long getWebinarId() {
    return webinarId;
  }


  public void setWebinarId(Long webinarId) {
    
    
    
    this.webinarId = webinarId;
  }


  public WebinarsCreateWebinarTemplateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The webinar template&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Weekly Meeting Template", value = "The webinar template's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WebinarsCreateWebinarTemplateRequest saveRecurrence(Boolean saveRecurrence) {
    
    
    
    
    this.saveRecurrence = saveRecurrence;
    return this;
  }

   /**
   * If the field is set to true, the recurrence webinar template will be saved as the scheduled webinar.
   * @return saveRecurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If the field is set to true, the recurrence webinar template will be saved as the scheduled webinar.")

  public Boolean getSaveRecurrence() {
    return saveRecurrence;
  }


  public void setSaveRecurrence(Boolean saveRecurrence) {
    
    
    
    this.saveRecurrence = saveRecurrence;
  }


  public WebinarsCreateWebinarTemplateRequest overwrite(Boolean overwrite) {
    
    
    
    
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Overwrite an existing webinar template if the template is created from same existing webinar.
   * @return overwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Overwrite an existing webinar template if the template is created from same existing webinar.")

  public Boolean getOverwrite() {
    return overwrite;
  }


  public void setOverwrite(Boolean overwrite) {
    
    
    
    this.overwrite = overwrite;
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
   * @return the WebinarsCreateWebinarTemplateRequest instance itself
   */
  public WebinarsCreateWebinarTemplateRequest putAdditionalProperty(String key, Object value) {
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
    WebinarsCreateWebinarTemplateRequest webinarsCreateWebinarTemplateRequest = (WebinarsCreateWebinarTemplateRequest) o;
    return Objects.equals(this.webinarId, webinarsCreateWebinarTemplateRequest.webinarId) &&
        Objects.equals(this.name, webinarsCreateWebinarTemplateRequest.name) &&
        Objects.equals(this.saveRecurrence, webinarsCreateWebinarTemplateRequest.saveRecurrence) &&
        Objects.equals(this.overwrite, webinarsCreateWebinarTemplateRequest.overwrite)&&
        Objects.equals(this.additionalProperties, webinarsCreateWebinarTemplateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webinarId, name, saveRecurrence, overwrite, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsCreateWebinarTemplateRequest {\n");
    sb.append("    webinarId: ").append(toIndentedString(webinarId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    saveRecurrence: ").append(toIndentedString(saveRecurrence)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
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
    openapiFields.add("webinar_id");
    openapiFields.add("name");
    openapiFields.add("save_recurrence");
    openapiFields.add("overwrite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsCreateWebinarTemplateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsCreateWebinarTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsCreateWebinarTemplateRequest is not found in the empty JSON string", WebinarsCreateWebinarTemplateRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsCreateWebinarTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsCreateWebinarTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsCreateWebinarTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsCreateWebinarTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsCreateWebinarTemplateRequest>() {
           @Override
           public void write(JsonWriter out, WebinarsCreateWebinarTemplateRequest value) throws IOException {
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
           public WebinarsCreateWebinarTemplateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsCreateWebinarTemplateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsCreateWebinarTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsCreateWebinarTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to WebinarsCreateWebinarTemplateRequest
  */
  public static WebinarsCreateWebinarTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsCreateWebinarTemplateRequest.class);
  }

 /**
  * Convert an instance of WebinarsCreateWebinarTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

