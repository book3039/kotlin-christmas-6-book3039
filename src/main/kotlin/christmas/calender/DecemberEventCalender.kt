package christmas.calender

import christmas.event.ChristmasDdayEvent
import christmas.event.SpecialEvent
import christmas.event.WoowaEvent

class DecemberEventCalender(private val day: Int = 1) : EventCalender(2023, 12, day) {

    private val starDays: List<Int>

    init {
        starDays = findStarDays()
    }

    private fun findStarDays(): List<Int> =
        super.findDateByDayName("SUNDAY") + listOf(25)

    fun hasStar(): Boolean = starDays.contains(day)

    fun createDecemberEvents(): List<WoowaEvent> {
        val events = mutableListOf(super.createDayTypeEvent())
        if (hasStar()) events.add(SpecialEvent())
        if (day in 1..25) events.add(ChristmasDdayEvent())

        return events.toList()
    }
}
