class Solution {
    public Node removeLastNode(Node head) {
        // Handle empty list
        if (head == null) return null;
        
        // Handle single node list
        if (head.next == null) return null;
        
        // For lists with 2+ nodes
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        
        return head;
    }
}