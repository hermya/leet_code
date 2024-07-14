import java.util.LinkedList;

class Solution {
    public int snakesAndLadders(int[][] board) {
        LinkedList<Move> moves = new LinkedList<>();
        var m = board.length; 
        var n = board[0].length; 
        var bl = new int[m*n];
        var ch = false;
        var x = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++ ) {
                var t = ch ? n - 1 - j : j;
                bl[x] = board[i][t];
                x++;
            }
            ch = !ch;
        }
        // for (int[] px : board) {
        //     System.out.println(Arrays.toString(px));
        // }

        var init = new Move(0, bl[0], 0, false);
        moves.addLast(init);

        var visited = new boolean[bl.length];
        visited[0] = true;        
        var vas = new boolean[bl.length];

        var bestCount = new int[bl.length];
        for (int i = 1; i < bl.length; i++) {
            bestCount[i] = 401;
        }
        var ans = 401;
        while (!moves.isEmpty()) {
            var pos = moves.pollFirst();
            //System.out.println("Visiting " + (pos.i + 1));
            if (pos.i == m*n - 1) {
                ans = Math.min(ans, pos.moves);
                continue;
            }
            if (pos.val == -1 || pos.isSub) {
                for(int i = pos.i + 1; i < (pos.i + 7) && i < (m * n); i++) {
                    if (!visited[i] || bestCount[i] > pos.moves + 1) {
                        moves.addLast(new Move(i, bl[i], pos.moves + 1, false));
                        bestCount[i] = pos.moves + 1;
                        visited[i] = true;
                    }
                } 
            } else {
                if (!vas[pos.val - 1] || bestCount[pos.val - 1] > pos.moves) {
                    moves.addLast(new Move(pos.val - 1, bl[pos.val - 1], pos.moves, true));
                    bestCount[pos.val - 1] = pos.moves;
                    vas[pos.val - 1] = true;
                }
            }
        }
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++ ) {
        //         System.out.print(bestCount[i * m + j] + " ");
        //     }
        //     System.out.println();
        // }
        //System.out.println(Arrays.toString(bestCount));
        return ans == 401 ? -1 : ans;
    }
}

class Move {
    int i;
    int val;
    int moves;
    boolean isSub;
    String track;
    Move (int a, int b, int moves, boolean isSub) {
        i = a;
        val = b;
        this.moves = moves;
        this.isSub = isSub;
    }
}