class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
       if(input.isEmpty()){
           return -1;
       }
        int x=input.peek();
        input.pop();
        return x;
        
    }

    void enqueue(int x) {
         while(!input.isEmpty()){
            output.push(input.peek());
              input.pop();
        }
      
        input.push(x);
         while(!output.isEmpty()){
            input.push(output.peek());
              output.pop();
        }
      
    }
}
