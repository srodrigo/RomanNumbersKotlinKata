package me.srodrigo.roman_kata

const val ONE = 'I'
const val FIVE = 'V'
const val TEN = 'X'
const val FIFTY = 'L'
const val HUNDRED = 'C'
const val FIVE_HUNDRED = 'D'
const val THOUSAND = 'M'

private val conversion = mapOf(
        ONE to 1,
        FIVE to 5,
        TEN to 10,
        FIFTY to 50,
        HUNDRED to 100,
        FIVE_HUNDRED to 500,
        THOUSAND to 1000
)

fun romanToArabic(roman: String): Int {
    return conversion[roman.first()]!!
}
