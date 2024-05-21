class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                var one = giveColor(grid[i][j]);
                var two = giveColor(grid[i][j+1]);
                var three = giveColor(grid[i+1][j]);
                var four = giveColor(grid[i+1][j+1]);
                var square = canDo(new int[]{one, two, three, four});
                if (square) {
                    return true;
                }
            }
        }
        return false;
    }

    int giveColor(char x) {
        return x == 'B' ? 0 : 1;
    }

    boolean canDo(int[] arr) {
        // black is zero
        // white is one
        var c = 0;
        for (int col : arr)
            c += col;
        return c!=2;
    }
}