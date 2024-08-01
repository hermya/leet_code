class Solution {
    public boolean exist(char[][] board, String word) {
        var arr = word.toCharArray();
        var visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                visited[i][j] = true;
                var found = search(board, arr, visited, i, j, 0);
                if (found) {
                    return true;
                }
                visited[i][j] = false;
            }
        }
        return false;
    }

    boolean search(char[][] board, char[] word, boolean[][] visited, int i, int j, int k) {
        //System.out.println(String.valueOf(Arrays.copyOf(word, k)));
        if (k == word.length) {
            return true;
        }
        
        if (board[i][j] != word[k]) {
            return false;
        }
        
        k++;

        if (i > 0 && !visited[i - 1][j]) {
            visited[i - 1][j] = true;
            var f = search(board, word, visited, i - 1, j, k);
            if (f) {
                return f;
            }
            visited[i - 1][j] = false;
        }
        if (i < board.length - 1 && !visited[i + 1][j]) {
            visited[i + 1][j] = true;
            var f = search(board, word, visited, i + 1, j, k);
            if (f) {
                return f;
            }
            visited[i + 1][j] = false;
        }
        if (j > 0 && !visited[i][j - 1]) {
            visited[i][j - 1] = true;
            var f = search(board, word, visited, i, j - 1, k);
            if (f) {
                return f;
            }
            visited[i][j - 1] = false;
        }
        if (j < board[0].length - 1 && !visited[i][j + 1]) {
            visited[i][j + 1] = true;
            var f = search(board, word, visited, i, j + 1, k);
            if (f) {
                return f;
            }
            visited[i][j + 1] = false;
        }
        return k == word.length;
    }
}