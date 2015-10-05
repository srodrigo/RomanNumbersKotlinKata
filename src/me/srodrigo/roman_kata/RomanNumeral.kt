package me.srodrigo.roman_kata

enum class RomanNumeral(val symbol: String, val value: Int) {
    ONE("I", 1),
    FIVE("V", 5),
    TEN("X", 10),
    FIFTY("L", 50),
    HUNDRED("C", 100),
    FIVE_HUNDRED("D", 500),
    THOUSAND("M", 1000);

    fun previous(): RomanNumeral = values()[this.ordinal() - 1]

    fun previousSubtraction(): RomanNumeral {
        val index = ordinal() - if (this.isFiveType()) 1 else 2
        return if (index >= 0) values()[index] else ONE
    }

    fun subtract(other: RomanNumeral): Int = this.value - other.value

    private fun isFiveType(): Boolean {
        return value % (5 * Math.pow(10.0, Math.log10(value.toDouble()).toInt().toDouble())) == 0.0
    }
}
