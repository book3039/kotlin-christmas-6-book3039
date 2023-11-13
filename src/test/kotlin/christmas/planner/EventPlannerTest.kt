package christmas.planner

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventPlannerTest {

    private val orders = "티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1"
    private val eventPlanner = EventPlanner(3, orders)

    init {
        eventPlanner.executeEvents()
    }

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
    fun `입력 받은 날짜와 메뉴의 총 혜택 금액을 구한다`() {
        assertThat(eventPlanner.calculateTotalBenefitAmount()).isEqualTo(-31_246)
    }

    @Test
    fun `입력 받은 날짜와 메뉴의 할인 후 예상 결제 금액을 구한다`() {
        assertThat(eventPlanner.calculateEstimatedPayment()).isEqualTo(135_754)
    }

    @Test
    fun `할인 전 총주문 금액이 12만원 이상일 때, 샴페인 1개 증정한다`() {
        assertThat(EventPlanner.promotionMenu.first).isEqualTo("샴페인")
    }

    @Test
    fun `입력 받은 메뉴의 총 금액이 1만원 미만이면 이벤트 적용을 하지 않는다(혜택 금액이 0원)`() {
        val otherOrders = "아이스크림-1"
        val otherEventPlanner = EventPlanner(3, otherOrders)
        otherEventPlanner.executeEvents()
        assertThat(otherEventPlanner.calculateTotalBenefitAmount()).isEqualTo(0)
    }

    @Test
    fun `혜택 금액에 따라 이벤트 배지를 증정한다_값 -6,069_별 이벤트 배지 증정`() {
        val otherOrders = "아이스크림-2"
        val otherEventPlanner = EventPlanner(3, otherOrders)
        otherEventPlanner.executeEvents()
        assertThat(otherEventPlanner.awardBadge()).isEqualTo("별")
    }

    @Test
    fun `혜택 금액에 따라 이벤트 배지를 증정한다_값 -10,115_트리 이벤트 배지 증정`() {
        val otherOrders = "아이스크림-5"
        val otherEventPlanner = EventPlanner(3, otherOrders)
        otherEventPlanner.executeEvents()
        assertThat(otherEventPlanner.awardBadge()).isEqualTo("트리")
    }

    @Test
    fun `혜택 금액에 따라 이벤트 배지를 증정한다_값 -20,230_산타 이벤트 배지 증정`() {
        val otherOrders = "아이스크림-10"
        val otherEventPlanner = EventPlanner(3, otherOrders)
        otherEventPlanner.executeEvents()
        assertThat(otherEventPlanner.awardBadge()).isEqualTo("산타")
    }
}