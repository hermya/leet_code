
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

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        var cur = preorder[0];
        var ii = doesExists(inorder, 0, inorder.length - 1, cur);
        return createTree(inorder, preorder, 0, inorder.length - 1, new int[]{0}, ii);
    }

    TreeNode createTree(int[] inorder, int[] preorder, int lb, int ub, int[] pi, int ii) {
        var root = new TreeNode(preorder[pi[0]]);
        pi[0]++;
        if (pi[0] == preorder.length) {
            return root;
        }

        if (isPartitionSafe(lb, ii - 1, inorder.length)) {
            var idx = doesExists(inorder, lb, ii - 1, preorder[pi[0]]);
            if (idx > -1) {
                root.left = createTree(inorder, preorder, lb, ii - 1, pi, idx);
            }
        }

        if (isPartitionSafe(ii + 1, ub, inorder.length)) {
            var idx = doesExists(inorder, ii + 1, ub, preorder[pi[0]]);
            if (idx > -1) {
                root.right = createTree(inorder, preorder, ii + 1, ub, pi, idx);
            }
        }
        
        return root;
    }

    boolean isPartitionSafe(int lb, int ub, int n) {
        if (lb < 0 || lb >= n || ub < 0 || ub >= n) {
            return false;
        }
        return lb <= ub;
    }

    int doesExists(int[] inorder, int lb, int ub, int val) {
        for (int i = lb; i <= ub; i++) {
            if (val == inorder[i]) {
                return i;
            }
        }
        return -1;
    }
    
}