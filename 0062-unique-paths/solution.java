class Solution {
    public int sol(int i,int j,int dp[][],int m,int n){
        if(i>=m||j>=n){
            return 0;
        }
        if(i==m-1&&j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=sol(i+1,j,dp,m,n)+sol(i,j+1,dp,m,n);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return sol(0,0,dp,m,n);
    }
}
