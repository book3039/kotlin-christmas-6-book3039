package christmas.badge

interface EventBadge {
    val badgeName: String
    val count: Int

    fun getPresent()
}