package christmas.event

import christmas.menu.DecemberMenuItem
import christmas.planner.EventPlanner

class PromotionEvent() : WoowaEvent {

    override val benefit: Int = -25_000
    private val promotion =
        Pair(DecemberMenuItem.BEVERAGE_CHAMPAGNE.menuName, DecemberMenuItem.BEVERAGE_CHAMPAGNE.price)

    override fun execute(eventPlanner: EventPlanner) {
        eventPlanner.promotionMenu = promotion
        eventPlanner.parsedOrders += listOf(promotion)
    }
}
