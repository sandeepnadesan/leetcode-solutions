class Solution {
    public int sol(int n, int dp[]){
        if(n==0||n==1){
            return n;
        }
        return sol(n-1,dp)+sol(n-2,dp);
    }

    public int fib(int n) {
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return sol(n,dp);
    }
}
