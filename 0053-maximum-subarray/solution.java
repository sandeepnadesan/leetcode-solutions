class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0]
        ;
        int cur=0;
        for(int i=0;i<n;i++){
            cur+=nums[i];
            if(cur>max){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
}
