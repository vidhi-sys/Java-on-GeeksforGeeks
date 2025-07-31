class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st= new Stack<>(); 
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
            
        }
        String ans="";
        while(st.size()>0){
            char ch=st.peek();
            ans+=(ch);
            st.pop();
        }
        
        return ans; 
    }
}