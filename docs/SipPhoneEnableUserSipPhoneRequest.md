

# SipPhoneEnableUserSipPhoneRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationName** | **String** | The authorization name of the user that is registered for SIP phone. |  |
|**domain** | **String** | The name or IP address of your provider&#39;s SIP domain (example: CDC.WEB).  |  |
|**password** | **String** | The password generated for the user in the SIP account. |  |
|**proxyServer** | **String** | The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server. |  |
|**proxyServer2** | **String** | The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server, or empty. |  [optional] |
|**proxyServer3** | **String** | The IP address of the proxy server for SIP requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. If you are not using a proxy server, this value can be the same as the Register Server, or empty. |  [optional] |
|**registerServer** | **String** | The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. |  |
|**registerServer2** | **String** | The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. |  [optional] |
|**registerServer3** | **String** | The IP address of the server that accepts REGISTER requests. Note that if you are using the UDP transport protocol, the default port is 5060. If you are using UDP with a different port number, that port number must be included with the IP address. |  [optional] |
|**registrationExpireTime** | **Integer** | The number of minutes after which the SIP registration of the Zoom client user will expire, and the client will auto register to the SIP server. |  [optional] |
|**transportProtocol** | [**TransportProtocolEnum**](#TransportProtocolEnum) | Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;. |  [optional] |
|**transportProtocol2** | [**TransportProtocol2Enum**](#TransportProtocol2Enum) | Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;. |  [optional] |
|**transportProtocol3** | [**TransportProtocol3Enum**](#TransportProtocol3Enum) | Protocols supported by the SIP provider.     The value must be either &#x60;UDP&#x60;, &#x60;TCP&#x60;, &#x60;TLS&#x60;, &#x60;AUTO&#x60;. |  [optional] |
|**userEmail** | **String** | The email address of the user to associate with the SIP Phone. Can add &#x60;.win&#x60;, &#x60;.mac&#x60;, &#x60;.android&#x60;, &#x60;.ipad&#x60;, &#x60;.iphone&#x60;, &#x60;.linux&#x60;, &#x60;.pc&#x60;, &#x60;.mobile&#x60;, &#x60;.pad&#x60; at the end of the email (for example, &#x60;user@example.com.mac&#x60;) to add accounts for different platforms for the same user. |  |
|**userName** | **String** | The phone number associated with the user in the SIP account. |  |
|**voiceMail** | **String** | The number to dial for checking voicemail. |  |



## Enum: TransportProtocolEnum

| Name | Value |
|---- | -----|
| UDP | &quot;UDP&quot; |
| TCP | &quot;TCP&quot; |
| TLS | &quot;TLS&quot; |
| AUTO | &quot;AUTO&quot; |



## Enum: TransportProtocol2Enum

| Name | Value |
|---- | -----|
| UDP | &quot;UDP&quot; |
| TCP | &quot;TCP&quot; |
| TLS | &quot;TLS&quot; |
| AUTO | &quot;AUTO&quot; |



## Enum: TransportProtocol3Enum

| Name | Value |
|---- | -----|
| UDP | &quot;UDP&quot; |
| TCP | &quot;TCP&quot; |
| TLS | &quot;TLS&quot; |
| AUTO | &quot;AUTO&quot; |



