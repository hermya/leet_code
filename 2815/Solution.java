import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        var map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            var maxD = maxDigit(nums[i]/1000, (nums[i]/100)%10, (nums[i]/10)%10, nums[i]%10);
            if (map.containsKey(maxD)) {
                map.get(maxD).add(i);
            } else {
                map.put(maxD, new ArrayList<>(List.of(i)));
            }
        }
        for (List<Integer> iList : map.values()) {
            for (int i = 0; i < iList.size(); i++) {
                for (int j = i + 1; j < iList.size(); j++){
                    ans = max(nums[iList.get(i)] + nums[iList.get(j)], ans);
                }
            }
        }
        return ans;
    }

    int maxDigit(int a, int b, int c, int d) {
        var maxFirst = max(a, b);
        var maxSecond = max(c, d);
        return max(maxFirst, maxSecond);
    }

    int max(int a, int b){
        return a > b ? a : b;
    }
}