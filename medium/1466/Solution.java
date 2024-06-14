import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int minReorder(int n, int[][] connections) {
        var q = new LinkedList<Integer>();
        ArrayList<Pair>[] graph = new ArrayList[n];
        for (int i = 0; i < n - 1; i++){
            var a = connections[i][0];
            var b = connections[i][1];
            if (graph[a] == null) {
                graph[a] = new ArrayList<Pair>();
            }
            graph[a].add(new Pair(b, -1));
            if (graph[b] == null) {
                graph[b] = new ArrayList<Pair>();
            }
            graph[b].add(new Pair(a, 1));
        }
        //System.out.println(Arrays.toString(graph));
        var visitedCount = 1;
        var visited = new boolean[n];
        var ans = 0;
        q.addLast(0);
        visited[0] = true;
        while (visitedCount < n){
            var node = q.pollFirst();
            var row = graph[node];
            for (int i = 0; i < row.size(); i++) {
                var item = row.get(i);
                if (item.p == -1 && !visited[item.i]) {
                    visited[item.i] = true;
                    visitedCount++;
                    q.addLast(item.i);
                    ans++;
                } else if (item.p == 1 && !visited[item.i]) {
                    visited[item.i] = true;
                    visitedCount++;
                    q.addLast(item.i);
                }
            }
        }
        return ans;
    }
}

class Pair {
    int i;
    int p;
    Pair(int a, int b) {
        i = a;
        p = b;
    }
    public String toString() {
        return "["+i+" ,"+p+"]";
    }
}