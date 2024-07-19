import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        var ans = new HashMap<String, List<Integer>>();
        for (int i = 0; i <= nums.length; i++) {
            traverse(nums, i, 0, ans, new ArrayList<Integer>(nums.length));
        }

        return new ArrayList<List<Integer>>(ans.values());
    }

    void traverse(int[] nums, int e, int x, Map<String, List<Integer>> ans, ArrayList<Integer> temp) {
        if (x == e) {
            ans.put(temp.toString(), List.copyOf(temp));
            return;
        }

        for (int i = x; i < nums.length; i++) {
            temp.add(nums[i]);
            traverse(nums, e, i + 1, ans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}