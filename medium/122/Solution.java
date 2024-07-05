class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        var prof = 0;
        var min = prices[0];
        var max = prices[0];
        var cur = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                cur = prices[i] - min;
            } else {
                min = prices[i];
                prof += cur;
                cur = 0;
            }
            max = prices[i];
        }
        prof += cur;
        return prof;
    }
}