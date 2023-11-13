package christmas.event

import christmas.menu.DecemberMenu
import christmas.planner.EventPlanner

class WeekEndEvent() : WoowaEvent {

    override val eventName: String = "주말 할인"
    override var benefit: Int = 0
    override fun execute(eventPlanner: EventPlanner) {
        val mainOrders = eventPlanner.parseMenu()
            .filter { DecemberMenu().findCategory(it.first) == "메인" }

        for (order in mainOrders) {
            benefit += order.second * -2023
        }
    }
}
