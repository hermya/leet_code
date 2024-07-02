
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
    public int kthSmallest(TreeNode root, int k) {
        var ans = new int[]{-1};
        traverse(root, new int[]{k}, new boolean[]{false}, ans);
        return ans[0];
    }

    void traverse (TreeNode root, int[] k, boolean[] ansFound, int[] ans) {
        if (root == null || ansFound[0]) {
            return;
        }
        traverse(root.left, k, ansFound, ans);
        if (k[0] == 1) {
            ans[0] = root.val;
            ansFound[0] = true;
        } 
        k[0]--;
        traverse(root.right, k, ansFound, ans);
    } 
}