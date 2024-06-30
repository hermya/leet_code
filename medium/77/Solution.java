import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        var ans = new ArrayList<List<Integer>>();
        createCombinations(n, k, 0, ans, new Integer[k], 0);
        return ans;
    }

    void createCombinations (int n, int k, int lastChosen, List<List<Integer>> ans, Integer[] curr, int pos) {
        if (k == 0) {
            //System.out.println(Arrays.toString(curr));
            ans.add(List.copyOf(Arrays.asList(curr)));
            return;
        }

        for (int i = lastChosen + 1; i <= n; i++) {
            curr[pos] = i;
            createCombinations(n, k - 1, i, ans, curr, pos + 1);
        }
    }
}