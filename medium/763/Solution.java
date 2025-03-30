import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[][] firstLast = new int[26][2];

        char[] sarr = s.toCharArray();
        char firstChar = sarr[0];

        for (int i = 1; i < sarr.length; i++) {
            if (firstChar != sarr[i]) {
                if (firstLast[sarr[i] - 'a'][0] == 0) {
                    firstLast[sarr[i] - 'a'][0] = i;
                    firstLast[sarr[i] - 'a'][1] = i;
                } else {
                    firstLast[sarr[i] - 'a'][1] = i;
                }
            } else {
                firstLast[sarr[i] - 'a'][1] = i;
            }
        }

        int firstCharEnd = firstLast[firstChar - 'a'][1];
        List<Integer> ans = new ArrayList<>();
        int prevSum = 0;

        for (int i = 1; i < sarr.length; i++) {
            int[] tempFirstLast = firstLast[sarr[i] - 'a'];
            if (tempFirstLast[0] > firstCharEnd) {
                if (ans.isEmpty()) {
                    ans.add(i);
                    prevSum = i;
                } else {
                    ans.add(i - prevSum);
                    prevSum = i;
                }
                firstCharEnd = tempFirstLast[1];
            } else {
                firstCharEnd = Math.max(firstCharEnd, tempFirstLast[1]);
            }
        }

        if (ans.isEmpty()) {
            ans.add(sarr.length);
        } else {
            ans.add(sarr.length - prevSum);
        }

        return ans;
    }
}