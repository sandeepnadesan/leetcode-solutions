class Solution {
    private void spiral(int[][] matrix, int nr, int nc, List<Integer> result, int r, int c, int dr, int dc) {
        if (nr == 0 || nc == 0) {
            return;
        }
        for (int i = 0; i < nc; i++) {
            r += dr; c += dc;
            result.add(matrix[r][c]);
        }
        spiral(matrix, nc, nr - 1, result, r, c, dc, -dr);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        spiral(matrix, matrix.length, matrix[0].length, result, 0, -1, 0, 1);
        return result;
    }
}
