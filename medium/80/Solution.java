class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int nnp = 1;
        int c = nums[0];
        int cc = 1;
        while (i < nums.length) {
            if (nums[i] != c) {
                nums[nnp] = nums[i];
                c = nums[i];
                nnp++;
                cc = 1;
            } else if (nums[i] == c && cc == 1) {
                nums[nnp] = nums[i];
                nnp++;
                cc = 2;
            }
            i++;
        }
        return nnp;
    }
}