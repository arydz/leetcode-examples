package com.arydz.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}
		if (x == 0) {
			return true;
		}

		List<Integer> digits = new ArrayList<>();
		while (x > 0) {
			digits.add(Math.abs(x % 10));
			x = x / 10;
		}
		int size = digits.size();
		int i = 0;
		int j = size - 1;
		while ((i < size && j > 0) && i <= j) {
			if (!digits.get(i).equals(digits.get(j))) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}
