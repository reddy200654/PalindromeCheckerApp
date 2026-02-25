/**
 * ================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level";
        
        // Create a palindrome strategy
        PalindromeStrategy strategy = new StackStrategy();
        
        // Capture start time in nanoseconds
        long startTime = System.nanoTime();
        
        // Check if the string is a palindrome
        boolean isPalindrome = strategy.check(input);
        
        // Capture end time in nanoseconds
        long endTime = System.nanoTime();
        
        // Calculate execution duration
        long executionTime = endTime - startTime;
        
        // Print the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * ================================================================
 * INTERFACE - PalindromeStrategy
 * ================================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {
    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input);
}

/**
 * ================================================================
 * CLASS - StackStrategy
 * ================================================================
 *
 * Stack-based palindrome validation algorithm.
 */
class StackStrategy implements PalindromeStrategy {
    
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        
        return true;
    }
}
