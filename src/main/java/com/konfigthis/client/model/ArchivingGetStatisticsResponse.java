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
import com.konfigthis.client.model.ArchivingGetStatisticsResponseStatisticByFileExtension;
import com.konfigthis.client.model.ArchivingGetStatisticsResponseStatisticByFileStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ArchivingGetStatisticsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ArchivingGetStatisticsResponse {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private OffsetDateTime from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private OffsetDateTime to;

  public static final String SERIALIZED_NAME_TOTAL_RECORDS = "total_records";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDS)
  private Integer totalRecords;

  public static final String SERIALIZED_NAME_STATISTIC_BY_FILE_EXTENSION = "statistic_by_file_extension";
  @SerializedName(SERIALIZED_NAME_STATISTIC_BY_FILE_EXTENSION)
  private ArchivingGetStatisticsResponseStatisticByFileExtension statisticByFileExtension;

  public static final String SERIALIZED_NAME_STATISTIC_BY_FILE_STATUS = "statistic_by_file_status";
  @SerializedName(SERIALIZED_NAME_STATISTIC_BY_FILE_STATUS)
  private ArchivingGetStatisticsResponseStatisticByFileStatus statisticByFileStatus;

  public ArchivingGetStatisticsResponse() {
  }

  public ArchivingGetStatisticsResponse from(OffsetDateTime from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * The queried start date.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-18T05:41:36Z", value = "The queried start date.")

  public OffsetDateTime getFrom() {
    return from;
  }


  public void setFrom(OffsetDateTime from) {
    
    
    
    this.from = from;
  }


  public ArchivingGetStatisticsResponse to(OffsetDateTime to) {
    
    
    
    
    this.to = to;
    return this;
  }

   /**
   * The queried end date.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-18T05:41:36Z", value = "The queried end date.")

  public OffsetDateTime getTo() {
    return to;
  }


  public void setTo(OffsetDateTime to) {
    
    
    
    this.to = to;
  }


  public ArchivingGetStatisticsResponse totalRecords(Integer totalRecords) {
    
    
    
    
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * The total number of returned meeting records.
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The total number of returned meeting records.")

  public Integer getTotalRecords() {
    return totalRecords;
  }


  public void setTotalRecords(Integer totalRecords) {
    
    
    
    this.totalRecords = totalRecords;
  }


  public ArchivingGetStatisticsResponse statisticByFileExtension(ArchivingGetStatisticsResponseStatisticByFileExtension statisticByFileExtension) {
    
    
    
    
    this.statisticByFileExtension = statisticByFileExtension;
    return this;
  }

   /**
   * Get statisticByFileExtension
   * @return statisticByFileExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArchivingGetStatisticsResponseStatisticByFileExtension getStatisticByFileExtension() {
    return statisticByFileExtension;
  }


  public void setStatisticByFileExtension(ArchivingGetStatisticsResponseStatisticByFileExtension statisticByFileExtension) {
    
    
    
    this.statisticByFileExtension = statisticByFileExtension;
  }


  public ArchivingGetStatisticsResponse statisticByFileStatus(ArchivingGetStatisticsResponseStatisticByFileStatus statisticByFileStatus) {
    
    
    
    
    this.statisticByFileStatus = statisticByFileStatus;
    return this;
  }

   /**
   * Get statisticByFileStatus
   * @return statisticByFileStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArchivingGetStatisticsResponseStatisticByFileStatus getStatisticByFileStatus() {
    return statisticByFileStatus;
  }


  public void setStatisticByFileStatus(ArchivingGetStatisticsResponseStatisticByFileStatus statisticByFileStatus) {
    
    
    
    this.statisticByFileStatus = statisticByFileStatus;
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
   * @return the ArchivingGetStatisticsResponse instance itself
   */
  public ArchivingGetStatisticsResponse putAdditionalProperty(String key, Object value) {
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
    ArchivingGetStatisticsResponse archivingGetStatisticsResponse = (ArchivingGetStatisticsResponse) o;
    return Objects.equals(this.from, archivingGetStatisticsResponse.from) &&
        Objects.equals(this.to, archivingGetStatisticsResponse.to) &&
        Objects.equals(this.totalRecords, archivingGetStatisticsResponse.totalRecords) &&
        Objects.equals(this.statisticByFileExtension, archivingGetStatisticsResponse.statisticByFileExtension) &&
        Objects.equals(this.statisticByFileStatus, archivingGetStatisticsResponse.statisticByFileStatus)&&
        Objects.equals(this.additionalProperties, archivingGetStatisticsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, totalRecords, statisticByFileExtension, statisticByFileStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchivingGetStatisticsResponse {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    statisticByFileExtension: ").append(toIndentedString(statisticByFileExtension)).append("\n");
    sb.append("    statisticByFileStatus: ").append(toIndentedString(statisticByFileStatus)).append("\n");
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
    openapiFields.add("total_records");
    openapiFields.add("statistic_by_file_extension");
    openapiFields.add("statistic_by_file_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArchivingGetStatisticsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ArchivingGetStatisticsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArchivingGetStatisticsResponse is not found in the empty JSON string", ArchivingGetStatisticsResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `statistic_by_file_extension`
      if (jsonObj.get("statistic_by_file_extension") != null && !jsonObj.get("statistic_by_file_extension").isJsonNull()) {
        ArchivingGetStatisticsResponseStatisticByFileExtension.validateJsonObject(jsonObj.getAsJsonObject("statistic_by_file_extension"));
      }
      // validate the optional field `statistic_by_file_status`
      if (jsonObj.get("statistic_by_file_status") != null && !jsonObj.get("statistic_by_file_status").isJsonNull()) {
        ArchivingGetStatisticsResponseStatisticByFileStatus.validateJsonObject(jsonObj.getAsJsonObject("statistic_by_file_status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArchivingGetStatisticsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArchivingGetStatisticsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArchivingGetStatisticsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArchivingGetStatisticsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ArchivingGetStatisticsResponse>() {
           @Override
           public void write(JsonWriter out, ArchivingGetStatisticsResponse value) throws IOException {
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
           public ArchivingGetStatisticsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArchivingGetStatisticsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArchivingGetStatisticsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArchivingGetStatisticsResponse
  * @throws IOException if the JSON string is invalid with respect to ArchivingGetStatisticsResponse
  */
  public static ArchivingGetStatisticsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArchivingGetStatisticsResponse.class);
  }

 /**
  * Convert an instance of ArchivingGetStatisticsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

