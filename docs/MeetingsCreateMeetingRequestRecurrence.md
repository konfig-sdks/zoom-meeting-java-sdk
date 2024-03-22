

# MeetingsCreateMeetingRequestRecurrence

Recurrence object. Use this object only for a meeting with type `8`, a recurring meeting with a fixed time. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDateTime** | **OffsetDateTime** | Select the final date when the meeting will recur before it is canceled. Should be in UTC time, such as 2017-11-25T12:00:00Z. Cannot be used with &#x60;end_times&#x60;. |  [optional] |
|**endTimes** | **Integer** | Select how many times the meeting should recur before it is canceled. If &#x60;end_times&#x60; is set to 0, it means there is no end time. The maximum number of recurring is 60. Cannot be used with &#x60;end_date_time&#x60;. |  [optional] |
|**monthlyDay** | **Integer** | Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state the day in a month when the meeting should recur. The value range is from 1 to 31.  For the meeting to recur on 23rd of each month, provide &#x60;23&#x60; as this field&#39;s value and &#x60;1&#x60; as the &#x60;repeat_interval&#x60; field&#39;s value. Instead, if you would like the meeting to recur every three months, on 23rd of the month, change the value of the &#x60;repeat_interval&#x60; field to &#x60;3&#x60;. |  [optional] |
|**monthlyWeek** | [**MonthlyWeekEnum**](#MonthlyWeekEnum) | Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state the week of the month when the meeting should recur. If you use this field, you must also use the &#x60;monthly_week_day&#x60; field to state the day of the week when the meeting should recur.     &#x60;-1&#x60; - Last week of the month.    &#x60;1&#x60; - First week of the month.    &#x60;2&#x60; - Second week of the month.    &#x60;3&#x60; - Third week of the month.    &#x60;4&#x60; - Fourth week of the month. |  [optional] |
|**monthlyWeekDay** | [**MonthlyWeekDayEnum**](#MonthlyWeekDayEnum) | Use this field **only if you&#39;re scheduling a recurring meeting of type** &#x60;3&#x60; to state a specific day in a week when the monthly meeting should recur. To use this field, you must also use the &#x60;monthly_week&#x60; field.       &#x60;1&#x60; - Sunday.    &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; - Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday. |  [optional] |
|**repeatInterval** | **Integer** | Define the interval when the meeting should recur. For instance, to schedule a meeting that recurs every two months, set this field&#39;s value as &#x60;2&#x60; and the value of the &#x60;type&#x60; parameter as &#x60;3&#x60;.   For a daily meeting, the maximum interval you can set is &#x60;90&#x60; days. For a weekly meeting the maximum interval that you can set is  of &#x60;12&#x60; weeks. For a monthly meeting, there is a maximum of &#x60;3&#x60; months.   |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Recurrence meeting types.  &#x60;1&#x60; - Daily.    &#x60;2&#x60; - Weekly.    &#x60;3&#x60; - Monthly. |  |
|**weeklyDays** | [**WeeklyDaysEnum**](#WeeklyDaysEnum) | This field is required if you&#39;re scheduling a recurring meeting of type &#x60;2&#x60; to state the days of the week when the meeting should repeat.       The value for this field could be a number between &#x60;1&#x60; to &#x60;7&#x60; in string format. For instance, if the meeting should recur on Sunday, provide &#x60;1&#x60; as this field&#39;s value.         **Note:** To set the meeting to occur on multiple days of a week, provide comma separated values for this field. For instance, if the meeting should recur on Sundays and Tuesdays, provide &#x60;1,3&#x60; as this field&#39;s value.       &#x60;1&#x60; - Sunday.     &#x60;2&#x60; - Monday.    &#x60;3&#x60; - Tuesday.    &#x60;4&#x60; -  Wednesday.    &#x60;5&#x60; -  Thursday.    &#x60;6&#x60; - Friday.    &#x60;7&#x60; - Saturday. |  [optional] |



## Enum: MonthlyWeekEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | -1 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: MonthlyWeekDayEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



## Enum: WeeklyDaysEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |



