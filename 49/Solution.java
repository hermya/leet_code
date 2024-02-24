import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var answer = new ArrayList<List<String>>();
        var hashMap = new HashMap<String, List<String>>();
        var hashx = "";
        for (int i = 0; i < strs.length; i++){
            hashx = hash(strs[i]);
            if (hashMap.containsKey(hashx)) {
                hashMap.get(hashx).add(strs[i]);
            } else {
                var tempList = new ArrayList<String>(List.of(strs[i]));
                hashMap.put(hashx, tempList);
                answer.add(tempList);
            }
        }
        return answer;
    }
    boolean stringsAreAnagrams(String s1, String s2) {
        return hash(s1).equals(hash(s2));
    }

    String hash(String s){
        var chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}