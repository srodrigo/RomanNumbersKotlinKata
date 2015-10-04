package me.srodrigo.roman_kata

const val ONE = "I"
const val FIVE = "V"
const val TEN = "X"
const val FIFTY = "L"
const val HUNDRED = "C"
const val FIVE_HUNDRED = "D"
const val THOUSAND = "M"

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
        9 to ONE + TEN,
        10 to TEN,
        90 to TEN + HUNDRED,
        50 to FIFTY,
        100 to HUNDRED,
        500 to FIVE_HUNDRED,
        900 to HUNDRED + THOUSAND,
        1000 to THOUSAND
)

fun romanToArabic(roman: String): Int {
    var arabic = 0

    var lastValue = 0
    for (c in roman.reversed()) {
        val value = romanToArabicTable[c.toString()]!!
        arabic += if (value >= lastValue) value else -value
        lastValue = value
    }

    return arabic
}

fun arabicToRoman(arabic: Int): String {
    var roman = ""

    var temp = arabic
    for (arabicMapping in arabicToRomanTable.toList().sortedByDescending { it.first }) {
        val arabicValue = arabicMapping.first
        var div = temp / arabicValue
        while (div > 0) {
            roman += arabicMapping.second
            roman = normalize(roman)

            temp -= arabicValue
            div = temp / arabicValue
        }
    }

    return roman
}

fun normalize(roman: String): String =
        roman.replace("IIII", "IV").replace("VVVV", "VX").replace("XXXX", "XL").replace("LLLL", "LC")
                .replace("CCCC", "CD").replace("DDDD", "DM")

