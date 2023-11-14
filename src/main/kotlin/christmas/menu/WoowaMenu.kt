package christmas.menu

interface WoowaMenu {
    val menuMap: Map<String, Pair<String, Int>> // Map(메뉴이름, Pair(카테고리, 가격))

    fun findPrice(name: String): Int {
        return menuMap[name]?.second ?: throw IllegalArgumentException()
    }

    fun findCategory(name: String): String {
        return menuMap[name]?.first ?: throw IllegalArgumentException()
    }

    fun calculatePrice(order: Pair<String, Int>): Int = findPrice(order.first) * order.second
}