class Solution {
    public Node delPos(Node head, int x) {
        // If list is empty
        if (head == null) {
            return null;
        }
        
        // If deleting the head node (position 1)
        if (x == 1) {
            if (head.next != null) {
                head.next.prev = null;
            }
            return head.next;
        }
        
        Node temp = head;
        int pos = 1;
        
        // Traverse to find the node at position x
        while (temp != null && pos < x) {
            temp = temp.next;
            pos++;
        }
        
        // If position is out of bounds
        if (temp == null) {
            return head;
        }
        
        // If deleting the last node
        if (temp.next == null) {
            temp.prev.next = null;
        } else {
            // Deleting a middle node
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        
        return head;
    }
}