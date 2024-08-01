class Solution {
    public int maximalSquare(char[][] matrix) {
        var max = 0;
        var dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            max = Math.max(matrix[0][i] - '0', max);
            dp[0][i] = matrix[0][i] - '0';
        }

        for (int i = 0; i < matrix.length; i++) {
            max = Math.max(matrix[i][0] - '0', max);
            dp[i][0] = matrix[i][0] - '0';
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    var bmin = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                    //var sqrt = (int)Math.sqrt(bmin);
                    dp[i][j] = bmin + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max*max;
    }
}