/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        Node temp=head;
        int first=temp.data;
        while(temp!=null){
            if(temp.next==null){
                return false;
            }
            if(temp.next.data==first&temp.next==head){
                return true;
            }
            
            temp=temp.next;
        }
        return false;
    }
}