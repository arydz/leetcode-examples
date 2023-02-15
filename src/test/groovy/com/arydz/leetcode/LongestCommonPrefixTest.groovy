package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class LongestCommonPrefixTest extends Specification {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix()

    @Unroll
    def "Test longest common prefix"() {
        expect:
        expected == longestCommonPrefix.longestCommonPrefix(x)
        where:
        x                                                       | expected
        ["flower", "flow", "flight"] as String[]                | "fl"
        ["dog","racecar","car"] as String[]                     | ""
        ["a"] as String[]                                       | "a"
        ["cir", "car"] as String[]                              | "c"
        ["reflower", "flow", "flight"] as String[]              | ""
        ["flower", "flower", "flower", "flower"] as String[]    | "flower"
    }
}
