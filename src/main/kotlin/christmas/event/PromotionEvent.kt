package christmas.event

import christmas.menu.DecemberMenuItem
import christmas.planner.EventPlanner

class PromotionEvent : WoowaEvent {

    override val eventName: String = "증정 이벤트"
    override val benefit: Int = -25_000
    private var totalCount = 1
    private val promotion =
        Pair(DecemberMenuItem.BEVERAGE_CHAMPAGNE.menuName, totalCount)

    override fun execute(eventPlanner: EventPlanner) {
        EventPlanner.promotionMenu = promotion
    }
}
