class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        int res[]= new int[n];

        for(int num : nums){
            if(num<pivot)
                l1.add(num);
            else if(num>pivot)
                l2.add(num);
            else
                l3.add(num);
        }

        int i=0;
        for(int num : l1){
            res[i++]=num;
        }
        for(int num : l3){
            res[i++]=num;
        }
        for(int num : l2){
            res[i++]=num;
        }

        return res;
    }
}
