class Solution {
    public int compress(char[] chars) {
        var ans = 0;
        if (chars.length < 2) {
            return chars.length;
        }
        var prev = chars[0];
        var ptr = 0;
        var cur = 1;
        for (int i = 1; i < chars.length; i++) {
            if (prev != chars[i]) {
                chars[ptr] = prev;
                ptr++;
                if (cur == 1) {
                    ans++;
                } else {
                    var num = String.valueOf(cur).toCharArray();
                    ans += 1 + num.length;
                    for (char x : num) {
                        chars[ptr] = x;
                        ptr++;
                    }
                }
                prev = chars[i];
                cur = 1;
            } else {
                cur++;
            }
        }
        chars[ptr] = prev;
        ptr++;
        if (cur == 1) {
            ans++;
        } else {
            var num = String.valueOf(cur).toCharArray();
            ans += 1 + num.length;
            for (char x : num) {
                chars[ptr] = x;
                ptr++;
            }
        }
        return ans;
    }

}