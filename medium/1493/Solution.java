class Solution {
    public int longestSubarray(int[] nums) {
        var max = 0;
        var trailWithoutZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                trailWithoutZero += nums[i];
                max = Math.max(max, nums[i]);
            } else if (i > 0) {
                if (nums[i] == 1) {
                    nums[i] += nums[i - 1];
                    trailWithoutZero++;
                    max = Math.max(max, nums[i]);
                } else if (nums[i] == 0) {
                    nums[i] = trailWithoutZero;
                    trailWithoutZero = 0;
                } 
            }
        }
        return Math.min(max, nums.length - 1);
    }
}