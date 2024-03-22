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
 * Tracking Field
 */
@ApiModel(description = "Tracking Field")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrackingFieldUpdateRequest {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_RECOMMENDED_VALUES = "recommended_values";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_VALUES)
  private List<String> recommendedValues = null;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public TrackingFieldUpdateRequest() {
  }

  public TrackingFieldUpdateRequest field(String field) {
    
    
    
    
    this.field = field;
    return this;
  }

   /**
   * Label/ Name for the tracking field.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "field1", value = "Label/ Name for the tracking field.")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    
    
    
    this.field = field;
  }


  public TrackingFieldUpdateRequest recommendedValues(List<String> recommendedValues) {
    
    
    
    
    this.recommendedValues = recommendedValues;
    return this;
  }

  public TrackingFieldUpdateRequest addRecommendedValuesItem(String recommendedValuesItem) {
    if (this.recommendedValues == null) {
      this.recommendedValues = new ArrayList<>();
    }
    this.recommendedValues.add(recommendedValuesItem);
    return this;
  }

   /**
   * Array of recommended values
   * @return recommendedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of recommended values")

  public List<String> getRecommendedValues() {
    return recommendedValues;
  }


  public void setRecommendedValues(List<String> recommendedValues) {
    
    
    
    this.recommendedValues = recommendedValues;
  }


  public TrackingFieldUpdateRequest required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * Tracking Field Required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Tracking Field Required")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
  }


  public TrackingFieldUpdateRequest visible(Boolean visible) {
    
    
    
    
    this.visible = visible;
    return this;
  }

   /**
   * Tracking Field Visible
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Tracking Field Visible")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    
    
    
    this.visible = visible;
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
   * @return the TrackingFieldUpdateRequest instance itself
   */
  public TrackingFieldUpdateRequest putAdditionalProperty(String key, Object value) {
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
    TrackingFieldUpdateRequest trackingFieldUpdateRequest = (TrackingFieldUpdateRequest) o;
    return Objects.equals(this.field, trackingFieldUpdateRequest.field) &&
        Objects.equals(this.recommendedValues, trackingFieldUpdateRequest.recommendedValues) &&
        Objects.equals(this.required, trackingFieldUpdateRequest.required) &&
        Objects.equals(this.visible, trackingFieldUpdateRequest.visible)&&
        Objects.equals(this.additionalProperties, trackingFieldUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, recommendedValues, required, visible, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingFieldUpdateRequest {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    recommendedValues: ").append(toIndentedString(recommendedValues)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("recommended_values");
    openapiFields.add("required");
    openapiFields.add("visible");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingFieldUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrackingFieldUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingFieldUpdateRequest is not found in the empty JSON string", TrackingFieldUpdateRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recommended_values") != null && !jsonObj.get("recommended_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recommended_values` to be an array in the JSON string but got `%s`", jsonObj.get("recommended_values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingFieldUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingFieldUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingFieldUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingFieldUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingFieldUpdateRequest>() {
           @Override
           public void write(JsonWriter out, TrackingFieldUpdateRequest value) throws IOException {
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
           public TrackingFieldUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrackingFieldUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrackingFieldUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingFieldUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to TrackingFieldUpdateRequest
  */
  public static TrackingFieldUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingFieldUpdateRequest.class);
  }

 /**
  * Convert an instance of TrackingFieldUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

