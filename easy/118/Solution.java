import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            return List.of(List.of(1));
        }
        if (numRows == 2) {
            return List.of(List.of(1), List.of(1, 1));
        }
        var ans = new ArrayList<List<Integer>>(numRows);
        ans.add(List.of(1));
        ans.add(List.of(1, 1));
        for (int i = 2; i < numRows; i++) {
            var n = ans.get(i - 1).size() + 1;
            var temp = new ArrayList<Integer>();
            temp.add(1);
            for (int j = 1; j < ans.get(i - 1).size(); j++) {
                temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            temp.add(1);
            ans.add(temp);            
        }
        return ans;
    }
}