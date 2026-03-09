/**
 * ==============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "level";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


interface PalindromeStrategy {

    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}