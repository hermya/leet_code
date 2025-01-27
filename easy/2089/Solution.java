import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        var countOfTarget = 0;
        var positionOfTarget = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                positionOfTarget++;
            } else if (nums[i] == target) {
                countOfTarget++;
            }
        }
        var ans = new ArrayList<Integer>();
        for (int i = 0; i < countOfTarget; i++) {
            ans.add(i + positionOfTarget);
        }
        return ans;
    }
}