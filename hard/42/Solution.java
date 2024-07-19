class Solution {
    public int trap(int[] height) {
        var temp = new int[height.length];
        
        temp[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            temp[i] = Math.max(height[i], temp[i - 1]);
        }

        //System.out.println(Arrays.toString(temp));

        var ans = 0;
        var lastMax = height[height.length - 1];
        for (int i = height.length - 2; i > 0; i-- ) {
            ans += Math.max(0, Math.min(lastMax, temp[i]) - height[i]);
            lastMax = Math.max(lastMax, height[i]);
        }
        return ans;
    }
}