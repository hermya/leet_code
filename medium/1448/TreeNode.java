
public class TreeNode {
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
    public int goodNodes(TreeNode root) {
        int[] ans = new int[1];
        traverse(root, -10001, ans);
        return ans[0];
    }

    void traverse(TreeNode root, int maxUntil, int[] count) {
        if (root == null) {
            return;
        }
        count[0] += root.val >= maxUntil ? 1 : 0;
        maxUntil = Math.max(maxUntil, root.val);
        traverse(root.left, maxUntil, count);
        traverse(root.right, maxUntil, count);
    }
}