package christmas

class DecemberEventCalander(private val day: Int = 1) : EventCalander(2023, 12, day) {

    private val starDays: List<Int>

    init {
        starDays = findStarDays()
    }

    private fun findStarDays(): List<Int> =
        findDateByDayName("SUNDAY") + listOf(25)

    fun hasStar(): Boolean = starDays.contains(day)
}
