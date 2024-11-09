long long minEnd(int n, int x) {
    long b = x;
    while (--n != 0) {
        b = (b+1) | x;
    }
    return b;
}

