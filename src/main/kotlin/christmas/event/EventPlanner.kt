package christmas.event

import christmas.menu.DecemberMenu

class EventPlanner {
    fun parseMenu(orders: String): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }

    fun calculateTotalOrderPrice(orders: String): Int =
        parseMenu(orders).sumOf { DecemberMenu().calculatePrice(it)}
}
