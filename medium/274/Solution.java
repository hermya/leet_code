import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        var n = citations.length;
        Arrays.sort(citations);
        var min = 6000;
        var h = -1;
        for (int i = n - 1; i >= 0; i--) {
            var diff = Math.abs(citations[i] - (n - i));
            if (diff < min) {
                min = diff;
                h = Math.max(h, Math.min(citations[i], n - i));
            }
        }
        return h;
    }
}