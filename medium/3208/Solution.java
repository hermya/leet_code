class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < colors.length - 1) {
            int next = right + 1;
            if (colors[next] != colors[right]) {
                right = next;
                if (right - left + 1 == k) {
                    // System.out.println(left + ", " + right);
                    count++;
                    left++;
                }
            } else {
                right = next;
                left = next;
            }
        }
        if (colors[0] != colors[colors.length - 1]) {
            right = 0;
            if (colors.length + right - left + 1 == k) {
                // System.out.println(left + ", " + right);
                count++;
                left++;
            }

            while (right < k - 2) {
                int next = right + 1;
                if (colors[next] != colors[right]) {
                    right = next;
                    if (colors.length + right - left + 1 == k) {
                        // System.out.println(left + ", " + right);
                        count++;
                        left++;
                    }
                } else {
                    break;
                }
            }
        }

        return count;
    }
}