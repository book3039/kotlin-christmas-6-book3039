package christmas.ui

import camp.nextstep.edu.missionutils.Console

private const val MSG_INPUT_WHEN_VISIT = "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"
private const val MSG_INPUT_TAKE_ORDER = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)"

object InputView {

    fun readDate(): Int {
        while (true) {
            try {
                println(MSG_INPUT_WHEN_VISIT)
                val input = Console.readLine()
                validateReadDate(input)
                return input.toInt()
            } catch (e: NumberFormatException) {
                println(MSG_ERR_NOT_VALID_DATE)
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    private fun validateReadDate(input: String) {
        InputValidator.run {
            checkIsDigit(input)
            checkIsEmptyString(input)
            checkCalenderRange(input)
        }
    }

    fun readOrders(): String {
        while (true) {
            try {
                println(MSG_INPUT_TAKE_ORDER)
                val input = Console.readLine()

                return input
            } catch (e: IllegalArgumentException) {
                e.message
            }
        }
    }
}