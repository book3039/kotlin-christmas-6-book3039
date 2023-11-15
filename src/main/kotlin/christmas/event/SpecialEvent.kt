package christmas.event

import christmas.planner.EventPlanner

private const val DEFAULT_DISCOUNT = -1000
private const val SPECIAL_EVENT = "특별 할인"

class SpecialEvent : WoowaEvent {
    override val eventName: String = SPECIAL_EVENT
    override val benefit: Int = DEFAULT_DISCOUNT
    override fun execute(eventPlanner: EventPlanner) {
    }
}
