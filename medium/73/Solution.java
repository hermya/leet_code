class Solution {
    public void setZeroes(int[][] matrix) {
        var rs = matrix.length;
        var cs = matrix[0].length;
        var rows = new boolean[rs];
        var cols = new boolean[cs];

        for (int i = 0; i < rs; i++) {
            for (int j = 0; j < cs; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                } 
            }
        }

        for (int i = 0; i < rs; i++) {
            for (int j = 0; j < cs; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}