

# MeetingsUpdateDetailsRequestSettingsSignLanguageInterpretation

The meeting's [sign language interpretation settings](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar). Make sure to add the language in the web portal in order to use it in the API. See link for details.   **Note:** If this feature is not enabled on the host's account, this setting will **not** be applied to the meeting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enable** | **Boolean** | Whether to enable [sign language interpretation](https://support.zoom.us/hc/en-us/articles/9644962487309-Using-sign-language-interpretation-in-a-meeting-or-webinar) for the meeting. |  [optional] |
|**interpreters** | [**List&lt;MeetingsUpdateDetailsRequestSettingsSignLanguageInterpretationInterpretersInner&gt;**](MeetingsUpdateDetailsRequestSettingsSignLanguageInterpretationInterpretersInner.md) | Information about the meeting&#39;s sign language interpreters. |  [optional] |



