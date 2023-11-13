package christmas.ui

import camp.nextstep.edu.missionutils.Console

object InputView {

    fun readDate(): Int {
        while (true) {
           try {
               println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)")
               val input = Console.readLine()
               InputValidator
                   .checkIsDigit(input)
                   .checkIsEmptyString(input)
               return input.toInt()
           } catch (e: IllegalArgumentException) {
               e.message
           }
        }
    }

}