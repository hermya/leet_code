import java.util.LinkedList;
import java.util.List;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        return bfs(maze, entrance);
    }

    int bfs(char[][] maze, int[] entrance) {
        var visited = new boolean[maze.length][maze[0].length];
        var queue = new LinkedList<List<Integer>>();
        traverse(queue, maze, entrance, visited, 1);
        visited[entrance[0]][entrance[1]] = true;
        while (!queue.isEmpty()) {
            var x = queue.pollFirst();
            if (exit(x, maze)) {
                return x.get(2);
            }
            traverse(queue, maze, new int[]{x.get(0), x.get(1)}, visited, x.get(2) + 1);
        }
        return -1;
    }

    boolean exit(List<Integer> coord, char[][] maze) {
        var x = coord.get(0);
        var y = coord.get(1);
        return x == 0 || x == maze.length - 1 || y == 0 || y == maze[0].length - 1;
    }

    void traverse(LinkedList<List<Integer>> queue, char[][] maze, int[] entrance, boolean[][] visited, int distance) {
        var x = entrance[0];
        var y = entrance[1];
        if (y < maze[0].length - 1) {
            if (maze[x][y + 1] == '.' && !visited[x][y+1]) {
                queue.addLast(List.of(x, y + 1, distance));
                visited[x][y + 1] = true;
            }
        }
        if (y > 0) {
            if (maze[x][y - 1] == '.' && !visited[x][y-1]) {
                queue.addLast(List.of(x, y - 1, distance));
                visited[x][y - 1] = true;
            }
        }
        if (x < maze.length - 1) {
            if (maze[x+1][y] == '.' && !visited[x+1][y]) {
                queue.addLast(List.of(x+1, y, distance));
                visited[x + 1][y] = true;
            }
        } 
        if (x > 0) {
            if (maze[x-1][y] == '.' && !visited[x-1][y]) {
                queue.addLast(List.of(x-1, y, distance));
                visited[x - 1][y] = true;
            }
        }
    }
}