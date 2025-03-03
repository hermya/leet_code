class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int numOfPivots = 0;
        int[] result = new int[nums.length];
        int resultItr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[resultItr] = nums[i];
                resultItr++;
            } else if (nums[i] == pivot) {
                numOfPivots++;
            }
        }

        while (numOfPivots > 0) {
            numOfPivots--;
            result[resultItr] = pivot;
            resultItr++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                result[resultItr] = nums[i];
                resultItr++;
            } 
        }

        return result;
    }
}