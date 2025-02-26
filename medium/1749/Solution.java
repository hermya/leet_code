class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // find max sub array
        int curr = nums[0];
        int maxPositive = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            maxPositive = Math.max(curr, maxPositive);
        }

        curr = nums[0];
        int maxNegative = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.min(curr + nums[i], nums[i]);
            maxNegative = Math.min(curr, maxNegative);
        }

        return Math.max(maxPositive, Math.abs(maxNegative));
    }
}