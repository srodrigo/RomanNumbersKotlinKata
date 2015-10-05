package me.srodrigo.roman_kata

fun String.toRomanNumeral(): RomanNumeral {
    for (numeral in RomanNumeral.values()) {
        if (this.equals(numeral.symbol)) {
            return numeral
        }
    }
    throw IllegalArgumentException("Cannot convert $this to RomanNumeral")
}

fun Int.toRomanNumeral(): RomanNumeral {
    for (numeral in RomanNumeral.values()) {
        if (this.equals(numeral.value)) {
            return numeral
        }
    }
    throw IllegalArgumentException("Cannot convert $this to RomanNumeral")
}

fun Int.upperRomanNumeral(): RomanNumeral {
    for (numeral in RomanNumeral.values()) {
        if (numeral.value > this) {
            return numeral
        }
    }
    return RomanNumeral.THOUSAND
}
