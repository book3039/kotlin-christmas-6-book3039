package christmas.planner

import christmas.planner.EventPlanner
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventPlannerTest {

    val eventPlanner = EventPlanner()

    @Test
    fun `입력 받은 메뉴를 (메뉴이름, 갯수) 형태로 바꾼다`() {
        val orders = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-3"
        assertThat(eventPlanner.parseMenu(orders)).isEqualTo(
            listOf(
                Pair("티본스테이크", 1),
                Pair("바비큐립", 1),
                Pair("초코케이크", 2),
                Pair("제로콜라", 3),
            )
        )
    }

    @Test
    fun `입력 받은 메뉴의 할인 전 총주문 금액을 구한다_1`() {
        val orders = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1"
        assertThat(eventPlanner.calculateTotalOrderPrice(orders)).isEqualTo(142_000)
    }

    @Test
    fun `입력 받은 메뉴의 할인 전 총주문 금액을 구한다_2`() {
        val orders = "타파스-1,제로콜라-1"
        assertThat(eventPlanner.calculateTotalOrderPrice(orders)).isEqualTo(8_500)
    }
}