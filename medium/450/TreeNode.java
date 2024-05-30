
public class TreeNode {
    int val;    TreeNode left;
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        if (root.val == key) {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }

            root.val = inorderSucc(root.right);
            root.right = deleteNode(root.right, root.val);
            
        }
        return root;
    }

    int inorderSucc(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}