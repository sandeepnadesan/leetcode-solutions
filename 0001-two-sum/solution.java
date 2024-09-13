class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
		int arr1[] = new int[2];
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                    return arr1;
                    
                }
            }
        }
    return null;
    }
}
