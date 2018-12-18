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
        String string = "aabcd";
        System.out.println(isUnique(string));
    }

    static boolean isUnique(String str) {
        int[] charArray = new int[52];
        Arrays.fill(charArray, -1);
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int indexByCharacter = getIndexByCharacter(character);
            if (charArray[indexByCharacter] != -1) {
                return false;
            } else {
                charArray[indexByCharacter] = 0;
            }
        }
        return true;
    }

    static int getIndexByCharacter(char character) {
        if (character >= 97) {
            return character - 'A' - 7;
        } else return character - 'A';
    }
}
