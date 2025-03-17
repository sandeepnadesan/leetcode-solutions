class Solution {
    public boolean divideArray(int[] nums) {
        Map <Integer , Integer> a = new HashMap<>();
        int n= nums.length;
        for(int num : nums){
            a.put(num , a.getOrDefault(num , 0)+1);
        }
        for( int c : a.values()){
            if(c%2!=0){
                return false;
            }
        }
        return true;
    }
}
