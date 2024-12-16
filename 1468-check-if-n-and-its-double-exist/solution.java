class Solution {
    public boolean checkIfExist(int[] arr) {
        int a=arr.length;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i!=j){
                    if(arr[i] == 2 * arr[j]){
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
