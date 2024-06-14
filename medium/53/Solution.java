class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curSum = curSum + nums[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (nums[i] > maxSum) {
                maxSum = nums[i];
                curSum = maxSum;
            }
            if (nums[i] > curSum) {
                curSum = nums[i];
            }
        }
        return maxSum;
    }
}