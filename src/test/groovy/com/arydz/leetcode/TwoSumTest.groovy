package com.arydz.leetcode


import spock.lang.Specification
import spock.lang.Unroll

class TwoSumTest extends Specification {

    TwoSum twoSum = new TwoSum()

    @Unroll
    def "Test solution for two sum"() {
        expect:
        expected == twoSum.twoSum(initArray, target)
        where:
        initArray               | target    | expected
        [2, 7, 11, 15] as int[] | 9         | [0, 1] as int[]
        [3, 2, 4] as int[]      | 6         | [1, 2] as int[]
        [3, 3] as int[]         | 6         | [0, 1] as int[]
    }
}
