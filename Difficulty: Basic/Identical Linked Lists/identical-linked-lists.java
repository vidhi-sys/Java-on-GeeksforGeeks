/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node temp=head1;
        Node temp2=head2;
        while(temp!=null &&temp2!=null){
            if(temp.data==temp2.data){
                temp=temp.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }
            
        }
        return (temp == null && temp2 == null);
    }
}