

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        if (head == null || head.next == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        // Delete the middle node (slow points to middle)
        prev.next = slow.next;
        
        return head;
    }
}