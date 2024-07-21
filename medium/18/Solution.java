import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        var ans = new ArrayList<List<Integer>>();
        compute(nums, new int[4], 0, 0, 0, target, ans);
        return ans;
    }

    void compute(int[] nums, int[] con, long sum, int k, int u, int target, ArrayList<List<Integer>> ans) {
        if (k > 0 && con[k - 1] > 0 && sum > target) {
            return;
        }
        if (k == 4) {
            if (sum == target) {
                ans.add(List.of(con[0], con[1], con[2], con[3]));
            }
            return;
        }

        for (int i = u; i < nums.length - (3 - k); i++) {
            con[k] = nums[i];
            compute(nums, con, sum + con[k], k + 1, i + 1, target, ans);
            while (i < (nums.length - 4 + k) && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}