import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{complementMap.get(complement), i};
            }

            // If not found, add the current number and its index to the map
            complementMap.put(nums[i], i);
        }

        // If no solution is found (which should not happen given the problem constraints)
        return null;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = new Solution().twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1));  // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = new Solution().twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = new Solution().twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3));  // Output: [0, 1]
    }
}

