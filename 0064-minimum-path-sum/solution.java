class Solution {
    public int sol(int i,int j,int n,int m,int[][]grid,int dp[][] ){
        if(i>=n||j>=m)return Integer.MAX_VALUE;
        if(i==n-1&&j==m-1)return grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=grid[i][j]+ Math.min(sol(i+1,j,n,m,grid,dp),sol(i,j+1,n,m,grid,dp));

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]= new int [n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return sol(0,0,n,m,grid,dp);
    }
}
