class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } if (nums.length == 2) {
            return Math.max(nums[0], nums[1]) == nums[0] ? 0 : 1;
        }
        return checkAndGet(nums, 0, nums.length - 1);
    }

    int checkAndGet(int[] nums, int l, int r) {
        if (l > r) {
            return -1;
        }
        var pos = (l + r) /2 ;
        if (pos == 0 && nums[pos] > nums[pos + 1]) {
            return pos;
        } else if (pos == 0) {
            return -1;
        }
        if (pos == nums.length - 1 && nums[pos] > nums[pos - 1]) {
            return pos;
        } else if (pos == nums.length - 1){
            return -1;
        }
        if (nums[pos] > nums[pos - 1] && nums[pos] > nums[pos + 1]) {
            return pos;
        }

        var dec = r - pos > 1 ? 0 : 1;
        var a = checkAndGet(nums, pos + dec, r);
        var b = checkAndGet(nums, l, pos - dec);            
        return Math.max(a, b);
    }
}