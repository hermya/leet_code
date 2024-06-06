
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
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    TreeNode search(TreeNode root, int val) {
        if (root != null && root.val == val) {
            return root;
        } else if (root == null) {
            return null;
        }
        if (val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }
}