package Assign.java;

class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
    }
}

public class LeetCode_Q2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 16;
        boolean result = solution.isPowerOfFour(n);
        System.out.println(result);
    }
}
