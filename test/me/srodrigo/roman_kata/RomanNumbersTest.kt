package me.srodrigo.roman_kata

import org.junit.Assert
import org.junit.Test

class RomanNumbersTest {

    @Test fun one() {
        Assert.assertEquals(1, romanToArabic("I"))
    }

    @Test fun five() {
        Assert.assertEquals(5, romanToArabic("V"))
    }

    @Test fun ten() {
        Assert.assertEquals(10, romanToArabic("X"))
    }

    @Test fun fifty() {
        Assert.assertEquals(50, romanToArabic("L"))
    }

    @Test fun hundred() {
        Assert.assertEquals(100, romanToArabic("C"))
    }

    @Test fun fiveHundred() {
        Assert.assertEquals(500, romanToArabic("D"))
    }

    @Test fun thousand() {
        Assert.assertEquals(1000, romanToArabic("M"))
    }

    @Test fun two() {
        Assert.assertEquals(2, romanToArabic("II"))
    }

    @Test fun four() {
        Assert.assertEquals(4, romanToArabic("IV"))
    }

    @Test fun seven() {
        Assert.assertEquals(7, romanToArabic("VII"))
    }

    @Test fun eleven() {
        Assert.assertEquals(11, romanToArabic("XI"))
    }

    @Test fun twenty() {
        Assert.assertEquals(20, romanToArabic("XX"))
    }

    @Test fun twentyFive() {
        Assert.assertEquals(25, romanToArabic("XXV"))
    }

    @Test fun twentyForty() {
        Assert.assertEquals(40, romanToArabic("XL"))
    }

    @Test fun ninetyOne() {
        Assert.assertEquals(99, romanToArabic("XCIX"))
    }

    @Test fun sixHundredAndSix() {
        Assert.assertEquals(666, romanToArabic("DCLXVI"))
    }

    @Test fun thousandFourHandredAndFortyFour() {
        Assert.assertEquals(1444, romanToArabic("MCDXLIV"))
    }

    @Test fun thousandNineHundredAndNinetyNine() {
        Assert.assertEquals(1999, romanToArabic("MCMXCIX"))
    }

    @Test fun twoThousandAndNine() {
        Assert.assertEquals(2009, romanToArabic("MMIX"))
    }

    @Test fun threeThousandFourHundredAndNinetyNine() {
        Assert.assertEquals(3499, romanToArabic("MMMCDXCIX"))
    }
}
