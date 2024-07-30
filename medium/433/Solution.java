import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        ArrayList<Integer>[] adjList = new ArrayList[1 + bank.length];

        adjList[0] = new ArrayList<>();
        for (int i = 0; i < bank.length; i++) {
            adjList[i + 1] = new ArrayList<Integer>();
            if (canMutate(startGene, bank[i])) {
                adjList[0].add(i + 1);
                adjList[i + 1].add(0);
            }
        }
        for (int i = 0; i < bank.length; i++) {
            for (int j = i + 1; j < bank.length; j++) {
                if (canMutate(bank[i], bank[j])) {
                    adjList[i + 1].add(j + 1);
                    adjList[j + 1].add(i + 1);
                }
            }
        }

        // for (List x : adjList) {
        //     System.out.println(x);
        // }

        var visited = new boolean[adjList.length];
        var queue = new LinkedList<Integer>();
        queue.addLast(0);
        var count = 0;
        while (!queue.isEmpty()) {
            var temp = new LinkedList<Integer>();
            count++;
            while (!queue.isEmpty()) {
                var node = queue.pollFirst();
               // System.out.println(node);
                if (!visited[node]) {
                    visited[node] = true;
                    for (Integer ns : adjList[node]) {
                        if (!visited[ns]) {
                            temp.addLast(ns);
                            //System.out.println(bank[ns - 1] + " " + endGene);
                            if (bank[ns - 1].equals(endGene)) {
                                return count;
                            }
                        }
                    }
                }
            }
            queue = temp;            
        }
        return -1;
    }

    boolean canMutate(String a, String b) {
        var arr = a.toCharArray();
        var brr = b.toCharArray();

        boolean mut = false;
        for (int i = 0; i < 8; i++) {
            if (!mut && arr[i] != brr[i]) {
                mut = true;
            } else if (arr[i] != brr[i]) {
                return false;
            }
        }
        return true;
    }
}