int sumOfTheDigitsOfHarshadNumber(int x) {
    int rem=0,sum=0;
    int y=x;

    while(x!=0)
    {
        rem=x%10;
        sum+=rem;
        x/=10;
    } 
    if(y%sum==0){
        return sum;
    }
    else{
        return -1;
    }
    
}
