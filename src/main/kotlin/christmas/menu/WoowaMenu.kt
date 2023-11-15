package christmas.menu

interface WoowaMenu {
    val menuInformation: Map<String, Pair<String, Int>> // Map(메뉴이름, Pair(카테고리, 가격))

    fun findPrice(name: String): Int {
        return menuInformation[name]?.second ?: throw IllegalArgumentException()
    }

    fun findCategory(name: String): String {
        return menuInformation[name]?.first ?: throw IllegalArgumentException()
    }

    // order = Pair<주문메뉴, 수량>
    fun calculatePrice(order: Pair<String, Int>): Int = findPrice(order.first) * order.second
}