import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int numIslands(char[][] grid) {
        var visited = new boolean[grid.length][grid[0].length];
        var count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    performBFS(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void performBFS(char[][] grid, boolean[][] visited, int i, int j) {
        var q = new LinkedList<List<Integer>>();
        q.add(List.of(i, j));
        visited[i][j] = true;
        while (!q.isEmpty()) {
            var c = q.pollLast();
            q.addAll(addBFS(grid, visited, c.get(0), c.get(1)));
        }
    }

    List<List<Integer>> addBFS(char[][] grid, boolean[][] visited, int i, int j) {
        var list = new ArrayList<List<Integer>>();
        if (i > 0 && grid[i - 1][j] == '1' && !visited[i - 1][j]) {
            list.add(List.of(i - 1, j));
            visited[i - 1][j] = true;
        } 
        if (j > 0 && grid[i][j - 1] == '1' && !visited[i][j - 1]) {
            list.add(List.of(i, j - 1));
            visited[i][j - 1] = true;
        }
        if (i < grid.length - 1 && grid[i + 1][j] == '1' && !visited[i + 1][j]) {
            list.add(List.of(i + 1, j));
            visited[i + 1][j] = true;
        }
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1' && !visited[i][j + 1]) {
            list.add(List.of(i, j + 1));
            visited[i][j + 1] = true;
        }
        return list;
    }
}