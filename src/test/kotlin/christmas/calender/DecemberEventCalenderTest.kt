package christmas.calender

import christmas.event.ChristmasDdayEvent
import christmas.event.SpecialEvent
import christmas.event.WeekDayEvent
import christmas.event.WeekEndEvent
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class DecemberEventCalenderTest {

    private val weekDayEventCalender = DecemberEventCalender(3)
    private val weekEndEventCalender = DecemberEventCalender(2)
    private val testCalender = DecemberEventCalender(1)

    @Test
    fun `23년 12월의 날짜를 입력 받으면 평일인지 주말인지 구분한다_값 3`() {
        assertThat(weekDayEventCalender.getDayType()).isEqualTo("평일")
    }

    @Test
    fun `23년 12월의 날짜를 입력 받으면 평일인지 주말인지 구분한다_값 2`() {
        assertThat(weekEndEventCalender.getDayType()).isEqualTo("주말")
    }

    @Test
    fun `입력 받은 날짜가 평일이면, 평일 이벤트 객체를 생성해서 반환한다`() {
        val result = weekDayEventCalender.createDayTypeEvent()
        assertTrue(result is WeekDayEvent)
    }

    @Test
    fun `입력 받은 날짜가 주말이면, 주말 이벤트 객체를 생성해서 반환한다`() {
        val result = weekEndEventCalender.createDayTypeEvent()
        assertTrue(result is WeekEndEvent)
    }

    @Test
    fun `23년 12월 특정 요일의 날짜들을 모두 반환한다`() {
        assertThat(testCalender.findDateByDayName("MONDAY")).isEqualTo(listOf(4, 11, 18, 25))
    }

    @ValueSource(ints = [3, 10, 17, 24, 25, 31])
    @ParameterizedTest
    fun `이벤트 달력에 별이 있는 날짜인지 확인한다`(input: Int) {
        val testCalender = DecemberEventCalender(input)
        assertTrue(testCalender.hasStar())
    }

    @Test
    fun `23년 12월의 날짜를 입력하면 해당하는 날짜 관련 이벤트를 모두 반환한다`() {
        val testCalender = DecemberEventCalender(3)
        val result = testCalender.createDecemberEvents()
        assertTrue(
            result.all {
                it is ChristmasDdayEvent || it is WeekDayEvent || it is SpecialEvent
            })
    }
}