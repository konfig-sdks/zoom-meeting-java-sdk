

# WebinarsListWebinarsResponseWebinarsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agenda** | **String** | Webinar description. The agenda length gets truncated to 250 characters when you list all webinars for a user. To view the complete agenda, retrieve details for a single webinar, use the [**Get a webinar**](https://developers.zoom.us) API. |  [optional] |
|**createdAt** | **OffsetDateTime** | The webinar&#39;s creation time. |  [optional] |
|**duration** | **Integer** | The webinar&#39;s duration, in minutes. |  [optional] |
|**hostId** | **String** | The host&#39;s ID. |  [optional] |
|**id** | **Long** | The webinar ID. |  [optional] |
|**joinUrl** | **String** | The URL to join the webinar. |  [optional] |
|**startTime** | **OffsetDateTime** | The webinar&#39;s start time. |  [optional] |
|**timezone** | **String** | The webinar&#39;s [timezone](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#timezones). |  [optional] |
|**topic** | **String** | The webinar&#39;s topic. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The webinar type.  * &#x60;5&#x60; - A webinar.  * &#x60;6&#x60; - A recurring webinar without a fixed time.  * &#x60;9&#x60; - A recurring webinar with a fixed time. |  [optional] |
|**uuid** | **String** | The webinar&#39;s universally unique identifier (UUID). Each webinar instance generates a webinar UUID. |  [optional] |
|**isSimulive** | **Boolean** | Whether the webinar is &#x60;simulive&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_9 | 9 |



