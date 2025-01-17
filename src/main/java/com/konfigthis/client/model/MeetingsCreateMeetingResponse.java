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
import com.konfigthis.client.model.MeetingsCreateMeetingResponseOccurrencesInner;
import com.konfigthis.client.model.MeetingsCreateMeetingResponseRecurrence;
import com.konfigthis.client.model.MeetingsCreateMeetingResponseSettings;
import com.konfigthis.client.model.MeetingsCreateMeetingResponseTrackingFieldsInner;
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
 * Meeting object.
 */
@ApiModel(description = "Meeting object.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MeetingsCreateMeetingResponse {
  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public static final String SERIALIZED_NAME_HOST_EMAIL = "host_email";
  @SerializedName(SERIALIZED_NAME_HOST_EMAIL)
  private String hostEmail;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REGISTRATION_URL = "registration_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_URL)
  private String registrationUrl;

  public static final String SERIALIZED_NAME_AGENDA = "agenda";
  @SerializedName(SERIALIZED_NAME_AGENDA)
  private String agenda;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_H323_PASSWORD = "h323_password";
  @SerializedName(SERIALIZED_NAME_H323_PASSWORD)
  private String h323Password;

  public static final String SERIALIZED_NAME_JOIN_URL = "join_url";
  @SerializedName(SERIALIZED_NAME_JOIN_URL)
  private String joinUrl;

  public static final String SERIALIZED_NAME_CHAT_JOIN_URL = "chat_join_url";
  @SerializedName(SERIALIZED_NAME_CHAT_JOIN_URL)
  private String chatJoinUrl;

  public static final String SERIALIZED_NAME_OCCURRENCES = "occurrences";
  @SerializedName(SERIALIZED_NAME_OCCURRENCES)
  private List<MeetingsCreateMeetingResponseOccurrencesInner> occurrences = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PMI = "pmi";
  @SerializedName(SERIALIZED_NAME_PMI)
  private String pmi;

  public static final String SERIALIZED_NAME_PRE_SCHEDULE = "pre_schedule";
  @SerializedName(SERIALIZED_NAME_PRE_SCHEDULE)
  private Boolean preSchedule = false;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private MeetingsCreateMeetingResponseRecurrence recurrence;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private MeetingsCreateMeetingResponseSettings settings;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_START_URL = "start_url";
  @SerializedName(SERIALIZED_NAME_START_URL)
  private String startUrl;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_TRACKING_FIELDS = "tracking_fields";
  @SerializedName(SERIALIZED_NAME_TRACKING_FIELDS)
  private List<MeetingsCreateMeetingResponseTrackingFieldsInner> trackingFields = null;

  /**
   * Meeting type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_8(8);

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
  private TypeEnum type = TypeEnum.NUMBER_2;

  public MeetingsCreateMeetingResponse() {
  }

  public MeetingsCreateMeetingResponse assistantId(String assistantId) {
    
    
    
    
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the user who scheduled this meeting on behalf of the host.
   * @return assistantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kFFvsJc-Q1OSxaJQLvaa_A", value = "The ID of the user who scheduled this meeting on behalf of the host.")

  public String getAssistantId() {
    return assistantId;
  }


  public void setAssistantId(String assistantId) {
    
    
    
    this.assistantId = assistantId;
  }


  public MeetingsCreateMeetingResponse hostEmail(String hostEmail) {
    
    
    
    
    this.hostEmail = hostEmail;
    return this;
  }

   /**
   * The meeting host&#39;s email address.
   * @return hostEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jchill@example.com", value = "The meeting host's email address.")

  public String getHostEmail() {
    return hostEmail;
  }


  public void setHostEmail(String hostEmail) {
    
    
    
    this.hostEmail = hostEmail;
  }


  public MeetingsCreateMeetingResponse id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in **long** format(represented as int64 data type in JSON), also known as the meeting number.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92674392836", value = "The [meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in **long** format(represented as int64 data type in JSON), also known as the meeting number.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public MeetingsCreateMeetingResponse registrationUrl(String registrationUrl) {
    
    
    
    
    this.registrationUrl = registrationUrl;
    return this;
  }

   /**
   * The URL that registrants can use to register for a meeting. This field is only returned for meetings that have enabled registration.
   * @return registrationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/meeting/register/7ksAkRCoEpt1Jm0wa-E6lICLur9e7Lde5oW6", value = "The URL that registrants can use to register for a meeting. This field is only returned for meetings that have enabled registration.")

  public String getRegistrationUrl() {
    return registrationUrl;
  }


  public void setRegistrationUrl(String registrationUrl) {
    
    
    
    this.registrationUrl = registrationUrl;
  }


  public MeetingsCreateMeetingResponse agenda(String agenda) {
    
    
    
    
    this.agenda = agenda;
    return this;
  }

   /**
   * Agenda
   * @return agenda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Meeting", value = "Agenda")

  public String getAgenda() {
    return agenda;
  }


  public void setAgenda(String agenda) {
    
    
    
    this.agenda = agenda;
  }


  public MeetingsCreateMeetingResponse createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this meeting was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-25T07:29:29Z", value = "The date and time when this meeting was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public MeetingsCreateMeetingResponse duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * The meeting duration.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "The meeting duration.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public MeetingsCreateMeetingResponse h323Password(String h323Password) {
    
    
    
    
    this.h323Password = h323Password;
    return this;
  }

   /**
   * H.323/SIP room system passcode
   * @return h323Password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "H.323/SIP room system passcode")

  public String getH323Password() {
    return h323Password;
  }


  public void setH323Password(String h323Password) {
    
    
    
    this.h323Password = h323Password;
  }


  public MeetingsCreateMeetingResponse joinUrl(String joinUrl) {
    
    
    
    
    this.joinUrl = joinUrl;
    return this;
  }

   /**
   * URL for participants to join the meeting. This URL should only be shared with users that you would like to invite for the meeting.
   * @return joinUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/j/11111", value = "URL for participants to join the meeting. This URL should only be shared with users that you would like to invite for the meeting.")

  public String getJoinUrl() {
    return joinUrl;
  }


  public void setJoinUrl(String joinUrl) {
    
    
    
    this.joinUrl = joinUrl;
  }


  public MeetingsCreateMeetingResponse chatJoinUrl(String chatJoinUrl) {
    
    
    
    
    this.chatJoinUrl = chatJoinUrl;
    return this;
  }

   /**
   * The URL to join the chat.
   * @return chatJoinUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/launch/jc/11111", value = "The URL to join the chat.")

  public String getChatJoinUrl() {
    return chatJoinUrl;
  }


  public void setChatJoinUrl(String chatJoinUrl) {
    
    
    
    this.chatJoinUrl = chatJoinUrl;
  }


  public MeetingsCreateMeetingResponse occurrences(List<MeetingsCreateMeetingResponseOccurrencesInner> occurrences) {
    
    
    
    
    this.occurrences = occurrences;
    return this;
  }

  public MeetingsCreateMeetingResponse addOccurrencesItem(MeetingsCreateMeetingResponseOccurrencesInner occurrencesItem) {
    if (this.occurrences == null) {
      this.occurrences = new ArrayList<>();
    }
    this.occurrences.add(occurrencesItem);
    return this;
  }

   /**
   * Array of occurrence objects.
   * @return occurrences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of occurrence objects.")

  public List<MeetingsCreateMeetingResponseOccurrencesInner> getOccurrences() {
    return occurrences;
  }


  public void setOccurrences(List<MeetingsCreateMeetingResponseOccurrencesInner> occurrences) {
    
    
    
    this.occurrences = occurrences;
  }


  public MeetingsCreateMeetingResponse password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The meeting passcode. This passcode may only contain these characters: &#x60;[a-z A-Z 0-9 @ - _ * !]&#x60;  If **Require a passcode when scheduling new meetings** setting has been enabled and [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated in the response even if it is not provided in the API request.    
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The meeting passcode. This passcode may only contain these characters: `[a-z A-Z 0-9 @ - _ * !]`  If **Require a passcode when scheduling new meetings** setting has been enabled and [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated in the response even if it is not provided in the API request.    ")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public MeetingsCreateMeetingResponse pmi(String pmi) {
    
    
    
    
    this.pmi = pmi;
    return this;
  }

   /**
   * [Personal meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). Only used for scheduled meetings and recurring meetings with no fixed time.
   * @return pmi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "97891943927", value = "[Personal meeting ID (PMI)](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#understanding-personal-meeting-id-pmi). Only used for scheduled meetings and recurring meetings with no fixed time.")

  public String getPmi() {
    return pmi;
  }


  public void setPmi(String pmi) {
    
    
    
    this.pmi = pmi;
  }


  public MeetingsCreateMeetingResponse preSchedule(Boolean preSchedule) {
    
    
    
    
    this.preSchedule = preSchedule;
    return this;
  }

   /**
   * Whether the prescheduled meeting was created via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This only supports the meeting &#x60;type&#x60; value of &#x60;2&#x60; (scheduled meetings) and &#x60;3&#x60; (recurring meetings with no fixed time).  * &#x60;true&#x60; - A GSuite prescheduled meeting.  * &#x60;false&#x60; - A regular meeting.
   * @return preSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the prescheduled meeting was created via the [GSuite app](https://support.zoom.us/hc/en-us/articles/360020187492-Zoom-for-GSuite-add-on). This only supports the meeting `type` value of `2` (scheduled meetings) and `3` (recurring meetings with no fixed time).  * `true` - A GSuite prescheduled meeting.  * `false` - A regular meeting.")

  public Boolean getPreSchedule() {
    return preSchedule;
  }


  public void setPreSchedule(Boolean preSchedule) {
    
    
    
    this.preSchedule = preSchedule;
  }


  public MeetingsCreateMeetingResponse recurrence(MeetingsCreateMeetingResponseRecurrence recurrence) {
    
    
    
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MeetingsCreateMeetingResponseRecurrence getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(MeetingsCreateMeetingResponseRecurrence recurrence) {
    
    
    
    this.recurrence = recurrence;
  }


  public MeetingsCreateMeetingResponse settings(MeetingsCreateMeetingResponseSettings settings) {
    
    
    
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MeetingsCreateMeetingResponseSettings getSettings() {
    return settings;
  }


  public void setSettings(MeetingsCreateMeetingResponseSettings settings) {
    
    
    
    this.settings = settings;
  }


  public MeetingsCreateMeetingResponse startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Meeting start date-time in UTC/GMT, such as &#x60;2020-03-31T12:02:00Z&#x60;.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-25T07:29:29Z", value = "Meeting start date-time in UTC/GMT, such as `2020-03-31T12:02:00Z`.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public MeetingsCreateMeetingResponse startUrl(String startUrl) {
    
    
    
    
    this.startUrl = startUrl;
    return this;
  }

   /**
   * URL to start the meeting. This URL should only be used by the host of the meeting and **should not be shared with anyone other than the host** of the meeting, since anyone with this URL will be able to log in to the Zoom Client as the host of the meeting.
   * @return startUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/s/11111", value = "URL to start the meeting. This URL should only be used by the host of the meeting and **should not be shared with anyone other than the host** of the meeting, since anyone with this URL will be able to log in to the Zoom Client as the host of the meeting.")

  public String getStartUrl() {
    return startUrl;
  }


  public void setStartUrl(String startUrl) {
    
    
    
    this.startUrl = startUrl;
  }


  public MeetingsCreateMeetingResponse timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone to format &#x60;start_time&#x60;.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/Los_Angeles", value = "Timezone to format `start_time`.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public MeetingsCreateMeetingResponse topic(String topic) {
    
    
    
    
    this.topic = topic;
    return this;
  }

   /**
   * Meeting topic.
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Meeting", value = "Meeting topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    
    
    
    this.topic = topic;
  }


  public MeetingsCreateMeetingResponse trackingFields(List<MeetingsCreateMeetingResponseTrackingFieldsInner> trackingFields) {
    
    
    
    
    this.trackingFields = trackingFields;
    return this;
  }

  public MeetingsCreateMeetingResponse addTrackingFieldsItem(MeetingsCreateMeetingResponseTrackingFieldsInner trackingFieldsItem) {
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

  public List<MeetingsCreateMeetingResponseTrackingFieldsInner> getTrackingFields() {
    return trackingFields;
  }


  public void setTrackingFields(List<MeetingsCreateMeetingResponseTrackingFieldsInner> trackingFields) {
    
    
    
    this.trackingFields = trackingFields;
  }


  public MeetingsCreateMeetingResponse type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Meeting type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_2", value = "Meeting type.")

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
   * @return the MeetingsCreateMeetingResponse instance itself
   */
  public MeetingsCreateMeetingResponse putAdditionalProperty(String key, Object value) {
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
    MeetingsCreateMeetingResponse meetingsCreateMeetingResponse = (MeetingsCreateMeetingResponse) o;
    return Objects.equals(this.assistantId, meetingsCreateMeetingResponse.assistantId) &&
        Objects.equals(this.hostEmail, meetingsCreateMeetingResponse.hostEmail) &&
        Objects.equals(this.id, meetingsCreateMeetingResponse.id) &&
        Objects.equals(this.registrationUrl, meetingsCreateMeetingResponse.registrationUrl) &&
        Objects.equals(this.agenda, meetingsCreateMeetingResponse.agenda) &&
        Objects.equals(this.createdAt, meetingsCreateMeetingResponse.createdAt) &&
        Objects.equals(this.duration, meetingsCreateMeetingResponse.duration) &&
        Objects.equals(this.h323Password, meetingsCreateMeetingResponse.h323Password) &&
        Objects.equals(this.joinUrl, meetingsCreateMeetingResponse.joinUrl) &&
        Objects.equals(this.chatJoinUrl, meetingsCreateMeetingResponse.chatJoinUrl) &&
        Objects.equals(this.occurrences, meetingsCreateMeetingResponse.occurrences) &&
        Objects.equals(this.password, meetingsCreateMeetingResponse.password) &&
        Objects.equals(this.pmi, meetingsCreateMeetingResponse.pmi) &&
        Objects.equals(this.preSchedule, meetingsCreateMeetingResponse.preSchedule) &&
        Objects.equals(this.recurrence, meetingsCreateMeetingResponse.recurrence) &&
        Objects.equals(this.settings, meetingsCreateMeetingResponse.settings) &&
        Objects.equals(this.startTime, meetingsCreateMeetingResponse.startTime) &&
        Objects.equals(this.startUrl, meetingsCreateMeetingResponse.startUrl) &&
        Objects.equals(this.timezone, meetingsCreateMeetingResponse.timezone) &&
        Objects.equals(this.topic, meetingsCreateMeetingResponse.topic) &&
        Objects.equals(this.trackingFields, meetingsCreateMeetingResponse.trackingFields) &&
        Objects.equals(this.type, meetingsCreateMeetingResponse.type)&&
        Objects.equals(this.additionalProperties, meetingsCreateMeetingResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, hostEmail, id, registrationUrl, agenda, createdAt, duration, h323Password, joinUrl, chatJoinUrl, occurrences, password, pmi, preSchedule, recurrence, settings, startTime, startUrl, timezone, topic, trackingFields, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingsCreateMeetingResponse {\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    registrationUrl: ").append(toIndentedString(registrationUrl)).append("\n");
    sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    h323Password: ").append(toIndentedString(h323Password)).append("\n");
    sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
    sb.append("    chatJoinUrl: ").append(toIndentedString(chatJoinUrl)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pmi: ").append(toIndentedString(pmi)).append("\n");
    sb.append("    preSchedule: ").append(toIndentedString(preSchedule)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    trackingFields: ").append(toIndentedString(trackingFields)).append("\n");
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
    openapiFields.add("assistant_id");
    openapiFields.add("host_email");
    openapiFields.add("id");
    openapiFields.add("registration_url");
    openapiFields.add("agenda");
    openapiFields.add("created_at");
    openapiFields.add("duration");
    openapiFields.add("h323_password");
    openapiFields.add("join_url");
    openapiFields.add("chat_join_url");
    openapiFields.add("occurrences");
    openapiFields.add("password");
    openapiFields.add("pmi");
    openapiFields.add("pre_schedule");
    openapiFields.add("recurrence");
    openapiFields.add("settings");
    openapiFields.add("start_time");
    openapiFields.add("start_url");
    openapiFields.add("timezone");
    openapiFields.add("topic");
    openapiFields.add("tracking_fields");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeetingsCreateMeetingResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeetingsCreateMeetingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeetingsCreateMeetingResponse is not found in the empty JSON string", MeetingsCreateMeetingResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("assistant_id") != null && !jsonObj.get("assistant_id").isJsonNull()) && !jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      if ((jsonObj.get("host_email") != null && !jsonObj.get("host_email").isJsonNull()) && !jsonObj.get("host_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_email").toString()));
      }
      if ((jsonObj.get("registration_url") != null && !jsonObj.get("registration_url").isJsonNull()) && !jsonObj.get("registration_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_url").toString()));
      }
      if ((jsonObj.get("agenda") != null && !jsonObj.get("agenda").isJsonNull()) && !jsonObj.get("agenda").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agenda` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agenda").toString()));
      }
      if ((jsonObj.get("h323_password") != null && !jsonObj.get("h323_password").isJsonNull()) && !jsonObj.get("h323_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `h323_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("h323_password").toString()));
      }
      if ((jsonObj.get("join_url") != null && !jsonObj.get("join_url").isJsonNull()) && !jsonObj.get("join_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `join_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("join_url").toString()));
      }
      if ((jsonObj.get("chat_join_url") != null && !jsonObj.get("chat_join_url").isJsonNull()) && !jsonObj.get("chat_join_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_join_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat_join_url").toString()));
      }
      if (jsonObj.get("occurrences") != null && !jsonObj.get("occurrences").isJsonNull()) {
        JsonArray jsonArrayoccurrences = jsonObj.getAsJsonArray("occurrences");
        if (jsonArrayoccurrences != null) {
          // ensure the json data is an array
          if (!jsonObj.get("occurrences").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `occurrences` to be an array in the JSON string but got `%s`", jsonObj.get("occurrences").toString()));
          }

          // validate the optional field `occurrences` (array)
          for (int i = 0; i < jsonArrayoccurrences.size(); i++) {
            MeetingsCreateMeetingResponseOccurrencesInner.validateJsonObject(jsonArrayoccurrences.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("pmi") != null && !jsonObj.get("pmi").isJsonNull()) && !jsonObj.get("pmi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pmi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pmi").toString()));
      }
      // validate the optional field `recurrence`
      if (jsonObj.get("recurrence") != null && !jsonObj.get("recurrence").isJsonNull()) {
        MeetingsCreateMeetingResponseRecurrence.validateJsonObject(jsonObj.getAsJsonObject("recurrence"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        MeetingsCreateMeetingResponseSettings.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      if ((jsonObj.get("start_url") != null && !jsonObj.get("start_url").isJsonNull()) && !jsonObj.get("start_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_url").toString()));
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
            MeetingsCreateMeetingResponseTrackingFieldsInner.validateJsonObject(jsonArraytrackingFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeetingsCreateMeetingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeetingsCreateMeetingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeetingsCreateMeetingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeetingsCreateMeetingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MeetingsCreateMeetingResponse>() {
           @Override
           public void write(JsonWriter out, MeetingsCreateMeetingResponse value) throws IOException {
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
           public MeetingsCreateMeetingResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeetingsCreateMeetingResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeetingsCreateMeetingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeetingsCreateMeetingResponse
  * @throws IOException if the JSON string is invalid with respect to MeetingsCreateMeetingResponse
  */
  public static MeetingsCreateMeetingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeetingsCreateMeetingResponse.class);
  }

 /**
  * Convert an instance of MeetingsCreateMeetingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

