package christmas.event

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventPlannerTest {

    @Test
    fun `입력 받은 메뉴를 (메뉴이름, 갯수) 형태로 바꾼다`() {
        val eventPlanner = EventPlanner()
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
}