class Solution {
    public int[] twoSum(int[] n1, int t) {
        int n=n1.length;
        int res[]=new int[2];
        int l=0;
        int r=n-1;
        while(l!=r){
            int re=n1[l]+n1[r];
            if(re==t){
                res[0]=l+1;
                res[1]=r+1;
                return res;
            }
            else if(re>t){
                r--;
            }
            else{
                l++;
            }
        }
        return n1;
    }
}
