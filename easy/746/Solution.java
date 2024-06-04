class Solution {
    public int minCostClimbingStairs(int[] cost) {
        var i = cost.length - 1;
        var j = cost.length - 2;
        while (i > 0 && j > 0) {
            var temp = cost[j - 1];
            cost[j - 1] = Math.min(temp + cost[j], temp + cost[i]);
            i--;
            j--; 
        }
        return Math.min(cost[0], cost[1]);
    }
}