package christmas.calender

import christmas.event.ChristmasDdayEvent
import christmas.event.SpecialEvent
import christmas.event.WoowaEvent

private const val TARGET_YEAR = 2023
private const val TARGET_MONTH = 12
private const val CHRISTMAS_DAY = 25
private const val TARGET_STAR_DAY = "SUNDAY"

class DecemberEventCalender(private val day: Int = FIRST_DAY) :
    EventCalender(TARGET_YEAR, TARGET_MONTH, day) {

    private val starDays: List<Int>

    init {
        starDays = findStarDays()
    }

    private fun findStarDays(): List<Int> =
        super.findDateByDayName(TARGET_STAR_DAY) + listOf(CHRISTMAS_DAY)

    fun hasStar(): Boolean = starDays.contains(day)

    fun createDecemberEvents(): List<WoowaEvent> {
        val events = mutableListOf(super.createDayTypeEvent())
        if (hasStar()) events.add(SpecialEvent())
        if (day in FIRST_DAY..CHRISTMAS_DAY) events.add(ChristmasDdayEvent())

        return events.toList()
    }
}
