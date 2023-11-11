package christmas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class DecemberEventCalanderTest {

    @Test
    fun `23년 12월의 날짜를 입력 받으면 평일인지 주말인지 구분한다_값 4`() {
        val testCalander = DecemberEventCalander(4)
        assertThat(testCalander.daytype()).isEqualTo("평일")
    }

    @Test
    fun `23년 12월의 날짜를 입력 받으면 평일인지 주말인지 구분한다_값 3`() {
        val testCalander = DecemberEventCalander(3)
        assertThat(testCalander.daytype()).isEqualTo("주말")
    }

    @Test
    fun `입력 받은 날짜가 평일이면, 평일 이벤트 객체를 생성해서 반환한다`() {
        val testCalander = DecemberEventCalander(4)
        val result = testCalander.createDaytypeEvent()
        assertTrue(result is WeekDayEvent)
    }

    @Test
    fun `입력 받은 날짜가 주말이면, 주말 이벤트 객체를 생성해서 반환한다`() {
        val testCalander = DecemberEventCalander(3)
        val result = testCalander.createDaytypeEvent()
        assertTrue(result is WeekEndEvent)
    }

    @Test
    fun `23년 12월 특정 요일의 날짜들을 모두 반환한다`() {
        val testCalander = DecemberEventCalander(3)
        val days = testCalander.findDateByDayName("MONDAY")
        assertThat(days).isEqualTo(listOf(4, 11, 18, 25))
    }

}