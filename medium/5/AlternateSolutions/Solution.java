class Solution {
    public String longestPalindrome(String s) {
        int midPoint = 0;
        int longestPalLeft = 0, longestPalRight = 1;
        char[] sarr = s.toCharArray();

        while (midPoint < sarr.length) {
            int right, left;
            // oddLength pal
            right = midPoint;
            left = midPoint;

            while (left >= 0 && right < sarr.length && sarr[left] == sarr[right]) {
                left--;
                right++;
            }

            if (longestPalRight - longestPalLeft < (right - left - 1)) {
                longestPalRight = right;
                longestPalLeft = left + 1;
            }

            // even length pal

            right = midPoint + 1;
            left = midPoint;
            while (left >= 0 && right < sarr.length && sarr[left] == sarr[right]) {
                left--;
                right++;
            }

            if (longestPalRight - longestPalLeft < right - left) {
                longestPalRight = right;
                longestPalLeft = left + 1;
            }
            midPoint++;
        }

        return s.substring(longestPalLeft, longestPalRight);
    }
}