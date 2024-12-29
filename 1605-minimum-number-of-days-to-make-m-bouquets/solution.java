class Solution {
    public int minDays(int[] b, int m, int k) {
        int n = b.length;
        if (m * k > n)
            return -1;
        int fc = 0;
        int c = 0;
        int max = b[0];
        int ans=-1;
        for (int i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        int l=0;
        int r=max;
        while(l<=r) {
            int mid=(l+r)/2;
            c=0;
            fc=0;
            for (int j = 0; j < n; j++) {
                if (b[j] <= mid) {
                    c++;
                } else {
                    c = 0;
                }
                if (c == k) {
                    fc++;
                    c = 0;
                }
            }
            if (fc >= m) {
                ans=mid;
                r=mid-1;
                // return i;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
