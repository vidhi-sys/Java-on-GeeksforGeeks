/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/
import java.util.LinkedList;
class Solution {
    public Node joinTheLists(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=head2;
        // code here
        return head1;
    }
}
