class Solution {
    public int missingNumber(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<=nums.length;i++){
            s1+=i;
        }
        for(int i=0;i<nums.length;i++){
            s2+=nums[i];
        }
        return s1-s2;
    }
}
