class Solution {
    public int sol(int i,int dp[],int cost[]){
        int n=cost.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=cost[i]+Math.min(sol(i+1,dp,cost),sol(i+2,dp,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(sol(0,dp,cost),sol(1,dp,cost));
    }
}
