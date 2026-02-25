/**
 * ================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {
    
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded input string
        String input = "madam";
        
        // Display the input text
        System.out.println("Input text: " + input);
        
        // Reverse the string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed text: " + reversed);
        
        // Check if palindrome by comparing original and reversed
        boolean isPalindrome = input.equals(reversed);
        
        // Display the result
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
    
    /**
     * Reverses a given string by iterating from last to first character.
     *
     * @param input The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String input) {
        String reversed = "";
        
        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        
        return reversed;
    }
}
