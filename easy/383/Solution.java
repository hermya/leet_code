class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var m = new int[26];
        var mag = magazine.toCharArray();
        for (int i = 0; i < mag.length; i++) {
            m[mag[i] - 'a']++;
        }
        var ran = ransomNote.toCharArray();
        for (int i = 0; i < ran.length; i++) {
            m[ran[i] - 'a']--;
            if (m[ran[i] - 'a'] == -1) {
                return false;
            }
        }
        return true;
    }
}