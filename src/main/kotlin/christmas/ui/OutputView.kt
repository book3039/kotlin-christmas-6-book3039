package christmas.ui

import java.text.DecimalFormat

private const val TARGET_MONTH = "12월"
private const val ORDERED_MENU = "<주문 메뉴>"
private const val TOTAL_ORDER_PRICE = "<할인 전 총주문 금액>"
private const val PROMOTION_MENU = "<증정 메뉴>"
private const val TOTAL_BENEFIT_AMOUNT = "<총혜택 금액>"
private const val ESTIMATED_PAYMENT = "<할인 후 예상 결제 금액>"
private const val DECEMBER_EVENT_BADGE = "<12월 이벤트 배지>"


object OutputView {

    private val decimalPattern = DecimalFormat("#,###")

    fun printWelcomeMessage() = println("안녕하세요! 우테코 식당 $TARGET_MONTH 이벤트 플래너입니다.")

    fun printEventPreview(date: Int) {
        println("$TARGET_MONTH ${date}일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!")
        println()
    }

    fun printMenu(parsedOrders: List<Pair<String, Int>>) {
        println(ORDERED_MENU)
        for (order in parsedOrders) {
            println(order.first + " ${order.second}개")
        }
        println()
    }

    fun printTotalOrderPrice(totalPrice: Int) {
        println(TOTAL_ORDER_PRICE)
        println("${decimalPattern.format(totalPrice)}원")
        println()
    }

    fun printPromotionMenu(promotion :Pair<String, Int>) {
        println(PROMOTION_MENU)
        print(promotion.first)
        if (promotion.second > 0) print(" ${promotion.second}개")
        println()
        println()
    }

    fun printTotalBenefitAmount(amount: Int) {
        println(TOTAL_BENEFIT_AMOUNT)
        println("${decimalPattern.format(amount)}원")
        println()
    }

    fun printEstimatedPayment(estimatedPayment: Int) {
        println(ESTIMATED_PAYMENT)
        println("${decimalPattern.format(estimatedPayment)}원")
        println()
    }

    fun printAwardedBadge(badge: String) {
        println(DECEMBER_EVENT_BADGE)
        println(badge)
        println()
    }

}