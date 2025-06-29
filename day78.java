public class day78 {
   
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Cases
        System.out.println(sol.myPow(2.0, 10));      // Output: 1024.0
        System.out.println(sol.myPow(2.1, 3));       // Output: ~9.261
        System.out.println(sol.myPow(2.0, -2));      // Output: 0.25
        System.out.println(sol.myPow(0.00001, 2147483647)); // Very small number
        System.out.println(sol.myPow(1.0, -2147483648));    // Edge case
    }
}

class Solution {
    public double myPow(double x, int n) {
        long N = n;  // Convert to long to handle edge case (n = -2^31)
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}

    
    

