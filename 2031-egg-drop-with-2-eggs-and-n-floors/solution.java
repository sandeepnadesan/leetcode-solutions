class Solution {
    public int twoEggDrop(int n) {
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            sum+=i;
            if(sum<n){
                c++;
            }
            else {
                break;
            }
        }
        return c;
        
    }
}
