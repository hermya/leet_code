class Solution {
    public int rob(int[] nums) {
        int[] robs = new int[nums.length];

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        var max = 0;
        for (int i = 0; i < nums.length; i++) {
            robs[i] = Math.max(nums[i], robs[i]);
            max = Math.max(max, robs[i]);
            for (int j = i + 2; j < nums.length; j++) {
                robs[j] = Math.max(nums[j] + robs[i], robs[j]);
                max = Math.max(max, robs[j]);
            }
        }
        return max;
    }
}