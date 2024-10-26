class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a= nums.length;
        int res = nums[a-k];
        return res;
    }
}
