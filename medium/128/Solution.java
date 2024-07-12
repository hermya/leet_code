class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        var map = new TreeSet<Integer>();
        for (int i : nums) {
            map.add(i);
        }

        var maxSeq = 1;
        var curSeq = 1;
        var lastNum = -1000000002;
        for (Integer x : map) {
            if (lastNum + 1 == x) {
                curSeq++;
                maxSeq = Math.max(curSeq, maxSeq);
            } else {
                curSeq = 1;
            }
            lastNum = x;
        }
        return maxSeq;
    }
}