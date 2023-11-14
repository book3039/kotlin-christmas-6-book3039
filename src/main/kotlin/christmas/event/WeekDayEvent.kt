package christmas.event

import christmas.menu.DecemberMenu
import christmas.planner.EventPlanner

class WeekDayEvent : WoowaEvent {

    override val eventName: String = "평일 할인"
    override var benefit: Int = 0
    override fun execute(eventPlanner: EventPlanner) {
        val dessertOrders = eventPlanner.parseMenu()
            .filter { DecemberMenu().findCategory(it.first) == "디저트" }

        for (order in dessertOrders) {
            benefit += order.second * -2023
        }
    }
}
