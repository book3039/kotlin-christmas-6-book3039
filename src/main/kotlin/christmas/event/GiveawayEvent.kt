package christmas.event

import christmas.menu.DecemberMenuItem

class GiveawayEvent() : WoowaEvent {

    override val benefit: Int = -25_000

    override fun execute(eventPlanner: EventPlanner) {
        eventPlanner.parsedOrders +=
            listOf(Pair(DecemberMenuItem.BEVERAGE_CHAMPAGNE.menuName, DecemberMenuItem.BEVERAGE_CHAMPAGNE.price))
    }
}
