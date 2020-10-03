package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class ReverseIntegerTest extends Specification {
    ReverseInteger reverseInteger = new ReverseInteger()

    @Unroll
    def "Test reverse integer"() {
        expect:
        expected == reverseInteger.reverse(x)
        where:
        x           | expected
        123         | 321
        -123        | -321
        120         | 21
        0           | 0
    }
}