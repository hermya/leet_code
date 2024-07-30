
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
    public int getMinimumDifference(TreeNode root) {
        var min = new int[]{100000};
        traverse(root, min, new int[]{100000});
        return min[0];
    }

    void traverse(TreeNode root, int[] min, int[] last) {
        if (root.left != null) {
            traverse(root.left, min, last);
        }
        min[0] = Math.min(min[0], Math.abs(last[0] - root.val));
        last[0] = root.val;
        if (root.right != null) {
            traverse(root.right, min, last);
        }
    }
}