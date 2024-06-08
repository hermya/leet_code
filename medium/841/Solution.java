import java.util.List;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        var visited = new boolean[rooms.size()];
        var n = rooms.size();
        var stack = new int[n];
        var top = -1;
        visited[0] = true;
        n--;
        for (Integer x : rooms.get(0)) {
            top++;
            stack[top] = x;
            visited[x] = true;
            n--;
        }
        while (top > -1 && n > 0) {
            var ele = stack[top];
            top--;
            for (Integer x : rooms.get(ele)) {
                if (!visited[x]) {
                    top++;
                    stack[top] = x;
                    visited[x] = true;
                    n--;
                }
            }
        }
        return n == 0;
    }
}