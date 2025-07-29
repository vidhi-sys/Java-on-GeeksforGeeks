class twoStacks {
    twoStacks() {}
    Stack<Integer>s1= new Stack<>();
    Stack<Integer>s2= new Stack<>();
    void push1(int x) {
        s1.push(x);
        
    }
    // Function to push an integer into the stack2.
    void push2(int x) {
      s2.push(x);
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(!s1.isEmpty()){
            return s1.pop();
        }
        else{
            return -1;
        }
    }
    // Function to remove an element from top of the stack2.
    int pop2() {
        if(!s2.isEmpty()){
            return s2.pop();
        }
        else{
            return -1;
        }
    }
}