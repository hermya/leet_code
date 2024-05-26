class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        var ans = 0;
        var twoNums = false;
        var keeper = new int[51];
        for (int i = 0; i < nums.length; i++) {
            keeper[nums[i]]++;
            if (keeper[nums[i]] == 2 && twoNums) {
                ans ^= nums[i];
            } else if(keeper[nums[i]] == 2) {
                twoNums = true;
                ans = nums[i];
            }
        }
        return ans;
    }
}