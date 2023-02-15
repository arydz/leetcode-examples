package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class ValidParenthesesTest extends Specification {

    ValidParentheses validParentheses = new ValidParentheses()

    @Unroll
    def "Test roman to integer"() {
        expect:
        expected == validParentheses.isValid(x)
        where:
        x          | expected
        "([)]"     | false
        "(){}[]"   | true
        "(()){}[]" | true
        "("        | false
        "}"        | false
        "(]"       | false
        "[]"       | true
    }
}
