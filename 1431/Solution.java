import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = 0;
        for (int candy: candies) {
            max = Math.max(candy, max);
        }

        List<Boolean> result = new ArrayList<>();
        var temp = 0;
        for (int candy: candies) {
            temp = candy + extraCandies;
            if (temp >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}