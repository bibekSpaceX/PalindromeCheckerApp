/**
 * ==============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of a palindrome validation algorithm.
 *
 * It captures start and end time using System.nanoTime()
 * and calculates the execution duration.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input
        String input = "level";

        // Capture start time
        long startTime = System.nanoTime();

        // Palindrome check logic
        boolean isPalindrome = true;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}