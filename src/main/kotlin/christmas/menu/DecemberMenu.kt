package christmas.menu

class DecemberMenu {

    fun findPrice(s: String): Int {
        return DecemberMenuItem.entries
            .find { it.menuName == s }
            ?.price ?: throw IllegalArgumentException()
    }

}
