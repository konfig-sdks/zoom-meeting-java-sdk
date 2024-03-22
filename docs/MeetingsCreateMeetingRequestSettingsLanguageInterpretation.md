

# MeetingsCreateMeetingRequestSettingsLanguageInterpretation

The meeting's [language interpretation settings](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars). Make sure to add the language in the web portal in order to use it in the API. See link for details.   **Note:** This feature is only available for certain Meeting add-on, Education, and Business and higher plans. If this feature is not enabled on the host's account, this setting will **not** be applied to the meeting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enable** | **Boolean** | Whether to enable [language interpretation](https://support.zoom.us/hc/en-us/articles/360034919791-Language-interpretation-in-meetings-and-webinars) for the meeting. |  [optional] |
|**interpreters** | [**List&lt;MeetingsCreateMeetingRequestSettingsLanguageInterpretationInterpretersInner&gt;**](MeetingsCreateMeetingRequestSettingsLanguageInterpretationInterpretersInner.md) | Information about the meeting&#39;s language interpreters. |  [optional] |



