package christmas.event

import christmas.menu.CATEGORY_DESSERT
import christmas.menu.DecemberMenu
import christmas.planner.EventPlanner

private const val DEFAULT_DISCOUNT = 0
private const val DISCOUNT_PER_MENU = -2023
private const val WEEKDAY_EVENT = "평일 할인"
private const val WEEKDAY_EVENT_TARGET_MENU = CATEGORY_DESSERT

class WeekDayEvent : WoowaEvent {
    override val eventName: String = WEEKDAY_EVENT
    override var benefit: Int = DEFAULT_DISCOUNT
    override fun execute(eventPlanner: EventPlanner) {
        val dessertOrders = eventPlanner.parseMenu()
            .filter { DecemberMenu().findCategory(it.first) == WEEKDAY_EVENT_TARGET_MENU }

        for (order in dessertOrders) {
            benefit += order.second * DISCOUNT_PER_MENU
        }
    }
}
