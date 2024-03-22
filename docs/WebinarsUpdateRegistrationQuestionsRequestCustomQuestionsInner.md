

# WebinarsUpdateRegistrationQuestionsRequestCustomQuestionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Custom question. |  [optional] |
|**answers** | **List&lt;String&gt;** | An array of answer choices. Can&#39;t be used for short answer type. |  [optional] |
|**required** | **Boolean** | State whether or not a registrant is required to answer the custom question. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The question-answer type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHORT | &quot;short&quot; |
| SINGLE_RADIO | &quot;single_radio&quot; |
| SINGLE_DROPDOWN | &quot;single_dropdown&quot; |
| MULTIPLE | &quot;multiple&quot; |



