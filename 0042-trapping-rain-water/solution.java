class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int rt[]=new int[n];
        int lt[]=new int[n];
        int mr=h[n-1];
        int ml=h[0];
        int ans[]=new int[n];
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            if(h[i]>ml){
                ml=h[i];
            }
            lt[i]=ml;
        }
        for(int i=n-1;i>=0;i--){
            if(h[i]>mr){
                mr=h[i];
            }
            rt[i]=mr;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.min(lt[i],rt[i]);
        }
        for(int i=0;i<n;i++){
            s1+=ans[i];
            s2+=h[i];
        }
        return s1-s2;

    }
}
