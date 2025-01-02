class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String [] s= new String[n];
        for(int i=0;i<n;i++){
            s[i]=nums[i]+"";
        }
        Arrays.sort(s,(s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder sb =  new StringBuilder();
        String zc="";
        for(int i=n-1;i>=0;i--){
            sb.append(s[i]);
            zc+='0';
        }
        if(sb.toString().equals(zc))return "0";
        else
            return sb.toString();
    }
}
