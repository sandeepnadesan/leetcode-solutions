class Solution {
    public String convertToBase7(int num) {
        int rem=0;
        if(num==0)return "0";
        int t=num;
        num=Math.abs(num);
        StringBuilder s= new StringBuilder();
        // List<Integer> a =new ArrayList<>();
        while(num!=0){
            rem=num%7;
            s.append(rem);
            num/=7;
        }
        if(t<0){
            s.append("-");
        }
        // Collections.reverse(a);
        // for(int c: a){
        //     s.append(c);
        // }
        
        // System.out.println(a);
        // String res=a.toString();
        return s.reverse().toString();
    }
}
