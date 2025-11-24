class Solution {
    Node removeDuplicates(Node head) {
        if (head == null) return null;
        
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        
        while (current != null) {
            if (set.contains(current.data)) {
                // Remove duplicate
                prev.next = current.next;
            } else {
                // Add to set and move prev pointer
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        
        return head;
    }
}