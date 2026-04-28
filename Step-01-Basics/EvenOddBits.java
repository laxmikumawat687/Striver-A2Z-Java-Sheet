// Problem: Number of Even and Odd Bits
// LeetCode: https://leetcode.com/problems/number-of-even-and-odd-bits/
// Difficulty: Easy
// Time Complexity: O(log n)
// Space Complexity: O(1)

// Intuition: Check each bit one by one from right to left using bit
// shifting. n&1 checks last bit, n>>1 moves to next bit.
// Every number is already binary inside computer — no conversion needed.

class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int index = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n = n >> 1;
            index++;
        }

        return new int[]{even, odd};
    }
}
