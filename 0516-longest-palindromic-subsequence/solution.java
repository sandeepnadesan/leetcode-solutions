class Solution {
    public int sol(int i,int j,int dp[][],String s){
        if(i>j)return 0;
        if(i==j)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+sol(i+1,j-1,dp,s);
        }
        else{
            return dp[i][j]=Math.max(sol(i+1,j,dp,s),sol(i,j-1,dp,s));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp)Arrays.fill(row,-1);
        return sol(0,n-1,dp,s);
    }
}
