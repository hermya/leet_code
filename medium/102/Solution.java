import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        if (root == null) {
            return List.of();
        }
        var ans = new ArrayList<List<Integer>>();
        q.addLast(root);
        while (!q.isEmpty()) {
            var t = new ArrayList<Integer>();
            var p = new LinkedList<TreeNode>();
            while (!q.isEmpty()) {
                var c = q.pollFirst();
                t.add(c.val);
                if (c.left != null) {
                    p.add(c.left);
                } 
                if (c.right != null) {
                    p.add(c.right);
                }
            }
            ans.add(t);
            q = p;
        }
        return ans;
    }
}