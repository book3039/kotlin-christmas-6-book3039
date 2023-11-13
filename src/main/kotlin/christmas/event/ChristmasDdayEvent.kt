package christmas.event

import christmas.planner.EventPlanner

class ChristmasDdayEvent(date: Int) : WoowaEvent {

    override val benefit: Int = -1000 - (date - 1) * 100
    override fun execute(eventPlanner: EventPlanner) {
    }
}
