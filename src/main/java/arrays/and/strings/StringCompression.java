package arrays.and.strings;

/**
 * @author Abhijeet Gulve
 */
public class StringCompression {


    public static void main(String[] args) {
        System.out.println(compressBad("aacccccaaaabbd"));
    }
    static String compressBad(String str) {
        String compressedString = "";
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString : str;
    }
}
