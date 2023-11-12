package christmas.event

interface WoowaEvent {
    val benefit: Int
    fun execute(eventPlanner: EventPlanner)
}
