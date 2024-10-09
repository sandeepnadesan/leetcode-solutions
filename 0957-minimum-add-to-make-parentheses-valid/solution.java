class Solution {
    public int minAddToMakeValid(String s) {
        int l = 0;  
        int r = 0;  
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                r++;  
            } else if (r > 0) {
                r--;  
            } else {
                l++;  
            }
        }
        return l + r;
    }
}

