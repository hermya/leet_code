
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
    public int longestZigZag(TreeNode root) {
        int[] maxDepth = new int[1];
        traverse(root, maxDepth, 0, false);
        return maxDepth[0];
    }

    void traverse(TreeNode root, int[] maxDepth, int curDepth, boolean flip) {
        // flip == true, move to right else move to left
        if (root == null) {
            return;
        }
        if (flip) {
            if (root.right != null) {
                maxDepth[0] = Math.max(maxDepth[0], curDepth + 1);
                traverse(root.right, maxDepth, curDepth + 1, false);
            } 
            if (root.left != null) {
                maxDepth[0] = Math.max(maxDepth[0], 1);
                traverse(root.left, maxDepth, 1, true);
            }
        } else {
            if (root.left != null) {
                maxDepth[0] = Math.max(maxDepth[0], curDepth + 1);
                traverse(root.left, maxDepth, curDepth + 1, true);
            } 
            if (root.right != null) {
                maxDepth[0] = Math.max(maxDepth[0], 1);
                traverse(root.right, maxDepth, 1, false);
            }
        }
    }
}