import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        var j = nums.length - 1;
        while (j >= 0 && nums[j] >= k) {
            j--;
        }
        int i = 0;
        var opt = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                opt++;
                i++; 
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return opt;
    }
}