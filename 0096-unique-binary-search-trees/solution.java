class Solution {
  public int numTrees(int n) {
    var dp = new int[n+1];
    dp[0] = 1;

    for (var i=1; i<=n; i++)
      for (var j=0; j<i; j++)
        dp[i] += dp[j] * dp[i-1-j];
    
    return dp[n];
  }
}
