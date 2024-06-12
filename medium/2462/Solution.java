import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        var cost = 0l;
        var pq = new PriorityQueue<Pair>(new PairComparator());
        int i = 0;
        int j = costs.length - 1;
        while (i < candidates && i <= j) {
            pq.add(new Pair(costs[i], i));
            i++;
        }
        var a = 0;
        while (a < candidates && j >= i) {
            pq.add(new Pair(costs[j], j));
            a++;
            j--;
        }
        k--;

        var last = pq.poll();
        cost += last.val;
        while (k > 0) {
            if (last.ind < i && i <= j) {
                pq.add(new Pair(costs[i], i));
                i++;
            } else if (last.ind > j && j >= i) {
                pq.add(new Pair(costs[j], j));
                j--;
            }
            last = pq.poll();
            cost += last.val;
            k--;
        }
        return cost;
    }
}

class Pair {
    int val;
    int ind;
    Pair (int i, int j) {
        val = i;
        ind = j;
    }

    public String toString() {
        return "(" + val + ", " + ind + ")";
    } 
}

class PairComparator implements Comparator<Pair>{
    
    public int compare(Pair s1, Pair s2) {
        if (s1.val != s2.val) {
            return s1.val - s2.val;
        }
        return s1.ind - s2.ind;
    }
}