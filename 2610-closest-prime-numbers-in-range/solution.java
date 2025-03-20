class Solution {
    public static boolean isprime(int num) {
        if (num < 2) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // int flag=0;
        int res[] = {-1,-1};
        // int i=0;
        for(int i=left;i<=right;i++){
            if(isprime(i)){
                // flag=1;
                l1.add(i);

            }
        }
        if(l1.size()<2)return res;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < l1.size(); i++) {
            int diff = l1.get(i) - l1.get(i - 1);
            if (diff < min) {
                min = diff;
                res[0] = l1.get(i - 1);
                res[1] = l1.get(i);
            }
        }
        return  res;
    }
    
    
}
