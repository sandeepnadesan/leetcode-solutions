class Solution {
    public int tupleSameProduct(int[] nums) {
        int n= nums.length;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int p=nums[i]*nums[j];
                mp.put(p,mp.getOrDefault(p,0)+1);
            }
        }


        int s=0;
        for(int c:mp.values()){
            if(c>1){
                s+=(c*(c-1))/2;
            }
        }
        return s*8;
    }
}
