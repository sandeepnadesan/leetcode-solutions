class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> s= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(s.containsKey(nums[i])&& i-s.get(nums[i])<=k)return true;
            s.put(nums[i],i);
        }
        return false;
        // if (n < k) return false;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i] == nums[j] && Math.abs(i - j) <= k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

    }

}
