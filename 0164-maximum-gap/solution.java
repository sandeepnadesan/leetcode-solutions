class Solution {
    public int maximumGap(int[] nums) {
        int a=nums.length;
        
        if(a<2){
            System.out.println("0");

        }
        else{

        Arrays.sort(nums);
        
        int maxGap = 0;
        
        for (int i = 1; i < a; i++) {
            int gap = nums[i] - nums[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        
        return maxGap;
    }
    return 0;   
}
}
