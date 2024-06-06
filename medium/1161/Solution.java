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
    public int maxLevelSum(TreeNode root) {
        var depthWise = new ArrayList<Integer>();
        traverse(root, depthWise, 1);
        int ans = 0;
        int max = -1000000001;
        for (int i = 0; i < depthWise.size(); i++) {
            var t = Math.max(depthWise.get(i), max);
            if (t > max) {
                max = t;
                ans = i + 1;
            }
        }
        return ans;
    }
    void traverse(TreeNode root, ArrayList<Integer> depthWise, int curDepth) {
        if (root == null) {
            return ;
        }
        if (depthWise.size() <= curDepth - 1) {
            depthWise.add(0);
        }
        depthWise.set(curDepth - 1, depthWise.get(curDepth - 1) + root.val);
        traverse(root.left, depthWise, curDepth + 1);
        traverse(root.right, depthWise, curDepth + 1);
    }
}