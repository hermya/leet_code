class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        var maxInc = 1;
        var maxDec = 1;
        var curInc = 1;
        var curDec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                curInc++;
                curDec = 1;
                maxInc = Math.max(curInc, maxInc);
            } else if (nums[i] < nums[i-1]) {
                curInc = 1;
                curDec++;
                maxDec = Math.max(curDec, maxDec);
            } else {
                curDec = 1;
                curInc = 1;
            }
        }
        return Math.max(maxInc, maxDec);
    }
}