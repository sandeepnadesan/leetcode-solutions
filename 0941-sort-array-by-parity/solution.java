class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0; // Pointer for even numbers
        int oddIndex = n - 1; // Pointer for odd numbers

        // Iterate through the nums array and place values into result array
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; // Place even numbers at the beginning
            } else {
                result[oddIndex--] = num; // Place odd numbers at the end
            }
        }

        return result; // Return the sorted array
    }
}
