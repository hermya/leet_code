import java.util.ArrayList;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        var list = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                list.add(i);
            }
        }
        
        int[] ans = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > list.size()) {
                ans[i] = -1;
            } else {
                ans[i] = list.get(queries[i] - 1);
            }
        }
        return ans;
    }
}