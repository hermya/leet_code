class Solution {
    public int maxArea(int[] height) {
        var len = height.length;
        var i = 0;
        var j = len - 1;
        var max = Math.min(height[j], height[i]) * (j - i); 
        while (i < j) {
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
        }
        return max;
    }
}