
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            String s = Integer.toString(i);
            int len = s.length();
            System.out.println(s);

            if (len % 2 != 0) continue;

            int mid = len / 2;
            int l = 0, r = 0;

            for (int j = 0; j < mid; j++) {
                l += s.charAt(j) - '0';
                r += s.charAt(j + mid) - '0';
            }

            if (l == r) {
                c++;
            }
        }
        return c;
    }
}

