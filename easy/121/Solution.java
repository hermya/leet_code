class Solution {
    public int maxProfit(int[] prices) {
        var min = prices[0];
        var max = prices[0];
        var prof = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                prof = Math.max(max - min, prof);
            } else if (prices[i] < min) {
                min = prices[i];
                max = min;
            }
        }
        return prof;
    }
}