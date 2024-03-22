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
import java.time.LocalDate;

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
 * ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_FREE_USAGE = "free_usage";
  @SerializedName(SERIALIZED_NAME_FREE_USAGE)
  private String freeUsage;

  public static final String SERIALIZED_NAME_PLAN_USAGE = "plan_usage";
  @SerializedName(SERIALIZED_NAME_PLAN_USAGE)
  private String planUsage;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private String usage;

  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner() {
  }

  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of the usage
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Dec 04 16:00:00 PST 2021", value = "Date of the usage")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner freeUsage(String freeUsage) {
    
    
    
    
    this.freeUsage = freeUsage;
    return this;
  }

   /**
   * Free storage
   * @return freeUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unlimited", value = "Free storage")

  public String getFreeUsage() {
    return freeUsage;
  }


  public void setFreeUsage(String freeUsage) {
    
    
    
    this.freeUsage = freeUsage;
  }


  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner planUsage(String planUsage) {
    
    
    
    
    this.planUsage = planUsage;
    return this;
  }

   /**
   * Paid storage
   * @return planUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3 TB", value = "Paid storage")

  public String getPlanUsage() {
    return planUsage;
  }


  public void setPlanUsage(String planUsage) {
    
    
    
    this.planUsage = planUsage;
  }


  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner usage(String usage) {
    
    
    
    
    this.usage = usage;
    return this;
  }

   /**
   * Storage used on the date
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3 MB", value = "Storage used on the date")

  public String getUsage() {
    return usage;
  }


  public void setUsage(String usage) {
    
    
    
    this.usage = usage;
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
   * @return the ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner instance itself
   */
  public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner putAdditionalProperty(String key, Object value) {
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
    ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner = (ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner) o;
    return Objects.equals(this.date, reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.date) &&
        Objects.equals(this.freeUsage, reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.freeUsage) &&
        Objects.equals(this.planUsage, reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.planUsage) &&
        Objects.equals(this.usage, reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.usage)&&
        Objects.equals(this.additionalProperties, reportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, freeUsage, planUsage, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freeUsage: ").append(toIndentedString(freeUsage)).append("\n");
    sb.append("    planUsage: ").append(toIndentedString(planUsage)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("free_usage");
    openapiFields.add("plan_usage");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner is not found in the empty JSON string", ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("free_usage") != null && !jsonObj.get("free_usage").isJsonNull()) && !jsonObj.get("free_usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_usage").toString()));
      }
      if ((jsonObj.get("plan_usage") != null && !jsonObj.get("plan_usage").isJsonNull()) && !jsonObj.get("plan_usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_usage").toString()));
      }
      if ((jsonObj.get("usage") != null && !jsonObj.get("usage").isJsonNull()) && !jsonObj.get("usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner>() {
           @Override
           public void write(JsonWriter out, ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner value) throws IOException {
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
           public ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner
  * @throws IOException if the JSON string is invalid with respect to ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner
  */
  public static ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner.class);
  }

 /**
  * Convert an instance of ReportsGetCloudRecordingUsageReportResponseCloudRecordingStorageInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
