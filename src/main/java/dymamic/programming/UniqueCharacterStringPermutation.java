package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class UniqueCharacterStringPermutation {
    public static void main(String[] args) {
        String[] strs = {"A", "B", "C"};
        printPermutations(strs, 0);
    }

    private static void printPermutations(String[] strs, int level) {
        if (level == strs.length) {
            for (int i = 0; i < strs.length; i++) {
                System.out.print(strs[i] + "");
            }
            System.out.println();
            return;
        }
        for (int i = level; i < strs.length; i++) {
            swap(level, i, strs);
            printPermutations(strs, level + 1);
            swap(level, i, strs);
        }
    }

    private static void swap(int level, int i, String[] strs) {
        String temp = strs[level];
        strs[level] = strs[i];
        strs[i] = temp;
    }
}
