class Solution {
    public int sol(int n, Map<Integer,Integer> dp){
        if(n<0)return 0;
        if (n==1)return 1;
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int val=sol(n-3,dp)+sol(n-2,dp)+sol(n-1,dp);
        dp.put(n,val);
        return val;
    }


    public int tribonacci(int n) {
        Map<Integer,Integer> dp = new HashMap<>();
        return sol(n,dp);
    }
}
