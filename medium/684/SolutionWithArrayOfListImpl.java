import java.util.ArrayList;
import java.util.List;

class SolutionWithArrayOfListImpl {
    public int[] findRedundantConnection(int[][] edges) {
        Graph h = new Graph(edges.length);
        for (int i = 0; i < edges.length; i++){
            if (h.addToGraph(edges[i])){
                return edges[i];
            }
        }
        return new int[]{-1, -1};
    }
}

class Graph {
    List<Short>[] graph;

    Graph(int n) {
        graph = new List[n + 1];
        while (n!= -1) {
            graph[n] = new ArrayList<>();
            n--;
        }
    }

    boolean addToGraph(int[] edge) {
        var node1 = edge[0];
        var node2 = edge[1];
        graph[node1].add((short) node2);
        graph[node2].add((short) node1);
        return findCycle((short) node1);
    }

    boolean findCycle(short node) {
        boolean[] visited = new boolean[graph.length];
        return doDFS(node, visited, (short) 0);
    }

    boolean doDFS(short node, boolean[] visited, short except) {
        if (node == except) {
            return false;
        }
        if (visited[node]) {
            return true;
        }
        visited[node] = true;
        for (short key : graph[node]) {
            if (key != except && doDFS(key, visited, node)) {
                return true;
            } else continue;
        }
        return false;
    }
}