import java.util.Arrays;

class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        var string = Arrays.toString(grid[0]);
        for (int[] array: grid) {
            if (!string.equals(Arrays.toString(array))){
                return false;
            }
            if (!columnCondition(array)) {
                return false;
            }
        }
        return true;
    }

    boolean columnCondition(int[] array) {
        var first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (first == array[i]) {
                return false;
            }
            first = array[i];
        }
        return true; 
    }

}