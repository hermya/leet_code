import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorToCount = new HashMap<>();

        int distinct = 0;
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            boolean ballExists = ballToColor.containsKey(ball);
            boolean colorExists = colorToCount.containsKey(color);
            if (ballExists) {
                var prevColor = ballToColor.get(ball);
                if (prevColor == color) {
                    // no change
                } else {
                    var prevVal = colorToCount.get(prevColor);
                    if (prevVal == 1) {
                        distinct--;
                    }
                    colorToCount.put(prevColor, prevVal - 1);
                    if (colorToCount.containsKey(color)) {
                      var val = colorToCount.get(color);
                        if (val == 0) {
                            distinct++;
                            colorToCount.put(color, 1);
                        } else {
                            colorToCount.put(color, val + 1);
                        }
                    } else {
                        distinct++;
                        colorToCount.put(color, 1);
                    }
                }
            } else {
                if (colorExists) {
                    var val = colorToCount.get(color);
                    if (val == 0) {
                        distinct++;
                        colorToCount.put(color, 1);
                    } else {
                        colorToCount.put(color, val + 1);
                    }
                } else {
                    distinct++;
                    colorToCount.put(color, 1);
                }
            }
            ballToColor.put(ball, color);
            ans[i] = distinct;
            // System.out.println("ball to color -> " + ballToColor);
            // System.out.println("color to count -> " + colorToCount);
        }
        return ans;
    }
}