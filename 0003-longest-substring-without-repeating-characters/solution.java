class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int i = 0; i < n; i++) {
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - left + 1);
            } else {
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(i));
            }
        }
        
        return maxLength;
    }
}
