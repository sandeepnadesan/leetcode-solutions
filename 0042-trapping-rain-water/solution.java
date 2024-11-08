class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] lt = new int[n];
        int[] rt = new int[n];
        int[] ans = new int[n];
        int maxl=nums[0];
        int maxr=nums[n-1];
        int s1=0,s2=0;

        for(int i=0;i<n;i++){
            if(nums[i]>maxl){
                maxl=nums[i];
            }
            lt[i]=maxl;

        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>maxr){
                maxr=nums[i];
            }
            rt[i]=maxr;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.min(lt[i],rt[i]);
        }
        for(int i=0;i<n;i++){
            s1+=ans[i];
            s2+=nums[i];
        }
        


        return s1-s2;
        
    }
}
