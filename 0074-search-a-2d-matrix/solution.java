class Solution {
    public boolean searchMatrix(int[][] m1, int t) {
        int m=m1.length;
        int n=m1[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int mid = (l+r)/2;
            int ri=mid/n;
            int ci=mid%n;
            if(m1[ri][ci]==t){
                return true;
            }
            else if(m1[ri][ci]>t){
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}
