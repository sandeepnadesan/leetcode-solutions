class Solution {
    public int[] getMaximumXor(int[] nums, int t) {
        int s=((int)Math.pow(2,t)-1);
        int n= nums.length;
        int [] ans = new int[n];
        int xv=0;
        for(int i=0;i<n;i++){
            xv^=nums[i];
        }
        int k=0;
        for(int i=n-1;i>=0;i--){
            ans[k++]=xv^s;
            xv^=nums[i];
        }
        return ans;

    }
}
