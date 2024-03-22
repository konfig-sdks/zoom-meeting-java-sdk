

# MeetingsCreateMeetingResponseOccurrencesInner

Occurrence object. This object is only returned for recurring webinars.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**duration** | **Integer** | Duration. |  [optional] |
|**occurrenceId** | **String** | Occurrence ID: Unique Identifier that identifies an occurrence of a recurring webinar. [Recurring webinars](https://support.zoom.us/hc/en-us/articles/216354763-How-to-Schedule-A-Recurring-Webinar) can have a maximum of 50 occurrences. |  [optional] |
|**startTime** | **OffsetDateTime** | Start time. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Occurrence status.   &#x60;available&#x60; - Available occurrence.    &#x60;deleted&#x60; -  Deleted occurrence. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |



