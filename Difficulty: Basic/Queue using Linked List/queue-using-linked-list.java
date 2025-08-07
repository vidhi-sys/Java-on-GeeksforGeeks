/*
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
*/

class MyQueue {
    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        // code here
        if(front==null){
            QueueNode new_node =new QueueNode(a);
           rear=front= new_node;
            
        }
        else{
        QueueNode new_node =new QueueNode(a);
        rear.next=new_node;
        rear=new_node;
        }
        
    }

    // Function to pop front element from the queue
    int pop() {
        if(front==null){
           return -1;
        }
        else{
            QueueNode temp=front;
            
            front=front.next;
            return temp.data;
        }
        

        
        // code here
    }
}