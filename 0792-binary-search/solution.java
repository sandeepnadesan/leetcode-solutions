class Solution {
    public int search(int[] nums, int t) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]>t){
                r--;
            }
            else{
                l++;
            }
        }
        return -1;
    }
}
