class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') 
        {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        long ans = 0;
        int maxi = Integer.MAX_VALUE, mini = Integer.MIN_VALUE;
        while (i < n && Character.isDigit(s.charAt(i))) 
        {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (sign == 1 && ans > maxi) return maxi;
            if (sign == -1 && -1 * ans < mini) return mini;
            i++;
        }
        return sign*(int)(ans);
    }
}
