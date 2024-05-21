class Solution {
    public boolean isGood(int[] nums) {
        var counter = new int[nums.length + 1];
        var n = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= counter.length) {
                return false;
            }
            if ((counter[nums[i]] < 1 && nums[i] < n) || (counter[nums[i]] < 2 && nums[i] == n)) {
                counter[nums[i]]++;
            } else {
                return false;
            }
        } 
        return true;
    }
}