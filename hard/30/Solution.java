import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        var esl = words.length * words[0].length();
        var wordMap = new HashMap<String, Integer>();
        if (esl > s.length()) {
            return List.of();
        }
        var x = 0;
        var arr = new int[words.length];
        for (int i = 0 ; i < words.length; i++) {
            if (wordMap.containsKey(words[i])) {
                arr[wordMap.get(words[i])]++;
            } else {
                wordMap.put(words[i], x);
                arr[x]++;
                x++;
            }
        }

        //System.out.println(Arrays.toString(arr));
        int i = 0;
        var im = false;
        var ans = new ArrayList<Integer>();
        while (i <= s.length() - esl) {
            var ss = s.substring(i, i + esl);
            //System.out.println(ss);
            int[] copy = Arrays.copyOf(arr, x);
            im = false;
            for (int j = 0; j < esl; j += words[0].length()) {
                var key = ss.substring(j, j + words[0].length());
                var idx = wordMap.get(key);
                if (idx != null) {
                    if (copy[idx] > 0) {
                        copy[idx]--;
                    } else {
                        im = true;
                        break;
                    }
                } else {
                    im = true;
                    break;
                }
            }
            if (!im) {
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}