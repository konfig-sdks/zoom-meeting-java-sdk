

# ReportsGetTelephoneReportsResponseTelephonyUsageInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callInNumber** | **String** | Caller&#39;s call-in number. |  [optional] |
|**countryName** | **String** | Country name. |  [optional] |
|**dept** | **String** | User department. |  [optional] |
|**duration** | **Integer** | Call leg duration |  [optional] |
|**endTime** | **OffsetDateTime** | Call leg end time |  [optional] |
|**hostEmail** | **String** | User email. |  [optional] |
|**hostId** | **String** | The user ID of the meeting host. |  [optional] |
|**hostName** | **String** | User display name. |  [optional] |
|**meetingId** | **Long** | [Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in &amp;quot;**long**&amp;quot; format(represented as int64 data type in JSON), also known as the meeting number. |  [optional] |
|**meetingType** | **String** | Meeting type. |  [optional] |
|**phoneNumber** | **String** | Toll-free telephone number.  |  [optional] |
|**rate** | **Double** | Calling rate for the telephone call. |  [optional] |
|**signaledNumber** | **String** | The number that is signaled to Zoom.  |  [optional] |
|**startTime** | **OffsetDateTime** | Call leg start time |  [optional] |
|**total** | **Double** | Total cost (USD) for Call Out. Calculated as plan rate by duration. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Call type. |  [optional] |
|**uuid** | **String** | Meeting UUID. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOLL_FREE | &quot;toll-free&quot; |
| CALL_OUT | &quot;call-out&quot; |
| CALL_IN | &quot;call-in&quot; |
| US_TOLL_NUMBER | &quot;US toll-number&quot; |
| GLOBAL_TOLL_NUMBER | &quot;global toll-number&quot; |
| PREMIUM | &quot;premium&quot; |
| PREMIUM_CALL_IN | &quot;premium call-in&quot; |
| TOLL | &quot;Toll&quot; |



