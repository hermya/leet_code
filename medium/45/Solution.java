class Solution {
    public int jump(int[] nums) {
        var dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1000000007;
        }
        if (nums.length == 1) {
            return 0;
        }
        dp[0] = 0;
        var range = nums[0];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            range = nums[i];
            j = i + 1;
            while (range > 0 && j < nums.length) {
                dp[j] = Math.min(dp[i] + 1, dp[j]);
                j++;
                range--;
            }
            //System.out.println(Arrays.toString(dp));
            if (j == nums.length) {
                break;
            }
        }   
        return dp[nums.length - 1];
    }
}