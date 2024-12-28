class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        if(nums[0]<nums[r])
            return nums[0];
        while(l<=r){
            int mid =(l+r)/2;
            if(nums[mid]>nums[n-1]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        } 
        return nums[l];
    }
}
