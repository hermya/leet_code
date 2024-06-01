import java.util.LinkedList;

class Solution {
    public int longestOnes(int[] nums, int k) {
        // start by turning only 0s to 1s, keep track of last k zeroPositions, keep moving ahead;
        var len = 0;
        var max = 0;
        var x = k;
        var queue = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (x == 0 && nums[i] == 0) {
                max = Math.max(len, max);
                if (!queue.isEmpty()) {
                    len = i - queue.pollFirst();
                    queue.addLast(i);
                } else {
                    len = 0;
                }
            } else if (nums[i] == 1) {
                len++;
            } else if (x > 0) {
                len++;
                queue.addLast(i);
                x--;
            }
        } 
        max = Math.max(max, len);
        return max;
    }
}