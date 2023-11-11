package christmas.calender

import christmas.event.WeekDayEvent
import christmas.event.WeekEndEvent
import christmas.event.WoowaEvent
import java.time.LocalDate
import java.time.YearMonth

private const val WEEKEND = "주말"
private const val WEEKDAY = "평일"
private const val TARGET_WEEKEND_FRIDAY = "FRIDAY"
private const val TARGET_WEEKEND_SATURDAY = "SATURDAY"
const val FIRST_DAY = 1

open class EventCalender(year: Int, month: Int, date: Int) {
    private val localDate: LocalDate = LocalDate.of(year, month, date)
    private val lengthOfMonth = YearMonth.of(year, month).lengthOfMonth()
    fun getDayType(): String {
        return when (localDate.dayOfWeek.toString()) {
            TARGET_WEEKEND_FRIDAY, TARGET_WEEKEND_SATURDAY -> WEEKEND
            else -> WEEKDAY
        }
    }

    fun findDateByDayName(day: String): List<Int> {
        return (FIRST_DAY..lengthOfMonth).filter {
            localDate
                .withDayOfMonth(it)
                .dayOfWeek
                .toString() == day
        }
    }

    fun createDayTypeEvent(): WoowaEvent =
        if (getDayType() == WEEKEND) WeekEndEvent() else WeekDayEvent()
}
