	class Solution {
		public String largestNumber (int[] nums) {
			int n = nums.length;
			String[] s = new String[n];
			for (int i = 0; i < n; i++)
				s[i] = nums[i] + "";
			Arrays.sort(s, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
			StringBuilder res = new StringBuilder();
			String checkZero = "";
			for (int i = n - 1; i >= 0; i--) {
				res.append(s[i]);
				checkZero = checkZero + '0';
			}
			if (res.toString().equals(checkZero))
				return "0";
			return res.toString();
		}
	}
