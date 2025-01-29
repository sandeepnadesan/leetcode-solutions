class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder r=new StringBuilder();
        int i=0;
        
        int n=w1.length();
        int m=w2.length();
        while(i<n||i<m){
            if(i<n){
                r.append(w1.charAt(i));
            }
            if(i<m){
                r.append(w2.charAt(i));
            }
            i++;
        }
        return r.toString();

    }
}
