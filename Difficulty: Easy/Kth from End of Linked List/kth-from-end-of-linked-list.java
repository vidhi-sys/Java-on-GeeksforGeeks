/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

    class Solution {
    int getKthFromLast(Node head, int k) {
        Node temp = head;
        int length = 0;
        
        // Calculate length of list
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        // Check if k is valid
        if (k > length) return -1;
        
        // Move to (length - k)th node
        temp = head;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }
        
        return temp.data;
    }
}
       
        
 