

# MeetingsUpdateRegistrationQuestionsRequestCustomQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the custom question. |  [optional] |
|**answers** | **List&lt;String&gt;** | Answer choices for the question. Can not be used for &#x60;short&#x60; question type as this type of question requires registrants to type out the answer. |  [optional] |
|**required** | **Boolean** | Indicates whether or not the custom question is required to be answered by participants or not. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the question being asked. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHORT | &quot;short&quot; |
| SINGLE | &quot;single&quot; |



