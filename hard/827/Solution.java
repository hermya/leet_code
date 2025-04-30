import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int largestIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] union = new int[m][n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                union[i][j][0] = -1;
                union[i][j][1] = -1;
                unionize(grid, i, j, union);
            }
        }

        //print(union, m, n);


        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(getDistance(grid, i, j, union, m, n)[0], ans);
            }
        }

        return ans;
    }

    int[] getDistance(int[][] grid, int i, int j, int[][][] union, int m, int n) {
        if (grid[i][j] == 1) {
            // no flip, just find parent
            int childI = i;
            int childJ = j;
            int tempI = union[i][j][0];
            int tempJ = union[i][j][1];
            while (tempI > -1 && tempJ > -1) {
                childI = tempI;
                childJ = tempJ;
                tempI = union[childI][childJ][0];
                tempJ = union[childI][childJ][1];
            }
            return new int[]{-1 * union[childI][childJ][0], childI, childJ};
        } else {
            // find distances from all four directions
            // make sure that parents in all four directions are not evaluated again and again
            var tempMap = new HashMap<Pair<Integer, Integer>, Integer>();
            if (i > 0 && grid[i - 1][j] == 1) {
                int[] temp = getDistance(grid, i - 1, j, union, m, n);
                tempMap.put(new Pair<>(temp[1], temp[2]), temp[0]);
            }
            if (i < m - 1 && grid[i + 1][j] == 1) {
                int[] temp = getDistance(grid, i + 1, j, union, m, n);
                tempMap.put(new Pair<>(temp[1], temp[2]), temp[0]);
            }
            if (j > 0 && grid[i][j - 1] == 1) {
                int[] temp = getDistance(grid, i, j - 1, union, m, n);
                tempMap.put(new Pair<>(temp[1], temp[2]), temp[0]);
            }
            if (j < n - 1 && grid[i][j + 1] == 1) {
                int[] temp = getDistance(grid, i, j + 1, union, m, n);
                tempMap.put(new Pair<>(temp[1], temp[2]), temp[0]);
            }

            return new int[] {tempMap.values().stream().reduce(0, Integer::sum) + 1, i, j};
        }
    }

    void unionize(int[][] grid, int i, int j, int[][][] union) {
        // at every new (i, j), I'm sure to be on an edge which has not been discovered yet 
        int fpI = -1;
        int fpJ = -1;
        if (j > 0 && grid[i][j - 1] == 1 && grid[i][j] == 1) {
            // find parent of grid[i][j - 1]. That parent is grid[i][j]'s parent
            int childI = i;
            int childJ = j - 1;
            int tempI = union[i][j - 1][0];
            int tempJ = union[i][j - 1][1];
            while (tempI > -1 && tempJ > -1) {
                childI = tempI;
                childJ = tempJ;
                tempI = union[childI][childJ][0];
                tempJ = union[childI][childJ][1];
            }
            union[i][j][0] = childI;
            union[i][j][1] = childJ;
            fpI = childI;
            fpJ = childJ;
            union[childI][childJ][0] --;
            union[childI][childJ][1] --;
        }
        if (i > 0 && grid[i - 1][j] == 1 && grid[i][j] == 1) {
            // find parent of grid[i][j - 1]. That parent is grid[i][j]'s parent
            int childI = i - 1;
            int childJ = j;
            int tempI = union[i - 1][j][0];
            int tempJ = union[i - 1][j][1];
            while (tempI > -1 && tempJ > -1) {
                childI = tempI;
                childJ = tempJ;
                tempI = union[childI][childJ][0];
                tempJ = union[childI][childJ][1];
            }
            if (fpI == -1) {
                union[i][j] = new int[]{childI, childJ};
                union[childI][childJ][0] --;
                union[childI][childJ][1] --;
            } else if (fpI != childI || fpJ != childJ) {
                int size = union[fpI][fpJ][0];
                union[fpI][fpJ][0] = childI;
                union[fpI][fpJ][1] = childJ;
                union[childI][childJ][0] += size;
                union[childI][childJ][1] += size;
            }
        }
    }

    void print(int[][][] union, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Arrays.toString(union[i][j]) + "\t");
            }
            System.out.println();
        } 

    }

}

class Pair<K, L> {
    private K first;
    private L second;

    public Pair(K f, L s) {
        this.first = f;
        this.second = s;
    }
}