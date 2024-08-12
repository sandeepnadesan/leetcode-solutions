class Solution {
    public int[] singleNumber(int[] nums) {
        int a = nums.length;
        int[] an = new int[2]; 
        int index = 0; 

        for (int i = 0; i < a; i++) {
            boolean found = false;
            for (int j = 0; j < a; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                an[index++] = nums[i];
                if (index == 2) break;
            }
        }
        
        return an;
    }
}

