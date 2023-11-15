package christmas.event

import christmas.planner.EventPlanner

private const val DEFAULT_DISCOUNT = -1000
private const val DISCOUNT_PER_DAY = -100
private const val CHRISTMAS_D_DAY_EVENT = "크리스마스 디데이 할인"

class ChristmasDdayEvent(date: Int) : WoowaEvent {
    override val eventName: String = CHRISTMAS_D_DAY_EVENT
    override val benefit: Int = DEFAULT_DISCOUNT + DISCOUNT_PER_DAY * (date - 1)
    override fun execute(eventPlanner: EventPlanner) {
    }
}
