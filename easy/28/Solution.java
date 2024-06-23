import java.util.ArrayList;

class Solution {
    public int strStr(String haystack, String needle) {
        var h = haystack.toCharArray();
        var nee = needle.toCharArray();
        var occurances = new ArrayList<Occur>();

        for (int i = 0; i < h.length; i++) {
            if (h[i] == nee[0]) {
                var o = new Occur();
                o.idx = i;
                o.l = 1;
                occurances.add(o);
            }
        }
        for (Occur o : occurances) {
            var n = o.idx + nee.length;
            var found = true;
            var j = 1;
            for (int i = o.idx + 1; i < n && i < h.length; i++) {
                if (h[i] != nee[j]) {
                    found = false;
                    break;
                } else {
                    o.l++;
                }
                j++;
            }
            if (found && o.l == nee.length) {
                return o.idx;
            }
        }
        return -1;
    }
}

class Occur {
    int idx;
    int l;
}