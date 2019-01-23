package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class ValidParanthesisPrint {
    public static void main(String[] args) {
        char[] array = new char[6];
        printAllValidParanthesis(3, 3, array, 0);
    }

    private static void printAllValidParanthesis(int left, int right, char[] array, int index) {

        if (left < 0 | right < 0) {
            return;
        }
        if (right < left) {
            return;
        }
        if (left == 0 && right == 0) {
            print(array);
        } else {
            array[index] = '(';
            printAllValidParanthesis(left - 1, right, array, index + 1);
            array[index] = ')';
            printAllValidParanthesis(left, right - 1, array, index + 1);
        }
    }

    static void print(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


}
