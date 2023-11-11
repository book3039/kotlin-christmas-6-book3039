package christmas

import java.time.LocalDate

class DecemberEventCalander(day: Int) {

    private val localDate = LocalDate.of(2023, 12, day)

    fun daytype(): String {
        return when (localDate.dayOfWeek.toString()) {
            "FRIDAY", "SATURDAY", "SUNDAY" -> "주말"
            else -> "평일"
        }
    }

    fun createDaytypeEvent(): WoowaEvent =
        if (daytype() == "주말") WeekEndEvent() else WeekDayEvent()

    fun findDateByDayName(day: String): List<Int> {
        return (1..31).filter {
            localDate
                .withDayOfMonth(it)
                .dayOfWeek
                .toString() == day
        }
    }
}
