package com.arydz.leetcode;

import java.util.Objects;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode first = new ListNode();
        if (list1.val < list2.val) {
            first.val = list1.val;
            list1 = list1.next;
        } else {
            first.val = list2.val;
            list2 = list2.next;
        }
        ListNode tail = new ListNode(101);
        first.next = tail;

        while (true) {

            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    if (list1.val < tail.val) {
                        tail.val = list1.val;
                        list1 = list1.next;
                    }
                } else {
                    if (list2.val < tail.val) {
                        tail.val = list2.val;
                        list2 = list2.next;
                    }
                }
            } else if (list1 != null) {
                if (list1.val < tail.val) {
                    tail.val = list1.val;
                    list1 = list1.next;
                }
            } else {
                if (list2.val < tail.val) {
                    tail.val = list2.val;
                    list2 = list2.next;
                }
            }

            if (list1 == null && list2 == null) {
                break;
            }
            tail.next = new ListNode(101);
            tail = tail.next;
        }

        return first;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ListNode)) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "val=" + val;
        }
    }
}



