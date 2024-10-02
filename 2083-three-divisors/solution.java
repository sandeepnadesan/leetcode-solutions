class Solution {
    public boolean isThree(int N) {
         if(N==1) return false;
        int x=(int)Math.sqrt(N);
    if(x*x==N)
    {
        for(int i=2;i<x;i++)
        {
            if(N%i==0)
            {
                return false;
            }
           
        }
        return true;
    }else
    {
        return false;
    }
    }
}

