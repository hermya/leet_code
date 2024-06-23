class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        var total = 0;
        var cur = 0;
        int j = 0;
        var val = 0;
        for (int i = 0; i < gas.length; i++) {
            val = gas[i] - cost[i];
            total += val;
            if (cur >= 0) {
                cur += val;
            } else if (val > 0) {
                cur = val;
                j = i;
            }
        }
        if (total < 0) {
            return -1;
        }
        return j;
    }
}