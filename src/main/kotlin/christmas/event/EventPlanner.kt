package christmas.event

import christmas.calender.DecemberEventCalender
import christmas.menu.DecemberMenu

class EventPlanner {

    private val events: List<WoowaEvent>
    private val orders = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1"
    var parsedOrders = parseMenu(orders)


    init {
        val tempEvents = DecemberEventCalender(3).createDecemberEvents().toMutableList()
        if (calculateTotalOrderPrice(orders) >= 120_000) tempEvents += listOf(GiveawayEvent())
        events = tempEvents.toList()
    }

    fun parseMenu(orders: String): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun calculateTotalOrderPrice(orders: String): Int =
        parseMenu(orders).sumOf { DecemberMenu().calculatePrice(it) }
}
