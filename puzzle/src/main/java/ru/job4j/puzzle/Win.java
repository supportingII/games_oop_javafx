package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {

        for(int i = 0; i < board.length; i++) {

            if ( board[i][i] == 1 ) {
                if( checkVerticalLineWin(board,i) || checkHorizontalLineWin(board,i) ) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkVerticalLineWin( int[][] board, int indexCell ) {
        for(int i = 0; i < 5; i++){
            if( board[i][indexCell] != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHorizontalLineWin( int[][] board, int indexRow ) {
        for(int i = 0; i < 5; i++){
            if( board[indexRow][i] != 1) {
                return false;
            }
        }
        return true;
    }
}
