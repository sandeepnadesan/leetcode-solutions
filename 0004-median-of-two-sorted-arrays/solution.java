class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []temp=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            temp[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            temp[k++]=nums2[i];
        }
        Arrays.sort(temp);
        
        if(temp.length%2==0)
        {
            return ((double)temp[temp.length/2]+(double)temp[temp.length/2-1])/2.0;
        }
        else
        {
            return (double)(temp[temp.length/2]);
        }
    }
}
