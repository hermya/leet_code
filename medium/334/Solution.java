class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        var smallest = Math.min(nums[0], nums[1]);
        var ssf = nums[1] > nums[0];
        var secondSmallest = ssf ? nums[1] : 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            } else if (nums[i] > smallest && !ssf) {
                ssf = true;
                secondSmallest = nums[i];
            } else if (nums[i] < secondSmallest && nums[i] > smallest && ssf){
                secondSmallest = nums[i];
            } else if (nums[i] > secondSmallest && ssf) {
                return true;
            }
        }
        return false;
    }

    boolean follows(int[] arr) {
        return arr[0] < arr[1] && arr[1] < arr[2];
    }

}