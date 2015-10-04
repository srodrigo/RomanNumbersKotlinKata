package me.srodrigo.roman_kata

import org.junit.Assert
import org.junit.Test

class RomanNumbersTest {

    @Test fun testOne() {
        Assert.assertEquals(1, romanToArabic("I"));
    }
}
