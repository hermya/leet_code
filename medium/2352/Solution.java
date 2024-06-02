class Solution {
    public int equalPairs(int[][] grid) {
        var len = grid.length;
        var ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                var x = 1;
                for (int k = 0; k < len; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        x = 0;
                        break;
                    }
                }
                ans += x;
            }
        }
        return ans;
    }
}