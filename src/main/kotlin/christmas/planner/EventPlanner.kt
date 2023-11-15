package christmas.planner

import christmas.badge.SantaBadge
import christmas.badge.StarBadge
import christmas.badge.TreeBadge
import christmas.calender.DecemberEventCalender
import christmas.event.PromotionEvent
import christmas.event.WoowaEvent
import christmas.menu.DecemberMenu

private const val NONE = "없음"
private const val MIN_PRICE_FOR_EVENT_DISCOUNT = 10_000
private const val MIN_PRICE_FOR_PROMOTION_EVENT = 120_000
private const val MIN_PRICE_FOR_STAR_BADGE = 5_000
private const val MIN_PRICE_FOR_TREE_BADGE = 10_000
private const val MIN_PRICE_FOR_SANTA_BADGE = 20_000

class EventPlanner(date: Int, private val orders: String) {

    private val events: List<WoowaEvent> = setEvents(date, orders)

    private fun setEvents(date: Int, orders: String): List<WoowaEvent> {
        if (calculateTotalOrderPrice(orders) < MIN_PRICE_FOR_EVENT_DISCOUNT) return emptyList()

        val tempEvents = DecemberEventCalender(date).createDecemberEvents().toMutableList()
        if (calculateTotalOrderPrice(orders) >= MIN_PRICE_FOR_PROMOTION_EVENT) tempEvents += listOf(PromotionEvent())

        return tempEvents
    }

    fun parseMenu(orders: String = this.orders): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun executeEvents() {
        for (event in events) event.execute(this)
    }

    fun createBenefitDetail(): List<Pair<String, Int>> = events.map { it.eventName to it.benefit }

    fun calculateTotalOrderPrice(orders: String = this.orders): Int {
        val decemberMenu = DecemberMenu()
        return parseMenu(orders).sumOf { decemberMenu.calculatePrice(it) }
    }

    fun calculateTotalBenefitAmount(): Int = events.sumOf { it.benefit }

    fun calculateEstimatedPayment(): Int =
        calculateTotalOrderPrice(orders) + events.filterNot { it is PromotionEvent }.sumOf { it.benefit }

    fun awardBadge(): String {
        val positiveTotalBenefit = (calculateTotalBenefitAmount() * -1)

        if (positiveTotalBenefit in MIN_PRICE_FOR_STAR_BADGE until MIN_PRICE_FOR_TREE_BADGE)
            return StarBadge().badgeName
        if (positiveTotalBenefit in MIN_PRICE_FOR_TREE_BADGE until MIN_PRICE_FOR_SANTA_BADGE)
            return TreeBadge().badgeName
        if (positiveTotalBenefit >= MIN_PRICE_FOR_SANTA_BADGE)
            return SantaBadge().badgeName

        return NONE
    }

    companion object {
        var promotionMenu: Pair<String, Int> = NONE to 0

        fun menuInformation() = DecemberMenu()
    }
}
