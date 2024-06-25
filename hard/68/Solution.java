import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> temp = new LinkedList<>();
        var n = words.length;
        var curlen = 0;
        var curList = new LinkedList<String>();
        var s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            curList.addLast(words[i]);
            curlen += words[i].length() + 1;
            if (curlen >= maxWidth) {
                if (curlen == maxWidth) {
                    if (i == n - 1) {
                        break;
                    }
                    s.append(curList.pollFirst());
                    s.append(" ");
                    if (curList.size() > 0) {
                        s.append(" ");
                        s.append(String.join(" ", curList));
                    }
                    temp.add(s.toString());
                    s = new StringBuilder();
                    curList = new LinkedList<>();
                    curlen = 0; 
                } else if (curlen == maxWidth + 1) {
                    temp.add(String.join(" ", curList));
                    curList = new LinkedList<>();
                    curlen = 0;
                } else {
                    var last = curList.pollLast();
                    var charLen = curlen - last.length() - 1 - curList.size();
                    var spaces = maxWidth - charLen;
                    if (curList.size() == 1) {
                        temp.add(curList.pollFirst() + " ".repeat(spaces));
                        curlen = last.length() + 1;
                    } else {
                        var ss = spaces/(curList.size() - 1);
                        var es = spaces%(curList.size() - 1);
                        while (curList.peekLast() != null) {
                            s.append(curList.pollFirst());
                            s.append(" ".repeat(ss));
                            if (es > 0) {
                                s.append(" ");
                                es--;
                            }
                        }
                        curlen = last.length() + 1;
                        temp.add(s.toString().trim());
                        s = new StringBuilder();
                    }
                    curList.add(last);
                }
            } 
        }
        if (curList.size() > 0) {
            var charLen = curlen - curList.size();
            var spaces = maxWidth - charLen;
            temp.add(String.join(" ", curList).trim() + " ".repeat(spaces - (curList.size() > 1 ? (curList.size() - 1) : 0)));
        }
        return temp;
    }
}