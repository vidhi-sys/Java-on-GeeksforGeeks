import java.util.Stack;

class Solution {
    public static String removePair(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If stack is not empty and top element equals current char, remove the pair
            if(!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop(); // Remove the matching character
            } else {
                stack.push(currentChar); // Push current character
            }
        }
        
        // Build result string from stack
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at beginning to maintain order
        }
        
        return result.toString();
    }
}