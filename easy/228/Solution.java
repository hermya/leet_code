import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return List.of();
        }
        var prev = nums[0];
        var start = nums[0];
        var ans = new ArrayList<String>();
        var b = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                prev = nums[i];
            } else {
                if (start == prev) {
                    ans.add(String.valueOf(start));
                } else {
                    b.append(start);
                    b.append("->");
                    b.append(prev);
                    ans.add(b.toString());
                    b.setLength(0);
                }
                start = nums[i];
                prev = nums[i];
            }
        }
        if (start == prev) {
            ans.add(String.valueOf(start));
        } else {
            b.append(start);
            b.append("->");
            b.append(prev);
            ans.add(b.toString());
            b.setLength(0);
        }
        return ans;
    }
}