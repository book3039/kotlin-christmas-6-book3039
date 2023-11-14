package christmas.event

import christmas.planner.EventPlanner

class SpecialEvent() : WoowaEvent {

    override val eventName: String = "특별 할인"
    override val benefit: Int = -1000
    override fun execute(eventPlanner: EventPlanner) {
    }

}
