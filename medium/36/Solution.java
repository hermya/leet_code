class Solution {
    public boolean isValidSudoku(char[][] board) {
        var rSet = new int[10][10];
        var cSet = new int[10][10];
        var bSet = new int[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                var val = board[i][j] - '0';
                if (rSet[i][val] == 0) {
                    rSet[i][val]++;
                } else {
                    //System.out.println("At row " + i + " value " + val + " occurred twice");
                    return false;
                }
                if (cSet[j][val] == 0) {
                    cSet[j][val]++;
                } else {
                    //System.out.println("At col " + j + " value " + val + " occurred twice");
                    return false;
                }
                var b = 3 * (i / 3) + j / 3;
                if (bSet[b][val] == 0) {
                    bSet[b][val]++;
                } else {
                    //System.out.println("At box " + b + " i=" + i + " j=" + j + " value " + val + " occurred twice");
                    return false;
                }
            }
        }
        return true;
    }
}