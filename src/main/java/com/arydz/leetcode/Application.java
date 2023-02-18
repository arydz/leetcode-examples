package com.arydz.leetcode;

public class Application {

    public static void main(String... args) {

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 1, 1});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2});
        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 1, 1});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 1, 2, 3, 4});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 2, 3, 4});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{-1, -1, 0, 1, 2});
//        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 0, 3});
        System.out.println(result);
    }
}
