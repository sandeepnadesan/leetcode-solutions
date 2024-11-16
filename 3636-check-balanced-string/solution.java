class Solution {
    public boolean isBalanced(String num) {
        // int num=Integer.parseInt(num);  
        // int n=num.length;
        int s1=0,s2=0;
        int[] ar = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            ar[i] = Character.getNumericValue(num.charAt(i));
        }
        int n=ar.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                s1+=ar[i];
            }
            else{
                s2+=ar[i];
            }


        }
        if(s1==s2)return true;
        return false;
    }
}
