class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();



        // Stack<Character> s1=new Stack<>();
        // Stack<Character> s2=new Stack<>();
        // for(char d:s.toCharArray()){
        //     s1.push(d);
        //     // System.out.println(s1);
        // }
        // for(char d:t.toCharArray()){
        //     if(s1.contains(d) && (!(s2.contains(d)))){
        //         s2.push(d);
        //         System.out.println(s2);
        //     }
        // }
        // if(s1.toString()==s2.toString()){
        //     return true;
        // }
        // // if(s1.equals(s2)){
        // //     return true;
        // // }
        // return false;

    }
}
