class Solution {
    public long pickGifts(int[] g, int n) {
        int a = g.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int maxIndex = 0;
            for (int k = 1; k < a; k++) {
                if (g[k] > g[maxIndex]) {
                    maxIndex = k;
                }
            }
            g[maxIndex] = (int) Math.sqrt(g[maxIndex]);
        }
        for (int value : g) {
            sum += value;
        }
        return sum;
    }
}

