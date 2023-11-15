package christmas.menu

const val CATEGORY_APPETIZER = "애피타이저"
const val CATEGORY_MAIN = "메인"
const val CATEGORY_DESSERT = "디저트"
const val CATEGORY_BEVERAGE = "음료"


enum class DecemberMenuItem(
    override val category: String,
    override val menuName: String,
    override val price: Int
) : WoowaMenuItem {

    APPETIZER_MUSHROOM_SOUP(CATEGORY_APPETIZER, "양송이수프", 6_000),
    APPETIZER_TAPAS(CATEGORY_APPETIZER, "타파스", 5_500),
    APPETIZER_CAESAR_SALAD(CATEGORY_APPETIZER, "시저샐러드", 8_000),

    MAIN_T_BONE_STEAK(CATEGORY_MAIN, "티본스테이크", 55_000),
    MAIN_BBQ_RIB(CATEGORY_MAIN, "바비큐립", 54_000),
    MAIN_SEAFOOD_PASTA(CATEGORY_MAIN, "해산물파스타", 35_000),
    MAIN_CHRISTMAS_PASTA(CATEGORY_MAIN, "크리스마스파스타", 25_000),

    DESSERT_CHOCO_CAKE(CATEGORY_DESSERT, "초코케이크", 15_000),
    DESSERT_ICE_CREAM(CATEGORY_DESSERT, "아이스크림", 5_000),

    BEVERAGE_ZERO_COKE(CATEGORY_BEVERAGE, "제로콜라", 3_000),
    BEVERAGE_RED_WINE(CATEGORY_BEVERAGE, "레드와인", 60_000),
    BEVERAGE_CHAMPAGNE(CATEGORY_BEVERAGE, "샴페인", 25_000)
}