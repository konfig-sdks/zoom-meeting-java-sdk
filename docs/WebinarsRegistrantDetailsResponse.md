

# WebinarsRegistrantDetailsResponse

Webinar registrant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**address** | **String** | The registrant&#39;s address. |  [optional] |
|**city** | **String** | The registrant&#39;s city. |  [optional] |
|**comments** | **String** | The registrant&#39;s questions and comments. |  [optional] |
|**country** | **String** | The registrant&#39;s two-letter ISO [country code](https://developers.zoom.us/docs/api/rest/other-references/abbreviation-lists/#countries). |  [optional] |
|**customQuestions** | [**List&lt;WebinarsRegistrantDetailsResponseCustomQuestionsInner&gt;**](WebinarsRegistrantDetailsResponseCustomQuestionsInner.md) | Information about custom questions. |  [optional] |
|**email** | **String** | The registrant&#39;s email address. See [Email address display rules](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#email-address-display-rules) for return value details. |  |
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
|**language** | [**LanguageEnum**](#LanguageEnum) | The registrant&#39;s language preference for confirmation emails:  * &#x60;en-US&#x60; &amp;mdash; English (US)  * &#x60;de-DE&#x60; &amp;mdash; German (Germany)  * &#x60;es-ES&#x60; &amp;mdash; Spanish (Spain)  * &#x60;fr-FR&#x60; &amp;mdash; French (France)  * &#x60;jp-JP&#x60; &amp;mdash; Japanese  * &#x60;pt-PT&#x60; &amp;mdash; Portuguese (Portugal)  * &#x60;ru-RU&#x60; &amp;mdash; Russian  * &#x60;zh-CN&#x60; &amp;mdash; Chinese (PRC)  * &#x60;zh-TW&#x60; &amp;mdash; Chinese (Taiwan)  * &#x60;ko-KO&#x60; &amp;mdash; Korean  * &#x60;it-IT&#x60; &amp;mdash; Italian (Italy)  * &#x60;vi-VN&#x60; &amp;mdash; Vietnamese  * &#x60;pl-PL&#x60; &amp;mdash; Polish  * &#x60;Tr-TR&#x60; &amp;mdash; Turkish |  [optional] |
|**createTime** | **OffsetDateTime** |  |  [optional] |
|**joinUrl** | **String** |  |  [optional] |



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



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| EN_US | &quot;en-US&quot; |
| DE_DE | &quot;de-DE&quot; |
| ES_ES | &quot;es-ES&quot; |
| FR_FR | &quot;fr-FR&quot; |
| JP_JP | &quot;jp-JP&quot; |
| PT_PT | &quot;pt-PT&quot; |
| RU_RU | &quot;ru-RU&quot; |
| ZH_CN | &quot;zh-CN&quot; |
| ZH_TW | &quot;zh-TW&quot; |
| KO_KO | &quot;ko-KO&quot; |
| IT_IT | &quot;it-IT&quot; |
| VI_VN | &quot;vi-VN&quot; |
| PL_PL | &quot;pl-PL&quot; |
| TR_TR | &quot;Tr-TR&quot; |



