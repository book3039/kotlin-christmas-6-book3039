package christmas.event

import christmas.menu.DecemberMenuItem
import christmas.planner.EventPlanner

private const val PROMOTION_EVENT = "증정 이벤트"

class PromotionEvent : WoowaEvent {
    override val eventName: String = PROMOTION_EVENT
    override val benefit: Int = DecemberMenuItem.BEVERAGE_CHAMPAGNE.price * -1
    private var totalCount = 1
    private val promotion =
        Pair(DecemberMenuItem.BEVERAGE_CHAMPAGNE.menuName, totalCount)

    override fun execute(eventPlanner: EventPlanner) {
        EventPlanner.promotionMenu = promotion
    }
}
