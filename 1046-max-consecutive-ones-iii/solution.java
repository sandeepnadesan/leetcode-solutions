class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int s=0;
        int l=0;
        int c=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
            
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            s=Math.max(s,i-l+1);
        }
        return s;
    }
}
