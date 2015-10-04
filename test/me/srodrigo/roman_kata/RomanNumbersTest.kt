package me.srodrigo.roman_kata

import org.junit.Assert
import org.junit.Test

class RomanNumbersTest {

    @Test fun testOne() {
        Assert.assertEquals(1, romanToArabic(ONE.toString()));
    }

    @Test fun testFive() {
        Assert.assertEquals(5, romanToArabic(FIVE.toString()));
    }

    @Test fun testTen() {
        Assert.assertEquals(10, romanToArabic(TEN.toString()));
    }

    @Test fun testFifty() {
        Assert.assertEquals(50, romanToArabic(FIFTY.toString()));
    }

    @Test fun testHundred() {
        Assert.assertEquals(100, romanToArabic(HUNDRED.toString()));
    }

    @Test fun testFiveHundred() {
        Assert.assertEquals(500, romanToArabic(FIVE_HUNDRED.toString()));
    }

    @Test fun testThousand() {
        Assert.assertEquals(1000, romanToArabic(THOUSAND.toString()));
    }
}
