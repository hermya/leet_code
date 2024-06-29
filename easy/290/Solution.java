import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] arr = new int[26];
        var map = new HashMap<String, Integer>();
        var arrId = 1;
        var mapId = 1;

        var strs = s.split(" ");
        var chars = pattern.toCharArray();
        if (strs.length != chars.length) {
            return false;
        }

        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(strs[i]) && arr[chars[i] - 'a'] == map.get(strs[i])) {
                continue;
            }
            if (map.containsKey(strs[i]) && arr[chars[i] - 'a'] != map.get(strs[i])) {
                return false;
            }
            if (!map.containsKey(strs[i]) && arr[chars[i] - 'a'] > 0) {
                return false;
            }
            if (!map.containsKey(strs[i]) && arr[chars[i] - 'a'] == 0) {
                map.put(strs[i], mapId);
                mapId++;
                arr[chars[i] - 'a'] = arrId;
                arrId++;
            }
        }
        return true;
    }
}