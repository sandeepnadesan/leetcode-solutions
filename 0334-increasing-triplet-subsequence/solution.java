class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, s= Integer.MAX_VALUE;
        System.out.println(first);
        System.out.println(s);

        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= s) {
                s = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
