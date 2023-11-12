package christmas.menu

enum class DecemberMenuItem(val category: String, val menuName: String, val price: Int) {

    APPETIZER_MUSHROOM_SOUP("애피타이저", "양송이수프", 6_000),
    APPETIZER_TAPAS("애피타이저", "타파스", 5_500),
    APPETIZER_CEASAR_SALAD("애피타이저", "시저샐러드", 8_000),

    MAIN_T_BONE_STEAK("메인", "티본스테이크", 55_000),
    MAIN_BBQ_RIB("메인", "바비큐립", 54_000),
    MAIN_SEAFOOD_PASTA("메인", "해산물파스타", 35_000),
    MAIN_CHRISTMAS_PASTA("메인", "크리스마스파스타", 25_000),

    DESSERT_CHOCO_CAKE("디저트", "초코케이크", 15_000),
    DESSERT_ICE_CREAM("디저트", "아이스크림", 5_000),

    BEVERAGE_ZERO_COKE("음료", "제로콜라", 3_000),
    BEVERAGE_RED_WINE("음료", "레드와인", 60_000),
    BEVERAGE_CHAMPAGNE("음료", "샴페인", 25_000)

}