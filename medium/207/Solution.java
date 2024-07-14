import java.util.ArrayList;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adList = new ArrayList[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            if (adList[prerequisites[i][0]] == null) {
                adList[prerequisites[i][0]] = new ArrayList<>();
            }
            adList[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        
        var recStack = new boolean[numCourses];
        for (int i = 0; i < adList.length; i++) {
            var visited = new boolean[numCourses];
            var ans = cycleExists(visited, recStack, adList, i);
            if (ans) return false;
        }
        return true;
    }

    boolean cycleExists(boolean[] visited, boolean[] recStack, ArrayList<Integer>[] adList, int i) {
        var list = adList[i];
        if (adList[i] == null || adList[i].isEmpty()) {
            return false;
        }
        if (recStack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        recStack[i] = true;
        for (int x : adList[i]) {
            var ans = cycleExists(visited, recStack, adList, x);
            if (ans) return ans;
        }
        recStack[i] = false;
        return false;           
    }
}