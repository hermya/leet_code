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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        var ans = new boolean[]{true};
        verifySame(p, q, ans);
        return ans[0];
    }

    void verifySame (TreeNode p, TreeNode q, boolean[] ans) {
        if (p == null && q == null) {
            return;
        }

        if (p == null && q != null || p != null && q == null) {
            ans[0] = false;
            return;
        }
        if (p.val != q.val) {
            ans[0] = false;
            return;
        }

        verifySame(p.left, q.left, ans);
        verifySame(p.right, q.right, ans);
    }
}