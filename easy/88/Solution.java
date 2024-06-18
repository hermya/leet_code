class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int ptr = m + n - 1; 
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[ptr] = nums1[i];
                i--;
            } else {
                nums1[ptr] = nums2[j];
                j--;
            }
            ptr--;
        }
        while (j >= 0 && ptr >= 0) {
            nums1[ptr] = nums2[j];
            ptr--;
            j--;
        }
    }
}