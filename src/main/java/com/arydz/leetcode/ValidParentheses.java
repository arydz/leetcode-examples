package com.arydz.leetcode;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {

    // (
    private static final byte OPENING_PARENTHESIS = 40;
    // )
    private static final byte CLOSING_PARENTHESIS = 41;
    // {
    private static final byte OPENING_CURLY_BRACKET = 123;
    // }
    private static final byte CLOSING_CURLY_BRACKET = 125;
    // [
    private static final byte OPENING_SQUARE_BRACKET = 91;
    // ]
    private static final byte CLOSING_SQUARE_BRACKET = 93;

    public boolean isValid(String s) {

        if (s.length() <= 1) {
            return false;
        }

        byte[] bytes = s.getBytes();

        Stack<Byte> stack = new Stack<>();

        for (byte aByte : bytes) {
            if (OPENING_PARENTHESIS == aByte || OPENING_CURLY_BRACKET == aByte || OPENING_SQUARE_BRACKET == aByte) {
                stack.push(aByte);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Byte pop = stack.pop();
                if (CLOSING_PARENTHESIS == aByte) {
                    if (OPENING_PARENTHESIS != pop) {
                        return false;
                    }
                }
                if (CLOSING_CURLY_BRACKET == aByte) {
                    if (OPENING_CURLY_BRACKET != pop) {
                        return false;
                    }
                }
                if (CLOSING_SQUARE_BRACKET == aByte) {
                    if (OPENING_SQUARE_BRACKET != pop) {
                        return false;
                    }
                }

            }
        }

        return stack.isEmpty();
    }
}
