
class SolutionWith2DArray {
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
    short[][] graph;
    int[] upperLimit;
    
    Graph(int n) {
        graph = new short[n + 1][n + 1];
        upperLimit = new int[n + 1];
    }

    boolean addToGraph(int[] edge) {
        var node1 = edge[0];
        var node2 = edge[1];
        graph[node1][upperLimit[node1]] = (short) node2;
        graph[node2][upperLimit[node2]] = (short) node1;
        upperLimit[node1] += 1;
        upperLimit[node2] += 1;
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
        for (int i = 0; i < upperLimit[node]; i++) {
            if (graph[node][i] != except && doDFS(graph[node][i], visited, node)) {
                return true;
            } else continue;
        }
        return false;
    }
}