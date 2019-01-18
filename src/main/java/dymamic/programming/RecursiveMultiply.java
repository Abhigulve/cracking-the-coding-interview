package dymamic.programming;

/**
 * @author Abhijeet Gulve
 * <p>
 * Recursive Multiply: Write a recursive function to multiply two positive integers without using
 * the * operator (or / operator). You can use addition, subtraction, and bit shifting, but you should
 * minimize the number of those operations.
 * </p>
 */
public class RecursiveMultiply {
    public static void main(String[] args) {
        System.out.println(product(10, 15));
    }

    private static int product(int small, int large) {
        if (small == 0) {
            return 0;
        }
        if (small == 1) {
            return large;
        }
        int smaller = small >> 1;
        int half = product(smaller, large);
        if (small % 2 == 0) {
            return half + half;
        } else {
            return half + half + large;
        }
    }

}
