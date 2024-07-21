import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        var wordSet = new HashSet<String>(wordDict);
        ArrayList<Integer>[] list = new ArrayList[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list[j] = list[j] == null ? new ArrayList<Integer>() : list[j];
                if (wordSet.contains(s.substring(i, j))) {
                    list[j].add(i);
                }
            }
        }        

        var visited = new boolean[s.length() + 1];
        if (list[s.length()].isEmpty()) {
            return false;
        }
        visited[s.length()] = true;
        for (int i = s.length(); i > 0; i--) {
            if (visited[i]) {
                var goesTo = list[i];
                for (Integer j : goesTo) {
                    visited[j] = true;
                }
            }
        }
        return visited[0];
    }
}