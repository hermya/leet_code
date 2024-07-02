import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public void flatten(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        preOrder(root, q);
        q.pollFirst();
        var ptr = root;
        while (!q.isEmpty()) {
            ptr.left = null;
            ptr.right = q.pollFirst();
            ptr = ptr.right;
        }
    }

    void preOrder(TreeNode root, LinkedList<TreeNode> q) {
        if (root == null) {
            return;
        }
        q.addLast(root);
        preOrder(root.left, q);
        preOrder(root.right, q);
    }
}