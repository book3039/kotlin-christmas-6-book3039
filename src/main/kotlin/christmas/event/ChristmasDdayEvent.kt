package christmas.event

import christmas.planner.EventPlanner

class ChristmasDdayEvent(date: Int) : WoowaEvent {

    override val eventName: String = "크리스마스 디데이 할인"
    override val benefit: Int = -1000 - (date - 1) * 100
    override fun execute(eventPlanner: EventPlanner) {
        TODO("Not yet implemented")
    }
}
