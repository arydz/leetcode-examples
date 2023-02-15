package com.arydz.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder longestPrefix = new StringBuilder();

        char temp;
        String shortestStr = strs[0];
        for (int i = 0; i < shortestStr.length(); i++) {

            temp = shortestStr.charAt(i);
            int countSameChar = 0;
            for (int j = 1; j < strs.length; j++) {

                if (strs[j].charAt(i) == temp) {
                    countSameChar++;
                }
            }

            if (countSameChar == strs.length - 1) {
                longestPrefix.append(temp);
            } else {
                break;
            }
        }

        return longestPrefix.toString();
    }
}
