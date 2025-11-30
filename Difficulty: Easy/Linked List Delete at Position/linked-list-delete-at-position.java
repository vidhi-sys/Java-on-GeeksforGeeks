// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        Node temp=head;
        int count=0;
        if(pos==1){
                head=head.next;
            }
        while(temp!=null){
            count+=1;
            
            if(count+1==pos){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
}
