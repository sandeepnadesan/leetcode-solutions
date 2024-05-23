int commonFactors(int a, int b) {
    int count=0;
    
    int min;
    if(a<b){
        min=a;
    }
    else{
        min=b;
    }
    int i=1;
    while(i<=min){
        if(a%i==0&&b%i==0){
            count++;    
        }
        i++;
    }
    return count;
}
