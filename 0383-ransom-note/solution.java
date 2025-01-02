class Solution {
    public boolean canConstruct(String r, String m) {
        int []l = new int[26];
        for(char c : m.toCharArray()){
            l[c-'a']++;
        }
        for(char d : r.toCharArray()){
            l[d-'a']--;
            if(l[d-'a']==-1)return false;
        }
        return true;
    }
}
