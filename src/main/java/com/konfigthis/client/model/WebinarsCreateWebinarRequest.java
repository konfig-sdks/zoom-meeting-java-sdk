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
import com.konfigthis.client.model.RecurrenceWebinarProperty;
import com.konfigthis.client.model.WebinarsCreateWebinarRequestSettings;
import com.konfigthis.client.model.WebinarsCreateWebinarRequestTrackingFieldsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Webinar object.
 */
@ApiModel(description = "Webinar object.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsCreateWebinarRequest {
  public static final String SERIALIZED_NAME_AGENDA = "agenda";
  @SerializedName(SERIALIZED_NAME_AGENDA)
  private String agenda;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private RecurrenceWebinarProperty recurrence;

  public static final String SERIALIZED_NAME_SCHEDULE_FOR = "schedule_for";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FOR)
  private String scheduleFor;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private WebinarsCreateWebinarRequestSettings settings;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_TRACKING_FIELDS = "tracking_fields";
  @SerializedName(SERIALIZED_NAME_TRACKING_FIELDS)
  private List<WebinarsCreateWebinarRequestTrackingFieldsInner> trackingFields = null;

  /**
   * Webinar types.  &#x60;5&#x60; - Webinar.    &#x60;6&#x60; - Recurring webinar with no fixed time.    &#x60;9&#x60; - Recurring webinar with a fixed time.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_9(9);

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
  private TypeEnum type = TypeEnum.NUMBER_5;

  public static final String SERIALIZED_NAME_IS_SIMULIVE = "is_simulive";
  @SerializedName(SERIALIZED_NAME_IS_SIMULIVE)
  private Boolean isSimulive;

  public static final String SERIALIZED_NAME_RECORD_FILE_ID = "record_file_id";
  @SerializedName(SERIALIZED_NAME_RECORD_FILE_ID)
  private String recordFileId;

  public WebinarsCreateWebinarRequest() {
  }

  public WebinarsCreateWebinarRequest agenda(String agenda) {
    
    
    
    
    this.agenda = agenda;
    return this;
  }

   /**
   * Webinar description.
   * @return agenda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Webinar", value = "Webinar description.")

  public String getAgenda() {
    return agenda;
  }


  public void setAgenda(String agenda) {
    
    
    
    this.agenda = agenda;
  }


  public WebinarsCreateWebinarRequest duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Webinar duration in minutes. Used for scheduled webinars only.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "Webinar duration in minutes. Used for scheduled webinars only.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public WebinarsCreateWebinarRequest password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * Webinar passcode. Passcode may only contain the characters [a-z A-Z 0-9 @ - _ * !]. Maximum of 10 characters.  If **Require a passcode when scheduling new meetings** setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated for the Webinar in the response even if it is not provided in the API request.     **Note:** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling the [**Get account settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/ma#operation/accountSettings) API.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Webinar passcode. Passcode may only contain the characters [a-z A-Z 0-9 @ - _ * !]. Maximum of 10 characters.  If **Require a passcode when scheduling new meetings** setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated for the Webinar in the response even if it is not provided in the API request.     **Note:** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling the [**Get account settings**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/ma#operation/accountSettings) API.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public WebinarsCreateWebinarRequest recurrence(RecurrenceWebinarProperty recurrence) {
    
    
    
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecurrenceWebinarProperty getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(RecurrenceWebinarProperty recurrence) {
    
    
    
    this.recurrence = recurrence;
  }


  public WebinarsCreateWebinarRequest scheduleFor(String scheduleFor) {
    
    
    
    
    this.scheduleFor = scheduleFor;
    return this;
  }

   /**
   * The email address or user ID of the user to schedule a webinar for.
   * @return scheduleFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jchill@example.com", value = "The email address or user ID of the user to schedule a webinar for.")

  public String getScheduleFor() {
    return scheduleFor;
  }


  public void setScheduleFor(String scheduleFor) {
    
    
    
    this.scheduleFor = scheduleFor;
  }


  public WebinarsCreateWebinarRequest settings(WebinarsCreateWebinarRequestSettings settings) {
    
    
    
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebinarsCreateWebinarRequestSettings getSettings() {
    return settings;
  }


  public void setSettings(WebinarsCreateWebinarRequestSettings settings) {
    
    
    
    this.settings = settings;
  }


  public WebinarsCreateWebinarRequest startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Webinar start time. We support two formats for &#x60;start_time&#x60; - local time and GMT.       To set time as GMT the format should be &#x60;yyyy-MM-dd&#x60;T&#x60;HH:mm:ssZ&#x60;.  To set time using a specific timezone, use &#x60;yyyy-MM-dd&#x60;T&#x60;HH:mm:ss&#x60; format and specify the timezone [ID](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones) in the &#x60;timezone&#x60; field OR leave it blank and the timezone set on your Zoom account will be used. You can also set the time as UTC as the timezone field.  The &#x60;start_time&#x60; should only be used for scheduled and / or recurring webinars with fixed time.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-26T06:44:14Z", value = "Webinar start time. We support two formats for `start_time` - local time and GMT.       To set time as GMT the format should be `yyyy-MM-dd`T`HH:mm:ssZ`.  To set time using a specific timezone, use `yyyy-MM-dd`T`HH:mm:ss` format and specify the timezone [ID](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones) in the `timezone` field OR leave it blank and the timezone set on your Zoom account will be used. You can also set the time as UTC as the timezone field.  The `start_time` should only be used for scheduled and / or recurring webinars with fixed time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public WebinarsCreateWebinarRequest templateId(String templateId) {
    
    
    
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The webinar template ID to schedule a webinar using a [webinar template](https://support.zoom.us/hc/en-us/articles/115001079746-Webinar-Templates) or a [admin webinar template](https://support.zoom.us/hc/en-us/articles/8137753618957-Configuring-admin-webinar-templates). For a list of webinar templates, use the [**List webinar templates**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/listWebinarTemplates) API.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5Cj3ceXoStO6TGOVvIOVPA==", value = "The webinar template ID to schedule a webinar using a [webinar template](https://support.zoom.us/hc/en-us/articles/115001079746-Webinar-Templates) or a [admin webinar template](https://support.zoom.us/hc/en-us/articles/8137753618957-Configuring-admin-webinar-templates). For a list of webinar templates, use the [**List webinar templates**](https://developers.zoom.us/docs/api/rest/reference/zoom-api/methods#operation/listWebinarTemplates) API.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    
    
    
    this.templateId = templateId;
  }


  public WebinarsCreateWebinarRequest timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone to assign to the &#x60;start_time&#x60; value. This field is only used for scheduled or recurring webinars with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/Los_Angeles", value = "The timezone to assign to the `start_time` value. This field is only used for scheduled or recurring webinars with a fixed time.  For a list of supported timezones and their formats, see our [timezone list](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public WebinarsCreateWebinarRequest topic(String topic) {
    
    
    
    
    this.topic = topic;
    return this;
  }

   /**
   * Webinar topic.
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Webinar", value = "Webinar topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    
    
    
    this.topic = topic;
  }


  public WebinarsCreateWebinarRequest trackingFields(List<WebinarsCreateWebinarRequestTrackingFieldsInner> trackingFields) {
    
    
    
    
    this.trackingFields = trackingFields;
    return this;
  }

  public WebinarsCreateWebinarRequest addTrackingFieldsItem(WebinarsCreateWebinarRequestTrackingFieldsInner trackingFieldsItem) {
    if (this.trackingFields == null) {
      this.trackingFields = new ArrayList<>();
    }
    this.trackingFields.add(trackingFieldsItem);
    return this;
  }

   /**
   * Tracking fields.
   * @return trackingFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracking fields.")

  public List<WebinarsCreateWebinarRequestTrackingFieldsInner> getTrackingFields() {
    return trackingFields;
  }


  public void setTrackingFields(List<WebinarsCreateWebinarRequestTrackingFieldsInner> trackingFields) {
    
    
    
    this.trackingFields = trackingFields;
  }


  public WebinarsCreateWebinarRequest type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Webinar types.  &#x60;5&#x60; - Webinar.    &#x60;6&#x60; - Recurring webinar with no fixed time.    &#x60;9&#x60; - Recurring webinar with a fixed time.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_5", value = "Webinar types.  `5` - Webinar.    `6` - Recurring webinar with no fixed time.    `9` - Recurring webinar with a fixed time.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public WebinarsCreateWebinarRequest isSimulive(Boolean isSimulive) {
    
    
    
    
    this.isSimulive = isSimulive;
    return this;
  }

   /**
   * Whether to set the webinar simulive.
   * @return isSimulive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to set the webinar simulive.")

  public Boolean getIsSimulive() {
    return isSimulive;
  }


  public void setIsSimulive(Boolean isSimulive) {
    
    
    
    this.isSimulive = isSimulive;
  }


  public WebinarsCreateWebinarRequest recordFileId(String recordFileId) {
    
    
    
    
    this.recordFileId = recordFileId;
    return this;
  }

   /**
   * The previously recorded file&#39;s ID for &#x60;simulive&#x60;.
   * @return recordFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f09340e1-cdc3-4eae-9a74-98f9777ed908", value = "The previously recorded file's ID for `simulive`.")

  public String getRecordFileId() {
    return recordFileId;
  }


  public void setRecordFileId(String recordFileId) {
    
    
    
    this.recordFileId = recordFileId;
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
   * @return the WebinarsCreateWebinarRequest instance itself
   */
  public WebinarsCreateWebinarRequest putAdditionalProperty(String key, Object value) {
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
    WebinarsCreateWebinarRequest webinarsCreateWebinarRequest = (WebinarsCreateWebinarRequest) o;
    return Objects.equals(this.agenda, webinarsCreateWebinarRequest.agenda) &&
        Objects.equals(this.duration, webinarsCreateWebinarRequest.duration) &&
        Objects.equals(this.password, webinarsCreateWebinarRequest.password) &&
        Objects.equals(this.recurrence, webinarsCreateWebinarRequest.recurrence) &&
        Objects.equals(this.scheduleFor, webinarsCreateWebinarRequest.scheduleFor) &&
        Objects.equals(this.settings, webinarsCreateWebinarRequest.settings) &&
        Objects.equals(this.startTime, webinarsCreateWebinarRequest.startTime) &&
        Objects.equals(this.templateId, webinarsCreateWebinarRequest.templateId) &&
        Objects.equals(this.timezone, webinarsCreateWebinarRequest.timezone) &&
        Objects.equals(this.topic, webinarsCreateWebinarRequest.topic) &&
        Objects.equals(this.trackingFields, webinarsCreateWebinarRequest.trackingFields) &&
        Objects.equals(this.type, webinarsCreateWebinarRequest.type) &&
        Objects.equals(this.isSimulive, webinarsCreateWebinarRequest.isSimulive) &&
        Objects.equals(this.recordFileId, webinarsCreateWebinarRequest.recordFileId)&&
        Objects.equals(this.additionalProperties, webinarsCreateWebinarRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agenda, duration, password, recurrence, scheduleFor, settings, startTime, templateId, timezone, topic, trackingFields, type, isSimulive, recordFileId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsCreateWebinarRequest {\n");
    sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    scheduleFor: ").append(toIndentedString(scheduleFor)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    trackingFields: ").append(toIndentedString(trackingFields)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isSimulive: ").append(toIndentedString(isSimulive)).append("\n");
    sb.append("    recordFileId: ").append(toIndentedString(recordFileId)).append("\n");
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
    openapiFields.add("agenda");
    openapiFields.add("duration");
    openapiFields.add("password");
    openapiFields.add("recurrence");
    openapiFields.add("schedule_for");
    openapiFields.add("settings");
    openapiFields.add("start_time");
    openapiFields.add("template_id");
    openapiFields.add("timezone");
    openapiFields.add("topic");
    openapiFields.add("tracking_fields");
    openapiFields.add("type");
    openapiFields.add("is_simulive");
    openapiFields.add("record_file_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsCreateWebinarRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsCreateWebinarRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsCreateWebinarRequest is not found in the empty JSON string", WebinarsCreateWebinarRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("agenda") != null && !jsonObj.get("agenda").isJsonNull()) && !jsonObj.get("agenda").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agenda` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agenda").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // validate the optional field `recurrence`
      if (jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) {
        RecurrenceWebinarProperty.validateJsonObject(jsonObj.getAsJsonObject("recurrence"));
      }
      if ((jsonObj.get("schedule_for") != null && !jsonObj.get("schedule_for").isJsonNull()) && !jsonObj.get("schedule_for").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule_for` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule_for").toString()));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        WebinarsCreateWebinarRequestSettings.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if (jsonObj.get("tracking_fields") != null && !jsonObj.get("tracking_fields").isJsonNull()) {
        JsonArray jsonArraytrackingFields = jsonObj.getAsJsonArray("tracking_fields");
        if (jsonArraytrackingFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tracking_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tracking_fields` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_fields").toString()));
          }

          // validate the optional field `tracking_fields` (array)
          for (int i = 0; i < jsonArraytrackingFields.size(); i++) {
            WebinarsCreateWebinarRequestTrackingFieldsInner.validateJsonObject(jsonArraytrackingFields.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("record_file_id") != null && !jsonObj.get("record_file_id").isJsonNull()) && !jsonObj.get("record_file_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `record_file_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("record_file_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsCreateWebinarRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsCreateWebinarRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsCreateWebinarRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsCreateWebinarRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsCreateWebinarRequest>() {
           @Override
           public void write(JsonWriter out, WebinarsCreateWebinarRequest value) throws IOException {
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
           public WebinarsCreateWebinarRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsCreateWebinarRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsCreateWebinarRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsCreateWebinarRequest
  * @throws IOException if the JSON string is invalid with respect to WebinarsCreateWebinarRequest
  */
  public static WebinarsCreateWebinarRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsCreateWebinarRequest.class);
  }

 /**
  * Convert an instance of WebinarsCreateWebinarRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

