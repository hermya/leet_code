import java.util.LinkedList;
import java.util.List;

class Solution {
    public int orangesRotting(int[][] grid) {
        var m = grid.length;
        var n = grid[0].length;
        var visited = new boolean[m][n];
        int ROTTEN = 2, FRESH = 1;
        var fc = new int[1];
        var rc = new int[1];
        var minutes = 0;
        var queue = new LinkedList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == ROTTEN) {
                    queue.addLast(List.of(i, j));
                    visited[i][j] = true;
                    rc[0]++;
                }
                if (grid[i][j] == FRESH) {
                    fc[0]++;
                }
            }
        }
        var total = fc[0] + rc[0];        
        
        while (!queue.isEmpty()) {
            var mbm = queue;
            queue = new LinkedList<List<Integer>>();
            var p = rc[0];
            for (List<Integer> ijs : mbm) {
                visit(visited, grid, m, n, rc, ijs, queue);
            }
            minutes += p != rc[0] ? 1 : 0;
        }
        
        if (rc[0] == total) {
            return minutes;
        }
        return -1;
    }

    void visit (boolean[][] visited, int[][] grid, int m, int n, int[] rc, List<Integer> current, LinkedList<List<Integer>> queue) {
        int i = current.get(0), j = current.get(1);
        if (i > 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) {
            queue.add(List.of(i - 1, j));
            rc[0]++;
            visited[i - 1][j] = true;
        } 
        if (i < m - 1 && !visited[i + 1][j] && grid[i + 1][j] == 1) {
            queue.add(List.of(i + 1, j));
            rc[0]++;
            visited[i + 1][j] = true;
        } 
        if (j > 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) {
            queue.add(List.of(i, j - 1));
            rc[0]++;
            visited[i][j - 1] = true;
        } 
        if (j < n - 1 && !visited[i][j + 1] && grid[i][j + 1] == 1) {
            queue.add(List.of(i, j + 1));
            rc[0]++;
            visited[i][j + 1] = true;
        } 
    }
}