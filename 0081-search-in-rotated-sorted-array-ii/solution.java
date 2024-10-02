class Solution {
    public boolean search(int[] nums, int target) {
        int a=nums.length;
        
        for(int i=0;i<a;i++){
            if(nums[i]==target){
                return true;
            }
        }
         return false;


    }
   
    
}

