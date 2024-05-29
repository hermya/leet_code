class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double init = 0;
        for(int i = 0 ; i < k; i++) {
            init += nums[i];
        }
        var prev = init;
        for(int i = k; i < nums.length; i++) {
            var temp = prev - nums[i - k] + nums[i];
            init = Math.max(temp, init);
            prev = temp;
        }
        return init/k;
    }
}