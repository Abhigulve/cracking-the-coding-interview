package dymamic.programming;

/**
 * @author Abhijeet Gulve
 * <p>
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 */
public class TripleStep {
    public static void main(String[] args) {
        int n = 4;
        int[] memo = new int[n];
        System.out.println(getAllPossibleStepCombination(n, memo));
    }

    static int getAllPossibleStepCombination(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            if (memo[n - 1] == 0) {
                memo[n - 1] = getAllPossibleStepCombination(n - 1, memo) + getAllPossibleStepCombination(n - 2, memo) + getAllPossibleStepCombination(n - 3, memo);
            }
            return memo[n - 1];
        }
    }
}