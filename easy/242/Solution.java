class Solution {
    public boolean isAnagram(String s, String t) {
        var s1 = new char[26];
        var t1 = new char[26];
        if (s.length() != t.length()) {
            return false;
        }
        var sarr = s.toCharArray();
        var tarr = t.toCharArray();
        for (int i = 0; i < sarr.length; i++) {
            s1[sarr[i] - 'a']++;
            t1[tarr[i] - 'a']++;
        }
        return String.valueOf(t1).equals(String.valueOf(s1));
    }
}