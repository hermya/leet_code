
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

public class Solution {
    public int maxDepth(TreeNode root) {
        var ans = new int[1];
        traverse(root, ans, 0);
        return ans[0];
    }

    void traverse(TreeNode root, int[] ans, int currentDepth) {
        if (root == null) {
            ans[0] = Math.max(currentDepth, ans[0]);
            return;   
        }
        traverse(root.left, ans, currentDepth + 1);
        traverse(root.right, ans, currentDepth + 1);
    }
}