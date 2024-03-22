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
 * Name tag information
 */
@ApiModel(description = "Name tag information")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsUpdateBrandingNameTagRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEXT_COLOR = "text_color";
  @SerializedName(SERIALIZED_NAME_TEXT_COLOR)
  private String textColor;

  public static final String SERIALIZED_NAME_ACCENT_COLOR = "accent_color";
  @SerializedName(SERIALIZED_NAME_ACCENT_COLOR)
  private String accentColor;

  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "background_color";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private String backgroundColor;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault = false;

  public static final String SERIALIZED_NAME_SET_DEFAULT_FOR_ALL_PANELISTS = "set_default_for_all_panelists";
  @SerializedName(SERIALIZED_NAME_SET_DEFAULT_FOR_ALL_PANELISTS)
  private Boolean setDefaultForAllPanelists = true;

  public WebinarsUpdateBrandingNameTagRequest() {
  }

  public WebinarsUpdateBrandingNameTagRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name tag&#39;s name.  **Note:** This value cannot exceed more than 50 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "name", value = "The name tag's name.  **Note:** This value cannot exceed more than 50 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WebinarsUpdateBrandingNameTagRequest textColor(String textColor) {
    
    
    
    
    this.textColor = textColor;
    return this;
  }

   /**
   * The name tag&#39;s text color.
   * @return textColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0e72ed", value = "The name tag's text color.")

  public String getTextColor() {
    return textColor;
  }


  public void setTextColor(String textColor) {
    
    
    
    this.textColor = textColor;
  }


  public WebinarsUpdateBrandingNameTagRequest accentColor(String accentColor) {
    
    
    
    
    this.accentColor = accentColor;
    return this;
  }

   /**
   * The name tag&#39;s accent color.
   * @return accentColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0e72ed", value = "The name tag's accent color.")

  public String getAccentColor() {
    return accentColor;
  }


  public void setAccentColor(String accentColor) {
    
    
    
    this.accentColor = accentColor;
  }


  public WebinarsUpdateBrandingNameTagRequest backgroundColor(String backgroundColor) {
    
    
    
    
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * The name tag&#39;s background color.
   * @return backgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0e72ed", value = "The name tag's background color.")

  public String getBackgroundColor() {
    return backgroundColor;
  }


  public void setBackgroundColor(String backgroundColor) {
    
    
    
    this.backgroundColor = backgroundColor;
  }


  public WebinarsUpdateBrandingNameTagRequest isDefault(Boolean isDefault) {
    
    
    
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether set the name tag as the default name tag or not.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether set the name tag as the default name tag or not.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    
    
    
    this.isDefault = isDefault;
  }


  public WebinarsUpdateBrandingNameTagRequest setDefaultForAllPanelists(Boolean setDefaultForAllPanelists) {
    
    
    
    
    this.setDefaultForAllPanelists = setDefaultForAllPanelists;
    return this;
  }

   /**
   * Whether to set the name tag as the new default for all panelists or not. This includes panelists not currently assigned a default name tag.
   * @return setDefaultForAllPanelists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to set the name tag as the new default for all panelists or not. This includes panelists not currently assigned a default name tag.")

  public Boolean getSetDefaultForAllPanelists() {
    return setDefaultForAllPanelists;
  }


  public void setSetDefaultForAllPanelists(Boolean setDefaultForAllPanelists) {
    
    
    
    this.setDefaultForAllPanelists = setDefaultForAllPanelists;
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
   * @return the WebinarsUpdateBrandingNameTagRequest instance itself
   */
  public WebinarsUpdateBrandingNameTagRequest putAdditionalProperty(String key, Object value) {
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
    WebinarsUpdateBrandingNameTagRequest webinarsUpdateBrandingNameTagRequest = (WebinarsUpdateBrandingNameTagRequest) o;
    return Objects.equals(this.name, webinarsUpdateBrandingNameTagRequest.name) &&
        Objects.equals(this.textColor, webinarsUpdateBrandingNameTagRequest.textColor) &&
        Objects.equals(this.accentColor, webinarsUpdateBrandingNameTagRequest.accentColor) &&
        Objects.equals(this.backgroundColor, webinarsUpdateBrandingNameTagRequest.backgroundColor) &&
        Objects.equals(this.isDefault, webinarsUpdateBrandingNameTagRequest.isDefault) &&
        Objects.equals(this.setDefaultForAllPanelists, webinarsUpdateBrandingNameTagRequest.setDefaultForAllPanelists)&&
        Objects.equals(this.additionalProperties, webinarsUpdateBrandingNameTagRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, textColor, accentColor, backgroundColor, isDefault, setDefaultForAllPanelists, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsUpdateBrandingNameTagRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    accentColor: ").append(toIndentedString(accentColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    setDefaultForAllPanelists: ").append(toIndentedString(setDefaultForAllPanelists)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("text_color");
    openapiFields.add("accent_color");
    openapiFields.add("background_color");
    openapiFields.add("is_default");
    openapiFields.add("set_default_for_all_panelists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsUpdateBrandingNameTagRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsUpdateBrandingNameTagRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsUpdateBrandingNameTagRequest is not found in the empty JSON string", WebinarsUpdateBrandingNameTagRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("text_color") != null && !jsonObj.get("text_color").isJsonNull()) && !jsonObj.get("text_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_color").toString()));
      }
      if ((jsonObj.get("accent_color") != null && !jsonObj.get("accent_color").isJsonNull()) && !jsonObj.get("accent_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accent_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accent_color").toString()));
      }
      if ((jsonObj.get("background_color") != null && !jsonObj.get("background_color").isJsonNull()) && !jsonObj.get("background_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsUpdateBrandingNameTagRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsUpdateBrandingNameTagRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsUpdateBrandingNameTagRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsUpdateBrandingNameTagRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsUpdateBrandingNameTagRequest>() {
           @Override
           public void write(JsonWriter out, WebinarsUpdateBrandingNameTagRequest value) throws IOException {
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
           public WebinarsUpdateBrandingNameTagRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsUpdateBrandingNameTagRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsUpdateBrandingNameTagRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsUpdateBrandingNameTagRequest
  * @throws IOException if the JSON string is invalid with respect to WebinarsUpdateBrandingNameTagRequest
  */
  public static WebinarsUpdateBrandingNameTagRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsUpdateBrandingNameTagRequest.class);
  }

 /**
  * Convert an instance of WebinarsUpdateBrandingNameTagRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

