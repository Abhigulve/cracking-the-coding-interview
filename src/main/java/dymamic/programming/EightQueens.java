package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class EightQueens {
    public static void main(String[] args) {
        boolean[][] board = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };
        arrangeQueens(board,0);
        printSolution(board);
    }

    static void printSolution(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }


    public static boolean arrangeQueens(boolean[][] board, int currentRow) {
        if (currentRow >= board.length)
            return true;
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(currentRow, i, board)) {
                board[currentRow][i] = true;
                if (!arrangeQueens(board, currentRow + 1)) {
                    board[currentRow][i] = false;
                } else {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isSafe(int i, int j, boolean[][] board) {
        int k, l;
        for (k = 0; k < board.length; k++) {
            if ((board[i][k]) || (board[k][j]))
                return false;
        }
        for (k = 0; k < board.length; k++) {
            for (l = 0; l < board[0].length; l++) {
                if (((k + l) == (i + j)) || ((k - l) == (i - j))) {
                    if (board[k][l])
                        return false;
                }
            }
        }
        return true;
    }
}
