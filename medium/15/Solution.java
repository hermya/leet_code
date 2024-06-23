import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        var prev = -100002;
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prev == nums[i]) {
                continue;
            } else {
                prev = nums[i];
            }
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                var val = nums[i] + nums[j] + nums[k];
                if (val == 0) {
                    list.add(List.of(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j+1]) {
                        j++;
                    }
                    j++;
                } else if (val < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return list;
    }
}