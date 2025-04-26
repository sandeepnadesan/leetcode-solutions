class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character,Integer> s1= new HashMap<>();
        Map<Character,Integer> s2= new HashMap<>();
        // int i=0;
        for(int i=0;i<word1.length();i++){
            s1.put(word1.charAt(i),s1.getOrDefault(word1.charAt(i),0)+1);
            // i++;
        }
        for(int i=0;i<word2.length();i++){
            s2.put(word2.charAt(i),s2.getOrDefault(word2.charAt(i),0)+1);
            // i++;
        }
        // int c1=0;
        // for(int l : s1.values()){
        //     c1+=l;

        // }
        // int c2=0;
        // for(int l : s2.values()){
        //     c2+=l;

        // }


        // System.out.println(c1);
        // System.out.println(c2);
        // if(s1.equals(s2)
        if (!s1.keySet().equals(s2.keySet())) return false;
        // if(c1==c2){
        //     return true;
        // }
        List<Integer> freq1 = new ArrayList<>(s1.values());
        List<Integer> freq2 = new ArrayList<>(s2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
        
        // return false;
    }
}
