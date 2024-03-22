

# ReportsGetWebinarDetailsReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customKeys** | [**List&lt;ReportsGetWebinarDetailsReportResponseCustomKeysInner&gt;**](ReportsGetWebinarDetailsReportResponseCustomKeysInner.md) | Custom keys and values assigned to the meeting. |  [optional] |
|**dept** | **String** | Department of the host. |  [optional] |
|**duration** | **Integer** | Meeting duration. |  [optional] |
|**endTime** | **OffsetDateTime** | Meeting end time. |  [optional] |
|**id** | **Long** | [Meeting ID](https://support.zoom.us/hc/en-us/articles/201362373-What-is-a-Meeting-ID-): Unique identifier of the meeting in &amp;quot;**long**&amp;quot; format(represented as int64 data type in JSON), also known as the meeting number. |  [optional] |
|**participantsCount** | **Integer** | Number of meeting participants. |  [optional] |
|**startTime** | **OffsetDateTime** | Meeting start time. |  [optional] |
|**topic** | **String** | Meeting topic. |  [optional] |
|**totalMinutes** | **Integer** | Number of Webinar minutes. This represents the total amount of Webinar minutes attended by each participant including the host, for a Webinar hosted by the user. For instance if there were one host(named A) and one participant(named B) in a Webinar, the value of total_minutes would be calculated as below:  **total_minutes** &#x3D; Total Webinar Attendance Minutes of A + Total Webinar Attendance Minutes of B |  [optional] |
|**trackingFields** | [**List&lt;ReportsGetWebinarDetailsReportResponseTrackingFieldsInner&gt;**](ReportsGetWebinarDetailsReportResponseTrackingFieldsInner.md) | Tracking fields. |  [optional] |
|**type** | **Integer** | Meeting type. |  [optional] |
|**userEmail** | **String** | User email. |  [optional] |
|**userName** | **String** | User display name. |  [optional] |
|**uuid** | **String** | Webinar UUID. Each webinar instance will generate its own UUID(i.e., after a meeting ends, a new UUID will be generated when the next instance of the webinar starts). [double encode](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis/#meeting-id-and-uuid) the UUID when using it for API calls if the UUID begins with a &#39;/&#39; or contains &#39;//&#39; in it. |  [optional] |



