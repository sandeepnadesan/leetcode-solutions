class Solution {
    public int[] getFinalState(int[] nums, int k, int mu) {
        int a=nums.length;
        for(int i=0;i<k;i++){
            int min=nums[0];
            int minIndex = 0;
            for(int j=0;j<a;j++){
                if(nums[j]<min){
                    min=nums[j];
                    minIndex = j;
                    
                }
            }
            nums[minIndex]*=mu;
        }
        return nums;
    }
}
