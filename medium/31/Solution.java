import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        var switchAt = -1;
        for (int i = nums.length - 1; i > 0; i-- ){
            if (nums[i] > nums[i - 1]) {
                switchAt = i - 1;
                break;
            }
        }
        if (switchAt != -1) {
            var min = 101;
            System.out.println(switchAt);
            var j = -1;
            for (int i = switchAt + 1; i < nums.length; i++) {
                if (min > nums[i] && nums[i] > nums[switchAt]) {
                    min = nums[i];
                    j = i;
                }
            }
            var temp = nums[switchAt];
            nums[switchAt] = min;
            nums[j] = temp;
            System.out.println(nums.length - switchAt - 1);
            var arr = new int[nums.length - switchAt - 1];
            for (int i = switchAt + 1; i < nums.length; i++) {
                arr[i - switchAt - 1] = nums[i];
            }
            Arrays.sort(arr);
            for (int i = switchAt + 1; i < nums.length; i++) {
                nums[i] = arr[i - switchAt - 1];
            }
            return;
        }

        for (int i = 0; i < nums.length/2; i++) {
            var j = nums.length - i - 1;
            var temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}