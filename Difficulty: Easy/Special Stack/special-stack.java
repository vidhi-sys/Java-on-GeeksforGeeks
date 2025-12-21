import java.util.Stack;

class GfG {
    public void push(int a, Stack<Integer> s) {
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        if(!s.isEmpty()) {
            return s.pop();
        }
        return -1; // or throw exception
    }

    public int min(Stack<Integer> s) {
        if(s.isEmpty()) {
            return Integer.MAX_VALUE; // or throw exception
        }
        
        int minVal = Integer.MAX_VALUE;
        Stack<Integer> temp = new Stack<>();
        
        // Find minimum without destroying original stack
        while(!s.isEmpty()) {
            int val = s.pop();
            minVal = Math.min(minVal, val);
            temp.push(val);
        }
        
        // Restore original stack
        while(!temp.isEmpty()) {
            s.push(temp.pop());
        }
        
        return minVal;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        return s.size() >= n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        return s.isEmpty();
    }
}