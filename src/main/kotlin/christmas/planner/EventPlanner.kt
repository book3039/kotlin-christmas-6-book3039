package christmas.planner

import christmas.calender.DecemberEventCalender
import christmas.event.GiveawayEvent
import christmas.event.WoowaEvent
import christmas.menu.DecemberMenu

class EventPlanner(private val date: Int, private val orders: String) {

    private val events: List<WoowaEvent> = setEvents(date, orders)
    var parsedOrders = parseMenu(orders)


    init {
    }

    private fun setEvents(date: Int, orders: String): List<WoowaEvent> {
        if (calculateTotalOrderPrice(orders) < 10_000) return emptyList()

        val tempEvents = DecemberEventCalender(date).createDecemberEvents().toMutableList()
        if (calculateTotalOrderPrice(orders) >= 120_000) tempEvents += listOf(GiveawayEvent())

        return tempEvents
    }

    fun parseMenu(orders: String = this.orders): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun calculateTotalOrderPrice(orders: String = this.orders): Int =
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
