int findTheWinner(int n, int k) {
    int position = 0; 
    for (int i = 2; i <= n; i++) {    
        position = (position + k) % i; 
    }
    int c= position+1;
    return c; 
}
