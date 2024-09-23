class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        
        for(int i=0;i<a;i++){
            if(nums[i]==target){
                return i;
            }
        }
         return -1;


    }
   
    
}
