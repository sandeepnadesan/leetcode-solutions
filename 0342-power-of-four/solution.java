class Solution {
    public boolean isPowerOfFour(int n) {
        // Handle edge cases for negative numbers and zero
        if (n <= 0) {
            return false;
        }
        
        for(int i = 0; i < 16; i++) { // Stop at i=15 to prevent overflow
            int ans = (int) Math.pow(4, i);
            if (ans == n) {
                return true;
            }
            // If ans has overflowed, break early
            if (ans > Integer.MAX_VALUE / 4) {
                break;
            }
        }
        return false;
    }
}

