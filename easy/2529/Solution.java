class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int m = l + (h - l)/2;

            if (nums[m] < 0) {
                if (m == nums.length - 1) {
                    return nums.length;
                } else if (nums[m + 1] < 0) {
                    l = m + 1;
                } else if (nums[m + 1] == 0) {
                    return Math.max(m + 1, posMax(nums, m + 1, nums.length - 1));
                } else {
                    return Math.max(m + 1, nums.length - m - 1);
                }
            } else {
                h = m - 1;
            }
        }

        return posMax(nums, 0, nums.length - 1);
    }

    int posMax(int[] nums, int l, int h) {
        while (l <= h) {
            int m = l + (h - l)/2;

            if (nums[m] > 0) {
                if (m == 0) {
                    return nums.length;
                } else if (nums[m - 1] > 0) {
                    h = m - 1;
                } else {
                    return nums.length - m;
                }
            } else {
                l = m + 1;
            }
        }
        return 0;        
    }
}