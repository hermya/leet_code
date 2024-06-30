
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
    public int sumNumbers(TreeNode root) {
        var ans = new int[1];
        traverse(root, 0, ans);
        return ans[0];
    }

    void traverse(TreeNode root, int curr, int[] ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            ans[0] += curr + root.val;
            return;
        } 
        traverse(root.left, (curr + root.val) * 10, ans);
        traverse(root.right, (curr + root.val) * 10, ans);   
    }
}