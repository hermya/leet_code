import java.util.ArrayList;


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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();
        traverse(root1, list1);
        traverse(root2, list2);
        return list1.toString().equals(list2.toString());
    }

    void traverse(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            list.add(root.val);    
        }
        if (root.left != null) {
            traverse(root.left, list);
        } 
        if (root.right != null) {
            traverse(root.right, list);
        }
    }
}