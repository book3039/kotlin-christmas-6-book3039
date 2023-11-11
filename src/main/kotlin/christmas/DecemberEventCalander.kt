package christmas

class DecemberEventCalander(day: Int = 1) : EventCalander(2023, 12, day) {

    private val starDays: List<Int>

    init {
        starDays = findStarDays()
    }

    private fun findStarDays(): List<Int> =
        findDateByDayName("SUNDAY") + listOf(25)

    fun hasStar(day: Int): Boolean = starDays.contains(day)
}
