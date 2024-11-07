class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []ar= new int[n];
        for(int i=0;i<n;i++){
            ar[i]=-1;
            for(int j=0;i<m;j++){
                if(nums1[i] == nums2[j]){
                    for(int k=j+1;k<m;k++){
                        if(nums2[k]>nums2[j]){
                            ar[i]=nums2[k];
                            break;
                        }
                        
                    }
                    break;

                }
            }
        }
        return ar;
    }
}
