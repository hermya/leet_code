class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        var rows = grid.length;
        var cols = grid[0].length;
        long count = 0;
        long[] roc = new long[rows];
        long[] coc = new long[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    roc[i]++;
                    coc[j]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count += (roc[i] - 1) * (coc[j] - 1);
                }
            }
        }
        return count;
    }
}