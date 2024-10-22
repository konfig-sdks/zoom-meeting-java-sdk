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
import com.konfigthis.client.model.AnalyticsSummaryResponseAnalyticsSummaryInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * AnalyticsSummaryResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnalyticsSummaryResponse {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private LocalDate from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private LocalDate to;

  public static final String SERIALIZED_NAME_ANALYTICS_SUMMARY = "analytics_summary";
  @SerializedName(SERIALIZED_NAME_ANALYTICS_SUMMARY)
  private List<AnalyticsSummaryResponseAnalyticsSummaryInner> analyticsSummary = null;

  public AnalyticsSummaryResponse() {
  }

  public AnalyticsSummaryResponse from(LocalDate from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * The queried start date
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jul 29 17:00:00 PDT 2020", value = "The queried start date")

  public LocalDate getFrom() {
    return from;
  }


  public void setFrom(LocalDate from) {
    
    
    
    this.from = from;
  }


  public AnalyticsSummaryResponse to(LocalDate to) {
    
    
    
    
    this.to = to;
    return this;
  }

   /**
   * The queried end date.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jul 29 17:00:00 PDT 2020", value = "The queried end date.")

  public LocalDate getTo() {
    return to;
  }


  public void setTo(LocalDate to) {
    
    
    
    this.to = to;
  }


  public AnalyticsSummaryResponse analyticsSummary(List<AnalyticsSummaryResponseAnalyticsSummaryInner> analyticsSummary) {
    
    
    
    
    this.analyticsSummary = analyticsSummary;
    return this;
  }

  public AnalyticsSummaryResponse addAnalyticsSummaryItem(AnalyticsSummaryResponseAnalyticsSummaryInner analyticsSummaryItem) {
    if (this.analyticsSummary == null) {
      this.analyticsSummary = new ArrayList<>();
    }
    this.analyticsSummary.add(analyticsSummaryItem);
    return this;
  }

   /**
   * Analytics Summary.
   * @return analyticsSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Analytics Summary.")

  public List<AnalyticsSummaryResponseAnalyticsSummaryInner> getAnalyticsSummary() {
    return analyticsSummary;
  }


  public void setAnalyticsSummary(List<AnalyticsSummaryResponseAnalyticsSummaryInner> analyticsSummary) {
    
    
    
    this.analyticsSummary = analyticsSummary;
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
   * @return the AnalyticsSummaryResponse instance itself
   */
  public AnalyticsSummaryResponse putAdditionalProperty(String key, Object value) {
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
    AnalyticsSummaryResponse analyticsSummaryResponse = (AnalyticsSummaryResponse) o;
    return Objects.equals(this.from, analyticsSummaryResponse.from) &&
        Objects.equals(this.to, analyticsSummaryResponse.to) &&
        Objects.equals(this.analyticsSummary, analyticsSummaryResponse.analyticsSummary)&&
        Objects.equals(this.additionalProperties, analyticsSummaryResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, analyticsSummary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSummaryResponse {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    analyticsSummary: ").append(toIndentedString(analyticsSummary)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("analytics_summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyticsSummaryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnalyticsSummaryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyticsSummaryResponse is not found in the empty JSON string", AnalyticsSummaryResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("analytics_summary") != null && !jsonObj.get("analytics_summary").isJsonNull()) {
        JsonArray jsonArrayanalyticsSummary = jsonObj.getAsJsonArray("analytics_summary");
        if (jsonArrayanalyticsSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("analytics_summary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `analytics_summary` to be an array in the JSON string but got `%s`", jsonObj.get("analytics_summary").toString()));
          }

          // validate the optional field `analytics_summary` (array)
          for (int i = 0; i < jsonArrayanalyticsSummary.size(); i++) {
            AnalyticsSummaryResponseAnalyticsSummaryInner.validateJsonObject(jsonArrayanalyticsSummary.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsSummaryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsSummaryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsSummaryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsSummaryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsSummaryResponse>() {
           @Override
           public void write(JsonWriter out, AnalyticsSummaryResponse value) throws IOException {
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
           public AnalyticsSummaryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnalyticsSummaryResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnalyticsSummaryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsSummaryResponse
  * @throws IOException if the JSON string is invalid with respect to AnalyticsSummaryResponse
  */
  public static AnalyticsSummaryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsSummaryResponse.class);
  }

 /**
  * Convert an instance of AnalyticsSummaryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

