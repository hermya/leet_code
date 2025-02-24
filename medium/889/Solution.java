import java.util.HashMap;
import java.util.Map;

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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> preToI = new HashMap<Integer, Integer>();
        Map<Integer, Integer> postToI = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < preorder.length; i++) {
            preToI.put(preorder[i], i);
            postToI.put(postorder[i], i);
        }

        int n = preorder.length - 1;

        return getRootNodeFrom(preorder, postorder, 0, n, 0, n, preToI, postToI);
    }

    TreeNode getRootNodeFrom(
        int[] preorder, int[] postorder, 
        int beginPre, int endPre, 
        int beginPost, int endPost, 
        Map<Integer, Integer> preToI, Map<Integer, Integer> postToI) {
        
        var root = new TreeNode(preorder[beginPre]);
        int sop = preToI.get(preorder[beginPre]) + 1;
        int eop = postToI.get(preorder[beginPre]) - 1;

        if (sop > endPre) {
            return root;
        } else {
            int leftChildVal = preorder[sop];
            int rightChildVal = postorder[eop];

            if (leftChildVal == rightChildVal) {
                root.left = getRootNodeFrom(preorder, postorder, 
                sop, endPre, beginPost, eop, preToI, postToI);
            } else {
                root.left = getRootNodeFrom(preorder, postorder, 
                sop, preToI.get(rightChildVal) - 1, 
                beginPost, postToI.get(leftChildVal), 
                preToI, postToI);
                root.right = getRootNodeFrom(preorder, postorder,
                preToI.get(rightChildVal), endPre,
                postToI.get(leftChildVal) + 1, endPost,
                preToI, postToI);
            }
        }
        return root;
    }
}