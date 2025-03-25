class Solution {
    public int numberOfMatches(int n) {
        int m=0;
        int t=0;
        while(n>1){
            m=n/2;
            t+=m;       
            n-=m;
        }
        return t;
    }
}
