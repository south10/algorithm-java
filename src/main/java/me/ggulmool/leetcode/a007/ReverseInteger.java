package me.ggulmool.leetcode.a007;

/*
Given a 32-bit signed integer, reverse digits of an integer.
- Example 1:
Input: 123
Output:  321

- Example 2:
Input: -123
Output: -321

- Example 3:
Input: 120
Output: 21

 */
public class ReverseInteger {
    public int mySolution(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
            return (int) result;
        }
        return 0;
    }
}
