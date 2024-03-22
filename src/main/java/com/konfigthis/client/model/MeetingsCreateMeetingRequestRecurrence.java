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
 * Recurrence object. Use this object only for a meeting with type &#x60;8&#x60;, a recurring meeting with a fixed time. 
 */
@ApiModel(description = "Recurrence object. Use this object only for a meeting with type `8`, a recurring meeting with a fixed time. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MeetingsCreateMeetingRequestRecurrence {
  public static final String SERIALIZED_NAME_END_DATE_TIME = "end_date_time";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_END_TIMES = "end_times";
  @SerializedName(SERIALIZED_NAME_END_TIMES)
  private Integer endTimes = 1;

  public static final String SERIALIZED_NAME_MONTHLY_DAY = "monthly_day";
  @SerializedName(SERIALIZED_NAME_MONTHLY_DAY)
  private Integer monthlyDay = 1;

  /**
   * Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state the week of the month when the meeting should recur. If you use this field, you must also use the &#x60;monthly_week_day&#x60; field to state the day of the week when the meeting should recur.     &#x60;-1&#x60; - Last week of the month.    &#x60;1&#x60; - First week of the month.    &#x60;2&#x60; - Second week of the month.    &#x60;3&#x60; - Third week of the month.    &#x60;4&#x60; - Fourth week of the month.
   */
  @JsonAdapter(MonthlyWeekEnum.Adapter.class)
 public enum MonthlyWeekEnum {
    NUMBER_MINUS_1(-1),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    MonthlyWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonthlyWeekEnum fromValue(Integer value) {
      for (MonthlyWeekEnum b : MonthlyWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MonthlyWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonthlyWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonthlyWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return MonthlyWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MONTHLY_WEEK = "monthly_week";
  @SerializedName(SERIALIZED_NAME_MONTHLY_WEEK)
  private MonthlyWeekEnum monthlyWeek;

  /**
   * Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state a specific day in a week when the monthly meeting should recur. To use this field, you must also use the &#x60;monthly_week&#x60; field.       &#x60;1&#x60; - Sunday.    &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; - Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday.
   */
  @JsonAdapter(MonthlyWeekDayEnum.Adapter.class)
 public enum MonthlyWeekDayEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7);

    private Integer value;

    MonthlyWeekDayEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonthlyWeekDayEnum fromValue(Integer value) {
      for (MonthlyWeekDayEnum b : MonthlyWeekDayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MonthlyWeekDayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonthlyWeekDayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonthlyWeekDayEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return MonthlyWeekDayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MONTHLY_WEEK_DAY = "monthly_week_day";
  @SerializedName(SERIALIZED_NAME_MONTHLY_WEEK_DAY)
  private MonthlyWeekDayEnum monthlyWeekDay;

  public static final String SERIALIZED_NAME_REPEAT_INTERVAL = "repeat_interval";
  @SerializedName(SERIALIZED_NAME_REPEAT_INTERVAL)
  private Integer repeatInterval;

  /**
   * Recurrence meeting types.  &#x60;1&#x60; - Daily.    &#x60;2&#x60; - Weekly.    &#x60;3&#x60; - Monthly.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

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

  /**
   * This field is required if you&#39;re scheduling a recurring meeting of type &#x60;2&#x60; to state the days of the week when the meeting should repeat.       The value for this field could be a number between &#x60;1&#x60; to &#x60;7&#x60; in string format. For instance, if the meeting should recur on Sunday, provide &#x60;1&#x60; as this field&#39;s value.         **Note:** To set the meeting to occur on multiple days of a week, provide comma separated values for this field. For instance, if the meeting should recur on Sundays and Tuesdays, provide &#x60;1,3&#x60; as this field&#39;s value.       &#x60;1&#x60; - Sunday.     &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; -  Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday.
   */
  @JsonAdapter(WeeklyDaysEnum.Adapter.class)
 public enum WeeklyDaysEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7");

    private String value;

    WeeklyDaysEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeeklyDaysEnum fromValue(String value) {
      for (WeeklyDaysEnum b : WeeklyDaysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WeeklyDaysEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeeklyDaysEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeeklyDaysEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WeeklyDaysEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEEKLY_DAYS = "weekly_days";
  @SerializedName(SERIALIZED_NAME_WEEKLY_DAYS)
  private WeeklyDaysEnum weeklyDays = WeeklyDaysEnum._1;

  public MeetingsCreateMeetingRequestRecurrence() {
  }

  public MeetingsCreateMeetingRequestRecurrence endDateTime(OffsetDateTime endDateTime) {
    
    
    
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Select the final date when the meeting will recur before it is canceled. Should be in UTC time, such as 2017-11-25T12:00:00Z. Cannot be used with &#x60;end_times&#x60;.
   * @return endDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-02T15:59Z", value = "Select the final date when the meeting will recur before it is canceled. Should be in UTC time, such as 2017-11-25T12:00:00Z. Cannot be used with `end_times`.")

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    
    
    
    this.endDateTime = endDateTime;
  }


  public MeetingsCreateMeetingRequestRecurrence endTimes(Integer endTimes) {
    
    if (endTimes != null && endTimes > 60) {
      throw new IllegalArgumentException("Invalid value for endTimes. Must be less than or equal to 60.");
    }
    
    
    this.endTimes = endTimes;
    return this;
  }

   /**
   * Select how many times the meeting should recur before it is canceled. If &#x60;end_times&#x60; is set to 0, it means there is no end time. The maximum number of recurring is 60. Cannot be used with &#x60;end_date_time&#x60;.
   * maximum: 60
   * @return endTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "Select how many times the meeting should recur before it is canceled. If `end_times` is set to 0, it means there is no end time. The maximum number of recurring is 60. Cannot be used with `end_date_time`.")

  public Integer getEndTimes() {
    return endTimes;
  }


  public void setEndTimes(Integer endTimes) {
    
    if (endTimes != null && endTimes > 60) {
      throw new IllegalArgumentException("Invalid value for endTimes. Must be less than or equal to 60.");
    }
    
    this.endTimes = endTimes;
  }


  public MeetingsCreateMeetingRequestRecurrence monthlyDay(Integer monthlyDay) {
    
    
    
    
    this.monthlyDay = monthlyDay;
    return this;
  }

   /**
   * Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state the day in a month when the meeting should recur. The value range is from 1 to 31.  For the meeting to recur on 23rd of each month, provide &#x60;23&#x60; as this field&#39;s value and &#x60;1&#x60; as the &#x60;repeat_interval&#x60; field&#39;s value. Instead, if you would like the meeting to recur every three months, on 23rd of the month, change the value of the &#x60;repeat_interval&#x60; field to &#x60;3&#x60;.
   * @return monthlyDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state the day in a month when the meeting should recur. The value range is from 1 to 31.  For the meeting to recur on 23rd of each month, provide `23` as this field's value and `1` as the `repeat_interval` field's value. Instead, if you would like the meeting to recur every three months, on 23rd of the month, change the value of the `repeat_interval` field to `3`.")

  public Integer getMonthlyDay() {
    return monthlyDay;
  }


  public void setMonthlyDay(Integer monthlyDay) {
    
    
    
    this.monthlyDay = monthlyDay;
  }


  public MeetingsCreateMeetingRequestRecurrence monthlyWeek(MonthlyWeekEnum monthlyWeek) {
    
    
    
    
    this.monthlyWeek = monthlyWeek;
    return this;
  }

   /**
   * Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state the week of the month when the meeting should recur. If you use this field, you must also use the &#x60;monthly_week_day&#x60; field to state the day of the week when the meeting should recur.     &#x60;-1&#x60; - Last week of the month.    &#x60;1&#x60; - First week of the month.    &#x60;2&#x60; - Second week of the month.    &#x60;3&#x60; - Third week of the month.    &#x60;4&#x60; - Fourth week of the month.
   * @return monthlyWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", value = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state the week of the month when the meeting should recur. If you use this field, you must also use the `monthly_week_day` field to state the day of the week when the meeting should recur.     `-1` - Last week of the month.    `1` - First week of the month.    `2` - Second week of the month.    `3` - Third week of the month.    `4` - Fourth week of the month.")

  public MonthlyWeekEnum getMonthlyWeek() {
    return monthlyWeek;
  }


  public void setMonthlyWeek(MonthlyWeekEnum monthlyWeek) {
    
    
    
    this.monthlyWeek = monthlyWeek;
  }


  public MeetingsCreateMeetingRequestRecurrence monthlyWeekDay(MonthlyWeekDayEnum monthlyWeekDay) {
    
    
    
    
    this.monthlyWeekDay = monthlyWeekDay;
    return this;
  }

   /**
   * Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state a specific day in a week when the monthly meeting should recur. To use this field, you must also use the &#x60;monthly_week&#x60; field.       &#x60;1&#x60; - Sunday.    &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; - Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday.
   * @return monthlyWeekDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", value = "Use this field **only if you're scheduling a recurring meeting of type** `3` to state a specific day in a week when the monthly meeting should recur. To use this field, you must also use the `monthly_week` field.       `1` - Sunday.    `2` - Monday.    `3` - Tuesday.    `4` -  Wednesday.    `5` - Thursday.    `6` - Friday.    `7` - Saturday.")

  public MonthlyWeekDayEnum getMonthlyWeekDay() {
    return monthlyWeekDay;
  }


  public void setMonthlyWeekDay(MonthlyWeekDayEnum monthlyWeekDay) {
    
    
    
    this.monthlyWeekDay = monthlyWeekDay;
  }


  public MeetingsCreateMeetingRequestRecurrence repeatInterval(Integer repeatInterval) {
    
    
    
    
    this.repeatInterval = repeatInterval;
    return this;
  }

   /**
   * Define the interval when the meeting should recur. For instance, to schedule a meeting that recurs every two months, set this field&#39;s value as &#x60;2&#x60; and the value of the &#x60;type&#x60; parameter as &#x60;3&#x60;.   For a daily meeting, the maximum interval you can set is &#x60;90&#x60; days. For a weekly meeting the maximum interval that you can set is  of &#x60;12&#x60; weeks. For a monthly meeting, there is a maximum of &#x60;3&#x60; months.  
   * @return repeatInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Define the interval when the meeting should recur. For instance, to schedule a meeting that recurs every two months, set this field's value as `2` and the value of the `type` parameter as `3`.   For a daily meeting, the maximum interval you can set is `90` days. For a weekly meeting the maximum interval that you can set is  of `12` weeks. For a monthly meeting, there is a maximum of `3` months.  ")

  public Integer getRepeatInterval() {
    return repeatInterval;
  }


  public void setRepeatInterval(Integer repeatInterval) {
    
    
    
    this.repeatInterval = repeatInterval;
  }


  public MeetingsCreateMeetingRequestRecurrence type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Recurrence meeting types.  &#x60;1&#x60; - Daily.    &#x60;2&#x60; - Weekly.    &#x60;3&#x60; - Monthly.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_1", required = true, value = "Recurrence meeting types.  `1` - Daily.    `2` - Weekly.    `3` - Monthly.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public MeetingsCreateMeetingRequestRecurrence weeklyDays(WeeklyDaysEnum weeklyDays) {
    
    
    
    
    this.weeklyDays = weeklyDays;
    return this;
  }

   /**
   * This field is required if you&#39;re scheduling a recurring meeting of type &#x60;2&#x60; to state the days of the week when the meeting should repeat.       The value for this field could be a number between &#x60;1&#x60; to &#x60;7&#x60; in string format. For instance, if the meeting should recur on Sunday, provide &#x60;1&#x60; as this field&#39;s value.         **Note:** To set the meeting to occur on multiple days of a week, provide comma separated values for this field. For instance, if the meeting should recur on Sundays and Tuesdays, provide &#x60;1,3&#x60; as this field&#39;s value.       &#x60;1&#x60; - Sunday.     &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; -  Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday.
   * @return weeklyDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "_1", value = "This field is required if you're scheduling a recurring meeting of type `2` to state the days of the week when the meeting should repeat.       The value for this field could be a number between `1` to `7` in string format. For instance, if the meeting should recur on Sunday, provide `1` as this field's value.         **Note:** To set the meeting to occur on multiple days of a week, provide comma separated values for this field. For instance, if the meeting should recur on Sundays and Tuesdays, provide `1,3` as this field's value.       `1` - Sunday.     `2` - Monday.    `3` - Tuesday.    `4` -  Wednesday.    `5` -  Thursday.    `6` - Friday.    `7` - Saturday.")

  public WeeklyDaysEnum getWeeklyDays() {
    return weeklyDays;
  }


  public void setWeeklyDays(WeeklyDaysEnum weeklyDays) {
    
    
    
    this.weeklyDays = weeklyDays;
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
   * @return the MeetingsCreateMeetingRequestRecurrence instance itself
   */
  public MeetingsCreateMeetingRequestRecurrence putAdditionalProperty(String key, Object value) {
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
    MeetingsCreateMeetingRequestRecurrence meetingsCreateMeetingRequestRecurrence = (MeetingsCreateMeetingRequestRecurrence) o;
    return Objects.equals(this.endDateTime, meetingsCreateMeetingRequestRecurrence.endDateTime) &&
        Objects.equals(this.endTimes, meetingsCreateMeetingRequestRecurrence.endTimes) &&
        Objects.equals(this.monthlyDay, meetingsCreateMeetingRequestRecurrence.monthlyDay) &&
        Objects.equals(this.monthlyWeek, meetingsCreateMeetingRequestRecurrence.monthlyWeek) &&
        Objects.equals(this.monthlyWeekDay, meetingsCreateMeetingRequestRecurrence.monthlyWeekDay) &&
        Objects.equals(this.repeatInterval, meetingsCreateMeetingRequestRecurrence.repeatInterval) &&
        Objects.equals(this.type, meetingsCreateMeetingRequestRecurrence.type) &&
        Objects.equals(this.weeklyDays, meetingsCreateMeetingRequestRecurrence.weeklyDays)&&
        Objects.equals(this.additionalProperties, meetingsCreateMeetingRequestRecurrence.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, endTimes, monthlyDay, monthlyWeek, monthlyWeekDay, repeatInterval, type, weeklyDays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingsCreateMeetingRequestRecurrence {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    endTimes: ").append(toIndentedString(endTimes)).append("\n");
    sb.append("    monthlyDay: ").append(toIndentedString(monthlyDay)).append("\n");
    sb.append("    monthlyWeek: ").append(toIndentedString(monthlyWeek)).append("\n");
    sb.append("    monthlyWeekDay: ").append(toIndentedString(monthlyWeekDay)).append("\n");
    sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weeklyDays: ").append(toIndentedString(weeklyDays)).append("\n");
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
    openapiFields.add("end_date_time");
    openapiFields.add("end_times");
    openapiFields.add("monthly_day");
    openapiFields.add("monthly_week");
    openapiFields.add("monthly_week_day");
    openapiFields.add("repeat_interval");
    openapiFields.add("type");
    openapiFields.add("weekly_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeetingsCreateMeetingRequestRecurrence
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeetingsCreateMeetingRequestRecurrence.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeetingsCreateMeetingRequestRecurrence is not found in the empty JSON string", MeetingsCreateMeetingRequestRecurrence.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MeetingsCreateMeetingRequestRecurrence.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("weekly_days") != null && !jsonObj.get("weekly_days").isJsonNull()) && !jsonObj.get("weekly_days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weekly_days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weekly_days").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeetingsCreateMeetingRequestRecurrence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeetingsCreateMeetingRequestRecurrence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeetingsCreateMeetingRequestRecurrence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeetingsCreateMeetingRequestRecurrence.class));

       return (TypeAdapter<T>) new TypeAdapter<MeetingsCreateMeetingRequestRecurrence>() {
           @Override
           public void write(JsonWriter out, MeetingsCreateMeetingRequestRecurrence value) throws IOException {
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
           public MeetingsCreateMeetingRequestRecurrence read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeetingsCreateMeetingRequestRecurrence instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeetingsCreateMeetingRequestRecurrence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeetingsCreateMeetingRequestRecurrence
  * @throws IOException if the JSON string is invalid with respect to MeetingsCreateMeetingRequestRecurrence
  */
  public static MeetingsCreateMeetingRequestRecurrence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeetingsCreateMeetingRequestRecurrence.class);
  }

 /**
  * Convert an instance of MeetingsCreateMeetingRequestRecurrence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

