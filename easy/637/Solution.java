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
    public List<Double> averageOfLevels(TreeNode root) {
        var sumList = new ArrayList<Double>();
        var countList = new ArrayList<Integer>();
        traverse(root, sumList, countList, 0);
        for (int i = 0; i < sumList.size(); i++) {
            sumList.set(i, sumList.get(i) / countList.get(i));
        }
        return sumList;
    }

    void traverse(TreeNode head, List<Double> sumList, List<Integer> countList, int height) {
        if (head == null) {
            return;
        }
        if (height == countList.size()) {
            countList.add(1);
            sumList.add((double)head.val);
        } else {
            sumList.set(height, sumList.get(height) + head.val);
            countList.set(height, countList.get(height) + 1);
        }

        traverse(head.left, sumList, countList, height + 1);
        traverse(head.right, sumList, countList, height + 1);

    }


}