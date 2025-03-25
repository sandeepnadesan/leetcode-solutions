class Solution {
    public int kthFactor(int n, int k) {
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        int res =0;
        int ind=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[ind++]=i;
            }
        }
        return arr[k-1];
    }
}
