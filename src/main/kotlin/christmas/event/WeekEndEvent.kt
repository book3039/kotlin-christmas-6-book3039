package christmas.event

import christmas.menu.CATEGORY_MAIN
import christmas.menu.DecemberMenu
import christmas.planner.EventPlanner

private const val DEFAULT_DISCOUNT = 0
private const val DISCOUNT_PER_MENU = -2023
private const val WEEKEND_EVENT = "주말 할인"
private const val WEEKEND_EVENT_TARGET_MENU = CATEGORY_MAIN

class WeekEndEvent : WoowaEvent {

    override val eventName: String = WEEKEND_EVENT
    override var benefit: Int = DEFAULT_DISCOUNT
    override fun execute(eventPlanner: EventPlanner) {
        val mainOrders = eventPlanner.parseMenu()
            .filter { DecemberMenu().findCategory(it.first) == WEEKEND_EVENT_TARGET_MENU }

        for (order in mainOrders) {
            benefit += order.second * DISCOUNT_PER_MENU
        }
    }
}
