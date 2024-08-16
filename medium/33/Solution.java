class Solution {
    public int search(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        var mid = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] >= nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // System.out.print

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            var rmid = (( start + end ) / 2 + mid) % nums.length;
            if (nums[rmid] == target) {
                return rmid;
            } else if (nums[rmid] > target) {
                end = (start + end) /2 - 1;
            } else {
                start = (start + end)/2 + 1;
            }
        }
        return -1;
    }
}