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
 * Send follow-up email to attendees.
 */
@ApiModel(description = "Send follow-up email to attendees.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  /**
   * &#x60;0&#x60; - No plan.    &#x60;1&#x60; - Send 1 day after the scheduled end date.    &#x60;2&#x60; - Send 2 days after the scheduled end date.    &#x60;3&#x60; - Send 3 days after the scheduled end date.    &#x60;4&#x60; - Send 4 days after the scheduled end date.    &#x60;5&#x60; - Send 5 days after the scheduled end date.    &#x60;6&#x60; - Send 6 days after the scheduled end date.    &#x60;7&#x60; - Send 7 days after the scheduled end date.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification() {
  }

  public WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification enable(Boolean enable) {
    
    
    
    
    this.enable = enable;
    return this;
  }

   /**
   * * &#x60;true&#x60;: Send follow-up email to attendees.  * &#x60;false&#x60;: Do not send follow-up email to attendees.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "* `true`: Send follow-up email to attendees.  * `false`: Do not send follow-up email to attendees.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    
    
    
    this.enable = enable;
  }


  public WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;0&#x60; - No plan.    &#x60;1&#x60; - Send 1 day after the scheduled end date.    &#x60;2&#x60; - Send 2 days after the scheduled end date.    &#x60;3&#x60; - Send 3 days after the scheduled end date.    &#x60;4&#x60; - Send 4 days after the scheduled end date.    &#x60;5&#x60; - Send 5 days after the scheduled end date.    &#x60;6&#x60; - Send 6 days after the scheduled end date.    &#x60;7&#x60; - Send 7 days after the scheduled end date.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_0", value = "`0` - No plan.    `1` - Send 1 day after the scheduled end date.    `2` - Send 2 days after the scheduled end date.    `3` - Send 3 days after the scheduled end date.    `4` - Send 4 days after the scheduled end date.    `5` - Send 5 days after the scheduled end date.    `6` - Send 6 days after the scheduled end date.    `7` - Send 7 days after the scheduled end date.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification instance itself
   */
  public WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification putAdditionalProperty(String key, Object value) {
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
    WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification webinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification = (WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification) o;
    return Objects.equals(this.enable, webinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.enable) &&
        Objects.equals(this.type, webinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.type)&&
        Objects.equals(this.additionalProperties, webinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification is not found in the empty JSON string", WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification>() {
           @Override
           public void write(JsonWriter out, WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification value) throws IOException {
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
           public WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification
  * @throws IOException if the JSON string is invalid with respect to WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification
  */
  public static WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification.class);
  }

 /**
  * Convert an instance of WebinarsCreateWebinarResponseSettingsFollowUpAttendeesEmailNotification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

