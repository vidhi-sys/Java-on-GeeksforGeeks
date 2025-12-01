class Solution {
    public Node removeDuplicates(Node head) {
        // Edge cases
        if (head == null || head.next == null) {
            return head;
        }
        
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        
        // Add first node's data
        set.add(current.data);
        
        while (current.next != null) {
            if (set.contains(current.next.data)) {
                // Remove duplicate
                current.next = current.next.next;
            } else {
                // Add to set and move to next node
                set.add(current.next.data);
                current = current.next;
            }
        }
        
        return head;
    }
}