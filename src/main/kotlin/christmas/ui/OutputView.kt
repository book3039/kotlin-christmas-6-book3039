package christmas.ui

import java.text.DecimalFormat


object OutputView {
    fun printEventPreview(date: Int) =
        println("12월 ${date}일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!")

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
    }

}