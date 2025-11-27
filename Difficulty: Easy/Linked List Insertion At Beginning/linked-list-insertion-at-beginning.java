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

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node temp=head;
        Node new_node= new Node(x);
        if(head==null){
            return new_node;
        }
        new_node.next=temp;
        temp=new_node;
        return  new_node;
    }
}