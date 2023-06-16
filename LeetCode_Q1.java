package Assign.java;

class Solution {
     public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }

        return true;
    }
}

public class LeetCode_Q1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPowerOfThree(27));
        System.out.println(s.isPowerOfThree(0));
    }
}
