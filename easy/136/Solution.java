class Solution {
    public int singleNumber(int[] nums) {
        var ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}