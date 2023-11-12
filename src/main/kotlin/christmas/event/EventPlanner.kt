package christmas.event

class EventPlanner {
    fun parseMenu(orders: String): List<Pair<String, Int>> {
        return orders.split(",").map {
            val (name, count) = it.split("-")
            name to count.toInt()
        }
    }


}
