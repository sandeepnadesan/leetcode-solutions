int countPrimes(int n) {
    if (n <= 2) {
        return 0;
    }
    
    bool *isPrime = (bool *)malloc(n * sizeof(bool));
    memset(isPrime, true, n * sizeof(bool));

    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) {
            count++;
        }
    }

    free(isPrime);

    return count;
}
