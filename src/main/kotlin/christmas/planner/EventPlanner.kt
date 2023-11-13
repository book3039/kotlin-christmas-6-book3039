package christmas.planner

import christmas.badge.SantaBadge
import christmas.badge.StarBadge
import christmas.badge.TreeBadge
import christmas.calender.DecemberEventCalender
import christmas.event.PromotionEvent
import christmas.event.WoowaEvent
import christmas.menu.DecemberMenu

private const val NONE_BADGE = "없음"

class EventPlanner(private val date: Int, private val orders: String) {

    private val events: List<WoowaEvent> = setEvents(date, orders)
    lateinit var promotionMenu: Pair<String, Int>

    private fun setEvents(date: Int, orders: String): List<WoowaEvent> {
        if (calculateTotalOrderPrice(orders) < 10_000) return emptyList()

        val tempEvents = DecemberEventCalender(date).createDecemberEvents().toMutableList()
        if (calculateTotalOrderPrice(orders) >= 120_000) tempEvents += listOf(PromotionEvent())

        return tempEvents
    }

    fun parseMenu(orders: String = this.orders): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun calculateTotalOrderPrice(orders: String = this.orders): Int =
        parseMenu(orders).sumOf { DecemberMenu().calculatePrice(it) }

    fun executeEvents() {
        for (event in events) event.execute(this)
    }

    fun calculateTotalBenefitAmount(): Int = events.sumOf { it.benefit }

    fun calculateEstimatedPayment(): Int =
        calculateTotalOrderPrice(orders) + events.filterNot { it is PromotionEvent }.sumOf { it.benefit }

    fun awardBadge(): String {
        val positiveTotalBenefit = (calculateTotalBenefitAmount() * -1)

        if (positiveTotalBenefit in 5_000 until 10_000) return StarBadge().badgeName
        if (positiveTotalBenefit in 10_000 until 20_000) return TreeBadge().badgeName
        if (positiveTotalBenefit >= 20_000) return SantaBadge().badgeName

        return NONE_BADGE
    }
}
