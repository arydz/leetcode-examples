package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class RomanToIntegerTest extends Specification {

    RomanToInteger romanToInteger = new RomanToInteger()

    @Unroll
    def "Test roman to integer"() {
        expect:
        expected == romanToInteger.romanToInt(x)
        where:
        x           | expected
        "III"       | 3
        "LVIII"     | 58
        "MCMXCIV"   | 1994
    }
}
