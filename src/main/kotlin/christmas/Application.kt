package christmas

import christmas.planner.EventPlanner
import christmas.ui.InputView
import christmas.ui.OutputView

fun main() {
    OutputView.printWelcomeMessage()
    val date = InputView.readDate()
    val orders = InputView.readOrders()
    val eventPlanner = EventPlanner(date, orders).apply { executeEvents() }

    OutputView.printEventPreview(date)
    OutputView.printAllInOrder(eventPlanner)
}
