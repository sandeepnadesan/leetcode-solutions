class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0, u = 0, m = 0;

        for (int i = 0; i < nums.length; i++) {
            while ((u & nums[i]) != 0) {
                u ^= nums[l]; 
                l++;
            }

            u |= nums[i];
            m = Math.max(m, i - l + 1);
        }

        return m;
    }
}
