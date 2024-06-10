import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> rightSideView(TreeNode root) {
        var ans = new ArrayList<Integer>();
        traverse(root, ans, 1);
        return ans;
    }

    void traverse(TreeNode root, ArrayList<Integer> ans, int depth) {
        if (root == null) {
            return;
        }
        if (ans.size() < depth) {
            ans.add(root.val);
        }
        traverse(root.right, ans, depth + 1);
        traverse(root.left, ans, depth + 1);
    }
}