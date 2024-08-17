class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } 
        var prev = nums[0];
        var curr = nums[1];
        var len = nums[0];
        var maxLen = len;

        for (int i = 1; i < nums.length; i++) {
            curr = nums[i];
            if (prev == curr && curr == 1) {
                len++;
                maxLen = Math.max(maxLen, len);
            } else if (curr == 1 && prev == 0) {
                len = 1;
                maxLen = Math.max(maxLen, len);
            } else if (curr == 0) {
                len = 0;
            }
            //System.out.println(len);
            prev = curr;
        }
        return maxLen;
    }
}