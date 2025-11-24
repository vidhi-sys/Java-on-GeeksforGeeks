/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        
        if (head == null)
            return;

        Node node = head;

        while (node != null && node.next != null) {
            /* Change next link of next node */
            node.next = node.next.next;

            /*Update ref node to new alternate node */
            node = node.next;}
        
    }
}