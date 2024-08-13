class Solution {
    public int removeElement(int[] nums, int val) {
        int a=nums.length;
        int c=0;
        int b[]= new int [a];
        for(int i=0;i<a;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
           
        }
        return c;
    }
}
