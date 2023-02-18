package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class RemoveDuplicatesFromSortedArrayTest extends Specification {

    RemoveDuplicatesFromSortedArray duplicates = new RemoveDuplicatesFromSortedArray()

    @Unroll
    def "test RemoveDuplicates"() {
        expect:
        expected == duplicates.removeDuplicates(x)
        where:
        x                                       | expected
        [1, 1, 1, 1, 1, 1, 1, 1] as int[]       | 1
        [1, 1, 2] as int[]                      | 2
        [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] as int[] | 5
        [0, 1, 1] as int[]                      | 2
        [0, 1, 2, 3, 4] as int[]                | 5
        [0, 1, 2, 3, 4] as int[]                | 5
        [1, 2, 3, 4] as int[]                   | 4
        [-1, -1, 0, 1, 2] as int[]              | 4
        [0, 0, 0, 3] as int[]                   | 2
    }
}
