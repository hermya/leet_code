class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            max1 = Math.max(max1, nums1[i]);            
            max2 = Math.max(max2, nums2[i]);
        }
        return max2 - max1;
    }
}