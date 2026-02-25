/**
 * ================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {
    
    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";
        
        // Display the input
        System.out.println("Input : " + input);
        
        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();
        
        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        
        // Flag to track palindrome result
        boolean isPalindrome = true;
        
        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from front
            char first = deque.removeFirst();
            
            // Remove from rear
            char last = deque.removeLast();
            
            // If they don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display the result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
