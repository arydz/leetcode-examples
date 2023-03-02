package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class RemoveElementTest extends Specification {

    RemoveElement removeElement = new RemoveElement()

    @Unroll
    def "test removeElement"() {
        expect:
        expected == removeElement.removeElement(x, y)
        where:
        x                                 | y | expected
        [3, 2, 2, 3] as int[]             | 3 | 2
        [2] as int[]                      | 3 | 1
        [0, 1, 2, 2, 3, 0, 4, 2] as int[] | 2 | 5
    }
}
