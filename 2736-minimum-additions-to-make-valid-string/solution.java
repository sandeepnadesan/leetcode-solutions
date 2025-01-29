class Solution {
    public int addMinimum(String word) {
        int r=0,i=0,n=word.length();
        while(i<n){
            int c=0;
            if(word.charAt(i)=='a'){
                i++;
                c++;
            }
            if(i<n && word.charAt(i)=='b'){
                i++;
                c++;
            }
            if(i<n && word.charAt(i)=='c'){
                i++;
                c++;
            }
            r+=3-c;

        }
        return r;
        
        
    }
}
