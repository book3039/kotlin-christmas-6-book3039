package christmas.event

import christmas.planner.EventPlanner

interface WoowaEvent {
    val eventName: String
    val benefit: Int
    fun execute(eventPlanner: EventPlanner)
}
