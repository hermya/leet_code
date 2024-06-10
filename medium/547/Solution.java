import java.util.LinkedList;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        var cities = isConnected.length;
        var stack = new LinkedList<Integer>();
        var visited = new boolean[cities];
        var c = 0;
        var ans = 0;

        while (c < cities) {
            for (int i = 0; i < cities; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    stack.addLast(i);
                    c++;
                    break;
                }
            }
            while (!stack.isEmpty()) {
                var index = stack.pollLast();
                for (int i = 0; i < cities; i++) {
                    if (!visited[i] && isConnected[index][i] == 1) {
                        visited[i] = true;
                        stack.addLast(i);
                        c++;
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}