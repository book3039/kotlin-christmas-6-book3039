package christmas.ui

import camp.nextstep.edu.missionutils.Console

private const val MSG_INPUT_WHEN_VISIT = "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)"
private const val MSG_INPUT_TAKE_ORDER = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)"

private const val MSG_ERR_NOT_VALID_DATE = "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요."
private const val MSG_ERR_NOT_VALID_ORDER = "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."

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
                println(MSG_ERR_NOT_VALID_ORDER)
            }
        }
    }

    private fun validateReadDate(input: String) {
        InputValidator.checkDateMatchRegex(input)
        InputValidator.checkCalenderRange(input)
    }

    fun readOrders(): String {
        while (true) {
            try {
                println(MSG_INPUT_TAKE_ORDER)
                val input = Console.readLine()
                validateReadOrders(input)
                return input
            } catch (e: NumberFormatException) {
                println(MSG_ERR_NOT_VALID_ORDER)
            } catch (e: IllegalArgumentException) {
                println(MSG_ERR_NOT_VALID_ORDER)
            }
        }
    }

    private fun validateReadOrders(input: String) {
        val menuNames = mutableListOf<String>()
        var totalCount = 0
        input.split(",").map {
            InputValidator.checkMenuNameMatchRegex(it)

            val (name, count) = it.split("-")
            validateEachOrder(name, count)
            require(!menuNames.contains(name))
            menuNames.add(name)
            totalCount += count.toInt()
        }
        require(totalCount <= 20)
        InputValidator.checkIsOnlyBeverage(menuNames)
    }

    private fun validateEachOrder(name: String, count: String) {
        InputValidator.checkMenuExist(name)
        InputValidator.checkMenuCountRange(count)
    }
}