package christmas

import java.time.LocalDate

open class EventCalander(year: Int, month: Int, date: Int) {
    private val localDate: LocalDate = LocalDate.of(year, month, date)

    fun getDayType(): String {
        return when (localDate.dayOfWeek.toString()) {
            "FRIDAY", "SATURDAY", "SUNDAY" -> "주말"
            else -> "평일"
        }
    }

    fun findDateByDayName(day: String): List<Int> {
        return (1..31).filter {
            localDate
                .withDayOfMonth(it)
                .dayOfWeek
                .toString() == day
        }
    }

    fun createDayTypeEvent(): WoowaEvent =
        if (getDayType() == "주말") WeekEndEvent() else WeekDayEvent()
}
