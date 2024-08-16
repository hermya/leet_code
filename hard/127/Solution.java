import java.util.ArrayList;
import java.util.List;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        ArrayList<Integer>[] adjList = new ArrayList[wordList.size() + 1];
        adjList[0] = new ArrayList<Integer>(wordList.size());
        var ewi = 0;
        var items = new char[wordList.size()][wordList.get(0).length()];
        var bword = beginWord.toCharArray();
        for (int i = 0; i < wordList.size(); i++) {
            adjList[i + 1] = new ArrayList<Integer>(wordList.size());
            items[i] = wordList.get(i).toCharArray();
            if (isAdjacent(bword, items[i])) {
                adjList[0].add(i + 1);
                adjList[i + 1].add(0);
            }
            if (endWord.equals(wordList.get(i))) {
                ewi = 1 + i;
            }
        }

        for (int i = 0; i < wordList.size(); i++) {
            //adjList[i + 1] = new ArrayList<Integer>(wordList.size());
            for (int j = 1; j < wordList.size(); j++) {
                if (isAdjacent(items[i], items[j])) {
                    adjList[i + 1].add(j + 1);
                    adjList[j + 1].add(i + 1);
                }
            }
        }

        var visited = new boolean[wordList.size() + 1];

        visited[0] = true;
        var q = new int[5001];
        var first = 0;
        var last = 1;
        q[first] = 0;
        var pcount = 1;

        while (first < last) {
            pcount++;
            
            var t = last;
            while (first < last) {
                var polled = q[first];
                var ads = adjList[polled];
                for (Integer ele : ads) {
                    if (!visited[ele]) {
                        //System.out.println("visited=" + ele + ", word=" + wordList.get(ele - 1));
                        if (ele == ewi) {
                            return pcount;
                        }
                        visited[ele] = true;
                        q[t] = ele;
                        t++;
                    }
                } 
                first++;
            }
            last = t;
        }
        return 0;
    }

    boolean isAdjacent(char[] w1, char[] w2) {
        int x = 0;
        for (int i = 0; i < w1.length; i++) {
            if (w1[i] != w2[i]){
                x++;
                if (x > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}