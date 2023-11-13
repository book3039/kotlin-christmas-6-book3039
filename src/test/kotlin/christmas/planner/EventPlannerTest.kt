package christmas.planner

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventPlannerTest {

    private val orders = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1"
    private val eventPlanner = EventPlanner(3, orders)

    @Test
    fun `입력 받은 메뉴를 (메뉴이름, 갯수) 형태로 바꾼다`() {
        assertThat(eventPlanner.parseMenu(orders)).isEqualTo(
            listOf(
                Pair("티본스테이크", 1),
                Pair("바비큐립", 1),
                Pair("초코케이크", 2),
                Pair("제로콜라", 1),
            )
        )
    }

    @Test
    fun `입력 받은 메뉴의 할인 전 총주문 금액을 구한다_1`() {
        assertThat(eventPlanner.calculateTotalOrderPrice(orders)).isEqualTo(142_000)
    }

    @Test
    fun `입력 받은 메뉴의 할인 전 총주문 금액을 구한다_2`() {
        val otherOrders = "타파스-1,제로콜라-1"
        val otherEventPlanner = EventPlanner(26, otherOrders)
        assertThat(otherEventPlanner.calculateTotalOrderPrice(otherOrders)).isEqualTo(8_500)
    }

    @Test
    fun `입력 받은 날짜와 메뉴의 혜택 금액을 구한다`() {
        eventPlanner.executeEvents()
        assertThat(eventPlanner.calculateTotalBenefitAmount()).isEqualTo(-31_246)
    }

}