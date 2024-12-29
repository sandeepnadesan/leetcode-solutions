class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = (int)1e9;
        int ans = 0;
        int l = 1;
        int r = max;
        while (l < r) {
            int mid = (l + r) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) piles[i] / mid);
                // System.out.println(sum);
                if (sum > h) {
                    break;
                }
            }
            if (sum <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;

    }
}


