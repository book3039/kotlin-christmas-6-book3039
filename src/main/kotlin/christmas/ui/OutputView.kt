package christmas.ui

object OutputView {
    fun printEventPreview(date: Int) =
        println("12월 ${date}일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!")

    fun printMenu(parsedOrders: List<Pair<String, Int>>) {
        println("<주문 메뉴>")
        for (order in parsedOrders) {
            println(order.first + " ${order.second}개")
        }
    }
}