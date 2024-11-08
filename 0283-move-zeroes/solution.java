class Solution {
    public void moveZeroes(int[] a) {
        int l=0,temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                temp=a[i];
                a[i]=a[l];
                a[l]=temp;
                ++l;
            };
        }
        
        
    }
}
