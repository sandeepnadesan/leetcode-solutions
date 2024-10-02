class Solution {
    public boolean isSameAfterReversals(int n) {
        if(n<10)return true;

        int reverse=0;
        int temp=n;
        while( n>0)
        {
            reverse=reverse*10+n%10;
            n/=10;
        }
        
        int reverse1=0;
         while( reverse>0)
        {
            reverse1=reverse1*10+reverse%10;
            reverse/=10;
        }
        return reverse1==temp;
    }
}
