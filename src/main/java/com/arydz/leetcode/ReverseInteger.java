package com.arydz.leetcode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Note:
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [INTEGER MAX AND INTEGER MIN].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = (result * 10) + x % 10;
			x /= 10;
		}
		if (result > Integer.MAX_VALUE) {
			return 0;
		}
		if (result < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) result;
	}
}
