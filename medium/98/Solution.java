
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
    public boolean isValidBST(TreeNode root) {
        var ans = new boolean[]{true};
        traverse(root, new int[1], ans, new boolean[]{true});
        return ans[0];
    }

    void traverse(TreeNode root, int[] prev, boolean[] valid, boolean[] isFirst) {
        if (root == null || !valid[0]) {
            return;
        }
        traverse(root.left, prev, valid, isFirst);
        if (isFirst[0]) {
            isFirst[0] = false;
            prev[0] = root.val;
        } else if (valid[0]){
            valid[0] = prev[0] < root.val;     
            prev[0] = root.val;
        }
        traverse(root.right, prev, valid, isFirst);
    }
}