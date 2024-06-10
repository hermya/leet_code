

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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        var ans = new int[1];
        traverse(root, new long[1000], 0, targetSum, ans);
        return ans[0];
    }
    void traverse(TreeNode root, long[] sum, int s, int targetSum, int[] ans) {
        if (root == null) {
            return;
        }
        
        for (int i = 0; i < s; i++) {
            if (sum[i] + root.val == targetSum) {
                ans[0]++;
            }
            sum[i] += root.val; 
        }

        s++;
        sum[s - 1] = root.val;
        if (root.val == targetSum) {
            ans[0]++;
        }
        traverse(root.left, sum, s, targetSum, ans);
        traverse(root.right, sum, s, targetSum, ans);
        s--;
        for (int i = 0; i < s; i++) {
            sum[i] -= root.val; 
        }

    }
}