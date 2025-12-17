class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node newNode = new Node(x);
        
        // Case 1: Insert at beginning (position 0)
        if (p == 0) {
            newNode.next = head.next;
            if (head != null) {
                head.next = newNode;
            }
            return head;
        }
        
        Node temp = head;
        int pos = 0;
        
        // Traverse to the node at position p-1
        // (We need the node before where we insert)
        while (temp != null ) {
            if(pos==p){
                break;
            }
            temp = temp.next;
            pos++;
        }
        
        // If we reached end before position p-1, insert at end
        if (temp == null) {
            // Find the last node
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }
        
        // Insert newNode after temp
        newNode.next = temp.next;
        newNode.prev = temp;
        
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        
        return head;
    }
}