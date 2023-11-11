package christmas

class DecemberEventCalander(private val day: Int = 1) : EventCalander(2023, 12, day) {

    private val starDays: List<Int>

    init {
        starDays = findStarDays()
    }

    private fun findStarDays(): List<Int> =
        findDateByDayName("SUNDAY") + listOf(25)

    fun hasStar(): Boolean = starDays.contains(day)

    fun createDecemberEvents(): List<WoowaEvent> {
        val events = mutableListOf<WoowaEvent>()
        events.add(createDayTypeEvent())
        if (hasStar()) events.add(SpecialEvent())
        if (day in 1..25) events.add(ChristmasDdayEvent())

        return events
    }
}
