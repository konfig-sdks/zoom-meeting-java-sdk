

# CloudRecordingCreateRegistrantRequest

 Registrant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | The registrant&#39;s address. |  [optional] |
|**city** | **String** | The registrant&#39;s city. |  [optional] |
|**comments** | **String** | The registrant&#39;s questions and comments. |  [optional] |
|**country** | **String** | The registrant&#39;s two-letter [country code](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries). |  [optional] |
|**customQuestions** | [**List&lt;CloudRecordingCreateRegistrantRequestCustomQuestionsInner&gt;**](CloudRecordingCreateRegistrantRequestCustomQuestionsInner.md) | Information about custom questions. |  [optional] |
|**email** | **String** | The registrant&#39;s email address. See [Email address display rules](https://marketplace.zoom.us/docs/api-reference/using-zoom-apis#email-address) for return value details. |  |
|**firstName** | **String** | The registrant&#39;s first name. |  |
|**industry** | **String** | The registrant&#39;s industry. |  [optional] |
|**jobTitle** | **String** | The registrant&#39;s job title. |  [optional] |
|**lastName** | **String** | The registrant&#39;s last name. |  [optional] |
|**noOfEmployees** | [**NoOfEmployeesEnum**](#NoOfEmployeesEnum) | The registrant&#39;s number of employees:  * &#x60;1-20&#x60;  * &#x60;21-50&#x60;  * &#x60;51-100&#x60;  * &#x60;101-250&#x60;  * &#x60;251-500&#x60;  * &#x60;501-1,000&#x60;  * &#x60;1,001-5,000&#x60;  * &#x60;5,001-10,000&#x60;  * &#x60;More than 10,000&#x60; |  [optional] |
|**org** | **String** | The registrant&#39;s organization. |  [optional] |
|**phone** | **String** | The registrant&#39;s phone number. |  [optional] |
|**purchasingTimeFrame** | [**PurchasingTimeFrameEnum**](#PurchasingTimeFrameEnum) | The registrant&#39;s purchasing time frame:  * &#x60;Within a month&#x60;  * &#x60;1-3 months&#x60;  * &#x60;4-6 months&#x60;  * &#x60;More than 6 months&#x60;  * &#x60;No timeframe&#x60; |  [optional] |
|**roleInPurchaseProcess** | [**RoleInPurchaseProcessEnum**](#RoleInPurchaseProcessEnum) | The registrant&#39;s role in the purchase process:  * &#x60;Decision Maker&#x60;  * &#x60;Evaluator/Recommender&#x60;  * &#x60;Influencer&#x60;  * &#x60;Not involved&#x60; |  [optional] |
|**state** | **String** | The registrant&#39;s state or province. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The registrant&#39;s status:  * &#x60;approved&#x60; &amp;mdash; Registrant is approved.  * &#x60;denied&#x60; &amp;mdash; Registrant is denied.  * &#x60;pending&#x60; &amp;mdash; Registrant is waiting for approval. |  [optional] |
|**zip** | **String** | The registrant&#39;s ZIP or postal code. |  [optional] |



## Enum: NoOfEmployeesEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| _1_20 | &quot;1-20&quot; |
| _21_50 | &quot;21-50&quot; |
| _51_100 | &quot;51-100&quot; |
| _101_250 | &quot;101-250&quot; |
| _251_500 | &quot;251-500&quot; |
| _501_1_000 | &quot;501-1,000&quot; |
| _1_001_5_000 | &quot;1,001-5,000&quot; |
| _5_001_10_000 | &quot;5,001-10,000&quot; |
| MORE_THAN_10_000 | &quot;More than 10,000&quot; |



## Enum: PurchasingTimeFrameEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| WITHIN_A_MONTH | &quot;Within a month&quot; |
| _1_3_MONTHS | &quot;1-3 months&quot; |
| _4_6_MONTHS | &quot;4-6 months&quot; |
| MORE_THAN_6_MONTHS | &quot;More than 6 months&quot; |
| NO_TIMEFRAME | &quot;No timeframe&quot; |



## Enum: RoleInPurchaseProcessEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| DECISION_MAKER | &quot;Decision Maker&quot; |
| EVALUATOR_RECOMMENDER | &quot;Evaluator/Recommender&quot; |
| INFLUENCER | &quot;Influencer&quot; |
| NOT_INVOLVED | &quot;Not involved&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DENIED | &quot;denied&quot; |
| PENDING | &quot;pending&quot; |



