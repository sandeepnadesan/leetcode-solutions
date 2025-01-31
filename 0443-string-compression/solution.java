class Solution {
    public int compress(char[] ch) {
        int a= ch.length;
        int c=0;
        
        // int idx=1;
        for(int i=0;i<a;){
            char cht=ch[i];
            int ct=0;
            while(i<a && ch[i]==cht){
                ct++;
                i++;
            }
            ch[c++]=cht;
            if(ct>1){
                for(char d: String.valueOf(ct).toCharArray()){
                    ch[c++]=d;
                }
            }
        }
        return c;

        
    }
}
