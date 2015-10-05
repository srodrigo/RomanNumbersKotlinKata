package me.srodrigo.roman_kata

fun romanToArabic(roman: String): Int {
    var arabic = 0

    var lastValue = 0
    for (romanChar in roman.reversed()) {
        val romanNumeral = romanChar.toString().toRomanNumeral()
        val value = romanNumeral.value
        arabic += if (value >= lastValue) value else -value
        lastValue = value
    }

    return arabic
}

fun arabicToRoman(arabic: Int): String {
    var processor = ArabicNumbersProcessor(arabic)
    while (processor.canConsume()) {
        val remaining = processor.remaining
        try {
            val exactNumeral = remaining.toRomanNumeral()
            processor.consume(exactNumeral)
            break;
        } catch (e: IllegalArgumentException) {
            val upperNumeral = remaining.upperRomanNumeral()
            if (remaining > upperNumeral.value) {
                processor.consume(upperNumeral)
            } else {
                val previousSubNumeral = upperNumeral.previousSubtraction()
                val difference = upperNumeral.subtract(previousSubNumeral)
                if (remaining >= difference) {
                    processor.consume(previousSubNumeral.symbol + upperNumeral.symbol, difference)
                } else {
                    val previousNumeral = upperNumeral.previous()
                    if (previousNumeral.value <= remaining) {
                        processor.consume(previousNumeral)
                    } else {
                        processor.consume(previousSubNumeral)
                    }
                }
            }
        }
    }

    return processor.buildRoman()
}
