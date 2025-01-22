class Solution {
    public int sol(int i,int j,int dp[][],List<List<Integer>> t){
        int n=t.size();
        if(i>=n)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=t.get(i).get(j)+Math.min(sol(i+1,j,dp,t),sol(i+1,j+1,dp,t));
    }
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();

        // int m=t[0].size();
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp)Arrays.fill(row,-1);
        return sol(0,0,dp,t);
    }

}
