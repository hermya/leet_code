import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] ans = new int[queries.length];
        var ballMap = new HashMap<Integer, Integer>();
        var colorMap = new HashMap<Integer, Set<Integer>>();
        var ctr = 0;
        for (int i = 0; i < queries.length; i++) {
            var color = queries[i][1];
            var ball = queries[i][0];
            var prevColor = ballMap.get(ball);
            if (Objects.isNull(prevColor)) {
                ballMap.put(ball, color);
                var ballSet = colorMap.get(color);
                if (Objects.isNull(ballSet) || ballSet.isEmpty()) {
                    ctr++;
                    colorMap.put(color, new HashSet<>(Set.of(ball)));
                } else {
                    ballSet.add(ball);
                }
                ans[i] = ctr;
            } else {
                ballMap.put(ball, color);
                var ballSet = colorMap.get(color);                
                var prevSet = colorMap.get(prevColor);
                prevSet.remove(ball);
                if (prevSet.isEmpty()) {
                    ctr--;
                }
                
                if (Objects.isNull(ballSet) || ballSet.isEmpty()) {
                    ctr++;
                    colorMap.put(color, new HashSet<>(Set.of(ball)));
                } else {
                    ballSet.add(ball);
                }
                ans[i] = ctr;
            }
            
            ans[i]=ctr;
        }
        return ans;
    }
}