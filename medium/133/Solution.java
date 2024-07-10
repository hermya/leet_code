

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        var q = new LinkedList<Node>(); // queue
        var map = new HashMap<Node, Node>(); // map nodes from first original to new and track visited nodes.
        var f = new Node(node.val); // first node
        q.addLast(node);
        map.put(node, f);

        while (!q.isEmpty()) {
            var ref = q.pollFirst();
            var act = map.get(ref);
            for (Node o : ref.neighbors) {
                if (map.containsKey(o)) {
                    act.neighbors.add(map.get(o));
                } else {
                    var p = new Node(o.val);
                    map.put(o, p);
                    act.neighbors.add(p);
                    q.add(o);
                }
            }
        }
        return f;
    }
}