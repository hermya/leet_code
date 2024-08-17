import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        var x = nums.length / 3;
        var set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length - x; i++) {
            if (nums[i] == nums[i + x]) {
                set.add(nums[i]);
                if (set.size() > 1) {
                    return new ArrayList<Integer>(set);
                }
                i += x;
            }
        }
        return new ArrayList<Integer>(set);
    }
}