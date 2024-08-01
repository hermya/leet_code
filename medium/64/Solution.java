class Solution {
    public int minPathSum(int[][] grid) {
        var m = grid.length;
        var n = grid[0].length;

        for (int i = m - 1; i > -1; i--) {
            for (int j = n - 1; j > -1; j--) {
                if (i == m - 1 && j == n - 1) {
                    continue;
                } else if (i == m - 1) {
                    grid[i][j] += grid[i][j + 1];                        
                } else if (j == n - 1) {
                    grid[i][j] += grid[i + 1][j];                        
                } else {
                    grid[i][j] += Math.min(grid[i + 1][j], grid[i][j + 1]);
                }
            }
        }
        // for (int[] p : grid) 
        //     System.out.println(Arrays.toString(p));
        return grid[0][0];
    }
}