class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        var n = nums.length;
        int i = 0, j = 0;
        var sum = nums[0];
        var size = 100001;
        var curSize = 1;
        while (i < n && j < n) {
            if (sum >= target) {
                if (i == j) {
                    return 1;
                }
                size = Math.min(size, curSize);
                i++;
                curSize--;
                sum -= nums[i - 1];
            } else {
                j++;
                if ( j == n ) {
                    break;
                }
                curSize++;
                sum += nums[j];
            }
        }
        if (size == 100001) {
            return 0;
        } 
        return size;
    }
}