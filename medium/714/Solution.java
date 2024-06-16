class Solution {
    public int maxProfit(int[] prices, int fee) {
        // Try it similar to max sub array problem
        // Initially, reach the local minima
        // From that minima, reach a point where i + 1 is smaller than profit until now - fee
        // maintain two variables: sum until now, last sum
        // evaluate which one is bigger
        var l = prices.length;
        var min = prices[0];
        var max = prices[0];
        var prof = 0;
        var cur = 0;
        int i = 1;
        while (i < l) {
            if (prices[i] > max - fee) {
                max = Math.max(max, prices[i]);
                cur = Math.max(max - min - fee, 0);
            } else if (prices[i] < max - fee) {
                prof += cur;
                min = prices[i];
                max = prices[i];
                cur = 0;
            } 
            if (min >= prices[i]) {
                min = prices[i];
                max = prices[i];
            }
            i++;
        }
        return prof + cur;
    }
}