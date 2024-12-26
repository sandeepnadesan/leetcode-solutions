public class Solution {
    int c;
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        news(nums, 0, 0, target);
        return c;
    }
    void news(int[] nums, int idx, int sum, int target){
        if(idx==nums.length){
            if(sum==target){
                c++;
            }
            return;
        }
        news(nums, idx+1, sum+nums[idx], target);
        news(nums, idx+1, sum-nums[idx], target);
    }

}
