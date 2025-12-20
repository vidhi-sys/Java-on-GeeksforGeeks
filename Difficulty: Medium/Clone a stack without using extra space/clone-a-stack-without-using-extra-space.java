import java.util.*;
class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        List<Integer> list = new ArrayList<>();
        
        // Store all elements in list
        while (!st.isEmpty()) {
            list.add(st.pop());
        }
        
        // Push back in reverse order to restore both stacks
        for (int i = list.size() - 1; i >= 0; i--) {
            int element = list.get(i);
            st.push(element);
            cloned.push(element);
        }
    }
}