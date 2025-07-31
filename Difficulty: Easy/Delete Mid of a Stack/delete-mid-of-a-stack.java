import java.util.Stack;

class Solution {
    // Function to delete middle element of a stack
    public void deleteMid(Stack<Integer> s) {
        // Calculate the middle index
        int mid = (s.size() / 2);
        
        // Temporary stack to hold elements
        Stack<Integer> temp = new Stack<>();
        
        // Transfer elements to temp stack until we reach the middle
        for (int i = 0; i < mid; i++) {
            temp.push(s.pop());
        }
        
        // Remove the middle element
        s.pop();
        
        // Push back the elements from temp stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }
}