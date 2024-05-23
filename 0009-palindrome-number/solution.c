bool isPalindrome(int x) {
    long int m=0,n;
    int y=x;
    while(x>0){
        n=x%10;
        m=m*10+n;
        x=x/10;
    }
    if(m==y){
        return true;
    }
    else{
        return false;
    }
}
