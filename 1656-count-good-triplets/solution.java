class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ct=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int d = Math.abs(arr[i] - arr[j]);
                    int e = Math.abs(arr[j] - arr[k]);
                    int f = Math.abs(arr[i] - arr[k]);
                    if(d<=a && e<=b && f<=c){
                        ct++;
                    }
                }
            }
        }
        return ct;
    }
}
