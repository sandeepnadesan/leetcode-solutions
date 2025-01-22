class Solution {
    public int sol(int dp[][],int m,int n,int obstacleGrid[][]){
        if(m<0||n<0)return 0;
        if(m==0&&n==0)return 1;
        if(obstacleGrid[m][n]==1)return 0;
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n]=sol(dp,m,n-1,obstacleGrid)+sol(dp,m-1,n,obstacleGrid);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int dp[][]= new int [m+1][n+1];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return sol(dp,m-1,n-1,obstacleGrid);
        
    }
}
