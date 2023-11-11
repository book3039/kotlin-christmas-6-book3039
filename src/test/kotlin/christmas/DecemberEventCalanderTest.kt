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
}