class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxFinal = nums[0];
        int maxCur = nums[0];
        int curlen = 1;
        int finlen = 1;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            temp = maxCur & nums[i];
            if (nums[i] > maxFinal) {
                curlen = 1;
                finlen = 1;
                maxFinal = nums[i];
                maxCur = nums[i];
            } else if (temp == maxFinal) {
                curlen++;
                finlen = Math.max(finlen, curlen);
            } else if (temp < maxFinal) {
                curlen = 1;
                maxCur = nums[i];
            }
        }
        return finlen;
    }
}