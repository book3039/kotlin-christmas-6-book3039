package christmas

import christmas.planner.EventPlanner
import christmas.ui.InputView
import christmas.ui.OutputView

fun main() {

    val date = InputView.readDate()
    val eventPlanner = EventPlanner(date, orders = InputView.readOrders())

    OutputView.apply {
        printEventPreview(date)
        printMenu(eventPlanner.parsedOrders)
        printTotalOrderPrice(eventPlanner.calculateTotalOrderPrice())
        printPromotionMenu(eventPlanner.promotionMenu)
        printTotalBenefitAmount(eventPlanner.calculateTotalBenefitAmount())
        printEstimatedPayment(eventPlanner.calculateEstimatedPayment())
        printAwardedBadge(eventPlanner.awardBadge())
    }




}
