package com.arydz.leetcode

import spock.lang.Specification
import spock.lang.Unroll

class MergeTwoSortedListsTest extends Specification {

    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists()

    @Unroll
    def "test mergeTwoLists"() {
        expect:
        expected == mergeTwoSortedLists.mergeTwoLists(x, y)
        where:
        x                          | y                         | expected
        createNodeList([1, 3, 10]) | createNodeList([2, 4, 5]) | createNodeList([1, 2, 3, 4, 5, 10])
        createNodeList([5])        | createNodeList([1, 2, 4]) | createNodeList([1, 2, 4, 5])
    }

    MergeTwoSortedLists.ListNode createNodeList(List<Integer> list) {

        MergeTwoSortedLists.ListNode first = new MergeTwoSortedLists.ListNode(list.get(0))
        if (list.size() > 1) {
            MergeTwoSortedLists.ListNode tail = new MergeTwoSortedLists.ListNode()
            first.next = tail
            for (int i = 1; i < list.size(); i++) {
                tail.val = list.get(i)
                if (i < list.size() - 1) {
                    tail.next = new MergeTwoSortedLists.ListNode()
                    tail = tail.next
                }
            }
        }
        return first
    }
}
