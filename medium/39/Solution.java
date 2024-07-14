import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        var ans = new ArrayList<List<Integer>>();
        traverse(candidates, new LinkedList<Integer>(), ans, target, 0, 0);
        return ans;
    }

    void traverse(int[] candidates, LinkedList<Integer> tempList, List<List<Integer>> ans, int target, int current, int start) {
        if (current > target) {
            return;
        } else if (current == target) {
            ans.add(List.copyOf(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tempList.addLast(candidates[i]);
            traverse(candidates, tempList, ans, target, current + candidates[i], i);
            tempList.pollLast();
        }
    }
}