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
 * ReportsGetBillingInvoicesResponseInvoicesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsGetBillingInvoicesResponseInvoicesInner {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_INVOICE_CHARGE_NAME = "invoice_charge_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_CHARGE_NAME)
  private String invoiceChargeName;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoice_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private String taxAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public ReportsGetBillingInvoicesResponseInvoicesInner() {
  }

  public ReportsGetBillingInvoicesResponseInvoicesInner endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the invoice period.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Mar 24 17:00:00 PDT 2022", value = "End date of the invoice period.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner invoiceChargeName(String invoiceChargeName) {
    
    
    
    
    this.invoiceChargeName = invoiceChargeName;
    return this;
  }

   /**
   * Name of the invoice.
   * @return invoiceChargeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Audio Conferencing Options", value = "Name of the invoice.")

  public String getInvoiceChargeName() {
    return invoiceChargeName;
  }


  public void setInvoiceChargeName(String invoiceChargeName) {
    
    
    
    this.invoiceChargeName = invoiceChargeName;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner invoiceNumber(String invoiceNumber) {
    
    
    
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number 
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Invoice number ")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    
    
    
    this.invoiceNumber = invoiceNumber;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of licenses bought.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45", value = "Number of licenses bought.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    
    
    
    this.quantity = quantity;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the invoice period.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Mar 24 17:00:00 PDT 2022", value = "Start date of the invoice period.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner taxAmount(String taxAmount) {
    
    
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax amount in the invoice.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34", value = "Tax amount in the invoice.")

  public String getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(String taxAmount) {
    
    
    
    this.taxAmount = taxAmount;
  }


  public ReportsGetBillingInvoicesResponseInvoicesInner totalAmount(String totalAmount) {
    
    
    
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total billed amount in the invoice.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45", value = "Total billed amount in the invoice.")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    
    
    
    this.totalAmount = totalAmount;
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
   * @return the ReportsGetBillingInvoicesResponseInvoicesInner instance itself
   */
  public ReportsGetBillingInvoicesResponseInvoicesInner putAdditionalProperty(String key, Object value) {
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
    ReportsGetBillingInvoicesResponseInvoicesInner reportsGetBillingInvoicesResponseInvoicesInner = (ReportsGetBillingInvoicesResponseInvoicesInner) o;
    return Objects.equals(this.endDate, reportsGetBillingInvoicesResponseInvoicesInner.endDate) &&
        Objects.equals(this.invoiceChargeName, reportsGetBillingInvoicesResponseInvoicesInner.invoiceChargeName) &&
        Objects.equals(this.invoiceNumber, reportsGetBillingInvoicesResponseInvoicesInner.invoiceNumber) &&
        Objects.equals(this.quantity, reportsGetBillingInvoicesResponseInvoicesInner.quantity) &&
        Objects.equals(this.startDate, reportsGetBillingInvoicesResponseInvoicesInner.startDate) &&
        Objects.equals(this.taxAmount, reportsGetBillingInvoicesResponseInvoicesInner.taxAmount) &&
        Objects.equals(this.totalAmount, reportsGetBillingInvoicesResponseInvoicesInner.totalAmount)&&
        Objects.equals(this.additionalProperties, reportsGetBillingInvoicesResponseInvoicesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, invoiceChargeName, invoiceNumber, quantity, startDate, taxAmount, totalAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsGetBillingInvoicesResponseInvoicesInner {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    invoiceChargeName: ").append(toIndentedString(invoiceChargeName)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("invoice_charge_name");
    openapiFields.add("invoice_number");
    openapiFields.add("quantity");
    openapiFields.add("start_date");
    openapiFields.add("tax_amount");
    openapiFields.add("total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsGetBillingInvoicesResponseInvoicesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsGetBillingInvoicesResponseInvoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsGetBillingInvoicesResponseInvoicesInner is not found in the empty JSON string", ReportsGetBillingInvoicesResponseInvoicesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("invoice_charge_name") != null && !jsonObj.get("invoice_charge_name").isJsonNull()) && !jsonObj.get("invoice_charge_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_charge_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_charge_name").toString()));
      }
      if ((jsonObj.get("invoice_number") != null && !jsonObj.get("invoice_number").isJsonNull()) && !jsonObj.get("invoice_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_number").toString()));
      }
      if ((jsonObj.get("tax_amount") != null && !jsonObj.get("tax_amount").isJsonNull()) && !jsonObj.get("tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_amount").toString()));
      }
      if ((jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonNull()) && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportsGetBillingInvoicesResponseInvoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsGetBillingInvoicesResponseInvoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsGetBillingInvoicesResponseInvoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsGetBillingInvoicesResponseInvoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsGetBillingInvoicesResponseInvoicesInner>() {
           @Override
           public void write(JsonWriter out, ReportsGetBillingInvoicesResponseInvoicesInner value) throws IOException {
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
           public ReportsGetBillingInvoicesResponseInvoicesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsGetBillingInvoicesResponseInvoicesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsGetBillingInvoicesResponseInvoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsGetBillingInvoicesResponseInvoicesInner
  * @throws IOException if the JSON string is invalid with respect to ReportsGetBillingInvoicesResponseInvoicesInner
  */
  public static ReportsGetBillingInvoicesResponseInvoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsGetBillingInvoicesResponseInvoicesInner.class);
  }

 /**
  * Convert an instance of ReportsGetBillingInvoicesResponseInvoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

