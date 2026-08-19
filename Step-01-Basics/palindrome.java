// Problem: Palindrome Number
// Difficulty: Easy
// Time Complexity: O(log x)
// Space Complexity: O(1)
// Intuition: Instead of converting to string, reverse only the second
// half of the number and compare with first half.
// Negative numbers are never palindrome.
// Numbers ending with 0 (except 0 itself) are never palindrome.
// Half reversal avoids overflow risk of reversing full number.

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;

        int reversed = 0;

        while (reversed < x) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}
