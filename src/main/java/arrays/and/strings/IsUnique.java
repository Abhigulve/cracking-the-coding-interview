package arrays.and.strings;

/**
 * @author Abhijeet Gulve
 */

import java.util.Arrays;

/**
 * Cracking the coding interview 1.1
 * <p>
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * </p>
 */
public class IsUnique {

    public static void main(String[] args) {
        String string = "abcd";
        System.out.println(isUnique(string));
    }

    static boolean isUnique(String str) {
        int[] charArray = new int[52];
        Arrays.fill(charArray, -1);
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character >= 97) {
                if (charArray[character - 'A' - 7] != -1) {
                    return false;
                } else {
                    charArray[character - 'A' - 7] = 0;
                }
            } else {
                if (charArray[character - 'A'] != -1) {
                    return false;
                } else {
                    charArray[character - 'A'] = 0;
                }
            }
        }
        return true;
    }


}
