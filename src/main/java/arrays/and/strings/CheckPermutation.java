package arrays.and.strings;

/**
 * @author Abhijeet Gulve
 * <p>
 * ex.
 * String s1=dog
 * String s2=god
 * These two strings are permutations of each other
 * <p>
 */
public class CheckPermutation {
    public static void main(String[] args) {

    }


    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int array[] = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s2.charAt(i);
            array[c]--;
            if (array[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
