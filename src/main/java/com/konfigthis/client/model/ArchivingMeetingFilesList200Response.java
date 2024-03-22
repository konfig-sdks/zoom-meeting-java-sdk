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
import com.konfigthis.client.model.ArchivingMeetingFilesList200ResponseArchiveFilesInner;
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
 * ArchivingMeetingFilesList200Response
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ArchivingMeetingFilesList200Response {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ARCHIVE_FILES = "archive_files";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_FILES)
  private List<ArchivingMeetingFilesList200ResponseArchiveFilesInner> archiveFiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPLETE_TIME = "complete_time";
  @SerializedName(SERIALIZED_NAME_COMPLETE_TIME)
  private Object completeTime = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_DURATION_IN_SECOND = "duration_in_second";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_SECOND)
  private Integer durationInSecond;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IS_BREAKOUT_ROOM = "is_breakout_room";
  @SerializedName(SERIALIZED_NAME_IS_BREAKOUT_ROOM)
  private Boolean isBreakoutRoom;

  /**
   * Whether the meeting or webinar is internal or external.  * &#x60;internal&#x60; - An internal meeting or webinar.  * &#x60;external&#x60; - An external meeting or webinar.    The &#x60;id&#x60;, &#x60;host_id&#x60;, and &#x60;topic&#x60; PII (Personal Identifiable Information) values in this response are removed when this value is &#x60;external&#x60;.
   */
  @JsonAdapter(MeetingTypeEnum.Adapter.class)
 public enum MeetingTypeEnum {
    INTERNAL("internal"),
    
    EXTERNAL("external");

    private String value;

    MeetingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MeetingTypeEnum fromValue(String value) {
      for (MeetingTypeEnum b : MeetingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MeetingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeetingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MeetingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MeetingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MEETING_TYPE = "meeting_type";
  @SerializedName(SERIALIZED_NAME_MEETING_TYPE)
  private MeetingTypeEnum meetingType;

  public static final String SERIALIZED_NAME_PARENT_MEETING_ID = "parent_meeting_id";
  @SerializedName(SERIALIZED_NAME_PARENT_MEETING_ID)
  private String parentMeetingId;

  public static final String SERIALIZED_NAME_RECORDING_COUNT = "recording_count";
  @SerializedName(SERIALIZED_NAME_RECORDING_COUNT)
  private Integer recordingCount;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Integer totalSize;

  /**
   * The type of archived meeting or webinar.    If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created via PMI (Personal Meeting ID).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.    If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time.  * &#x60;9&#x60; - A recurring webinar with a fixed time.    If the recording is **not** from a meeting or webinar:   * &#x60;100&#x60; - A [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8),
    
    NUMBER_9(9),
    
    NUMBER_100(100);

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

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  /**
   * The archive&#39;s processing status.  * &#x60;completed&#x60; - The archive&#39;s processing is complete.  * &#x60;processing&#x60; - The archive is processing.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    COMPLETED("completed"),
    
    PROCESSING("processing");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public ArchivingMeetingFilesList200Response() {
  }

  public ArchivingMeetingFilesList200Response accountName(String accountName) {
    
    
    
    
    this.accountName = accountName;
    return this;
  }

   /**
   * The user&#39;s account name.
   * @return accountName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "account_01", required = true, value = "The user's account name.")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    
    
    
    this.accountName = accountName;
  }


  public ArchivingMeetingFilesList200Response archiveFiles(List<ArchivingMeetingFilesList200ResponseArchiveFilesInner> archiveFiles) {
    
    
    
    
    this.archiveFiles = archiveFiles;
    return this;
  }

  public ArchivingMeetingFilesList200Response addArchiveFilesItem(ArchivingMeetingFilesList200ResponseArchiveFilesInner archiveFilesItem) {
    this.archiveFiles.add(archiveFilesItem);
    return this;
  }

   /**
   * Information about the archive files.
   * @return archiveFiles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Information about the archive files.")

  public List<ArchivingMeetingFilesList200ResponseArchiveFilesInner> getArchiveFiles() {
    return archiveFiles;
  }


  public void setArchiveFiles(List<ArchivingMeetingFilesList200ResponseArchiveFilesInner> archiveFiles) {
    
    
    
    this.archiveFiles = archiveFiles;
  }


  public ArchivingMeetingFilesList200Response completeTime(Object completeTime) {
    
    
    
    
    this.completeTime = completeTime;
    return this;
  }

   /**
   * Get completeTime
   * @return completeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getCompleteTime() {
    return completeTime;
  }


  public void setCompleteTime(Object completeTime) {
    
    
    
    this.completeTime = completeTime;
  }


  public ArchivingMeetingFilesList200Response duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * The meeting or webinar&#39;s scheduled duration.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The meeting or webinar's scheduled duration.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public ArchivingMeetingFilesList200Response durationInSecond(Integer durationInSecond) {
    
    
    
    
    this.durationInSecond = durationInSecond;
    return this;
  }

   /**
   * The meeting or webinar&#39;s duration, in seconds.
   * @return durationInSecond
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1800", required = true, value = "The meeting or webinar's duration, in seconds.")

  public Integer getDurationInSecond() {
    return durationInSecond;
  }


  public void setDurationInSecond(Integer durationInSecond) {
    
    
    
    this.durationInSecond = durationInSecond;
  }


  public ArchivingMeetingFilesList200Response hostId(String hostId) {
    
    
    
    
    this.hostId = hostId;
    return this;
  }

   /**
   * The host&#39;s user ID for the archived meeting or webinar.
   * @return hostId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dhjdfgdkg8w", required = true, value = "The host's user ID for the archived meeting or webinar.")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    
    
    
    this.hostId = hostId;
  }


  public ArchivingMeetingFilesList200Response id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The meeting or webinar ID, either &#x60;meetingId&#x60; or &#x60;webinarId&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "553068284", required = true, value = "The meeting or webinar ID, either `meetingId` or `webinarId`.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public ArchivingMeetingFilesList200Response isBreakoutRoom(Boolean isBreakoutRoom) {
    
    
    
    
    this.isBreakoutRoom = isBreakoutRoom;
    return this;
  }

   /**
   * Whether the room is a [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms).
   * @return isBreakoutRoom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether the room is a [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms).")

  public Boolean getIsBreakoutRoom() {
    return isBreakoutRoom;
  }


  public void setIsBreakoutRoom(Boolean isBreakoutRoom) {
    
    
    
    this.isBreakoutRoom = isBreakoutRoom;
  }


  public ArchivingMeetingFilesList200Response meetingType(MeetingTypeEnum meetingType) {
    
    
    
    
    this.meetingType = meetingType;
    return this;
  }

   /**
   * Whether the meeting or webinar is internal or external.  * &#x60;internal&#x60; - An internal meeting or webinar.  * &#x60;external&#x60; - An external meeting or webinar.    The &#x60;id&#x60;, &#x60;host_id&#x60;, and &#x60;topic&#x60; PII (Personal Identifiable Information) values in this response are removed when this value is &#x60;external&#x60;.
   * @return meetingType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INTERNAL", required = true, value = "Whether the meeting or webinar is internal or external.  * `internal` - An internal meeting or webinar.  * `external` - An external meeting or webinar.    The `id`, `host_id`, and `topic` PII (Personal Identifiable Information) values in this response are removed when this value is `external`.")

  public MeetingTypeEnum getMeetingType() {
    return meetingType;
  }


  public void setMeetingType(MeetingTypeEnum meetingType) {
    
    
    
    this.meetingType = meetingType;
  }


  public ArchivingMeetingFilesList200Response parentMeetingId(String parentMeetingId) {
    
    
    
    
    this.parentMeetingId = parentMeetingId;
    return this;
  }

   /**
   * The parent meeting&#39;s universally unique ID (UUID). Each meeting or webinar instance generates a UUID. If the &#x60;is_breakout_room&#x60; value is &#x60;true&#x60;, the API returns this value.
   * @return parentMeetingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "atsXxhSEQWit9t+U02HXNQ==", value = "The parent meeting's universally unique ID (UUID). Each meeting or webinar instance generates a UUID. If the `is_breakout_room` value is `true`, the API returns this value.")

  public String getParentMeetingId() {
    return parentMeetingId;
  }


  public void setParentMeetingId(String parentMeetingId) {
    
    
    
    this.parentMeetingId = parentMeetingId;
  }


  public ArchivingMeetingFilesList200Response recordingCount(Integer recordingCount) {
    
    
    
    
    this.recordingCount = recordingCount;
    return this;
  }

   /**
   * The number of archived files returned in the API call response.
   * @return recordingCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The number of archived files returned in the API call response.")

  public Integer getRecordingCount() {
    return recordingCount;
  }


  public void setRecordingCount(Integer recordingCount) {
    
    
    
    this.recordingCount = recordingCount;
  }


  public ArchivingMeetingFilesList200Response startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The meeting or webinar&#39;s start time.
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-04-26T05:23:18Z", required = true, value = "The meeting or webinar's start time.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public ArchivingMeetingFilesList200Response timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The meeting or webinar&#39;s [timezone](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).
   * @return timezone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Asia/Shanghai", required = true, value = "The meeting or webinar's [timezone](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones).")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public ArchivingMeetingFilesList200Response topic(String topic) {
    
    
    
    
    this.topic = topic;
    return this;
  }

   /**
   * The meeting or webinar topic.
   * @return topic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Personal Meeting Room", required = true, value = "The meeting or webinar topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    
    
    
    this.topic = topic;
  }


  public ArchivingMeetingFilesList200Response totalSize(Integer totalSize) {
    
    
    
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * The total size of the archive file, in bytes.
   * @return totalSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "364463", required = true, value = "The total size of the archive file, in bytes.")

  public Integer getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Integer totalSize) {
    
    
    
    this.totalSize = totalSize;
  }


  public ArchivingMeetingFilesList200Response type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of archived meeting or webinar.    If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created via PMI (Personal Meeting ID).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.    If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time.  * &#x60;9&#x60; - A recurring webinar with a fixed time.    If the recording is **not** from a meeting or webinar:   * &#x60;100&#x60; - A [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms).
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_1", required = true, value = "The type of archived meeting or webinar.    If the recording is of a meeting:  * `1` - Instant meeting.  * `2` - Scheduled meeting.  * `3` - A recurring meeting with no fixed time.  * `4` - A meeting created via PMI (Personal Meeting ID).  * `7` - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * `8` - Recurring meeting with a fixed time.    If the recording is of a webinar:  * `5` - A webinar.  * `6` - A recurring webinar without a fixed time.  * `9` - A recurring webinar with a fixed time.    If the recording is **not** from a meeting or webinar:   * `100` - A [breakout room](https://support.zoom.us/hc/en-us/articles/115005769646-Participating-in-breakout-rooms).")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ArchivingMeetingFilesList200Response uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The universally unique identifier (UUID) of the recorded meeting or webinar instance. Each meeting or webinar instance generates a UUID.
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "yO3dfhh3t467UkQ==", required = true, value = "The universally unique identifier (UUID) of the recorded meeting or webinar instance. Each meeting or webinar instance generates a UUID.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public ArchivingMeetingFilesList200Response status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The archive&#39;s processing status.  * &#x60;completed&#x60; - The archive&#39;s processing is complete.  * &#x60;processing&#x60; - The archive is processing.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMPLETED", required = true, value = "The archive's processing status.  * `completed` - The archive's processing is complete.  * `processing` - The archive is processing.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ArchivingMeetingFilesList200Response groupId(String groupId) {
    
    
    
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Primary group IDs of participants who belong to your account. Each group ID is separated by a comma.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pvFIYKSDTum9iCDOOtQL4w,_FsqLyI0RlO6LVPeUVWi8g", value = "Primary group IDs of participants who belong to your account. Each group ID is separated by a comma.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    
    
    
    this.groupId = groupId;
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
   * @return the ArchivingMeetingFilesList200Response instance itself
   */
  public ArchivingMeetingFilesList200Response putAdditionalProperty(String key, Object value) {
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
    ArchivingMeetingFilesList200Response archivingMeetingFilesList200Response = (ArchivingMeetingFilesList200Response) o;
    return Objects.equals(this.accountName, archivingMeetingFilesList200Response.accountName) &&
        Objects.equals(this.archiveFiles, archivingMeetingFilesList200Response.archiveFiles) &&
        Objects.equals(this.completeTime, archivingMeetingFilesList200Response.completeTime) &&
        Objects.equals(this.duration, archivingMeetingFilesList200Response.duration) &&
        Objects.equals(this.durationInSecond, archivingMeetingFilesList200Response.durationInSecond) &&
        Objects.equals(this.hostId, archivingMeetingFilesList200Response.hostId) &&
        Objects.equals(this.id, archivingMeetingFilesList200Response.id) &&
        Objects.equals(this.isBreakoutRoom, archivingMeetingFilesList200Response.isBreakoutRoom) &&
        Objects.equals(this.meetingType, archivingMeetingFilesList200Response.meetingType) &&
        Objects.equals(this.parentMeetingId, archivingMeetingFilesList200Response.parentMeetingId) &&
        Objects.equals(this.recordingCount, archivingMeetingFilesList200Response.recordingCount) &&
        Objects.equals(this.startTime, archivingMeetingFilesList200Response.startTime) &&
        Objects.equals(this.timezone, archivingMeetingFilesList200Response.timezone) &&
        Objects.equals(this.topic, archivingMeetingFilesList200Response.topic) &&
        Objects.equals(this.totalSize, archivingMeetingFilesList200Response.totalSize) &&
        Objects.equals(this.type, archivingMeetingFilesList200Response.type) &&
        Objects.equals(this.uuid, archivingMeetingFilesList200Response.uuid) &&
        Objects.equals(this.status, archivingMeetingFilesList200Response.status) &&
        Objects.equals(this.groupId, archivingMeetingFilesList200Response.groupId)&&
        Objects.equals(this.additionalProperties, archivingMeetingFilesList200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, archiveFiles, completeTime, duration, durationInSecond, hostId, id, isBreakoutRoom, meetingType, parentMeetingId, recordingCount, startTime, timezone, topic, totalSize, type, uuid, status, groupId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchivingMeetingFilesList200Response {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    archiveFiles: ").append(toIndentedString(archiveFiles)).append("\n");
    sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationInSecond: ").append(toIndentedString(durationInSecond)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBreakoutRoom: ").append(toIndentedString(isBreakoutRoom)).append("\n");
    sb.append("    meetingType: ").append(toIndentedString(meetingType)).append("\n");
    sb.append("    parentMeetingId: ").append(toIndentedString(parentMeetingId)).append("\n");
    sb.append("    recordingCount: ").append(toIndentedString(recordingCount)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("archive_files");
    openapiFields.add("complete_time");
    openapiFields.add("duration");
    openapiFields.add("duration_in_second");
    openapiFields.add("host_id");
    openapiFields.add("id");
    openapiFields.add("is_breakout_room");
    openapiFields.add("meeting_type");
    openapiFields.add("parent_meeting_id");
    openapiFields.add("recording_count");
    openapiFields.add("start_time");
    openapiFields.add("timezone");
    openapiFields.add("topic");
    openapiFields.add("total_size");
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("status");
    openapiFields.add("group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_name");
    openapiRequiredFields.add("archive_files");
    openapiRequiredFields.add("complete_time");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("duration_in_second");
    openapiRequiredFields.add("host_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_breakout_room");
    openapiRequiredFields.add("meeting_type");
    openapiRequiredFields.add("recording_count");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("timezone");
    openapiRequiredFields.add("topic");
    openapiRequiredFields.add("total_size");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArchivingMeetingFilesList200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ArchivingMeetingFilesList200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArchivingMeetingFilesList200Response is not found in the empty JSON string", ArchivingMeetingFilesList200Response.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ArchivingMeetingFilesList200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("archive_files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `archive_files` to be an array in the JSON string but got `%s`", jsonObj.get("archive_files").toString()));
      }

      JsonArray jsonArrayarchiveFiles = jsonObj.getAsJsonArray("archive_files");
      // validate the required field `archive_files` (array)
      for (int i = 0; i < jsonArrayarchiveFiles.size(); i++) {
        ArchivingMeetingFilesList200ResponseArchiveFilesInner.validateJsonObject(jsonArrayarchiveFiles.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("host_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_id").toString()));
      }
      if (!jsonObj.get("meeting_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meeting_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meeting_type").toString()));
      }
      if ((jsonObj.get("parent_meeting_id") != null && !jsonObj.get("parent_meeting_id").isJsonNull()) && !jsonObj.get("parent_meeting_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_meeting_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_meeting_id").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if (!jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonNull()) && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArchivingMeetingFilesList200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArchivingMeetingFilesList200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArchivingMeetingFilesList200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArchivingMeetingFilesList200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ArchivingMeetingFilesList200Response>() {
           @Override
           public void write(JsonWriter out, ArchivingMeetingFilesList200Response value) throws IOException {
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
           public ArchivingMeetingFilesList200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArchivingMeetingFilesList200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArchivingMeetingFilesList200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArchivingMeetingFilesList200Response
  * @throws IOException if the JSON string is invalid with respect to ArchivingMeetingFilesList200Response
  */
  public static ArchivingMeetingFilesList200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArchivingMeetingFilesList200Response.class);
  }

 /**
  * Convert an instance of ArchivingMeetingFilesList200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

