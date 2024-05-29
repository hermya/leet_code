class Solution {
    public void moveZeroes(int[] nums) {
        var pos = 1;
        var start = 0;

        while (pos < nums.length) {
            if (nums[start] == 0 && nums[pos] != 0) {
                var temp = nums[start];
                nums[start] = nums[pos];
                nums[pos] = temp;
                start++;
                pos++;
            } else if (nums[start] == 0 && nums[pos] == 0){
                pos++;
            } else {
                start++;
                pos++;
            }
        }
        
    }
}