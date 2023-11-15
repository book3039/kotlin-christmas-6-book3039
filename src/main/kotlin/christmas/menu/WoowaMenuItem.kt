package christmas.menu

const val CATEGORY_APPETIZER = "애피타이저"
const val CATEGORY_MAIN = "메인"
const val CATEGORY_DESSERT = "디저트"
const val CATEGORY_BEVERAGE = "음료"

interface WoowaMenuItem {
    val category: String
    val menuName: String
    val price: Int
}
