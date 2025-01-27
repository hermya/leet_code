import java.util.Arrays;

class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        var len = nums.length;
        var mid = 0;
        var medianNow = 0;
        if (len % 2 == 1) {
            medianNow = nums[len/2];
            mid = len/2;
        } else {
            medianNow = nums[len/2];
            mid = len/2;
        }
        long ops = 0;
        if (medianNow < k) {
            ops = k - medianNow;
            var start = mid + 1;
            while (start < len && nums[start] < k) {
                ops += k - nums[start];
                start++;
            }
        } else if (medianNow > k) {
            ops = medianNow - k;
            var start = mid - 1;
            while (start > -1 && nums[start] > k) {
                ops += nums[start] - k;
                start --;
            }    
        }
        return ops;
    }
}