class Solution {
    public boolean isArraySpecial(int[] nums) {
        int a = nums.length;
        if(a==1){
            return true;
        }
        for(int i=0;i<a-1;i++){
            if (nums[i] % 2 == nums[i + 1] % 2){
                return false;
            }
            
        }
        return true;
    }
}
