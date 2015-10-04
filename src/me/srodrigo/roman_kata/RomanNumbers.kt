package me.srodrigo.roman_kata

const val ONE = 'I'
const val FIVE = 'V'
const val TEN = 'X'
const val FIFTY = 'L'
const val HUNDRED = 'C'
const val FIVE_HUNDRED = 'D'
const val THOUSAND = 'M'

private val romanToArabicTable = mapOf(
        ONE to 1,
        FIVE to 5,
        TEN to 10,
        FIFTY to 50,
        HUNDRED to 100,
        FIVE_HUNDRED to 500,
        THOUSAND to 1000
)

private val arabicToRomanTable = mapOf(
        1 to ONE,
        5 to FIVE,
        10 to TEN,
        50 to FIFTY,
        100 to HUNDRED,
        500 to FIVE_HUNDRED,
        1000 to THOUSAND
)

fun romanToArabic(roman: String): Int {
    var arabic = 0

    var lastValue = 0
    for (c in roman.reversed()) {
        val value = romanToArabicTable[c]!!
        arabic += if (value >= lastValue) value else -value
        lastValue = value
    }

    return arabic
}

fun arabicToRoman(arabic: Int): String {
    return arabicToRomanTable[arabic]!!.toString()
}
