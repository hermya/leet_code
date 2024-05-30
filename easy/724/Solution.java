import java.util.stream.IntStream;

class Solution {
    public int pivotIndex(int[] nums) {
        var sum = IntStream.of(nums).sum();
        var lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                lSum = 0;
            } else {
                lSum += nums[i - 1];
            }
            sum -= nums[i];
            if (sum == lSum) {
                return i;
            }
        }
        return -1;
    }
}