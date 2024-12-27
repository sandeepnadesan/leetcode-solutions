class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n= values.length;
        int maxp=0;
        int sum=values[0]+0;
        for(int i=1;i<n;i++){
            
            maxp=Math.max(maxp,sum+(values[i] - i));
            sum=Math.max(sum,(values[i] + i));
            
        }
        return maxp;
    }
}
