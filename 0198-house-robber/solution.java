class Solution {
    public int sol(int nums[],int i,int dp[]){
        int n=nums.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max((nums[i]+sol(nums,i+2,dp)),sol(nums,i+1,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return sol(nums,0,dp);
    }
}
