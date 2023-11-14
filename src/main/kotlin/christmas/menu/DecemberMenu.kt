package christmas.menu

class DecemberMenu : WoowaMenu {

    override val menuMap: Map<String, Pair<String, Int>> =
        DecemberMenuItem.entries.associate { it.menuName to Pair(it.category, it.price) }

    fun hasMenu(menuName: String): Boolean = menuMap.containsKey(menuName)
}
