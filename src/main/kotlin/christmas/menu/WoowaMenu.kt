package christmas.menu

interface WoowaMenu {
    val menuMap: Map<String, Pair<String, Int>>

    fun findPrice(s: String): Int {
        return menuMap[s]?.second ?: throw IllegalArgumentException()
    }

    fun calculatePrice(s: Pair<String, Int>): Int = findPrice(s.first) * s.second
}