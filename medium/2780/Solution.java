import java.util.Map;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int maj = -1;
        int count = 0;
        for (Integer key: map.keySet()) {
            count = map.get(key);
            if (count > nums.size()/2) {
                maj = key;
                break;
            }
        }

        if (maj == -1) {
            return -1;
        }

        int i = 0;
        int leftCount = 0;
        while (i < nums.size()) {
            if (nums.get(i) == maj) {
                leftCount++;
                count--;
            }
            i++;
            if (leftCount > i/2) {
                break;
            }
        }

        if (count > (nums.size() - i)/2) {
            return i - 1;
        }

        return -1;

        // int rightCount = 0;
        // int j = i;
        // while (i < nums.size()) {
        //     if (nums.get(i) == maj) {
        //         rightCount++;
        //     }
        //     i++;
        //     if (rightCount > (i - j)/2) {
        //         return j - 1;
        //     }
        // }
        // return -1;
    }
}