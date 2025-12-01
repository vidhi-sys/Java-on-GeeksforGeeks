/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node temp=head;
        int n=arr.length;
        for(int i=1;i<n;i++){
            Node new_node=new Node(arr[i]);
            temp.next=new_node;
            temp=temp.next;
            
        }
        return head;
    }
}
