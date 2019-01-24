package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class PaintFill {
    public static void main(String[] args) {
        int[][] screens = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        printMatrix(screens);
        paintFill(screens, 3, 1, 3, 2);
        System.out.println();
        printMatrix(screens);
    }

    private static void printMatrix(int[][] screens) {
        for (int i = 0; i < screens.length; i++) {
            for (int j = 0; j < screens[0].length; j++) {
                System.out.print(screens[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void paintFill(int[][] screens, int row, int col, int replaceColor, int givenColor) {
        if (row < 0 || row >= screens.length || col < 0 || col >= screens[0].length) {
            return;
        }

        if (screens[row][col] == givenColor) {
            screens[row][col] = replaceColor;
            paintFill(screens, row - 1, col, replaceColor, givenColor);
            paintFill(screens, row + 1, col, replaceColor, givenColor);
            paintFill(screens, row, col - 1, replaceColor, givenColor);
            paintFill(screens, row, col + 1, replaceColor, givenColor);
        }
    }


}
