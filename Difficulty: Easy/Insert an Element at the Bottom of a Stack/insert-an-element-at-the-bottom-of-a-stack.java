// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<> ();
        while(st.size()>0){
            temp.push(st.pop());
            }
            st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;
        
    }
}