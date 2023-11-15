package christmas.menu

class DecemberMenu : WoowaMenu {
    override val menuInformation: Map<String, Pair<String, Int>> =
        DecemberMenuItem.entries.associate { it.menuName to Pair(it.category, it.price) }

    fun hasMenu(menuName: String): Boolean = menuInformation.containsKey(menuName)
}
