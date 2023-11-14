package christmas.ui

import christmas.menu.DecemberMenu

private const val DECEMBER_FIRST_DAY = 1
private const val DECEMBER_LAST_DAY = 31

private const val MIN_MENU_COUNT = 1
private const val MAX_MENU_COUNT = 20

object InputValidator {

    private val dateRegex = Regex("""^[0-9]+$""")
    private val menuRegex = Regex("""^([가-힣]+)-([0-9]+)$""")

    fun checkDateMatchRegex(input: String) =
        require(dateRegex.matches(input))

    fun checkCalenderRange(input: String) =
        require(input.toInt() in DECEMBER_FIRST_DAY..DECEMBER_LAST_DAY)

    fun checkMenuCountRange(input: String) =
        require(input.toInt() in MIN_MENU_COUNT..MAX_MENU_COUNT)

    fun checkMenuNameMatchRegex(input: String) =
        require(menuRegex.matches(input))

    fun checkMenuExist(input: String) =
        require(DecemberMenu().hasMenu(input))
}