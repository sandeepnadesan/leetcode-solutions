class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int in=1,dc=1,ml=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                in++;
                dc=1;
            }
            else if(nums[i]<nums[i-1]){
                dc++;
                in=1;
            }
            else{
                in=1;
                dc=1;
            }
            ml=Math.max(ml,Math.max(in,dc));
        }
        return ml;

    }
}
