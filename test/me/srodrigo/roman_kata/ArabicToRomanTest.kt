package me.srodrigo.roman_kata

import org.junit.Assert
import org.junit.Test

class ArabicToRomanTest {

    @Test fun basicNumbers() {
        Assert.assertEquals("I", arabicToRoman(1))
        Assert.assertEquals("V", arabicToRoman(5))
        Assert.assertEquals("X", arabicToRoman(10))
        Assert.assertEquals("L", arabicToRoman(50))
        Assert.assertEquals("C", arabicToRoman(100))
        Assert.assertEquals("D", arabicToRoman(500))
        Assert.assertEquals("M", arabicToRoman(1000))
    }

    @Test fun two() {
        Assert.assertEquals("II", arabicToRoman(2))
    }

    @Test fun four() {
        Assert.assertEquals("IV", arabicToRoman(4))
    }

    @Test fun seven() {
        Assert.assertEquals("VII", arabicToRoman(7))
    }

    @Test fun eleven() {
        Assert.assertEquals("XI", arabicToRoman(11))
    }

    @Test fun twenty() {
        Assert.assertEquals("XX", arabicToRoman(20))
    }

    @Test fun twentyFive() {
        Assert.assertEquals("XXV", arabicToRoman(25))
    }

    @Test fun forty() {
        Assert.assertEquals("XL", arabicToRoman(40))
    }

    @Test fun ninetyNine() {
        Assert.assertEquals("XCIX", arabicToRoman(99))
    }

    @Test fun sixHundredAndSix() {
        Assert.assertEquals("DCLXVI", arabicToRoman(666))
    }

    @Test fun thousandFourHandredAndFortyFour() {
        Assert.assertEquals("MCDXLIV", arabicToRoman(1444))
    }

    @Test fun thousandNineHundredAndNinetyNine() {
        Assert.assertEquals("MCMXCIX", arabicToRoman(1999))
    }

    @Test fun twoThousandAndNine() {
        Assert.assertEquals("MMIX", arabicToRoman(2009))
    }

    @Test fun threeThousandFourHundredAndNinetyNine() {
        Assert.assertEquals("MMMCDXCIX", arabicToRoman(3499))
    }
}
