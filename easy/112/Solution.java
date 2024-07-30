
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return traverse(root, targetSum, 0);
    }

    boolean traverse(TreeNode root, int targetSum, int currentSum) {
        if (root.left == null && root.right == null) {
            return targetSum == currentSum + root.val;
        } else {
            var left = false;
            if (root.left != null) {
                left = traverse(root.left, targetSum, currentSum + root.val);
            } 
            var right = false;
            if (root.right != null) {
                right = traverse(root.right, targetSum, currentSum + root.val);
            }
            return left || right;
        }
    }
}