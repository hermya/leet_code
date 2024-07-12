
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

class Solution {
    public Node connect(Node root) {
        traverse(root, new Node[6000], 0);
        return root;
    }

    void traverse(Node root, Node[] map, int height) {
        if (root == null) {
            return;
        }
        if (map[height] != null) {
            root.next = map[height];
        } 
        map[height] = root;
        traverse(root.right, map, height + 1);
        traverse(root.left, map, height + 1);
    }
}