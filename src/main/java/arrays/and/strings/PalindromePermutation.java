package arrays.and.strings;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * 1.5
 * 1.6
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "otacocato", "atco eta", etc.)
 *
 * @author Abhijeet Gulve
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("aayaa"));
    }


    private static boolean isPalindromePermutation(String s) {
        int[] alphabest = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                alphabest[s.charAt(i)]++;
            }
        }
        boolean odd = false;
        for (int i = 0; i < alphabest.length; i++) {
            if (alphabest[i] % 2 != 0) {
                if (!odd)
                    odd = true;
                else return false;
            }
        }
        return true;
    }
}
