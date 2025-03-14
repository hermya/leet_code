import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
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

public class Solution {
    public void recoverTree(TreeNode root) {
        List<Integer> keeper = new ArrayList<Integer>(1000);        
        Map<TreeNode, int[]> countKeeper = new HashMap<TreeNode, int[]>();

        getAllValues(root, keeper, countKeeper);

        keeper.sort(Comparator.naturalOrder());

        // for (TreeNode key : countKeeper.keySet()) {
        //     System.out.println(key.val + " -> " + Arrays.toString(countKeeper.get(key)));
        // }

        // System.out.println(keeper);

        reconstruct(root, keeper, countKeeper, 0);
    }

    int getAllValues(TreeNode root, List<Integer> keeper, Map<TreeNode, int[]> cKeeper) {
        if (root == null) {
            return 0;
        }
        keeper.add(root.val);
        int leftSize = getAllValues(root.left, keeper, cKeeper);
        int rightSize = getAllValues(root.right, keeper, cKeeper);
        cKeeper.put(root, new int[] {leftSize, rightSize});
        return 1 + leftSize + rightSize;
    }

    void reconstruct(TreeNode root, List<Integer> keeper, Map<TreeNode, int[]> cKeeper, int start) {
        if (root == null) {
            return;
        }

        int[] segment = cKeeper.get(root);
        int ind = start + segment[0];
        root.val = keeper.get(ind);

        reconstruct(root.left, keeper, cKeeper, start);
        reconstruct(root.right, keeper, cKeeper, ind + 1);
    }
}