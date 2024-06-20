class Solution {
    public int removeElement(int[] nums, int val) {
        var ptr1 = 0;
        var ptr2 = 0;
        while (ptr1 < nums.length && nums[ptr1] != val) {
            ptr1++;
        } 
        ptr2 = ptr1 + 1;
        while (ptr1 < nums.length && ptr2 < nums.length) {
            if (nums[ptr2] != val) {
                var t = nums[ptr2];
                nums[ptr2] = val;
                nums[ptr1] = t;
                ptr1++;
            } 
            ptr2++;
        }
        return ptr1;
    }
}