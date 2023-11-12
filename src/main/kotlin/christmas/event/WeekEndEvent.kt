package christmas.event

import christmas.menu.DecemberMenu

class WeekEndEvent() : WoowaEvent {

    override var benefit: Int = 0
    override fun execute(eventPlanner: EventPlanner) {
        val mainOrders = eventPlanner.parsedOrders
            .filter { DecemberMenu().findCategory(it.first) == "메인" }

        for (order in mainOrders) {
            benefit += order.second * -2023
        }
    }
}
