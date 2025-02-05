class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        Set<Character> s=new HashSet<>();
        Set<Character> t=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2){
                c++;
                s.add(c1);
                t.add(c2);
            }
            if(c>2)return false;

        }
        return (c== 2 && s.equals(t)) || c==0;




    }
}
