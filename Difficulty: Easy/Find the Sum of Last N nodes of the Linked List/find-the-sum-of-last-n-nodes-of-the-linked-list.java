/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        int sum=0;
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int left=len-n;
        Node temp2=head;
        int count=0;
        while(count!=left){
            count++;
            temp2=temp2.next;
        }
        while(temp2!=temp){
            sum+=temp2.data;
            temp2=temp2.next;
        }
        return sum;
    }
}