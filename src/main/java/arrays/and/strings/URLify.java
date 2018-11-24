package arrays.and.strings;

import java.util.Arrays;

/**
 * @author Abhijeet Gulve
 */
public class URLify {
    public static void main(String[] args) {
        urliFy("Mr John Smith    ", 13);
    }

    /**
     * This method will add spaces to String.
     * will shift the element to next index
     *
     * @param s
     * @param  n
     * @return
     */
    private static String urliFy(String s, int  n) {
        char str[] = s.toCharArray();
        int spaceCount = 0, index, i = 0;
        for (i = 0; i <  n; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index =  n + spaceCount * 2;
        for (i =  n - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(str);
        return Arrays.toString(str);
    }
}
