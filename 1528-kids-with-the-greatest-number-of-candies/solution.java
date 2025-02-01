class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int n=c.length;
        int max=c[0];
        for(int i=0;i<n;i++){
            if(c[i]>max){
                max=c[i];
            }

        }
        List<Boolean> r=new ArrayList <>();
        for(int i=0;i<n;i++){
            if(c[i]+e>=max){
                r.add(true);
            }
            else{
                r.add(false);
            }

        }
        return r;
    }
}
