class Solution {
    public int searchInsert(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        var mid = (start + end)/2;

        while (mid >= 0 && mid < nums.length) {
            if (nums[mid] == target) {
                return mid;
            }
            if (mid == 0 && nums[mid] > target) {
                return 0;
            }
            if (mid == nums.length - 1 && nums[mid] < target) {
                return nums.length;
            }
            if (mid > 0 && nums[mid - 1] < target && nums[mid] > target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
                mid = (start + end)/2;
            } else {
                start = mid + 1;
                mid = (start + end)/2;
            }
        }
        return mid;
    }
}