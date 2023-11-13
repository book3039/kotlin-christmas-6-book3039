package christmas.planner

import christmas.calender.DecemberEventCalender
import christmas.event.GiveawayEvent
import christmas.event.WoowaEvent
import christmas.menu.DecemberMenu

class EventPlanner {

    private val events: List<WoowaEvent> = listOf()
    private val orders = "아이스크림-1"
    var parsedOrders = parseMenu(orders)


    init {
        if (calculateTotalOrderPrice(orders) >= 10_000) setEvents()
    }

    private fun setEvents() {
        val tempEvents = DecemberEventCalender(3).createDecemberEvents().toMutableList()
        if (calculateTotalOrderPrice(orders) >= 120_000) tempEvents += listOf(GiveawayEvent())
        events.toMutableList() += tempEvents
        events.toList()
    }

    fun parseMenu(orders: String): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun calculateTotalOrderPrice(orders: String): Int =
        parseMenu(orders).sumOf { DecemberMenu().calculatePrice(it) }

    fun executeEvents() {
        for (event in events) event.execute(this)
    }

    fun calculateTotalBenefitAmount(): Int = events.sumOf { it.benefit }

    fun calculateEsitmatedPayment(): Int =
        calculateTotalOrderPrice(orders) + events
            .filterNot { it is GiveawayEvent }
            .sumOf { it.benefit }
}
