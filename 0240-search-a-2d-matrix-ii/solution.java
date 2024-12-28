class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ci=0;
        int ri=n-1;
        while(ci<m&&ri>=0){
            if(matrix[ri][ci]==target){
                return true;
            }
            else if(matrix[ri][ci]>target){
                ri--;

            }
            else{
                ci++;
            }

        }
        return false;
    }
}
