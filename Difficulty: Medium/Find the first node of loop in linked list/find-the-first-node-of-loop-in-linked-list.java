class Solution {
    public int cycleStart(Node head) {
        // Edge cases
        if (head == null || head.next == null) return -1;
        
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        
        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        // If no cycle
        if (!hasCycle) return -1;
        
        // Step 2: Find cycle start node
        Node cycleStartNode = head;
        while (cycleStartNode != slow) {
            cycleStartNode = cycleStartNode.next;
            slow = slow.next;
        }
        
        // Step 3: Return data of next node after cycle start
        return cycleStartNode.data;
    }
}