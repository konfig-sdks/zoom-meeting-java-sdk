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
import com.konfigthis.client.model.CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner;
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
 * The recording meeting object.
 */
@ApiModel(description = "The recording meeting object.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CloudRecordingListRecordingsResponseMeetingsInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_RECORDING_COUNT = "recording_count";
  @SerializedName(SERIALIZED_NAME_RECORDING_COUNT)
  private Integer recordingCount;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private Long totalSize;

  /**
   * The recording&#39;s associated type of meeting or webinar:   If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created viaPersonal Meeting ID (PMI).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.   If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time  * &#x60;9&#x60; - A recurring webinar with a fixed time.  If the recording is **not** from a meeting or webinar:   * &#x60;99&#x60; - A recording uploaded via the [**Recordings**](https://zoom.us/recording) interface on the Zoom Web Portal.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    _99("99");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
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
        String value =  jsonReader.nextString();
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

  public static final String SERIALIZED_NAME_RECORDING_PLAY_PASSCODE = "recording_play_passcode";
  @SerializedName(SERIALIZED_NAME_RECORDING_PLAY_PASSCODE)
  private String recordingPlayPasscode;

  public static final String SERIALIZED_NAME_RECORDING_FILES = "recording_files";
  @SerializedName(SERIALIZED_NAME_RECORDING_FILES)
  private List<CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner> recordingFiles = null;

  public CloudRecordingListRecordingsResponseMeetingsInner() {
  }

  public CloudRecordingListRecordingsResponseMeetingsInner accountId(String accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Unique Identifier of the user account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cx3wERazSgup7ZWRHQM8-w", value = "Unique Identifier of the user account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    
    this.accountId = accountId;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Meeting duration.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "Meeting duration.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner hostId(String hostId) {
    
    
    
    
    this.hostId = hostId;
    return this;
  }

   /**
   * ID of the user set as host of meeting.
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_0ctZtY0REqWalTmwvrdIw", value = "ID of the user set as host of meeting.")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    
    
    
    this.hostId = hostId;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Meeting ID - also known as the meeting number.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6840331990", value = "Meeting ID - also known as the meeting number.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner recordingCount(Integer recordingCount) {
    
    
    
    
    this.recordingCount = recordingCount;
    return this;
  }

   /**
   * Number of recording files returned in the response of this API call. This includes the &#x60;recording_files&#x60; and  &#x60;participant_audio_files&#x60; files.
   * @return recordingCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "Number of recording files returned in the response of this API call. This includes the `recording_files` and  `participant_audio_files` files.")

  public Integer getRecordingCount() {
    return recordingCount;
  }


  public void setRecordingCount(Integer recordingCount) {
    
    
    
    this.recordingCount = recordingCount;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The time when the meeting started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-18T05:41:36Z", value = "The time when the meeting started.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner topic(String topic) {
    
    
    
    
    this.topic = topic;
    return this;
  }

   /**
   * Meeting topic.
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Personal Meeting", value = "Meeting topic.")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    
    
    
    this.topic = topic;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner totalSize(Long totalSize) {
    
    
    
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * The total file size of the recording. This includes the &#x60;recording_files&#x60; and &#x60;participant_audio_files&#x60; files.
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22", value = "The total file size of the recording. This includes the `recording_files` and `participant_audio_files` files.")

  public Long getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(Long totalSize) {
    
    
    
    this.totalSize = totalSize;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The recording&#39;s associated type of meeting or webinar:   If the recording is of a meeting:  * &#x60;1&#x60; - Instant meeting.  * &#x60;2&#x60; - Scheduled meeting.  * &#x60;3&#x60; - A recurring meeting with no fixed time.  * &#x60;4&#x60; - A meeting created viaPersonal Meeting ID (PMI).  * &#x60;7&#x60; - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * &#x60;8&#x60; - Recurring meeting with a fixed time.   If the recording is of a webinar:  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time  * &#x60;9&#x60; - A recurring webinar with a fixed time.  If the recording is **not** from a meeting or webinar:   * &#x60;99&#x60; - A recording uploaded via the [**Recordings**](https://zoom.us/recording) interface on the Zoom Web Portal.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", value = "The recording's associated type of meeting or webinar:   If the recording is of a meeting:  * `1` - Instant meeting.  * `2` - Scheduled meeting.  * `3` - A recurring meeting with no fixed time.  * `4` - A meeting created viaPersonal Meeting ID (PMI).  * `7` - A [Personal Audio Conference](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) (PAC).  * `8` - Recurring meeting with a fixed time.   If the recording is of a webinar:  * `5` - A webinar.  * `6` - A recurring webinar without a fixed time  * `9` - A recurring webinar with a fixed time.  If the recording is **not** from a meeting or webinar:   * `99` - A recording uploaded via the [**Recordings**](https://zoom.us/recording) interface on the Zoom Web Portal.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique Meeting Identifier. Each instance of the meeting will have its own UUID.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOKXuumlTAGXuqwr3bLyuQ==", value = "Unique Meeting Identifier. Each instance of the meeting will have its own UUID.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner recordingPlayPasscode(String recordingPlayPasscode) {
    
    
    
    
    this.recordingPlayPasscode = recordingPlayPasscode;
    return this;
  }

   /**
   * The cloud recording&#39;s passcode to be used in the URL. This recording&#39;s passcode can be directly spliced in &#x60;play_url&#x60; or &#x60;share_url&#x60; with &#x60;?pwd&#x3D;&#x60; to access and play. For example, &#39;https://zoom.us/rec/share/_**************?pwd&#x3D;yNYIS408EJygs7rE5vVsJwXIz4-VW7MH&#39;. If you want to use this field, please contact Zoom support.
   * @return recordingPlayPasscode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yNYIS408EJygs7rE5vVsJwXIz4-VW7MH", value = "The cloud recording's passcode to be used in the URL. This recording's passcode can be directly spliced in `play_url` or `share_url` with `?pwd=` to access and play. For example, 'https://zoom.us/rec/share/_**************?pwd=yNYIS408EJygs7rE5vVsJwXIz4-VW7MH'. If you want to use this field, please contact Zoom support.")

  public String getRecordingPlayPasscode() {
    return recordingPlayPasscode;
  }


  public void setRecordingPlayPasscode(String recordingPlayPasscode) {
    
    
    
    this.recordingPlayPasscode = recordingPlayPasscode;
  }


  public CloudRecordingListRecordingsResponseMeetingsInner recordingFiles(List<CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner> recordingFiles) {
    
    
    
    
    this.recordingFiles = recordingFiles;
    return this;
  }

  public CloudRecordingListRecordingsResponseMeetingsInner addRecordingFilesItem(CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner recordingFilesItem) {
    if (this.recordingFiles == null) {
      this.recordingFiles = new ArrayList<>();
    }
    this.recordingFiles.add(recordingFilesItem);
    return this;
  }

   /**
   * List of recording file.
   * @return recordingFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of recording file.")

  public List<CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner> getRecordingFiles() {
    return recordingFiles;
  }


  public void setRecordingFiles(List<CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner> recordingFiles) {
    
    
    
    this.recordingFiles = recordingFiles;
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
   * @return the CloudRecordingListRecordingsResponseMeetingsInner instance itself
   */
  public CloudRecordingListRecordingsResponseMeetingsInner putAdditionalProperty(String key, Object value) {
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
    CloudRecordingListRecordingsResponseMeetingsInner cloudRecordingListRecordingsResponseMeetingsInner = (CloudRecordingListRecordingsResponseMeetingsInner) o;
    return Objects.equals(this.accountId, cloudRecordingListRecordingsResponseMeetingsInner.accountId) &&
        Objects.equals(this.duration, cloudRecordingListRecordingsResponseMeetingsInner.duration) &&
        Objects.equals(this.hostId, cloudRecordingListRecordingsResponseMeetingsInner.hostId) &&
        Objects.equals(this.id, cloudRecordingListRecordingsResponseMeetingsInner.id) &&
        Objects.equals(this.recordingCount, cloudRecordingListRecordingsResponseMeetingsInner.recordingCount) &&
        Objects.equals(this.startTime, cloudRecordingListRecordingsResponseMeetingsInner.startTime) &&
        Objects.equals(this.topic, cloudRecordingListRecordingsResponseMeetingsInner.topic) &&
        Objects.equals(this.totalSize, cloudRecordingListRecordingsResponseMeetingsInner.totalSize) &&
        Objects.equals(this.type, cloudRecordingListRecordingsResponseMeetingsInner.type) &&
        Objects.equals(this.uuid, cloudRecordingListRecordingsResponseMeetingsInner.uuid) &&
        Objects.equals(this.recordingPlayPasscode, cloudRecordingListRecordingsResponseMeetingsInner.recordingPlayPasscode) &&
        Objects.equals(this.recordingFiles, cloudRecordingListRecordingsResponseMeetingsInner.recordingFiles)&&
        Objects.equals(this.additionalProperties, cloudRecordingListRecordingsResponseMeetingsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, duration, hostId, id, recordingCount, startTime, topic, totalSize, type, uuid, recordingPlayPasscode, recordingFiles, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRecordingListRecordingsResponseMeetingsInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordingCount: ").append(toIndentedString(recordingCount)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    recordingPlayPasscode: ").append(toIndentedString(recordingPlayPasscode)).append("\n");
    sb.append("    recordingFiles: ").append(toIndentedString(recordingFiles)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("duration");
    openapiFields.add("host_id");
    openapiFields.add("id");
    openapiFields.add("recording_count");
    openapiFields.add("start_time");
    openapiFields.add("topic");
    openapiFields.add("total_size");
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("recording_play_passcode");
    openapiFields.add("recording_files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudRecordingListRecordingsResponseMeetingsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CloudRecordingListRecordingsResponseMeetingsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRecordingListRecordingsResponseMeetingsInner is not found in the empty JSON string", CloudRecordingListRecordingsResponseMeetingsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("host_id") != null && !jsonObj.get("host_id").isJsonNull()) && !jsonObj.get("host_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_id").toString()));
      }
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("recording_play_passcode") != null && !jsonObj.get("recording_play_passcode").isJsonNull()) && !jsonObj.get("recording_play_passcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recording_play_passcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recording_play_passcode").toString()));
      }
      if (jsonObj.get("recording_files") != null && !jsonObj.get("recording_files").isJsonNull()) {
        JsonArray jsonArrayrecordingFiles = jsonObj.getAsJsonArray("recording_files");
        if (jsonArrayrecordingFiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recording_files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recording_files` to be an array in the JSON string but got `%s`", jsonObj.get("recording_files").toString()));
          }

          // validate the optional field `recording_files` (array)
          for (int i = 0; i < jsonArrayrecordingFiles.size(); i++) {
            CloudRecordingListRecordingsResponseMeetingsInnerRecordingFilesInner.validateJsonObject(jsonArrayrecordingFiles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRecordingListRecordingsResponseMeetingsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRecordingListRecordingsResponseMeetingsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRecordingListRecordingsResponseMeetingsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRecordingListRecordingsResponseMeetingsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRecordingListRecordingsResponseMeetingsInner>() {
           @Override
           public void write(JsonWriter out, CloudRecordingListRecordingsResponseMeetingsInner value) throws IOException {
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
           public CloudRecordingListRecordingsResponseMeetingsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudRecordingListRecordingsResponseMeetingsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CloudRecordingListRecordingsResponseMeetingsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudRecordingListRecordingsResponseMeetingsInner
  * @throws IOException if the JSON string is invalid with respect to CloudRecordingListRecordingsResponseMeetingsInner
  */
  public static CloudRecordingListRecordingsResponseMeetingsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRecordingListRecordingsResponseMeetingsInner.class);
  }

 /**
  * Convert an instance of CloudRecordingListRecordingsResponseMeetingsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

