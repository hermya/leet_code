class Solution {
    public int minDistance(String word1, String word2) {
        var w1 = word1.toCharArray();
        var w2 = word2.toCharArray();
        var dp = new int[w1.length + 1][w2.length + 1];
        for (int i = 0; i < w2.length; i++) {
            dp[0][i + 1] = i + 1; 
        }
        for (int i = 0; i < w1.length; i++) {
            dp[i + 1][0] = i + 1; 
        }
        for (int i = 0; i < w1.length; i++) {
            for (int j = 0; j < w2.length; j++) {
                var pb = Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i][j]));
                if (w1[i] == w2[j]) {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    dp[i + 1][j + 1] = pb + 1;
                }
            }
        }
        
        if (w1.length == 0 || w2.length == 0) {
            return Math.max(w1.length, w2.length);
        }
        return dp[w1.length][w2.length];
    }

}