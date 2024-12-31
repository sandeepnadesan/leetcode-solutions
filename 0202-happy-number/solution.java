class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
