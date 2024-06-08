class Solution {
    public int uniquePaths(int m, int n) {
        var ans = new int[m][n];
        ans[m - 1][n - 1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1 ; j >= 0 ; j--) {
                if (j < n - 1 ){
                    ans[i][j] = ans[i][j] + ans[i][j + 1];
                }
                if (i < m - 1) {
                    ans[i][j] = ans[i][j] + ans[i + 1][j];
                }
            }
        }
        return ans[0][0];
    }
}