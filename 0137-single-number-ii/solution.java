class Solution {
    public int singleNumber(int[] nums) {
        int a = nums.length;
        int flag;
        for(int i=0;i<a;i++){
            flag=0;
            for(int j=0;j<a;j++){
                if(i!=j&&nums[i]==nums[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return nums[i];
            }
        }
        return -1;

    }
}
