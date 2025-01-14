

# WebinarsGetDetailsResponse

Webinar object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostEmail** | **String** | Email address of the meeting host. |  [optional] |
|**hostId** | **String** | ID of the user set as host of webinar. |  [optional] |
|**id** | **Long** | Webinar ID in **long** format(represented as int64 data type in JSON), also known as the webinar number. |  [optional] |
|**uuid** | **String** | Unique webinar ID. Each webinar instance will generate its own webinar UUID. After a webinar ends, a new UUID is generated for the next instance of the webinar. Retrieve a list of UUIDs from past webinar instances using the [**List past webinar instances**](https://developers.zoom.us) API. [Double encode](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#meeting-id-and-uuid) your UUID when using it for API calls if the UUID begins with a &#x60;/&#x60; or contains &#x60;//&#x60; in it.   |  [optional] |
|**agenda** | **String** | Webinar agenda. |  [optional] |
|**createdAt** | **OffsetDateTime** | Create time. |  [optional] |
|**duration** | **Integer** | Webinar duration. |  [optional] |
|**joinUrl** | **String** | URL to join the webinar. Only share this URL with the users who should be invited to the webinar. |  [optional] |
|**occurrences** | [**List&lt;WebinarsGetDetailsResponseOccurrencesInner&gt;**](WebinarsGetDetailsResponseOccurrencesInner.md) | Array of occurrence objects. |  [optional] |
|**password** | **String** | Webinar passcode.   If **Require a passcode when scheduling new meetings** setting has been **enabled** **and** [locked](https://support.zoom.us/hc/en-us/articles/115005269866-Using-Tiered-Settings#locked) for the user, the passcode field will be autogenerated for the Webinar in the response even if it is not provided in the API request.           **Note:** If the account owner or the admin has configured [minimum passcode requirement settings](https://support.zoom.us/hc/en-us/articles/360033559832-Meeting-and-webinar-passwords#h_a427384b-e383-4f80-864d-794bf0a37604), the passcode value provided here must meet those requirements.         If the requirements are enabled, you can view those requirements by calling either the [**Get user settings**](https://developers.zoom.us) API or the [**Get account settings**](https://developers.zoom.us) API. |  [optional] |
|**encryptedPasscode** | **String** | Encrypted passcode for third party endpoints (H323/SIP). |  [optional] |
|**h323Passcode** | **String** | H.323/SIP room system passcode. |  [optional] |
|**recurrence** | [**RecurrenceWebinarProperty2**](RecurrenceWebinarProperty2.md) |  |  [optional] |
|**settings** | [**WebinarsGetDetailsResponseSettings**](WebinarsGetDetailsResponseSettings.md) |  |  [optional] |
|**startTime** | **OffsetDateTime** | Webinar start time in GMT/UTC. |  [optional] |
|**startUrl** | **String** |     The &#x60;start_url&#x60; of a webinar is a URL using which a host or an alternative host can start the webinar. This URL should only be used by the host of the meeting and should not be shared with anyone other than the host of the webinar.   The expiration time for the &#x60;start_url&#x60; field listed in the response of the [**Create a webinar**](https://developers.zoom.us) API is two hours for all regular users.    For users created using the &#x60;custCreate&#x60; option via the [**Create users**](https://developers.zoom.us) API, the expiration time of the &#x60;start_url&#x60; field is 90 days.   For security reasons, to retrieve the latest value for the &#x60;start_url&#x60; field programmatically (after expiry), you must call the [**Get a webinar**](https://developers.zoom.us) API and refer to the value of the &#x60;start_url&#x60; field in the response.     |  [optional] |
|**timezone** | **String** | Time zone to format &#x60;start_time&#x60;. |  [optional] |
|**topic** | **String** | Webinar topic. |  [optional] |
|**trackingFields** | [**List&lt;WebinarsGetDetailsResponseTrackingFieldsInner&gt;**](WebinarsGetDetailsResponseTrackingFieldsInner.md) | Tracking fields. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Webinar types.   &#x60;5&#x60; - Webinar.    &#x60;6&#x60; - Recurring webinar with no fixed time.    &#x60;9&#x60; - Recurring webinar with a fixed time. |  [optional] |
|**isSimulive** | **Boolean** | Whether the webinar is &#x60;simulive&#x60;. |  [optional] |
|**recordFileId** | **String** | The previously recorded file&#39;s ID for &#x60;simulive&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_9 | 9 |



