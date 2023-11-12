package christmas.event

import christmas.menu.DecemberMenu

class WeekDayEvent() : WoowaEvent {

    override var benefit: Int = 0
    override fun execute(eventPlanner: EventPlanner) {
        val dessertOrders = eventPlanner.parsedOrders
            .filter { DecemberMenu().findCategory(it.first) == "디저트" }

        for (order in dessertOrders) {
            benefit += order.second * -2023

        }
    }
}
