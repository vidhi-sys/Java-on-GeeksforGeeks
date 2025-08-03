class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(top<999){
            arr[++top]=x;
            
         
            
        }
    }

    public int pop() {
       if(top!=-1){
          int val=arr[top];
          top--;
          return val;
           
           
       }
       else{
           return -1;
       }
    }
}