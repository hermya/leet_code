import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionWithMapImpl {
    public int[] findRedundantConnection(int[][] edges) {
        Graph h = new Graph();
        for (int i = 0; i < edges.length; i++){
            if (h.addToGraph(edges[i])){
                return edges[i];
            }
        }
        return new int[]{-1, -1};
    }
}

class Graph {
    Map<Integer, List<Integer>> map = new HashMap<>();

    boolean addToGraph(int[] edge) {
        var node1 = edge[0];
        var node2 = edge[1];
        if (map.containsKey(node1)) {
            map.get(node1).add(node2);
        } else {
            map.put(node1, new ArrayList<>(List.of(node2)));
        }
        if (map.containsKey(node2)) {
            map.get(node2).add(node1);
        } else {
            map.put(node2, new ArrayList<>(List.of(node1)));
        }
        return findCycle(node1);
    }

    boolean findCycle(int node) {
        var tempMap = new HashMap<Integer, Boolean>();
        for (Integer key: map.keySet()){
            tempMap.put(key, Boolean.FALSE);
        }
        return doDFS(node, tempMap, -1);
    }

    boolean doDFS(int node, Map<Integer, Boolean> visited, int except) {
        if (node == except) {
            return false;
        }
        if (Boolean.TRUE.equals(visited.get(node))) {
            return true;
        }
        visited.put(node, Boolean.TRUE);
        for (Integer key : map.get(node)) {
            if (key != except && doDFS(key, visited, node)) {
                return true;
            } else continue;
        }
        return false;
    }
}