bool judgeSquareSum(int c) {
    if (c < 0) return false;
    
    long long left = 0;
    long long right = (long long)sqrt(c);
    
    while (left <= right) {
        long long sum = left * left + right * right;
        if (sum == c) {
            return true;
        } else if (sum < c) {
            left++;
        } else {
            right--;
        }
    }
    
    return false;
}

