import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        var board = new int[8][8];
        for (int i = 0; i < queens.length; i++) {
            board[queens[i][0]][queens[i][1]] = 1;
        }
        var ans = new ArrayList<List<Integer>>();
        for (int i = king[0] -1; i >= 0; i--) {
            if (board[i][king[1]] == 1) {
                ans.add(List.of(i, king[1]));
                break;
            }
        }
        for (int i = king[0]+1; i < 8; i++) {
            if (board[i][king[1]] == 1) {
                ans.add(List.of(i, king[1]));
                break;
            }
        }
        for (int i = king[1]-1; i >= 0; i--) {
            if (board[king[0]][i] == 1) {
                ans.add(List.of(king[0], i));
                break;
            }
        }
        for (int i = king[1]+1; i < 8; i++) {
            if (board[king[0]][i] == 1) {
                ans.add(List.of(king[0], i));
                break;
            }
        }
        // diag
        for (int i = king[0] -1, j = king[1] -1; i >= 0 && j >= 0; i--,  j--) {
            if (board[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
        }
        for (int i = king[0] +1, j = king[1] +1; i <8 && j < 8; i++,  j++) {
            if (board[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
        }
        for (int i = king[0] + 1, j = king[1] -1; i < 8 && j >= 0; i++,  j--) {
            if (board[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
        }
        for (int i = king[0] -1, j = king[1] +1; i >= 0 && j < 8; i--,  j++) {
            if (board[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
        }
        return ans;
    }
}