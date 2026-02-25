/**
 * ================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Hardcoded string to check
        String inputText = "madam";
        
        // Display the input text
        System.out.println("Input text: " + inputText);
        
        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputText);
        
        // Display the result
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
    
    /**
     * Checks if a given string is a palindrome.
     * 
     * @param text The string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(String text) {
        // Get the length of the string
        int length = text.length();
        
        // Compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
