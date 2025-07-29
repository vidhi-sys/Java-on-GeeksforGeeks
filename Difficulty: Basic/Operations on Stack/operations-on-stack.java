// User function Template for Java

class Geeks {
    // Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x) {
        // Your code here
        st.push(x);
    }

    // Function to remove top element from stack.
    public static void remove(Stack<Integer> st) {
        st.pop();
        
        // Your code here
    }

    // Function to print the top element of stack.
        
    public static void headOf_Stack(Stack<Integer> st) {
         if(!st.isEmpty()){
             System.out.println(st.peek());
             
         }
        
    }

        
    // Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val) {
        for (int element : st) {
        if (element == val) {
            return true;
        }
    }
    return false;

       
    }
}
