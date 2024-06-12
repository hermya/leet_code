import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        var map = new HashMap<String, List<Pair>>();
        for (int i = 0; i < equations.size(); i++) {
            var eq = equations.get(i);
            var val = values[i];
            var num = eq.get(0);
            var denom = eq.get(1);
            if (map.containsKey(num)) {
                map.get(num).add(new Pair(denom, val));
            } else {
                map.put(num, new ArrayList<>(
                    List.of(new Pair(denom, val))
                ));
            }
            if (map.containsKey(denom)) {
                map.get(denom).add(new Pair(num, 1/val));
            } else {
                map.put(denom, new ArrayList<>(
                    List.of(new Pair(num, 1/val))
                ));
            }
        }
        //System.out.println(map);
        var ans = new double[queries.size()];
        var idx = 0;
        for (List<String> query : queries) {
            var num = query.get(0);
            var denom = query.get(1);
            if (map.containsKey(num) && num.equals(denom)){
                ans[idx] = 1;
                idx++;
                continue;
            } else if (!map.containsKey(num)) {
                ans[idx] = -1;
                idx++;
            } else {
                var stack = new LinkedList<String>();
                var answer = new LinkedList<Double>();
                var visited = new HashMap<String, Boolean>();
                visited.put(num, true);
                stack.addLast(num);
                var found = false;
                var cur = 1d;
                while (!stack.isEmpty()) {
                    var cn = stack.pollLast();
                    cur = cn.equals(num) ? 1d : answer.pollLast();
                    if (cn.equals(denom)) {
                        found = true;
                        ans[idx] = cur;
                        idx++;
                        break;
                    }
                    var denoms = map.get(cn); 
                    for (Pair d : denoms) {
                        if (!visited.containsKey(d.s) || !visited.get(d.s)) {
                            visited.put(d.s, true);
                            stack.addLast(d.s);
                            answer.addLast(d.val * cur);
                        }
                    }
                }
                if (!found) {
                    ans[idx] = -1;
                    idx++;
                }
            }
        }
        return ans;
    }
}

class Pair {
    String s;
    double val;
    Pair(String i, double j) {
        s = i;
        val = j;
    }

    public String toString() {
        return "(" + s + ", " + val + ")"; 
    }
}