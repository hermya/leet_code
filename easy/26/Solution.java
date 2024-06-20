class Solution {
    public int removeDuplicates(int[] nums) {
        var nnp = 1;
        var i = 1;
        var c = nums[0];
        while (i < nums.length) {
            if (nums[i] != c) {
                nums[nnp] = nums[i];
                c = nums[i];
                nnp++;
            } 
            i++;
        }
        return nnp;
    }
}