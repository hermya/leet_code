class Solution {
    public int lengthOfLIS(int[] nums) {
        var dp = new int[nums.length];
        var max = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            dp[i] = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = dp[i] > max ? dp[i] : max;
        }

        return max;
    }
}