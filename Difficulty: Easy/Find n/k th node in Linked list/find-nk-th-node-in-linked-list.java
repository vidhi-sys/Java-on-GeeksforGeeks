/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        Node current=head;
       
        int position = (int)Math.ceil((double)count / k);
        for(int i=1;i<position;i++){
            current=current.next;
            
        }
        
       return current.data;
    }
}