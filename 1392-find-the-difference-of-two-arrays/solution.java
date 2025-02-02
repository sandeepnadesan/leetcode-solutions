class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();

        for(int n:nums1){
            a.add(n);
        }
        for(int n:nums2){
            b.add(n);
        }
        for(int n : a ){
            if(b.contains(n)==false)ans1.add(n);
        }
        for(int n : b ){
            if(a.contains(n)==false)ans2.add(n);
        }
        ans.add(ans1);
        ans.add(ans2);

        return ans;




    }
}
