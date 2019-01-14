package dymamic.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 * <p>
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that
 * the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
 * the bottom right
 */
public class RobotGrid {
    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 0, 0, 0},
                        {1, 1, 0, 0},
                        {0, 1, 1, 0},
                        {0, 0, 1, 1}
                };

        /**
         * Expected result is
         *  [3 3, 3 2, 2 2, 2 1, 1 1, 1 0, 0 0]
         */
        List<String> path = new ArrayList<>();
        isValidPath(0, 0, mat, path);
        System.out.println(path);
    }

    static boolean isValidPath(int row, int col, int[][] grid, List<String> path) {
        if ((row == grid.length - 1) && col == grid[0].length - 1) {
            path.add(row + " " + col);
            return true;
        }
        if (row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return false;
        }
        if ((grid[row][col] == 1) && isValidPath(row + 1, col, grid, path)) {
            path.add(row + " " + col);
            return true;
        } else if ((grid[row][col] == 1) && isValidPath(row, col + 1, grid, path)) {
            path.add(row + " " + col);
            return true;
        } else return false;
    }


}
