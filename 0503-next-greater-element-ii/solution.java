class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] ar = new int [n*2];
        int [] ar1 = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=nums[i];
            ar[i+n]=nums[i];
        }
        for(int i=0;i<n;i++){
            ar1[i]=-1;
            for(int j=i+1;j<ar.length;j++){
                if(nums[i]<ar[j]){
                    ar1[i]=ar[j];
                    break;
                }
                
            }
        }
        return ar1;

    }
}
