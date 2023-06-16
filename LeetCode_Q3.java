package Assign.java;

 class Solution {
    public int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;
        
        // Apply modular exponentiation for each digit in b
        for (int i = 0; i < b.length; i++) {
            // Calculate a^10 mod mod since the maximum digit value is 10
            int pow10 = 1;
            for (int j = 0; j < 10; j++) {
                pow10 = (pow10 * a) % mod;
            }
            
            // Calculate a^b[i] mod mod using modular exponentiation
            int digit = 0;
            for (int j = 0; j < b[i]; j++) {
                digit = (digit + pow10) % mod;
            }
            
            // Update the result by multiplying with the current digit value
            result = (result * digit) % mod;
        }
        
        return result;
    }
}

public class LeetCode_Q3 {
    public static void main(String[] args) {
        
    }
    
}
