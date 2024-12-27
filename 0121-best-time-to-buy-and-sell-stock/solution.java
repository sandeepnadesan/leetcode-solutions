class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int a=0;
        int o=0;
        int min = p[0];
        int max =0;
        if (p == null || p.length == 0) {
            return 0;
        }
        for(int i=1;i<n;i++){
            min=Math.min(min,p[i]);
            int b=p[i]-min;
            max=Math.max(max,b);
        }
        return max;


    }
}
