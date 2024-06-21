class Solution {
    public boolean canJump(int[] nums) {
        var ptr1 = 0;
        var ptr2 = 0;
        if (nums[ptr1] == 0) {
            return nums.length == 1;
        }
        ptr1++;
        while (ptr1 < nums.length) {
            if (nums[ptr1] == 0) {
                while (ptr2 != ptr1) {
                    if (nums[ptr2] <= ptr1 - ptr2 && ptr1 != nums.length - 1){
                        ptr2++;
                    } else {
                        break;
                    }
                }
                if (ptr2 == ptr1) {
                    return false;
                }
            } 
            ptr1++;
        }
        return true;
    }
}