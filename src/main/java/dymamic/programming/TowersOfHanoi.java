package dymamic.programming;

import java.util.Stack;

/**
 * @author Abhijeet Gulve
 */
public class TowersOfHanoi {

    public static void main(String[] args) {

    }

    public static void tower() {


    }

    private static boolean isBalancedBrackets(String value) {
        Stack<Character> stack = new Stack<>();
        char upperElement = 0;
        for (int i = 0; i < value.length(); i++) {
            if (!stack.isEmpty()) {
                upperElement = stack.peek();
            }
            stack.push(value.charAt(i));
            if (!stack.isEmpty() && stack.size() > 1) {
                if ((upperElement == '[' && stack.peek() == ']') ||
                        (upperElement == '{' && stack.peek() == '}') ||
                        (upperElement == '(' && stack.peek() == ')')) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}
