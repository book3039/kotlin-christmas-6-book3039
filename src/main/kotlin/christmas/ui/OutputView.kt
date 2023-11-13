package christmas.ui

import java.text.DecimalFormat


object OutputView {
    fun printEventPreview(date: Int) {
        println("12월 ${date}일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!")
        println()
    }

    fun printMenu(parsedOrders: List<Pair<String, Int>>) {
        println("<주문 메뉴>")
        for (order in parsedOrders) {
            println(order.first + " ${order.second}개")
        }
        println()
    }

    fun printTotalOrderPrice(totalPrice: Int) {
        println("<할인 전 총주문 금액>")
        println("${DecimalFormat("#,###").format(totalPrice)}원")
        println()
    }

    fun printPromotionMenu(promotion :Pair<String, Int>) {
        println("<증정 메뉴>")
        println(promotion.first + " ${promotion.second}개")
        println()
    }

    fun printTotalBenefitAmount(amount: Int) {
        println("<총혜택 금액>")
        println("${DecimalFormat("#,###").format(amount)}원")
        println()
    }

    fun printEstimatedPayment(estimatedPayment: Int) {
        println("<할인 후 예상 결제 금액>")
        println("${DecimalFormat("#,###").format(estimatedPayment)}원")
        println()
    }


}