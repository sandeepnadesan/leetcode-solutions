class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            if((c.length-i)<=c[i]){
                return c.length-i;
            }
        }
        return 0;
    }
}
