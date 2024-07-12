class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        var map = new int[128];
        var arr = s.toCharArray();
        var maxlen = 1;
        var curLen = 1;
        map[arr[0]] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (map[arr[i]] == 0 || map[arr[i]] < i + 1 - curLen) {
                curLen++;
                map[arr[i]] = i + 1;
            } else {
                curLen = i + 1 - map[arr[i]];
                map[arr[i]] = i + 1;
            }
            maxlen = Math.max(curLen, maxlen);
        }
        return maxlen;
    }
}