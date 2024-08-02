class Solution {
    public void gameOfLife(int[][] board) {
        // 0 -> previously 0 and now 0
        // 1 -> previously 1 and now 1
        // 2 -> previously 0 and now 1
        // 3 -> previously 1 and now 0
        var m = board.length;
        var n = board[0].length;
        var ts = 0;
        if (m == 1 && n == 1) {
            board[0][0] = 0;
        }
        if (m == 1) {
            board[0][0] = board[0][0] == 1 ? 3 : 0;
            board[0][n - 1] = board[0][n - 1] == 1 ? 3 : 0;

            for (int i = 1; i < n - 1; i++) {
                ts = board[0][i - 1] % 2 + board[0][i + 1] % 2;
                if (board[0][i] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[0][i] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[0][i] = 2;
                    }
                }
            }
        } 
        if (n == 1) {
            board[0][0] = board[0][0] == 1 ? 3 : 0;
            board[m - 1][0] = board[m - 1][0] == 1 ? 3 : 0;

            for (int i = 1; i < m - 1; i++) {
                ts = board[i - 1][0] % 2 + board[i + 1][0] % 2;
                if (board[i][0] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[i][0] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[i][0] = 2;
                    }
                }
            }
        }
        if (m > 1 && n > 1) {
            ts = board[0][1] % 2 + board[1][0] % 2 + board[1][1] % 2;
            if (board[0][0] == 1) {
                if (ts < 2 || ts > 3) {
                    board[0][0] = 3;
                } 
            } else {
                if (ts == 3) {
                    board[0][0] = 2;
                }
            }

            ts = board[0][n - 2] % 2 + board[1][n - 1] % 2 + board[1][n - 2] % 2;
            if (board[0][n - 1] == 1) {
                if (ts < 2 || ts > 3) {
                    board[0][ n - 1] = 3;
                } 
            } else {
                if (ts == 3) {
                    board[0][ n - 1] = 2;
                }
            }

            ts = board[m - 1][1] % 2 + board[m - 2][1] % 2 + board[m - 2][0] % 2;
            if (board[m - 1][0] == 1) {
                if (ts < 2 || ts > 3) {
                    board[m - 1][0] = 3;
                } 
            } else {
                if (ts == 3) {
                    board[m - 1][0] = 2;
                }
            }

            ts = board[m - 1][n - 2] % 2 + board[m - 2][n - 2] % 2 + board[m - 2][n - 1] % 2;
            if (board[m - 1][n - 1] == 1) {
                if (ts < 2 || ts > 3) {
                    board[m - 1][n - 1] = 3;
                } 
            } else {
                if (ts == 3) {
                    board[m - 1][n - 1] = 2;
                }
            }
        }

        //print(board);

        if (n > 2 && m > 1) {
            for (int i = 1; i < n - 1; i++) {
                ts = board[0][i - 1] % 2 + board[0][i + 1] % 2 + board[1][i - 1] % 2 + board[1][i] % 2 + board[1][i + 1] % 2;
                if (board[0][i] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[0][i] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[0][i] = 2;
                    }
                }
            }

            for (int i = 1; i < n - 1; i++) {
                ts = board[m - 1][i - 1] % 2 + board[m - 1][i + 1] % 2 + board[m - 2][i - 1] % 2 + board[m - 2][i] % 2 + board[m - 2][i + 1] % 2;
                if (board[m - 1][i] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[m - 1][i] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[m - 1][i] = 2;
                    }
                }
            }
        }

        //print(board);

        if (n > 1 && m > 2) {
            for (int i = 1; i < m - 1; i++) {
                ts = board[i - 1][0] % 2 + board[i + 1][0] % 2 + board[i - 1][1] % 2 + board[i][1] % 2 + board[i + 1][1] % 2;
                if (board[i][0] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[i][0] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[i][0] = 2;
                    }
                }
            }

            for (int i = 1; i < m - 1; i++) {
                ts = board[i - 1][n - 1] % 2 + board[i + 1][n - 1] % 2 + board[i - 1][n - 2] % 2 + board[i][n - 2] % 2 + board[i + 1][n - 2] % 2;
                if (board[i][n - 1] == 1) {
                    if (ts < 2 || ts > 3) {
                        board[i][n - 1] = 3;
                    } 
                } else {
                    if (ts == 3) {
                        board[i][n - 1] = 2;
                    }
                }
            }
        }

        //print(board);

        if (n > 2 && m > 2) {
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    //print(board);
                    ts = board[i - 1][j - 1] % 2 + board[i - 1][j] % 2 + board[i - 1][j + 1] % 2 + board[i][j - 1] % 2 + board[i][j + 1] % 2 + board[i + 1][j - 1] % 2 + board[i + 1][j] % 2 + board[i + 1][j + 1] % 2;
                    //System.out.println("i=" + i + ", j=" + j + ", ts=" + ts);
                    if (board[i][j] == 1) {
                        if (ts < 2 || ts > 3) {
                            board[i][j] = 3;
                        } 
                    } else {
                        if (ts == 3) {
                            board[i][j] = 2;
                        }
                    }
                }
            }
        }

       // print(board);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
                //board[i][j] = board[i][j] % 2;
            }
        }
    }

    void print (int[][] board) {
        for (int[] x : board) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
    }

}