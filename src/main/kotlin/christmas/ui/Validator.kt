package christmas.ui

import christmas.menu.CATEGORY_BEVERAGE
import christmas.planner.EventPlanner

private const val DECEMBER_FIRST_DAY = 1
private const val DECEMBER_LAST_DAY = 31

private const val MIN_MENU_COUNT = 1
private const val MAX_MENU_COUNT = 20

object Validator {
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
        require(EventPlanner.menuInformation().hasMenu(input))

    fun checkIsOnlyBeverage(menuNames: MutableList<String>) {
        val categories = menuNames.map { EventPlanner.menuInformation().findCategory(it) }
        require(!categories.all { it == CATEGORY_BEVERAGE })
    }

    fun checkOrders(input: String) {
        val menuNames = mutableListOf<String>()
        var totalCount = 0
        input.split(",").map {
            checkMenuNameMatchRegex(it)
            val (name, count) = it.split("-")
            validateEachOrder(name, count)
            require(!menuNames.contains(name))
            menuNames.add(name)
            totalCount += count.toInt()
        }
        require(totalCount <= MAX_MENU_COUNT)
        checkIsOnlyBeverage(menuNames)
    }

    private fun validateEachOrder(name: String, count: String) {
        checkMenuExist(name)
        checkMenuCountRange(count)
    }
}