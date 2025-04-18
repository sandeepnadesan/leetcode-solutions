class Solution {
    public long maximumTripletValue(int[] nums) {
        long mx=0;
        int n=nums.length;
        int ml=nums[0];
        long result=0;
            for (int j=1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    long val = ((long)ml - (long)nums[j]) * nums[k];
                    result = Math.max(result, val);
                }
                ml = Math.max(ml, nums[j]);
            }
        return result;
    }
}
