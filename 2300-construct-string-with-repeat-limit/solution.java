import java.util.*;

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        int repeatCount = 0; 
        int lastChar = -1; 
        while (true) {
            boolean added = false;
            for (int i = 25; i >= 0; i--) {
                if (freq[i] == 0 || (i == lastChar && repeatCount == repeatLimit)) {
                    continue; 
                }
                result.append((char) ('a' + i));
                freq[i]--;
                added = true;
                if (i == lastChar) {
                    repeatCount++;
                } else {
                    lastChar = i;
                    repeatCount = 1;
                }
                break; 
            }
            if (!added) {
                break;
            }
        }
        return result.toString();
    }
}

