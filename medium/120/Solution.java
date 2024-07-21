import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        var n = triangle.size();
        var paths = new Node[n * (n + 1) / 2  +  1][2];
        var s = 0;
        paths[0][0] = new Node(1, triangle.get(0).get(0));
        paths[0][1] = paths[0][0];
        s++;
        var next = 1;
        for (int i = 1; i < triangle.size(); i++) {
            next++;
            for (int j = 0; j < triangle.get(i).size() - 1; j++) {
                paths[s][0] = new Node(next, triangle.get(i).get(j));
                paths[s][1] = new Node(next + 1, triangle.get(i).get(j + 1));
                s++;
                next++;
            }
        }
        var last = triangle.get(triangle.size() - 1);
        next++;
        for (int i = 0; i < last.size(); i++) {
            paths[s][0] = new Node(next, 0);
            paths[s][1] = new Node(next, 0);
            s++;
        }

        // for (Node[] x : paths){
        //     for (Node y : x) {
        //         System.out.print(y);
        //     }
        //     System.out.println();
        // }

        var minTraversal = new int[n * (n + 1) / 2  +  2];
        for (int i = 0; i < minTraversal.length; i++) {
            minTraversal[i] = 100000000;
        }
        minTraversal[0] = 0;
        for (int i = 0; i < paths.length; i++) {
            var w1 = paths[i][0];
            var w2 = paths[i][1];
            minTraversal[w1.i] = Math.min(minTraversal[w1.i], minTraversal[i] + w1.r);
            minTraversal[w2.i] = Math.min(minTraversal[w2.i], minTraversal[i] + w2.r);
        }

        //System.out.println(Arrays.toString(minTraversal));
        return minTraversal[minTraversal.length - 1];
    }
}

class Node {
    int r;
    int i;
    Node (int a, int b) {
        i = a;
        r = b;
    }

    public String toString() {
        return "[" + r + " for " + i + "] ";
    }
}