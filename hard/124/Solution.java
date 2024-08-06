
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
    public int maxPathSum(TreeNode root) {
        // at any node, you have 3 options
        // 1) use both childern and node to make a complete path
        // 2) go with left side + node for backward propagation
        // 3) go with right side + node for backward propagation
        var ans = new int[]{Integer.MIN_VALUE};
        return Math.max(traverse(root, ans), ans[0]);
    }

    int traverse(TreeNode root, int[] max) {
        var left = 0;
        if (root.left != null) {
            left = traverse(root.left, max);
        }
        var right = 0;
        if (root.right != null) {
            right = traverse(root.right, max);
        }
        //System.out.println(left + ", " + right + ", " + root.val + " | " + max[0]);
        var lSum = root.val + left;
        var rSum = root.val + right;
        var wholesome = lSum + rSum - root.val;
        var cur = Math.max(Math.max(lSum, rSum), Math.max(wholesome, root.val));
        max[0] = Math.max(cur, max[0]);
        //System.out.println(max[0]);
        return Math.max(lSum, Math.max(rSum, root.val));
    }
}