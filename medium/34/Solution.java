class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        // step 1 : find any instance:
        int mid = 0;
        int index = -1;
        while (start <= end) {
            mid = (start + end)/2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (index == -1) {
            return new int[]{-1, -1};
        }
        
        // step 2.1 -> calc right end;
        start = index;
        end = nums.length;
        var right = -1;

        while (start <= end) {
            mid = (start + end)/2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] != target)) {
                right = mid;
                break;
            } else if (nums[mid] == target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        
        // step 2.2 -> calc left end;
        start = 0;
        end = index;
        var left = -1;

        while (start <= end) {
            mid = (start + end)/2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target)) {
                left = mid;
                break;
            } else if (nums[mid] == target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{left, right};
    }
}