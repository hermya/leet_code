
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums, 0, nums.length - 1);
    }

    TreeNode constructTree(int[] nums, int lb, int ub) {
        if (lb <= ub && lb > -1 && ub < nums.length) {
            var mid = (lb + ub)/2;
            var root = new TreeNode(nums[mid]);
            root.left = constructTree(nums, lb, mid - 1);
            root.right = constructTree(nums, mid + 1, ub);
            return root;
        } 
        return null;
    }
}