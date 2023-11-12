package christmas.menu

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DecemberMenuTest {

    private val decemberMenu = DecemberMenu()


    @Test
    fun `메뉴 이름을 입력하면, 가격을 반환한다_값 양송이수프`() {
        assertThat(decemberMenu.findPrice("양송이수프")).isEqualTo(6_000)
    }

    @Test
    fun `메뉴 이름을 입력하면, 가격을 반환한다_값 티본스테이크`() {
        assertThat(decemberMenu.findPrice("티본스테이크")).isEqualTo(55_000)
    }

    @Test
    fun `메뉴 이름을 입력하면, 가격을 반환한다_값 초코케이크`() {
        assertThat(decemberMenu.findPrice("초코케이크")).isEqualTo(15_000)
    }

    @Test
    fun `메뉴 이름을 입력하면, 가격을 반환한다_값 제로콜라`() {
        assertThat(decemberMenu.findPrice("제로콜라")).isEqualTo(3_000)
    }

}