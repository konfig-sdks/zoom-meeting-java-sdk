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
import com.konfigthis.client.model.WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner;
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
 * WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The survey&#39;s question and answer type.  * &#x60;single&#x60; - Single choice.  * &#x60;multiple&#x60; - Multiple choice.  * &#x60;matching&#x60; - Matching.  * &#x60;rank_order&#x60; - Rank order  * &#x60;short_answer&#x60; - Short answer  * &#x60;long_answer&#x60; - Long answer.  * &#x60;fill_in_the_blank&#x60; - Fill in the blank  * &#x60;rating_scale&#x60; - Rating scale.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SINGLE("single"),
    
    MULTIPLE("multiple"),
    
    MATCHING("matching"),
    
    RANK_ORDER("rank_order"),
    
    SHORT_ANSWER("short_answer"),
    
    LONG_ANSWER("long_answer"),
    
    FILL_IN_THE_BLANK("fill_in_the_blank"),
    
    RATING_SCALE("rating_scale");

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

  public static final String SERIALIZED_NAME_ANSWER_REQUIRED = "answer_required";
  @SerializedName(SERIALIZED_NAME_ANSWER_REQUIRED)
  private Boolean answerRequired = false;

  public static final String SERIALIZED_NAME_SHOW_AS_DROPDOWN = "show_as_dropdown";
  @SerializedName(SERIALIZED_NAME_SHOW_AS_DROPDOWN)
  private Boolean showAsDropdown = false;

  public static final String SERIALIZED_NAME_ANSWERS = "answers";
  @SerializedName(SERIALIZED_NAME_ANSWERS)
  private List<String> answers = null;

  public static final String SERIALIZED_NAME_PROMPTS = "prompts";
  @SerializedName(SERIALIZED_NAME_PROMPTS)
  private List<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner> prompts = null;

  public static final String SERIALIZED_NAME_ANSWER_MIN_CHARACTER = "answer_min_character";
  @SerializedName(SERIALIZED_NAME_ANSWER_MIN_CHARACTER)
  private Integer answerMinCharacter;

  public static final String SERIALIZED_NAME_ANSWER_MAX_CHARACTER = "answer_max_character";
  @SerializedName(SERIALIZED_NAME_ANSWER_MAX_CHARACTER)
  private Integer answerMaxCharacter;

  public static final String SERIALIZED_NAME_RATING_MIN_VALUE = "rating_min_value";
  @SerializedName(SERIALIZED_NAME_RATING_MIN_VALUE)
  private Integer ratingMinValue;

  public static final String SERIALIZED_NAME_RATING_MAX_VALUE = "rating_max_value";
  @SerializedName(SERIALIZED_NAME_RATING_MAX_VALUE)
  private Integer ratingMaxValue;

  public static final String SERIALIZED_NAME_RATING_MIN_LABEL = "rating_min_label";
  @SerializedName(SERIALIZED_NAME_RATING_MIN_LABEL)
  private String ratingMinLabel;

  public static final String SERIALIZED_NAME_RATING_MAX_LABEL = "rating_max_label";
  @SerializedName(SERIALIZED_NAME_RATING_MAX_LABEL)
  private String ratingMaxLabel;

  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner() {
  }

  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The survey question, up to 420 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "How useful was this webinar?", value = "The survey question, up to 420 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The survey&#39;s question and answer type.  * &#x60;single&#x60; - Single choice.  * &#x60;multiple&#x60; - Multiple choice.  * &#x60;matching&#x60; - Matching.  * &#x60;rank_order&#x60; - Rank order  * &#x60;short_answer&#x60; - Short answer  * &#x60;long_answer&#x60; - Long answer.  * &#x60;fill_in_the_blank&#x60; - Fill in the blank  * &#x60;rating_scale&#x60; - Rating scale.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SINGLE", value = "The survey's question and answer type.  * `single` - Single choice.  * `multiple` - Multiple choice.  * `matching` - Matching.  * `rank_order` - Rank order  * `short_answer` - Short answer  * `long_answer` - Long answer.  * `fill_in_the_blank` - Fill in the blank  * `rating_scale` - Rating scale.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner answerRequired(Boolean answerRequired) {
    
    
    
    
    this.answerRequired = answerRequired;
    return this;
  }

   /**
   * Whether participants must answer the question.  * &#x60;true&#x60; - The participant must answer the question.  * &#x60;false&#x60; - The participant does not need to answer the question.    This value defaults to &#x60;false&#x60;.
   * @return answerRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether participants must answer the question.  * `true` - The participant must answer the question.  * `false` - The participant does not need to answer the question.    This value defaults to `false`.")

  public Boolean getAnswerRequired() {
    return answerRequired;
  }


  public void setAnswerRequired(Boolean answerRequired) {
    
    
    
    this.answerRequired = answerRequired;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner showAsDropdown(Boolean showAsDropdown) {
    
    
    
    
    this.showAsDropdown = showAsDropdown;
    return this;
  }

   /**
   * Whether to display the radio selection as a drop-down box.  * &#x60;true&#x60; - Show as a drop-down box.  * &#x60;false&#x60; - Do not show as a drop-down box.    This value defaults to &#x60;false&#x60;.
   * @return showAsDropdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to display the radio selection as a drop-down box.  * `true` - Show as a drop-down box.  * `false` - Do not show as a drop-down box.    This value defaults to `false`.")

  public Boolean getShowAsDropdown() {
    return showAsDropdown;
  }


  public void setShowAsDropdown(Boolean showAsDropdown) {
    
    
    
    this.showAsDropdown = showAsDropdown;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner answers(List<String> answers) {
    
    
    
    
    this.answers = answers;
    return this;
  }

  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner addAnswersItem(String answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

   /**
   * The survey question&#39;s available answers. This field requires a **minimum** of two answers.   * For &#x60;single&#x60; and &#x60;multiple&#x60; questions, you can only provide a maximum of 50 answers.  * For &#x60;matching&#x60; polls, you can only provide a maximum of 16 answers.  * For &#x60;rank_order&#x60; polls, you can only provide a maximum of seven answers.
   * @return answers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The survey question's available answers. This field requires a **minimum** of two answers.   * For `single` and `multiple` questions, you can only provide a maximum of 50 answers.  * For `matching` polls, you can only provide a maximum of 16 answers.  * For `rank_order` polls, you can only provide a maximum of seven answers.")

  public List<String> getAnswers() {
    return answers;
  }


  public void setAnswers(List<String> answers) {
    
    
    
    this.answers = answers;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner prompts(List<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner> prompts) {
    
    
    
    
    this.prompts = prompts;
    return this;
  }

  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner addPromptsItem(WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner promptsItem) {
    if (this.prompts == null) {
      this.prompts = new ArrayList<>();
    }
    this.prompts.add(promptsItem);
    return this;
  }

   /**
   * Information about the prompt questions. This field only applies to &#x60;matching&#x60; and &#x60;rank_order&#x60; questions. You **must** provide a minimum of two prompts, up to a maximum of 10 prompts.
   * @return prompts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the prompt questions. This field only applies to `matching` and `rank_order` questions. You **must** provide a minimum of two prompts, up to a maximum of 10 prompts.")

  public List<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner> getPrompts() {
    return prompts;
  }


  public void setPrompts(List<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner> prompts) {
    
    
    
    this.prompts = prompts;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner answerMinCharacter(Integer answerMinCharacter) {
    if (answerMinCharacter != null && answerMinCharacter < 1) {
      throw new IllegalArgumentException("Invalid value for answerMinCharacter. Must be greater than or equal to 1.");
    }
    
    
    
    this.answerMinCharacter = answerMinCharacter;
    return this;
  }

   /**
   * The allowed minimum number of characters. This field only applies to &#x60;short_answer&#x60; and &#x60;long_answer&#x60; questions. You must provide at least a **one** character minimum value.
   * minimum: 1
   * @return answerMinCharacter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The allowed minimum number of characters. This field only applies to `short_answer` and `long_answer` questions. You must provide at least a **one** character minimum value.")

  public Integer getAnswerMinCharacter() {
    return answerMinCharacter;
  }


  public void setAnswerMinCharacter(Integer answerMinCharacter) {
    if (answerMinCharacter != null && answerMinCharacter < 1) {
      throw new IllegalArgumentException("Invalid value for answerMinCharacter. Must be greater than or equal to 1.");
    }
    
    
    this.answerMinCharacter = answerMinCharacter;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner answerMaxCharacter(Integer answerMaxCharacter) {
    
    
    
    
    this.answerMaxCharacter = answerMaxCharacter;
    return this;
  }

   /**
   * The allowed maximum number of characters. This field only applies to &#x60;short_answer&#x60; and &#x60;long_answer&#x60; questions.  * For &#x60;short_answer&#x60; question, a maximum of 500 characters.  * For &#x60;long_answer&#x60; question, a maximum of 2,000 characters.
   * @return answerMaxCharacter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The allowed maximum number of characters. This field only applies to `short_answer` and `long_answer` questions.  * For `short_answer` question, a maximum of 500 characters.  * For `long_answer` question, a maximum of 2,000 characters.")

  public Integer getAnswerMaxCharacter() {
    return answerMaxCharacter;
  }


  public void setAnswerMaxCharacter(Integer answerMaxCharacter) {
    
    
    
    this.answerMaxCharacter = answerMaxCharacter;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner ratingMinValue(Integer ratingMinValue) {
    if (ratingMinValue != null && ratingMinValue < 0) {
      throw new IllegalArgumentException("Invalid value for ratingMinValue. Must be greater than or equal to 0.");
    }
    
    
    
    this.ratingMinValue = ratingMinValue;
    return this;
  }

   /**
   * The rating scale&#39;s minimum value. This value can&#39;t be less than zero.    This field only applies to the &#x60;rating_scale&#x60; survey.
   * minimum: 0
   * @return ratingMinValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The rating scale's minimum value. This value can't be less than zero.    This field only applies to the `rating_scale` survey.")

  public Integer getRatingMinValue() {
    return ratingMinValue;
  }


  public void setRatingMinValue(Integer ratingMinValue) {
    if (ratingMinValue != null && ratingMinValue < 0) {
      throw new IllegalArgumentException("Invalid value for ratingMinValue. Must be greater than or equal to 0.");
    }
    
    
    this.ratingMinValue = ratingMinValue;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner ratingMaxValue(Integer ratingMaxValue) {
    
    if (ratingMaxValue != null && ratingMaxValue > 10) {
      throw new IllegalArgumentException("Invalid value for ratingMaxValue. Must be less than or equal to 10.");
    }
    
    
    this.ratingMaxValue = ratingMaxValue;
    return this;
  }

   /**
   * The rating scale&#39;s maximum value, up to a maximum value of 10.    This field only applies to the &#x60;rating_scale&#x60; survey.
   * maximum: 10
   * @return ratingMaxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The rating scale's maximum value, up to a maximum value of 10.    This field only applies to the `rating_scale` survey.")

  public Integer getRatingMaxValue() {
    return ratingMaxValue;
  }


  public void setRatingMaxValue(Integer ratingMaxValue) {
    
    if (ratingMaxValue != null && ratingMaxValue > 10) {
      throw new IllegalArgumentException("Invalid value for ratingMaxValue. Must be less than or equal to 10.");
    }
    
    this.ratingMaxValue = ratingMaxValue;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner ratingMinLabel(String ratingMinLabel) {
    
    
    
    
    this.ratingMinLabel = ratingMinLabel;
    return this;
  }

   /**
   * The low score label used for the &#x60;rating_min_value&#x60; field, up to 50 characters.    This field only applies to the &#x60;rating_scale&#x60; survey.
   * @return ratingMinLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not likely", value = "The low score label used for the `rating_min_value` field, up to 50 characters.    This field only applies to the `rating_scale` survey.")

  public String getRatingMinLabel() {
    return ratingMinLabel;
  }


  public void setRatingMinLabel(String ratingMinLabel) {
    
    
    
    this.ratingMinLabel = ratingMinLabel;
  }


  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner ratingMaxLabel(String ratingMaxLabel) {
    
    
    
    
    this.ratingMaxLabel = ratingMaxLabel;
    return this;
  }

   /**
   * The high score label used for the &#x60;rating_max_value&#x60; field, up to 50 characters.    This field only applies to the &#x60;rating_scale&#x60; survey.
   * @return ratingMaxLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Extremely Likely", value = "The high score label used for the `rating_max_value` field, up to 50 characters.    This field only applies to the `rating_scale` survey.")

  public String getRatingMaxLabel() {
    return ratingMaxLabel;
  }


  public void setRatingMaxLabel(String ratingMaxLabel) {
    
    
    
    this.ratingMaxLabel = ratingMaxLabel;
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
   * @return the WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner instance itself
   */
  public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner putAdditionalProperty(String key, Object value) {
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
    WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner webinarsUpdateSurveyRequestCustomSurveyQuestionsInner = (WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner) o;
    return Objects.equals(this.name, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.name) &&
        Objects.equals(this.type, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.type) &&
        Objects.equals(this.answerRequired, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.answerRequired) &&
        Objects.equals(this.showAsDropdown, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.showAsDropdown) &&
        Objects.equals(this.answers, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.answers) &&
        Objects.equals(this.prompts, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.prompts) &&
        Objects.equals(this.answerMinCharacter, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.answerMinCharacter) &&
        Objects.equals(this.answerMaxCharacter, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.answerMaxCharacter) &&
        Objects.equals(this.ratingMinValue, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.ratingMinValue) &&
        Objects.equals(this.ratingMaxValue, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.ratingMaxValue) &&
        Objects.equals(this.ratingMinLabel, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.ratingMinLabel) &&
        Objects.equals(this.ratingMaxLabel, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.ratingMaxLabel)&&
        Objects.equals(this.additionalProperties, webinarsUpdateSurveyRequestCustomSurveyQuestionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, answerRequired, showAsDropdown, answers, prompts, answerMinCharacter, answerMaxCharacter, ratingMinValue, ratingMaxValue, ratingMinLabel, ratingMaxLabel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    answerRequired: ").append(toIndentedString(answerRequired)).append("\n");
    sb.append("    showAsDropdown: ").append(toIndentedString(showAsDropdown)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("    answerMinCharacter: ").append(toIndentedString(answerMinCharacter)).append("\n");
    sb.append("    answerMaxCharacter: ").append(toIndentedString(answerMaxCharacter)).append("\n");
    sb.append("    ratingMinValue: ").append(toIndentedString(ratingMinValue)).append("\n");
    sb.append("    ratingMaxValue: ").append(toIndentedString(ratingMaxValue)).append("\n");
    sb.append("    ratingMinLabel: ").append(toIndentedString(ratingMinLabel)).append("\n");
    sb.append("    ratingMaxLabel: ").append(toIndentedString(ratingMaxLabel)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("answer_required");
    openapiFields.add("show_as_dropdown");
    openapiFields.add("answers");
    openapiFields.add("prompts");
    openapiFields.add("answer_min_character");
    openapiFields.add("answer_max_character");
    openapiFields.add("rating_min_value");
    openapiFields.add("rating_max_value");
    openapiFields.add("rating_min_label");
    openapiFields.add("rating_max_label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner is not found in the empty JSON string", WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("answers") != null && !jsonObj.get("answers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `answers` to be an array in the JSON string but got `%s`", jsonObj.get("answers").toString()));
      }
      if (jsonObj.get("prompts") != null && !jsonObj.get("prompts").isJsonNull()) {
        JsonArray jsonArrayprompts = jsonObj.getAsJsonArray("prompts");
        if (jsonArrayprompts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("prompts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `prompts` to be an array in the JSON string but got `%s`", jsonObj.get("prompts").toString()));
          }

          // validate the optional field `prompts` (array)
          for (int i = 0; i < jsonArrayprompts.size(); i++) {
            WebinarsUpdateSurveyRequestCustomSurveyQuestionsInnerPromptsInner.validateJsonObject(jsonArrayprompts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("rating_min_label") != null && !jsonObj.get("rating_min_label").isJsonNull()) && !jsonObj.get("rating_min_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rating_min_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rating_min_label").toString()));
      }
      if ((jsonObj.get("rating_max_label") != null && !jsonObj.get("rating_max_label").isJsonNull()) && !jsonObj.get("rating_max_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rating_max_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rating_max_label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner>() {
           @Override
           public void write(JsonWriter out, WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner value) throws IOException {
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
           public WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner
  * @throws IOException if the JSON string is invalid with respect to WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner
  */
  public static WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner.class);
  }

 /**
  * Convert an instance of WebinarsUpdateSurveyRequestCustomSurveyQuestionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

