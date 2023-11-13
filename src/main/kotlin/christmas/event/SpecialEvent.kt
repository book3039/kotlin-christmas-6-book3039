package christmas.event

import christmas.planner.EventPlanner

class SpecialEvent() : WoowaEvent {

    override val benefit: Int = -1000
    override fun execute(eventPlanner: EventPlanner) {

    }
}
