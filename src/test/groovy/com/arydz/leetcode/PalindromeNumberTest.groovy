package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class PalindromeNumberTest extends Specification {

    PalindromeNumber palindromeNumber = new PalindromeNumber()

    @Unroll
    def "test isPalindrome"() {
        expect:
        expected == palindromeNumber.isPalindrome(x)
        where:
        x           | expected
        -2147483648 | false
        0           | true
        -1          | false
        121         | true
        -121        | false
        10          | false
    }
}
