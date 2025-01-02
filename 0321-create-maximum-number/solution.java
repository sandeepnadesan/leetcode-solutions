import java.util.*;

public class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] maxNumber = new int[k];

        for (int i = Math.max(0, k - n2); i <= Math.min(k, n1); i++) {
            int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
            if (greater(candidate, 0, maxNumber, 0)) {
                maxNumber = candidate;
            }
        }

        return maxNumber;
    }

    private int[] maxArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && j + n - i > k && nums[i] > result[j - 1]) {
                j--;
            }
            if (j < k) {
                result[j++] = nums[i];
            }
        }

        return result;
    }

    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] merged = new int[k];
        int i = 0, j = 0, r = 0;

        while (r < k) {
            if (greater(nums1, i, nums2, j)) {
                merged[r++] = nums1[i++];
            } else {
                merged[r++] = nums2[j++];
            }
        }

        return merged;
    }

    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }

   
}
