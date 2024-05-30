class Solution {
    public int[] productExceptSelf(int[] nums) {
        var ans = new int[nums.length];
        long prod = 1;
        var zeroCount = 0;
        var zeroPos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroPos = i;
            } else {
                prod *= nums[i];
            }
        }
        if (zeroCount > 1) {
            return ans;
        } 
        if (zeroCount == 1) {
            ans[zeroPos] = (int) prod;
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = (int) (prod / nums[i]);
        }
        return ans;
    }
}