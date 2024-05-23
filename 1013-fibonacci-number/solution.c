

// int fib(int n){
//     int a=0;
//     int b=1;
//     int result;
//     int i=2;
//     if(n==0){
//         return 0;
//     }
//     if(n==1){
//         return 1;
//     }
//     else{
//         return fib(n - 1) + fib(n - 2);
//     }

// }

int fib(int n){
    int a=0;
    int b=1;
    int result;
    int i=2;
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    while(i<=n){
        result=a+b;
        a=b;
        b=result;
        i++;
    }
    return result;

}
