package me.srodrigo.roman_kata

import org.junit.Assert
import org.junit.Test

class RomanNumbersTest {

    @Test fun testOne() {
        Assert.assertEquals(1, romanToArabic("I"));
    }

    @Test fun testFive() {
        Assert.assertEquals(5, romanToArabic("V"));
    }

    @Test fun testTen() {
        Assert.assertEquals(10, romanToArabic("X"));
    }

    @Test fun testFifty() {
        Assert.assertEquals(50, romanToArabic("L"));
    }

    @Test fun testHundred() {
        Assert.assertEquals(100, romanToArabic("C"));
    }

    @Test fun testFiveHundred() {
        Assert.assertEquals(500, romanToArabic("D"));
    }

    @Test fun testThousand() {
        Assert.assertEquals(1000, romanToArabic("M"));
    }
}
