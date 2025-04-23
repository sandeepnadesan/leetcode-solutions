class Solution {
    public int countLargestGroup(int n) {
        if(n<10)return n;
        int c=0;
        Map<Integer,Integer> m= new HashMap<>();
        for(int i=1;i<=n;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int rem =temp%10;
                sum = sum+rem; 
                temp/=10;
            }
            m.put(sum,m.getOrDefault(sum,0)+1); 
            System.out.println(m);
        }
        int max=0;
        for(int val : m.values()){
            max=Math.max(max,val);
        }
        for(int val : m.values()){
            if(val==max){
                c++;
            }
        }
        return c;

    }
}
