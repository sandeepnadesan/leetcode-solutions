import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0) + 1);
            System.out.println(m);
        }

        Set<Integer> freqSet = new HashSet<>();
        for (int freq : m.values()) {
            if (!freqSet.add(freq)) {
                return false; 
            }
        }

        return true;
    }
}

