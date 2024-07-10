class Solution {
    public void sortColors(int[] nums) {
        var nz = 0;
        var n1 = 0;
        var n2 = 0;
        for (int i : nums) {
            switch (i) {
                case 0: nz++; break;
                case 1: n1++; break;
                case 2: n2++; break;
                default: break;
            }
        }

        var i = 0;
        while (i < nums.length && i < nz) {
            nums[i] = 0;
            i++;
        }
        while (i < nums.length && i < nz + n1) {
            nums[i] = 1;
            i++;
        }
        while (i < nums.length && i < nz + n1 + n2) {
            nums[i] = 2;
            i++;
        }
    }
}