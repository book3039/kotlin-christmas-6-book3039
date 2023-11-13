package christmas.ui

private const val DECEMBER_FIRST_DAY = 1
private const val DECEMBER_LAST_DAY = 31

const val MSG_ERR_NOT_VALID_DATE = "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요."
const val MSG_ERR_NOT_VALID_ORDER = "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."

object InputValidator {

    fun checkIsDigit(input: String) =
        require(input.all { it.isDigit() }) { MSG_ERR_NOT_VALID_DATE }


    fun checkIsEmptyString(input: String) =
        require(input.isNotEmpty()) { MSG_ERR_NOT_VALID_DATE }


    fun checkCalenderRange(input: String) =
        require(input.toInt() in DECEMBER_FIRST_DAY..DECEMBER_LAST_DAY) { MSG_ERR_NOT_VALID_DATE }
}