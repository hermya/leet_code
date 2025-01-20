class Solution {
    public String getSmallestString(String s, int k) {
        var charArray = s.toCharArray();
        var start = 0;
        
        while (k > 0 && start < s.length()) {
            int charToChange = charArray[start] - 'a';
        
            if (charToChange > 0) {
                var ld = charToChange;
                var rd = (26 - charToChange);
                if (ld < rd) {
                    var temp = Math.min(ld, k);
                    charToChange -=temp;
                    k -=temp;
                } else {
                    var temp = Math.min(rd, k);
                    if ((charToChange + temp)%26 > charToChange) {
                        charToChange -= temp;
                        k -=temp;
                    } else {
                        charToChange = (charToChange + temp) % 26;
                        k -=temp;
                    }
                }
            }
            charArray[start] = (char) ((int)'a' + charToChange);
            start++;
        }
        return String.valueOf(charArray);
    }
}