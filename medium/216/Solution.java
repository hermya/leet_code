import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        var finalAns = new ArrayList<List<Integer>>();
        backTrack(k, n, 0, finalAns, new LinkedList<Integer>(), 0);
        return finalAns;
    }

    void backTrack(int k, int n, int sumUntil, List<List<Integer>> finalAns, LinkedList<Integer> currentAns, int used) {
        if (currentAns.size() == k) {
            if (sumUntil == n) {
                finalAns.add(List.copyOf(currentAns));
            }
            return;
        }
        for (int i = used + 1; i <= 9; i++) {
            sumUntil += i;
            currentAns.addLast(i);
            backTrack(k, n, sumUntil, finalAns, currentAns, i);
            currentAns.pollLast();
            sumUntil -= i;
        }
    }
}