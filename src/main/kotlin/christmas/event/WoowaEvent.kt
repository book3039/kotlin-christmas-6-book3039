package christmas.event

import christmas.planner.EventPlanner

interface WoowaEvent {
    val benefit: Int
    fun execute(eventPlanner: EventPlanner)
}
