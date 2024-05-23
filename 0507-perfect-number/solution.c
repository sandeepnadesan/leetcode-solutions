bool checkPerfectNumber(int num) {
    int n,m,sum=0,i=1;

    while(i<=num/2)
    {
        if(num%i==0){
            sum+=i;
        }
        i++;
    }
    return sum == num;
}
