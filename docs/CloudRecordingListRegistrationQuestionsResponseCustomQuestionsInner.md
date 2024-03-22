

# CloudRecordingListRegistrationQuestionsResponseCustomQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the question. |  [optional] |
|**answers** | **List&lt;String&gt;** | Answer choices for the question. Can not be used with Short answer type. |  [optional] |
|**required** | **Boolean** | State whether registrants are required to answer custom questions or not. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of registration question and answers. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHORT | &quot;short&quot; |
| SINGLE | &quot;single&quot; |
| MULTIPLE | &quot;multiple&quot; |



