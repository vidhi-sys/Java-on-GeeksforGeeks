class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);
        
        // Insert at head
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }
        
        Node current = head;
        // Traverse to node at position (pos-1)
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        
        // If position is valid
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
        // If position beyond length, node is not inserted (or add at end as needed)
        
        return head;
    }
}