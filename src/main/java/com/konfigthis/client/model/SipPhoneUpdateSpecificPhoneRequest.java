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
 * SipPhoneUpdateSpecificPhoneRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SipPhoneUpdateSpecificPhoneRequest {
  public static final String SERIALIZED_NAME_AUTHORIZATION_NAME = "authorization_name";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_NAME)
  private String authorizationName;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROXY_SERVER = "proxy_server";
  @SerializedName(SERIALIZED_NAME_PROXY_SERVER)
  private String proxyServer;

  public static final String SERIALIZED_NAME_PROXY_SERVER2 = "proxy_server2";
  @SerializedName(SERIALIZED_NAME_PROXY_SERVER2)
  private String proxyServer2;

  public static final String SERIALIZED_NAME_PROXY_SERVER3 = "proxy_server3";
  @SerializedName(SERIALIZED_NAME_PROXY_SERVER3)
  private String proxyServer3;

  public static final String SERIALIZED_NAME_REGISTER_SERVER = "register_server";
  @SerializedName(SERIALIZED_NAME_REGISTER_SERVER)
  private String registerServer;

  public static final String SERIALIZED_NAME_REGISTER_SERVER2 = "register_server2";
  @SerializedName(SERIALIZED_NAME_REGISTER_SERVER2)
  private String registerServer2;

  public static final String SERIALIZED_NAME_REGISTER_SERVER3 = "register_server3";
  @SerializedName(SERIALIZED_NAME_REGISTER_SERVER3)
  private String registerServer3;

  public static final String SERIALIZED_NAME_REGISTRATION_EXPIRE_TIME = "registration_expire_time";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_EXPIRE_TIME)
  private Integer registrationExpireTime = 60;

  /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   */
  @JsonAdapter(TransportProtocolEnum.Adapter.class)
 public enum TransportProtocolEnum {
    UDP("UDP"),
    
    TCP("TCP"),
    
    TLS("TLS"),
    
    AUTO("AUTO");

    private String value;

    TransportProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportProtocolEnum fromValue(String value) {
      for (TransportProtocolEnum b : TransportProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransportProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransportProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSPORT_PROTOCOL = "transport_protocol";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_PROTOCOL)
  private TransportProtocolEnum transportProtocol;

  /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   */
  @JsonAdapter(TransportProtocol2Enum.Adapter.class)
 public enum TransportProtocol2Enum {
    UDP("UDP"),
    
    TCP("TCP"),
    
    TLS("TLS"),
    
    AUTO("AUTO");

    private String value;

    TransportProtocol2Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportProtocol2Enum fromValue(String value) {
      for (TransportProtocol2Enum b : TransportProtocol2Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransportProtocol2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportProtocol2Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportProtocol2Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransportProtocol2Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSPORT_PROTOCOL2 = "transport_protocol2";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_PROTOCOL2)
  private TransportProtocol2Enum transportProtocol2;

  /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   */
  @JsonAdapter(TransportProtocol3Enum.Adapter.class)
 public enum TransportProtocol3Enum {
    UDP("UDP"),
    
    TCP("TCP"),
    
    TLS("TLS"),
    
    AUTO("AUTO");

    private String value;

    TransportProtocol3Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportProtocol3Enum fromValue(String value) {
      for (TransportProtocol3Enum b : TransportProtocol3Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransportProtocol3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportProtocol3Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportProtocol3Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransportProtocol3Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSPORT_PROTOCOL3 = "transport_protocol3";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_PROTOCOL3)
  private TransportProtocol3Enum transportProtocol3;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_VOICE_MAIL = "voice_mail";
  @SerializedName(SERIALIZED_NAME_VOICE_MAIL)
  private String voiceMail;

  public SipPhoneUpdateSpecificPhoneRequest() {
  }

  public SipPhoneUpdateSpecificPhoneRequest authorizationName(String authorizationName) {
    
    
    
    
    this.authorizationName = authorizationName;
    return this;
  }

   /**
   * The authorization name of the user that is registered for SIP phone.
   * @return authorizationName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testname", required = true, value = "The authorization name of the user that is registered for SIP phone.")

  public String getAuthorizationName() {
    return authorizationName;
  }


  public void setAuthorizationName(String authorizationName) {
    
    
    
    this.authorizationName = authorizationName;
  }


  public SipPhoneUpdateSpecificPhoneRequest domain(String domain) {
    
    
    
    
    this.domain = domain;
    return this;
  }

   /**
   * The name or IP address of your provider&#39;s SIP domain (example: CDC.WEB). 
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "example.com", required = true, value = "The name or IP address of your provider's SIP domain (example: CDC.WEB). ")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    
    
    
    this.domain = domain;
  }


  public SipPhoneUpdateSpecificPhoneRequest password(String password) {
    
    
    
    
    this.password = password;
    return this;
  }

   /**
   * The password generated for the user in the SIP account.
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456", required = true, value = "The password generated for the user in the SIP account.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    
    
    
    this.password = password;
  }


  public SipPhoneUpdateSpecificPhoneRequest proxyServer(String proxyServer) {
    
    
    
    
    this.proxyServer = proxyServer;
    return this;
  }

   /**
   * The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
   * @return proxyServer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.2", required = true, value = "The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.")

  public String getProxyServer() {
    return proxyServer;
  }


  public void setProxyServer(String proxyServer) {
    
    
    
    this.proxyServer = proxyServer;
  }


  public SipPhoneUpdateSpecificPhoneRequest proxyServer2(String proxyServer2) {
    
    
    
    
    this.proxyServer2 = proxyServer2;
    return this;
  }

   /**
   * The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
   * @return proxyServer2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.4", required = true, value = "The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.")

  public String getProxyServer2() {
    return proxyServer2;
  }


  public void setProxyServer2(String proxyServer2) {
    
    
    
    this.proxyServer2 = proxyServer2;
  }


  public SipPhoneUpdateSpecificPhoneRequest proxyServer3(String proxyServer3) {
    
    
    
    
    this.proxyServer3 = proxyServer3;
    return this;
  }

   /**
   * The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.
   * @return proxyServer3
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.6", required = true, value = "The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server.")

  public String getProxyServer3() {
    return proxyServer3;
  }


  public void setProxyServer3(String proxyServer3) {
    
    
    
    this.proxyServer3 = proxyServer3;
  }


  public SipPhoneUpdateSpecificPhoneRequest registerServer(String registerServer) {
    
    
    
    
    this.registerServer = registerServer;
    return this;
  }

   /**
   * The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
   * @return registerServer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.1", required = true, value = "The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.")

  public String getRegisterServer() {
    return registerServer;
  }


  public void setRegisterServer(String registerServer) {
    
    
    
    this.registerServer = registerServer;
  }


  public SipPhoneUpdateSpecificPhoneRequest registerServer2(String registerServer2) {
    
    
    
    
    this.registerServer2 = registerServer2;
    return this;
  }

   /**
   * The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
   * @return registerServer2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.3", required = true, value = "The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.")

  public String getRegisterServer2() {
    return registerServer2;
  }


  public void setRegisterServer2(String registerServer2) {
    
    
    
    this.registerServer2 = registerServer2;
  }


  public SipPhoneUpdateSpecificPhoneRequest registerServer3(String registerServer3) {
    
    
    
    
    this.registerServer3 = registerServer3;
    return this;
  }

   /**
   * The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.
   * @return registerServer3
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192.0.2.5", required = true, value = "The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address.")

  public String getRegisterServer3() {
    return registerServer3;
  }


  public void setRegisterServer3(String registerServer3) {
    
    
    
    this.registerServer3 = registerServer3;
  }


  public SipPhoneUpdateSpecificPhoneRequest registrationExpireTime(Integer registrationExpireTime) {
    if (registrationExpireTime != null && registrationExpireTime < 1) {
      throw new IllegalArgumentException("Invalid value for registrationExpireTime. Must be greater than or equal to 1.");
    }
    if (registrationExpireTime != null && registrationExpireTime > 127) {
      throw new IllegalArgumentException("Invalid value for registrationExpireTime. Must be less than or equal to 127.");
    }
    
    
    this.registrationExpireTime = registrationExpireTime;
    return this;
  }

   /**
   * The number of minutes after which the SIP registration of the Zoom client user will expire, and the client will auto register to the SIP server.
   * minimum: 1
   * maximum: 127
   * @return registrationExpireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "The number of minutes after which the SIP registration of the Zoom client user will expire, and the client will auto register to the SIP server.")

  public Integer getRegistrationExpireTime() {
    return registrationExpireTime;
  }


  public void setRegistrationExpireTime(Integer registrationExpireTime) {
    if (registrationExpireTime != null && registrationExpireTime < 1) {
      throw new IllegalArgumentException("Invalid value for registrationExpireTime. Must be greater than or equal to 1.");
    }
    if (registrationExpireTime != null && registrationExpireTime > 127) {
      throw new IllegalArgumentException("Invalid value for registrationExpireTime. Must be less than or equal to 127.");
    }
    
    this.registrationExpireTime = registrationExpireTime;
  }


  public SipPhoneUpdateSpecificPhoneRequest transportProtocol(TransportProtocolEnum transportProtocol) {
    
    
    
    
    this.transportProtocol = transportProtocol;
    return this;
  }

   /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   * @return transportProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UDP", value = "Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.")

  public TransportProtocolEnum getTransportProtocol() {
    return transportProtocol;
  }


  public void setTransportProtocol(TransportProtocolEnum transportProtocol) {
    
    
    
    this.transportProtocol = transportProtocol;
  }


  public SipPhoneUpdateSpecificPhoneRequest transportProtocol2(TransportProtocol2Enum transportProtocol2) {
    
    
    
    
    this.transportProtocol2 = transportProtocol2;
    return this;
  }

   /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   * @return transportProtocol2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UDP", value = "Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.")

  public TransportProtocol2Enum getTransportProtocol2() {
    return transportProtocol2;
  }


  public void setTransportProtocol2(TransportProtocol2Enum transportProtocol2) {
    
    
    
    this.transportProtocol2 = transportProtocol2;
  }


  public SipPhoneUpdateSpecificPhoneRequest transportProtocol3(TransportProtocol3Enum transportProtocol3) {
    
    
    
    
    this.transportProtocol3 = transportProtocol3;
    return this;
  }

   /**
   * Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;.
   * @return transportProtocol3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UDP", value = "Protocols supported by the SIP provider.     The value must be either `UDP`, `TCP`, `TLS`, `AUTO`.")

  public TransportProtocol3Enum getTransportProtocol3() {
    return transportProtocol3;
  }


  public void setTransportProtocol3(TransportProtocol3Enum transportProtocol3) {
    
    
    
    this.transportProtocol3 = transportProtocol3;
  }


  public SipPhoneUpdateSpecificPhoneRequest userName(String userName) {
    
    
    
    
    this.userName = userName;
    return this;
  }

   /**
   * The phone number associated with the user in the SIP account.
   * @return userName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Jill Chill", required = true, value = "The phone number associated with the user in the SIP account.")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    
    
    
    this.userName = userName;
  }


  public SipPhoneUpdateSpecificPhoneRequest voiceMail(String voiceMail) {
    
    
    
    
    this.voiceMail = voiceMail;
    return this;
  }

   /**
   * The number to dial for checking voicemail.
   * @return voiceMail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4000", required = true, value = "The number to dial for checking voicemail.")

  public String getVoiceMail() {
    return voiceMail;
  }


  public void setVoiceMail(String voiceMail) {
    
    
    
    this.voiceMail = voiceMail;
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
   * @return the SipPhoneUpdateSpecificPhoneRequest instance itself
   */
  public SipPhoneUpdateSpecificPhoneRequest putAdditionalProperty(String key, Object value) {
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
    SipPhoneUpdateSpecificPhoneRequest sipPhoneUpdateSpecificPhoneRequest = (SipPhoneUpdateSpecificPhoneRequest) o;
    return Objects.equals(this.authorizationName, sipPhoneUpdateSpecificPhoneRequest.authorizationName) &&
        Objects.equals(this.domain, sipPhoneUpdateSpecificPhoneRequest.domain) &&
        Objects.equals(this.password, sipPhoneUpdateSpecificPhoneRequest.password) &&
        Objects.equals(this.proxyServer, sipPhoneUpdateSpecificPhoneRequest.proxyServer) &&
        Objects.equals(this.proxyServer2, sipPhoneUpdateSpecificPhoneRequest.proxyServer2) &&
        Objects.equals(this.proxyServer3, sipPhoneUpdateSpecificPhoneRequest.proxyServer3) &&
        Objects.equals(this.registerServer, sipPhoneUpdateSpecificPhoneRequest.registerServer) &&
        Objects.equals(this.registerServer2, sipPhoneUpdateSpecificPhoneRequest.registerServer2) &&
        Objects.equals(this.registerServer3, sipPhoneUpdateSpecificPhoneRequest.registerServer3) &&
        Objects.equals(this.registrationExpireTime, sipPhoneUpdateSpecificPhoneRequest.registrationExpireTime) &&
        Objects.equals(this.transportProtocol, sipPhoneUpdateSpecificPhoneRequest.transportProtocol) &&
        Objects.equals(this.transportProtocol2, sipPhoneUpdateSpecificPhoneRequest.transportProtocol2) &&
        Objects.equals(this.transportProtocol3, sipPhoneUpdateSpecificPhoneRequest.transportProtocol3) &&
        Objects.equals(this.userName, sipPhoneUpdateSpecificPhoneRequest.userName) &&
        Objects.equals(this.voiceMail, sipPhoneUpdateSpecificPhoneRequest.voiceMail)&&
        Objects.equals(this.additionalProperties, sipPhoneUpdateSpecificPhoneRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationName, domain, password, proxyServer, proxyServer2, proxyServer3, registerServer, registerServer2, registerServer3, registrationExpireTime, transportProtocol, transportProtocol2, transportProtocol3, userName, voiceMail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipPhoneUpdateSpecificPhoneRequest {\n");
    sb.append("    authorizationName: ").append(toIndentedString(authorizationName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    proxyServer: ").append(toIndentedString(proxyServer)).append("\n");
    sb.append("    proxyServer2: ").append(toIndentedString(proxyServer2)).append("\n");
    sb.append("    proxyServer3: ").append(toIndentedString(proxyServer3)).append("\n");
    sb.append("    registerServer: ").append(toIndentedString(registerServer)).append("\n");
    sb.append("    registerServer2: ").append(toIndentedString(registerServer2)).append("\n");
    sb.append("    registerServer3: ").append(toIndentedString(registerServer3)).append("\n");
    sb.append("    registrationExpireTime: ").append(toIndentedString(registrationExpireTime)).append("\n");
    sb.append("    transportProtocol: ").append(toIndentedString(transportProtocol)).append("\n");
    sb.append("    transportProtocol2: ").append(toIndentedString(transportProtocol2)).append("\n");
    sb.append("    transportProtocol3: ").append(toIndentedString(transportProtocol3)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    voiceMail: ").append(toIndentedString(voiceMail)).append("\n");
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
    openapiFields.add("authorization_name");
    openapiFields.add("domain");
    openapiFields.add("password");
    openapiFields.add("proxy_server");
    openapiFields.add("proxy_server2");
    openapiFields.add("proxy_server3");
    openapiFields.add("register_server");
    openapiFields.add("register_server2");
    openapiFields.add("register_server3");
    openapiFields.add("registration_expire_time");
    openapiFields.add("transport_protocol");
    openapiFields.add("transport_protocol2");
    openapiFields.add("transport_protocol3");
    openapiFields.add("user_name");
    openapiFields.add("voice_mail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorization_name");
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("proxy_server");
    openapiRequiredFields.add("proxy_server2");
    openapiRequiredFields.add("proxy_server3");
    openapiRequiredFields.add("register_server");
    openapiRequiredFields.add("register_server2");
    openapiRequiredFields.add("register_server3");
    openapiRequiredFields.add("user_name");
    openapiRequiredFields.add("voice_mail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SipPhoneUpdateSpecificPhoneRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SipPhoneUpdateSpecificPhoneRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SipPhoneUpdateSpecificPhoneRequest is not found in the empty JSON string", SipPhoneUpdateSpecificPhoneRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SipPhoneUpdateSpecificPhoneRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("authorization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_name").toString()));
      }
      if (!jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("proxy_server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxy_server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxy_server").toString()));
      }
      if (!jsonObj.get("proxy_server2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxy_server2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxy_server2").toString()));
      }
      if (!jsonObj.get("proxy_server3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proxy_server3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proxy_server3").toString()));
      }
      if (!jsonObj.get("register_server").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `register_server` to be a primitive type in the JSON string but got `%s`", jsonObj.get("register_server").toString()));
      }
      if (!jsonObj.get("register_server2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `register_server2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("register_server2").toString()));
      }
      if (!jsonObj.get("register_server3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `register_server3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("register_server3").toString()));
      }
      if ((jsonObj.get("transport_protocol") != null && !jsonObj.get("transport_protocol").isJsonNull()) && !jsonObj.get("transport_protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transport_protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transport_protocol").toString()));
      }
      if ((jsonObj.get("transport_protocol2") != null && !jsonObj.get("transport_protocol2").isJsonNull()) && !jsonObj.get("transport_protocol2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transport_protocol2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transport_protocol2").toString()));
      }
      if ((jsonObj.get("transport_protocol3") != null && !jsonObj.get("transport_protocol3").isJsonNull()) && !jsonObj.get("transport_protocol3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transport_protocol3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transport_protocol3").toString()));
      }
      if (!jsonObj.get("user_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_name").toString()));
      }
      if (!jsonObj.get("voice_mail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice_mail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice_mail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SipPhoneUpdateSpecificPhoneRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SipPhoneUpdateSpecificPhoneRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SipPhoneUpdateSpecificPhoneRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SipPhoneUpdateSpecificPhoneRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SipPhoneUpdateSpecificPhoneRequest>() {
           @Override
           public void write(JsonWriter out, SipPhoneUpdateSpecificPhoneRequest value) throws IOException {
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
           public SipPhoneUpdateSpecificPhoneRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SipPhoneUpdateSpecificPhoneRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SipPhoneUpdateSpecificPhoneRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SipPhoneUpdateSpecificPhoneRequest
  * @throws IOException if the JSON string is invalid with respect to SipPhoneUpdateSpecificPhoneRequest
  */
  public static SipPhoneUpdateSpecificPhoneRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SipPhoneUpdateSpecificPhoneRequest.class);
  }

 /**
  * Convert an instance of SipPhoneUpdateSpecificPhoneRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
