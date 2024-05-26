int climbStairs(int n) {
    int k,j=1,f=1;
    for(int i=1;i<n;i++){
        k=f+j;
        f=j;
        j=k;
        
    }
    return j;
}
