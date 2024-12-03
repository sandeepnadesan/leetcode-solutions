class Solution {
    public int isPrefixOfWord(String s, String sw) {
        int a=s.length();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(sw)) {
                return i+1;
            }
        }
        return -1;
    }
}
