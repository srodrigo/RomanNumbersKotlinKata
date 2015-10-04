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
}
