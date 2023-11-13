package christmas.ui

object InputValidator {

    fun checkIsDigit(input: String): InputValidator {
        require(input.all { it.isDigit() }) { }

        return this
    }

    fun checkIsEmptyString(input: String): InputValidator {
        require(input.isNotEmpty()) { }

        return this
    }
}