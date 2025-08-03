class MyStack {
     class StackNode {
         int data;
         StackNode next;
       StackNode(int a) {
             data = a;
             next = null;
         }
    }
    StackNode top;
    

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode element= new StackNode (a);
        element.next=top;
        top=element;
        
        
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top ==null){
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
        // Add your code here
    }
}