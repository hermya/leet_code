class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        var m = obstacleGrid.length;
        var n = obstacleGrid[0].length;
        var nuGrid = new int[m][n];
        var og = obstacleGrid;
        if (og[m - 1][n - 1] == 1 || og[0][0] == 1) {
            return 0;
        }
        nuGrid[m - 1][n - 1] = 1;

        for (int i = m - 1; i > -1; i--) {
            for (int j = n - 1; j > -1; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                } else if (i == m - 1) {
                    nuGrid[i][j] += og[i][j + 1] == 0 ? nuGrid[i][j + 1]: 0;
                } else if (j == n - 1) {
                    nuGrid[i][j] += og[i + 1][j] == 0 ? nuGrid[i + 1][j]: 0;
                } else {
                    nuGrid[i][j] += (1 - og[i + 1][j]) * nuGrid[i + 1][j] +  (1 - og[i][j + 1]) * nuGrid[i][j + 1];
                }
            }
        }
        return nuGrid[0][0];
    }
}