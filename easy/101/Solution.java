/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root.left != null && root.right!= null){
            return isSymmetric(root.left, root.right);
        } else if (root.left != null || root.right!= null) {
            return false;
        }
        return true;
    }

    boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } 
        if ((left != null && right == null) || (left == null && right != null)) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        var wideSym = isSymmetric(left.left, right.right);
        var narrowSym = false;
        if (wideSym) {
            narrowSym = isSymmetric(left.right, right.left);
        }
        return wideSym && narrowSym;
    }
}