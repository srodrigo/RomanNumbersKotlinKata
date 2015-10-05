package me.srodrigo.roman_kata

class ArabicNumbersProcessor(val arabic: Int) {
    private val romanNumberBuilder = StringBuilder()

    var remaining = arabic
        private set

    fun canConsume() = remaining > 0

    fun consume(romanNumeral: RomanNumeral) {
        romanNumberBuilder.append(romanNumeral.symbol)
        remaining -= romanNumeral.value
    }

    fun consume(romanNumber: String, value: Int) {
        romanNumberBuilder.append(romanNumber)
        remaining -= value
    }

    fun buildRoman(): String = romanNumberBuilder.toString()
}
